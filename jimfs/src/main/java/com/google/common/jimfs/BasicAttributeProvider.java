/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.jimfs;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/**
 * Attribute provider that provides attributes common to all file systems, the {@link
 * BasicFileAttributeView} ("basic" or no view prefix), and allows the reading of {@link
 * BasicFileAttributes}.
 *
 * @author Colin Decker
 */
final class BasicAttributeProvider extends AttributeProvider {

  public static final String ATTR_SIZE_KEY_NAME = "size";
  public static final String ATTR_FILE_KEY_KEY_NAME = "fileKey";
  public static final String ATTR_IS_DIRECTORY_KEY_NAME = "isDirectory";
  public static final String ATTR_IS_REGULAR_FILE_KEY_NAME = "isRegularFile";
  public static final String ATTR_IS_SYMBOLIC_LINK_KEY_NAME = "isSymbolicLink";
  public static final String ATTR_IS_OTHER_KEY_NAME = "isOther";
  public static final String ATTR_CREATION_TIME_KEY_NAME = "creationTime";
  public static final String ATTR_LAST_ACCESS_TIME_KEY_NAME = "lastAccessTime";
  public static final String ATTR_LAST_MODIFIED_TIME_KEY_NAME = "lastModifiedTime";

  private static final ImmutableSet<String> ATTRIBUTES =
      ImmutableSet.of(
              ATTR_SIZE_KEY_NAME,
              ATTR_FILE_KEY_KEY_NAME,
              ATTR_IS_DIRECTORY_KEY_NAME,
              ATTR_IS_REGULAR_FILE_KEY_NAME,
              ATTR_IS_SYMBOLIC_LINK_KEY_NAME,
              ATTR_IS_OTHER_KEY_NAME,
              ATTR_CREATION_TIME_KEY_NAME,
              ATTR_LAST_ACCESS_TIME_KEY_NAME,
              ATTR_LAST_MODIFIED_TIME_KEY_NAME);

  @Override
  public String name() {
    return "basic";
  }

  @Override
  public ImmutableSet<String> fixedAttributes() {
    return ATTRIBUTES;
  }

  @NullableDecl
  @Override
  public Object get(File file, String attribute) {
    switch (attribute) {
      case ATTR_SIZE_KEY_NAME:
        return file.size();
      case ATTR_FILE_KEY_KEY_NAME:
        return file.id();
      case ATTR_IS_DIRECTORY_KEY_NAME:
        return file.isDirectory();
      case ATTR_IS_REGULAR_FILE_KEY_NAME:
        return file.isRegularFile();
      case ATTR_IS_SYMBOLIC_LINK_KEY_NAME:
        return file.isSymbolicLink();
      case ATTR_IS_OTHER_KEY_NAME:
        return !file.isDirectory() && !file.isRegularFile() && !file.isSymbolicLink();
      case ATTR_CREATION_TIME_KEY_NAME:
        return file.getCreationTime();
      case ATTR_LAST_ACCESS_TIME_KEY_NAME:
        return file.getLastAccessTime();
      case ATTR_LAST_MODIFIED_TIME_KEY_NAME:
        return file.getLastModifiedTime();
      default:
        return null;
    }
  }

  @Override
  public void set(File file, String view, String attribute, Object value, boolean create) {
    switch (attribute) {
      case ATTR_CREATION_TIME_KEY_NAME:
        checkNotCreate(view, attribute, create);
        file.setCreationTime(checkType(view, attribute, value, FileTime.class));
        break;
      case ATTR_LAST_ACCESS_TIME_KEY_NAME:
        checkNotCreate(view, attribute, create);
        file.setLastAccessTime(checkType(view, attribute, value, FileTime.class));
        break;
      case ATTR_LAST_MODIFIED_TIME_KEY_NAME:
        checkNotCreate(view, attribute, create);
        file.setLastModifiedTime(checkType(view, attribute, value, FileTime.class));
        break;
      case ATTR_SIZE_KEY_NAME:
      case ATTR_FILE_KEY_KEY_NAME:
      case ATTR_IS_DIRECTORY_KEY_NAME:
      case ATTR_IS_REGULAR_FILE_KEY_NAME:
      case ATTR_IS_SYMBOLIC_LINK_KEY_NAME:
      case ATTR_IS_OTHER_KEY_NAME:
        throw unsettable(view, attribute, create);
      default:
    }
  }

  @Override
  public Class<BasicFileAttributeView> viewType() {
    return BasicFileAttributeView.class;
  }

  @Override
  public BasicFileAttributeView view(
      FileLookup lookup, ImmutableMap<String, FileAttributeView> inheritedViews) {
    return new View(lookup);
  }

  @Override
  public Class<BasicFileAttributes> attributesType() {
    return BasicFileAttributes.class;
  }

  @Override
  public BasicFileAttributes readAttributes(File file) {
    return new Attributes(file);
  }

  /** Implementation of {@link BasicFileAttributeView}. */
  private static final class View extends AbstractAttributeView implements BasicFileAttributeView {

    protected View(FileLookup lookup) {
      super(lookup);
    }

    @Override
    public String name() {
      return "basic";
    }

    @Override
    public BasicFileAttributes readAttributes() throws IOException {
      return new Attributes(lookupFile());
    }

    @Override
    public void setTimes(
        @NullableDecl FileTime lastModifiedTime,
        @NullableDecl FileTime lastAccessTime,
        @NullableDecl FileTime createTime)
        throws IOException {
      File file = lookupFile();

      if (lastModifiedTime != null) {
        file.setLastModifiedTime(lastModifiedTime);
      }

      if (lastAccessTime != null) {
        file.setLastAccessTime(lastAccessTime);
      }

      if (createTime != null) {
        file.setCreationTime(createTime);
      }
    }
  }

  /** Implementation of {@link BasicFileAttributes}. */
  static class Attributes implements BasicFileAttributes {

    private final FileTime lastModifiedTime;
    private final FileTime lastAccessTime;
    private final FileTime creationTime;
    private final boolean regularFile;
    private final boolean directory;
    private final boolean symbolicLink;
    private final long size;
    private final Object fileKey;

    protected Attributes(File file) {
      this.lastModifiedTime = file.getLastModifiedTime();
      this.lastAccessTime = file.getLastAccessTime();
      this.creationTime = file.getCreationTime();
      this.regularFile = file.isRegularFile();
      this.directory = file.isDirectory();
      this.symbolicLink = file.isSymbolicLink();
      this.size = file.size();
      this.fileKey = file.id();
    }

    @Override
    public FileTime lastModifiedTime() {
      return lastModifiedTime;
    }

    @Override
    public FileTime lastAccessTime() {
      return lastAccessTime;
    }

    @Override
    public FileTime creationTime() {
      return creationTime;
    }

    @Override
    public boolean isRegularFile() {
      return regularFile;
    }

    @Override
    public boolean isDirectory() {
      return directory;
    }

    @Override
    public boolean isSymbolicLink() {
      return symbolicLink;
    }

    @Override
    public boolean isOther() {
      return false;
    }

    @Override
    public long size() {
      return size;
    }

    @Override
    public Object fileKey() {
      return fileKey;
    }
  }
}

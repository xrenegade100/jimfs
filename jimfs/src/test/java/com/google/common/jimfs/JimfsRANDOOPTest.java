package com.google.common.jimfs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JimfsRANDOOPTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.common.jimfs.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem2 = com.google.common.jimfs.Jimfs.newFileSystem("hi!", configuration1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in hostname at index 10: jimfs://hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem1 = com.google.common.jimfs.Jimfs.newFileSystem("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Expected authority at index 8: jimfs://");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.common.jimfs.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem2 = com.google.common.jimfs.Jimfs.newFileSystem("", configuration1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Expected authority at index 8: jimfs://");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem1 = com.google.common.jimfs.Jimfs.newFileSystem("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in hostname at index 10: jimfs://hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = com.google.common.jimfs.Jimfs.URI_SCHEME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jimfs" + "'", str0, "jimfs");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.common.jimfs.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem1 = com.google.common.jimfs.Jimfs.newFileSystem(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.nio.file.FileSystem fileSystem0 = com.google.common.jimfs.Jimfs.newFileSystem();
        java.lang.Class<?> wildcardClass1 = fileSystem0.getClass();
        org.junit.Assert.assertNotNull(fileSystem0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.common.jimfs.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem2 = com.google.common.jimfs.Jimfs.newFileSystem("jimfs", configuration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.nio.file.FileSystem fileSystem1 = com.google.common.jimfs.Jimfs.newFileSystem("jimfs");
        org.junit.Assert.assertNotNull(fileSystem1);
    }
}


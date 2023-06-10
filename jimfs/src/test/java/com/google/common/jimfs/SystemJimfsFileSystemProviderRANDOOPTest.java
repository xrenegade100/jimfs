import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemJimfsFileSystemProviderRANDOOPTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList0 = java.nio.file.spi.FileSystemProvider.installedProviders();
        java.lang.Class<?> wildcardClass1 = fileSystemProviderList0.getClass();
        org.junit.Assert.assertNotNull(fileSystemProviderList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "", (java.lang.Object) (byte) -1, linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.AccessMode[] accessModeArray2 = new java.nio.file.AccessMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path1, accessModeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accessModeArray2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path2 = systemJimfsFileSystemProvider0.readSymbolicLink(path1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "", (java.lang.Object) '4', linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.CopyOption copyOption3 = null;
        java.nio.file.CopyOption[] copyOptionArray4 = new java.nio.file.CopyOption[] { copyOption3 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path1, path2, copyOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copyOptionArray4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.CopyOption[] copyOptionArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path1, path2, copyOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.OpenOption[] openOptionArray3 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream4 = systemJimfsFileSystemProvider0.newInputStream(path2, openOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.net.URI uRI1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem2 = systemJimfsFileSystemProvider0.getFileSystem(uRI1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore3 = systemJimfsFileSystemProvider0.getFileStore(path2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.CopyOption copyOption4 = null;
        java.nio.file.CopyOption[] copyOptionArray5 = new java.nio.file.CopyOption[] { copyOption4 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path2, path3, copyOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.OpenOption openOption2 = null;
        java.nio.file.OpenOption[] openOptionArray3 = new java.nio.file.OpenOption[] { openOption2 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream4 = systemJimfsFileSystemProvider0.newOutputStream(path1, openOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path1, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.net.URI uRI0 = null;
        java.lang.Runnable runnable1 = com.google.common.jimfs.SystemJimfsFileSystemProvider.removeFileSystemRunnable(uRI0);
        java.lang.Class<?> wildcardClass2 = runnable1.getClass();
        org.junit.Assert.assertNotNull(runnable1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path3 = systemJimfsFileSystemProvider0.readSymbolicLink(path2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.net.URI uRI1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path2 = systemJimfsFileSystemProvider0.getPath(uRI1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        wildcardFileAttributeArray7[0] = wildcardFileAttribute4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path2, path3, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = systemJimfsFileSystemProvider0.readAttributes(path1, "hi!", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "", (java.lang.Object) '4', linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore2 = systemJimfsFileSystemProvider0.getFileStore(path1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = systemJimfsFileSystemProvider0.deleteIfExists(path1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "hi!", (java.lang.Object) (-1L), linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "jimfs", (java.lang.Object) 1.0f, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path2, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path3 = systemJimfsFileSystemProvider0.getPath(uRI2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.AccessMode[] accessModeArray3 = new java.nio.file.AccessMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path2, accessModeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray3 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray4 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray3);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = systemJimfsFileSystemProvider0.deleteIfExists(path2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.CopyOption[] copyOptionArray4 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path2, path3, copyOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = systemJimfsFileSystemProvider0.isSameFile(path1, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = systemJimfsFileSystemProvider0.readAttributes(path1, "", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path1, path2, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.lang.Object obj4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "jimfs", obj4, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.OpenOption openOption3 = null;
        java.nio.file.OpenOption[] openOptionArray4 = new java.nio.file.OpenOption[] { openOption3 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream5 = systemJimfsFileSystemProvider0.newInputStream(path2, openOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.CopyOption[] copyOptionArray3 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path1, path2, copyOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copyOptionArray3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        wildcardFileAttributeArray6[0] = wildcardFileAttribute3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path2, wildcardFileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = systemJimfsFileSystemProvider0.isHidden(path1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path1, path2, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.AccessMode accessMode3 = null;
        java.nio.file.AccessMode[] accessModeArray4 = new java.nio.file.AccessMode[] { accessMode3 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path2, accessModeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.CopyOption[] copyOptionArray3 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path1, path2, copyOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copyOptionArray3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.OpenOption[] openOptionArray3 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream4 = systemJimfsFileSystemProvider0.newOutputStream(path2, openOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = systemJimfsFileSystemProvider0.isSameFile(path3, path4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream3 = systemJimfsFileSystemProvider0.newInputStream(path1, openOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption linkOption5 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] { linkOption5 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "hi!", (java.lang.Object) (short) -1, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = systemJimfsFileSystemProvider0.readAttributes(path2, "", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path3, path4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.CopyOption copyOption5 = null;
        java.nio.file.CopyOption[] copyOptionArray6 = new java.nio.file.CopyOption[] { copyOption5 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path3, path4, copyOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray3 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray4 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray3);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.CopyOption copyOption4 = null;
        java.nio.file.CopyOption[] copyOptionArray5 = new java.nio.file.CopyOption[] { copyOption4 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path2, path3, copyOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem3 = systemJimfsFileSystemProvider0.getFileSystem(uRI2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = systemJimfsFileSystemProvider0.deleteIfExists(path3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.CopyOption[] copyOptionArray5 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path3, path4, copyOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path4, path5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.CopyOption copyOption3 = null;
        java.nio.file.CopyOption[] copyOptionArray4 = new java.nio.file.CopyOption[] { copyOption3 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path1, path2, copyOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copyOptionArray4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.OpenOption openOption5 = null;
        java.nio.file.OpenOption[] openOptionArray6 = new java.nio.file.OpenOption[] { openOption5 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = systemJimfsFileSystemProvider0.newInputStream(path4, openOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.AccessMode accessMode2 = null;
        java.nio.file.AccessMode[] accessModeArray3 = new java.nio.file.AccessMode[] { accessMode2 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path1, accessModeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accessModeArray3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = systemJimfsFileSystemProvider0.isSameFile(path4, path5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path4 = systemJimfsFileSystemProvider0.getPath(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path5 = systemJimfsFileSystemProvider0.getPath(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        wildcardFileAttributeArray8[0] = wildcardFileAttribute5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path4, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem5 = systemJimfsFileSystemProvider0.getFileSystem(uRI4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path3, path4, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = systemJimfsFileSystemProvider0.isHidden(path3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        wildcardFileAttributeArray5[0] = wildcardFileAttribute2;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = systemJimfsFileSystemProvider0.readAttributes(path2, "hi!", linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path1, path2, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.OpenOption[] openOptionArray5 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream6 = systemJimfsFileSystemProvider0.newInputStream(path4, openOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = systemJimfsFileSystemProvider0.deleteIfExists(path4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.Class<?> wildcardClass1 = systemJimfsFileSystemProvider0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = systemJimfsFileSystemProvider0.isSameFile(path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider6 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str7 = systemJimfsFileSystemProvider6.getScheme();
        java.lang.String str8 = systemJimfsFileSystemProvider6.getScheme();
        java.lang.String str9 = systemJimfsFileSystemProvider6.getScheme();
        java.nio.file.LinkOption[] linkOptionArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path4, "jimfs", (java.lang.Object) systemJimfsFileSystemProvider6, linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jimfs" + "'", str8, "jimfs");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jimfs" + "'", str9, "jimfs");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption openOption4 = null;
        java.nio.file.OpenOption[] openOptionArray5 = new java.nio.file.OpenOption[] { openOption4 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream6 = systemJimfsFileSystemProvider0.newInputStream(path3, openOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList4 = java.nio.file.spi.FileSystemProvider.installedProviders();
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "hi!", (java.lang.Object) fileSystemProviderList4, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileSystemProviderList4);
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path4, path5, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path5 = systemJimfsFileSystemProvider0.readSymbolicLink(path4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path4 = systemJimfsFileSystemProvider0.readSymbolicLink(path3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.CopyOption copyOption5 = null;
        java.nio.file.CopyOption[] copyOptionArray6 = new java.nio.file.CopyOption[] { copyOption5 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path3, path4, copyOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path3, "jimfs", (java.lang.Object) (short) 10, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption linkOption5 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] { linkOption5 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "", (java.lang.Object) true, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path5, path6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path3, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemJimfsFileSystemProvider0.isSameFile(path5, path6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.OpenOption[] openOptionArray6 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream7 = systemJimfsFileSystemProvider0.newOutputStream(path5, openOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path3, "hi!", (java.lang.Object) 100.0d, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.OpenOption openOption6 = null;
        java.nio.file.OpenOption[] openOptionArray7 = new java.nio.file.OpenOption[] { openOption6 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream8 = systemJimfsFileSystemProvider0.newOutputStream(path5, openOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption openOption4 = null;
        java.nio.file.OpenOption[] openOptionArray5 = new java.nio.file.OpenOption[] { openOption4 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = systemJimfsFileSystemProvider0.newOutputStream(path3, openOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider3 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str4 = systemJimfsFileSystemProvider3.getScheme();
        java.lang.Class<?> wildcardClass5 = systemJimfsFileSystemProvider3.getClass();
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "hi!", (java.lang.Object) systemJimfsFileSystemProvider3, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "", (java.lang.Object) 10.0f, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.OpenOption openOption2 = null;
        java.nio.file.OpenOption[] openOptionArray3 = new java.nio.file.OpenOption[] { openOption2 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream4 = systemJimfsFileSystemProvider0.newInputStream(path1, openOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = systemJimfsFileSystemProvider0.isHidden(path4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.Class<?> wildcardClass4 = systemJimfsFileSystemProvider0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "", (java.lang.Object) 10, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        wildcardFileAttributeArray10[0] = wildcardFileAttribute7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption linkOption6 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] { linkOption6 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = systemJimfsFileSystemProvider0.readAttributes(path4, "hi!", linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        wildcardFileAttributeArray9[0] = wildcardFileAttribute6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path5, wildcardFileAttributeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        java.nio.file.CopyOption[] copyOptionArray6 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path4, path5, copyOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption[] openOptionArray4 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream5 = systemJimfsFileSystemProvider0.newInputStream(path3, openOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.OpenOption openOption5 = null;
        java.nio.file.OpenOption[] openOptionArray6 = new java.nio.file.OpenOption[] { openOption5 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream7 = systemJimfsFileSystemProvider0.newOutputStream(path4, openOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem6 = systemJimfsFileSystemProvider0.getFileSystem(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = systemJimfsFileSystemProvider0.readAttributes(path3, "hi!", linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.AccessMode[] accessModeArray4 = new java.nio.file.AccessMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path3, accessModeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.CopyOption[] copyOptionArray7 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path5, path6, copyOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path6 = systemJimfsFileSystemProvider0.readSymbolicLink(path5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = systemJimfsFileSystemProvider0.readAttributes(path5, "jimfs", linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        wildcardFileAttributeArray5[0] = wildcardFileAttribute2;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.CopyOption[] copyOptionArray8 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path6, path7, copyOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.OpenOption openOption3 = null;
        java.nio.file.OpenOption[] openOptionArray4 = new java.nio.file.OpenOption[] { openOption3 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream5 = systemJimfsFileSystemProvider0.newOutputStream(path2, openOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "hi!", (java.lang.Object) 1.0f, linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption linkOption5 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] { linkOption5 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = systemJimfsFileSystemProvider0.readAttributes(path3, "", linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "jimfs", (java.lang.Object) (byte) 100, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = systemJimfsFileSystemProvider0.deleteIfExists(path5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem4 = systemJimfsFileSystemProvider0.getFileSystem(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path7 = systemJimfsFileSystemProvider0.readSymbolicLink(path6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = systemJimfsFileSystemProvider0.isHidden(path2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = systemJimfsFileSystemProvider0.isSameFile(path6, path7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        wildcardFileAttributeArray6[0] = wildcardFileAttribute3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path1, path2, wildcardFileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        wildcardFileAttributeArray10[0] = wildcardFileAttribute7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path6, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption linkOption5 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] { linkOption5 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = systemJimfsFileSystemProvider0.readAttributes(path3, "jimfs", linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path2, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        java.nio.file.CopyOption copyOption6 = null;
        java.nio.file.CopyOption[] copyOptionArray7 = new java.nio.file.CopyOption[] { copyOption6 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path4, path5, copyOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream3 = systemJimfsFileSystemProvider0.newOutputStream(path1, openOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.AccessMode[] accessModeArray5 = new java.nio.file.AccessMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path4, accessModeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.CopyOption copyOption8 = null;
        java.nio.file.CopyOption[] copyOptionArray9 = new java.nio.file.CopyOption[] { copyOption8 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path6, path7, copyOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = systemJimfsFileSystemProvider0.readAttributes(path1, "jimfs", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = systemJimfsFileSystemProvider0.isHidden(path5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption linkOption7 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] { linkOption7 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = systemJimfsFileSystemProvider0.readAttributes(path5, "jimfs", linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = systemJimfsFileSystemProvider0.readAttributes(path5, "", linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption[] openOptionArray4 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream5 = systemJimfsFileSystemProvider0.newOutputStream(path3, openOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore5 = systemJimfsFileSystemProvider0.getFileStore(path4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemJimfsFileSystemProvider0.isHidden(path6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption linkOption7 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] { linkOption7 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = systemJimfsFileSystemProvider0.readAttributes(path5, "", linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider5 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str6 = systemJimfsFileSystemProvider5.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider5.getScheme();
        java.lang.Class<?> wildcardClass8 = systemJimfsFileSystemProvider5.getClass();
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path3, "jimfs", (java.lang.Object) wildcardClass8, linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path3, "", (java.lang.Object) 100L, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = systemJimfsFileSystemProvider0.deleteIfExists(path6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.OpenOption[] openOptionArray5 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = systemJimfsFileSystemProvider0.newOutputStream(path4, openOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.CopyOption[] copyOptionArray7 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path5, path6, copyOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore6 = systemJimfsFileSystemProvider0.getFileStore(path5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.Class<?> wildcardClass6 = systemJimfsFileSystemProvider0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.CopyOption[] copyOptionArray4 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path2, path3, copyOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        wildcardFileAttributeArray10[0] = wildcardFileAttribute7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path6, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute8 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray10 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray11 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray10;
        wildcardFileAttributeArray11[0] = wildcardFileAttribute8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path6, path7, wildcardFileAttributeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray10);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption linkOption7 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] { linkOption7 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path4, "hi!", (java.lang.Object) (byte) 1, linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.AccessMode accessMode6 = null;
        java.nio.file.AccessMode[] accessModeArray7 = new java.nio.file.AccessMode[] { accessMode6 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path5, accessModeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.AccessMode accessMode5 = null;
        java.nio.file.AccessMode[] accessModeArray6 = new java.nio.file.AccessMode[] { accessMode5 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path4, accessModeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path6, path7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore7 = systemJimfsFileSystemProvider0.getFileStore(path6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.OpenOption[] openOptionArray6 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = systemJimfsFileSystemProvider0.newInputStream(path5, openOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = systemJimfsFileSystemProvider0.readAttributes(path2, "", linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.OpenOption openOption7 = null;
        java.nio.file.OpenOption[] openOptionArray8 = new java.nio.file.OpenOption[] { openOption7 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream9 = systemJimfsFileSystemProvider0.newOutputStream(path6, openOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path6, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.AccessMode[] accessModeArray6 = new java.nio.file.AccessMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path5, accessModeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.CopyOption[] copyOptionArray5 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path3, path4, copyOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore4 = systemJimfsFileSystemProvider0.getFileStore(path3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.CopyOption copyOption7 = null;
        java.nio.file.CopyOption[] copyOptionArray8 = new java.nio.file.CopyOption[] { copyOption7 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path5, path6, copyOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path6 = systemJimfsFileSystemProvider0.getPath(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path3, path4, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption linkOption8 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption8 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = systemJimfsFileSystemProvider0.readAttributes(path6, "", linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        wildcardFileAttributeArray6[0] = wildcardFileAttribute3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path2, wildcardFileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path6, path7, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        wildcardFileAttributeArray7[0] = wildcardFileAttribute4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path3, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path4, "", (java.lang.Object) "", linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path4, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption linkOption5 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] { linkOption5 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "jimfs", (java.lang.Object) 10.0f, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path6, path7, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider4 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str5 = systemJimfsFileSystemProvider4.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider4.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider4.getScheme();
        java.lang.String str8 = systemJimfsFileSystemProvider4.getScheme();
        java.lang.Class<?> wildcardClass9 = systemJimfsFileSystemProvider4.getClass();
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "jimfs", (java.lang.Object) systemJimfsFileSystemProvider4, linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "jimfs" + "'", str8, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path1, path2, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        java.nio.file.CopyOption copyOption6 = null;
        java.nio.file.CopyOption[] copyOptionArray7 = new java.nio.file.CopyOption[] { copyOption6 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path4, path5, copyOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        wildcardFileAttributeArray6[0] = wildcardFileAttribute3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path2, wildcardFileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem7 = systemJimfsFileSystemProvider0.getFileSystem(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        wildcardFileAttributeArray10[0] = wildcardFileAttribute7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.AccessMode accessMode7 = null;
        java.nio.file.AccessMode[] accessModeArray8 = new java.nio.file.AccessMode[] { accessMode7 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path6, accessModeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.OpenOption[] openOptionArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream3 = systemJimfsFileSystemProvider0.newOutputStream(path1, openOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path5, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        wildcardFileAttributeArray8[0] = wildcardFileAttribute5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path3, path4, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path7 = systemJimfsFileSystemProvider0.getPath(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path6, "", (java.lang.Object) (byte) -1, linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemJimfsFileSystemProvider0.isSameFile(path7, path8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path6, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path2, path3, wildcardFileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        wildcardFileAttributeArray5[0] = wildcardFileAttribute2;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = systemJimfsFileSystemProvider0.deleteIfExists(path7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider9 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str10 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.String str11 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.Class<?> wildcardClass12 = systemJimfsFileSystemProvider9.getClass();
        java.nio.file.LinkOption[] linkOptionArray13 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "jimfs", (java.lang.Object) systemJimfsFileSystemProvider9, linkOptionArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jimfs" + "'", str10, "jimfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "jimfs" + "'", str11, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(linkOptionArray13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = systemJimfsFileSystemProvider0.readAttributes(path4, "hi!", linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        wildcardFileAttributeArray7[0] = wildcardFileAttribute4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path3, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.AccessMode[] accessModeArray8 = new java.nio.file.AccessMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path7, accessModeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        wildcardFileAttributeArray6[0] = wildcardFileAttribute3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path1, path2, wildcardFileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.CopyOption copyOption7 = null;
        java.nio.file.CopyOption[] copyOptionArray8 = new java.nio.file.CopyOption[] { copyOption7 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path5, path6, copyOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        wildcardFileAttributeArray8[0] = wildcardFileAttribute5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path4, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.util.List<java.nio.file.spi.FileSystemProvider> fileSystemProviderList3 = java.nio.file.spi.FileSystemProvider.installedProviders();
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "hi!", (java.lang.Object) fileSystemProviderList3, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileSystemProviderList3);
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption linkOption7 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] { linkOption7 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path4, "", (java.lang.Object) 0, linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption linkOption8 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption8 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = systemJimfsFileSystemProvider0.readAttributes(path6, "jimfs", linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path3, path4, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute9 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray11 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray12 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray11;
        wildcardFileAttributeArray12[0] = wildcardFileAttribute9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path7, path8, wildcardFileAttributeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray11);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.OpenOption openOption8 = null;
        java.nio.file.OpenOption[] openOptionArray9 = new java.nio.file.OpenOption[] { openOption8 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream10 = systemJimfsFileSystemProvider0.newInputStream(path7, openOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.CopyOption[] copyOptionArray8 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path6, path7, copyOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.lang.Object obj9 = null;
        java.nio.file.LinkOption linkOption10 = null;
        java.nio.file.LinkOption[] linkOptionArray11 = new java.nio.file.LinkOption[] { linkOption10 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "jimfs", obj9, linkOptionArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption linkOption6 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] { linkOption6 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path3, "", (java.lang.Object) false, linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = systemJimfsFileSystemProvider0.isHidden(path7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "hi!", (java.lang.Object) 100L, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "", (java.lang.Object) 10.0f, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path7, path8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path8 = systemJimfsFileSystemProvider0.readSymbolicLink(path7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.OpenOption openOption8 = null;
        java.nio.file.OpenOption[] openOptionArray9 = new java.nio.file.OpenOption[] { openOption8 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream10 = systemJimfsFileSystemProvider0.newOutputStream(path7, openOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray10 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray11 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray10;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path7, path8, wildcardFileAttributeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray10);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path7, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.CopyOption[] copyOptionArray9 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path7, path8, copyOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore8 = systemJimfsFileSystemProvider0.getFileStore(path7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        wildcardFileAttributeArray9[0] = wildcardFileAttribute6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path5, wildcardFileAttributeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.CopyOption[] copyOptionArray9 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path7, path8, copyOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = systemJimfsFileSystemProvider0.readAttributes(path2, "hi!", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute8 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray10 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray11 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray10;
        wildcardFileAttributeArray11[0] = wildcardFileAttribute8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path6, path7, wildcardFileAttributeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray10);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        wildcardFileAttributeArray7[0] = wildcardFileAttribute4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path2, path3, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.OpenOption[] openOptionArray7 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = systemJimfsFileSystemProvider0.newInputStream(path6, openOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(openOptionArray7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        wildcardFileAttributeArray10[0] = wildcardFileAttribute7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path7, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray10 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray11 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray10;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path7, path8, wildcardFileAttributeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray10);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        wildcardFileAttributeArray8[0] = wildcardFileAttribute5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path4, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        wildcardFileAttributeArray9[0] = wildcardFileAttribute6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path4, path5, wildcardFileAttributeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.Path path5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path4, path5, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray8 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray9 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray8;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, wildcardFileAttributeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray8);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.CopyOption[] copyOptionArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.move(path7, path8, copyOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = systemJimfsFileSystemProvider0.readAttributes(path1, "jimfs", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        wildcardFileAttributeArray7[0] = wildcardFileAttribute4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path3, wildcardFileAttributeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption linkOption5 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] { linkOption5 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "", (java.lang.Object) "jimfs", linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "jimfs", (java.lang.Object) false, linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.lang.Object obj7 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path5, "jimfs", obj7, linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.CopyOption[] copyOptionArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path1, path2, copyOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        wildcardFileAttributeArray5[0] = wildcardFileAttribute2;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        wildcardFileAttributeArray10[0] = wildcardFileAttribute7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path5, path6, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray6 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray7 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path4, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray6);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.AccessMode[] accessModeArray7 = new java.nio.file.AccessMode[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path6, accessModeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path6, path7, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray5 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray6 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path3, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray5);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.Path path9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = systemJimfsFileSystemProvider0.isSameFile(path8, path9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.Class<?> wildcardClass8 = systemJimfsFileSystemProvider0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.LinkOption linkOption10 = null;
        java.nio.file.LinkOption[] linkOptionArray11 = new java.nio.file.LinkOption[] { linkOption10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = systemJimfsFileSystemProvider0.readAttributes(path8, "hi!", linkOptionArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.CopyOption copyOption9 = null;
        java.nio.file.CopyOption[] copyOptionArray10 = new java.nio.file.CopyOption[] { copyOption9 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path7, path8, copyOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider8 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str9 = systemJimfsFileSystemProvider8.getScheme();
        java.lang.String str10 = systemJimfsFileSystemProvider8.getScheme();
        java.lang.String str11 = systemJimfsFileSystemProvider8.getScheme();
        java.lang.String str12 = systemJimfsFileSystemProvider8.getScheme();
        java.lang.String str13 = systemJimfsFileSystemProvider8.getScheme();
        java.lang.String str14 = systemJimfsFileSystemProvider8.getScheme();
        java.lang.String str15 = systemJimfsFileSystemProvider8.getScheme();
        java.nio.file.LinkOption linkOption16 = null;
        java.nio.file.LinkOption[] linkOptionArray17 = new java.nio.file.LinkOption[] { linkOption16 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path6, "hi!", (java.lang.Object) str15, linkOptionArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jimfs" + "'", str9, "jimfs");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jimfs" + "'", str10, "jimfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "jimfs" + "'", str11, "jimfs");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jimfs" + "'", str12, "jimfs");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jimfs" + "'", str13, "jimfs");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "jimfs" + "'", str14, "jimfs");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jimfs" + "'", str15, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray17);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption linkOption9 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] { linkOption9 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = systemJimfsFileSystemProvider0.readAttributes(path7, "hi!", linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        wildcardFileAttributeArray5[0] = wildcardFileAttribute2;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem8 = systemJimfsFileSystemProvider0.getFileSystem(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path4, "jimfs", (java.lang.Object) 1, linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption[] linkOptionArray6 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path3, "", (java.lang.Object) 10.0d, linkOptionArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider9 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str10 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.String str11 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.String str12 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.String str13 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.String str14 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.String str15 = systemJimfsFileSystemProvider9.getScheme();
        java.lang.Class<?> wildcardClass16 = systemJimfsFileSystemProvider9.getClass();
        java.nio.file.LinkOption linkOption17 = null;
        java.nio.file.LinkOption[] linkOptionArray18 = new java.nio.file.LinkOption[] { linkOption17 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "hi!", (java.lang.Object) wildcardClass16, linkOptionArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jimfs" + "'", str10, "jimfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "jimfs" + "'", str11, "jimfs");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jimfs" + "'", str12, "jimfs");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "jimfs" + "'", str13, "jimfs");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "jimfs" + "'", str14, "jimfs");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jimfs" + "'", str15, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(linkOptionArray18);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.AccessMode accessMode9 = null;
        java.nio.file.AccessMode[] accessModeArray10 = new java.nio.file.AccessMode[] { accessMode9 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.checkAccess(path8, accessModeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(accessModeArray10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileStore fileStore9 = systemJimfsFileSystemProvider0.getFileStore(path8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.Path path9 = null;
        java.nio.file.CopyOption[] copyOptionArray10 = new java.nio.file.CopyOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path8, path9, copyOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(copyOptionArray10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemJimfsFileSystemProvider0.deleteIfExists(path8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray10 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray11 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray10;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path8, wildcardFileAttributeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray10);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray11);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.net.URI uRI10 = null;
        java.lang.Runnable runnable11 = com.google.common.jimfs.SystemJimfsFileSystemProvider.removeFileSystemRunnable(uRI10);
        java.nio.file.LinkOption linkOption12 = null;
        java.nio.file.LinkOption[] linkOptionArray13 = new java.nio.file.LinkOption[] { linkOption12 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path8, "jimfs", (java.lang.Object) runnable11, linkOptionArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(runnable11);
        org.junit.Assert.assertNotNull(linkOptionArray13);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.Path path9 = null;
        java.nio.file.CopyOption[] copyOptionArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.copy(path8, path9, copyOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = systemJimfsFileSystemProvider0.readAttributes(path2, "jimfs", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path3 = null;
        java.nio.file.Path path4 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute5 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray7 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray8 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray7;
        wildcardFileAttributeArray8[0] = wildcardFileAttribute5;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path3, path4, wildcardFileAttributeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray7);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path8 = systemJimfsFileSystemProvider0.getPath(uRI7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = systemJimfsFileSystemProvider0.isHidden(path8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        wildcardFileAttributeArray10[0] = wildcardFileAttribute7;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path6, wildcardFileAttributeArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path7, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption linkOption9 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] { linkOption9 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = systemJimfsFileSystemProvider0.readAttributes(path7, "jimfs", linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption linkOption10 = null;
        java.nio.file.LinkOption[] linkOptionArray11 = new java.nio.file.LinkOption[] { linkOption10 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "jimfs", (java.lang.Object) (short) 100, linkOptionArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "", (java.lang.Object) 'a', linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.delete(path8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.Path path9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createLink(path8, path9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path2, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = systemJimfsFileSystemProvider0.readAttributes(path8, "hi!", linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path8 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap11 = systemJimfsFileSystemProvider0.readAttributes(path8, "hi!", linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray3 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray4 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray3;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path1, wildcardFileAttributeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileAttributeArray3);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.nio.file.Path path8 = null;
        java.nio.file.attribute.FileAttribute<?> wildcardFileAttribute9 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray11 = new java.nio.file.attribute.FileAttribute[1];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray12 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray11;
        wildcardFileAttributeArray12[0] = wildcardFileAttribute9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path7, path8, wildcardFileAttributeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray11);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.lang.Object obj9 = new java.lang.Object();
        java.nio.file.LinkOption linkOption10 = null;
        java.nio.file.LinkOption[] linkOptionArray11 = new java.nio.file.LinkOption[] { linkOption10 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "", obj9, linkOptionArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray11);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.lang.Object obj4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path2, "", obj4, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption4 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] { linkOption4 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path1, "jimfs", (java.lang.Object) 100.0f, linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path4, "jimfs", (java.lang.Object) 1L, linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str7 = systemJimfsFileSystemProvider0.getScheme();
        java.net.URI uRI8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.FileSystem fileSystem9 = systemJimfsFileSystemProvider0.getFileSystem(uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path4 = null;
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider6 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str7 = systemJimfsFileSystemProvider6.getScheme();
        java.lang.Class<?> wildcardClass8 = systemJimfsFileSystemProvider6.getClass();
        java.nio.file.LinkOption linkOption9 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] { linkOption9 };
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path4, "jimfs", (java.lang.Object) wildcardClass8, linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jimfs" + "'", str7, "jimfs");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = systemJimfsFileSystemProvider0.readAttributes(path5, "hi!", linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path2 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray4 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray5 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createDirectory(path2, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray4);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path6, "hi!", (java.lang.Object) (short) 1, linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path6 = null;
        java.nio.file.Path path7 = null;
        java.nio.file.attribute.FileAttribute[] fileAttributeArray9 = new java.nio.file.attribute.FileAttribute[0];
        @SuppressWarnings("unchecked")
        java.nio.file.attribute.FileAttribute<?>[] wildcardFileAttributeArray10 = (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9;
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.createSymbolicLink(path6, path7, (java.nio.file.attribute.FileAttribute<?>[]) fileAttributeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertNotNull(fileAttributeArray9);
        org.junit.Assert.assertNotNull(wildcardFileAttributeArray10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.google.common.jimfs.SystemJimfsFileSystemProvider systemJimfsFileSystemProvider0 = new com.google.common.jimfs.SystemJimfsFileSystemProvider();
        java.lang.String str1 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str2 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str3 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str4 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str5 = systemJimfsFileSystemProvider0.getScheme();
        java.lang.String str6 = systemJimfsFileSystemProvider0.getScheme();
        java.nio.file.Path path7 = null;
        java.lang.Object obj9 = new java.lang.Object();
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            systemJimfsFileSystemProvider0.setAttribute(path7, "hi!", obj9, linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jimfs" + "'", str1, "jimfs");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jimfs" + "'", str2, "jimfs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jimfs" + "'", str3, "jimfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jimfs" + "'", str4, "jimfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jimfs" + "'", str5, "jimfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jimfs" + "'", str6, "jimfs");
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }
}


package io.show;

import okio.BufferedSink;
import okio.Okio;
import okio.Source;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

@SuppressWarnings("ALL")
public class CopyFileStructure {

    private static final File srcDir = new File("D:\\test\\tmp");
    private static final File dstDir = new File("D:\\test\\tmp2");
    private static final File fileToDelete = new File("D:\\test\\tmp2\\google.html");
    private static final File fileToCopy = new File("D:\\test\\someFile.txt");
    private static final File fileCopied = new File("D:\\test\\someFile2.txt");

    public static void main(String[] args) throws IOException {
//        copyDirectoryAndFileStructureWithFilter(srcDir, dstDir);
//        copyFileTree();
//        pathDifferenceTest(srcDir);
//        deleteFile(fileToDelete);
//        deleteFileTree(dstDir);
//        okIoCopyFile(fileToCopy, fileCopied);
    }

    private static void pathDifferenceTest(File file) throws IOException {
        //getAbsolutePath() gets the path string after resolving it against the current directory if it's relative, resulting in a fully qualified path.
        System.out.println("absolute path: " + file.getAbsolutePath());
        //getCanonicalPath() gets the path string after resolving any relative path against current directory,
        // and removes any relative pathing (. and ..),
        // and any file system links to return a path which the file system
        // considers the canonical means to reference the file system object to which it points.
        System.out.println("canonical path: " + file.getCanonicalPath());
//        getPath() gets the path string that the File object was constructed with, and it may be relative current directory.
        System.out.println("just path: " + file.getPath());
    }

    private static void copyDirectoryAndFileStructureWithFilter(File src, File dst) {
        if (!src.exists()) {
            System.out.println("No such directory to copy");
            return;
        }

        if (src.isDirectory() && !dst.exists()) {
            dst.mkdir();
        }

        if (src.listFiles() == null) {
            System.out.println("List is null when src is: " + src);
            return;
        }

        for (File srcSubDir : src.listFiles(pathname -> {
            if (pathname.isFile()) {
//                final String fileName = pathname.getName();
//                copyFile(pathname, new File(dst, fileName));
//                copyFile(pathname, new File(dst, pathname.getName()));
                copyWithNioToDirReplaceExisting(pathname, dst);
                return false;
            }
            return true;
        })) {
            final String subDirName = srcSubDir.getName();
            copyDirectoryAndFileStructure(srcSubDir, new File(dst, subDirName));
        }
    }

    private static void copyDirectoryAndFileStructure(File src, File dst) {
        if (!src.exists()) {
            System.out.println("No such directory to copy");
            return;
        }

        if (src.isFile()) {
            copyFile(src, dst);
            return;
        }

        if (!dst.exists()) {
            dst.mkdirs();
        }

        if (src.listFiles() == null) return;

        for (File srcSubDir : src.listFiles()) {
            final String subDirName = srcSubDir.getName();
            copyDirectoryAndFileStructure(srcSubDir, new File(dst, subDirName));
        }
    }

    private static void copyDirectoryStructure(File src, File dst) {
        if (!src.exists()) {
            System.out.println("No such directory to copy");
            return;
        }

        if (src.isFile()) {
            System.out.println("It's file. Go further");
            return;
        }

        if (!dst.exists()) {
            dst.mkdir();
        }

        if (src.listFiles() == null) return;

        for (File srcSubDir : src.listFiles()) {
            String subDirName = srcSubDir.getName();

            System.out.println("subDir: " + srcSubDir.toString());
            System.out.println("subDirName: " + subDirName);
            System.out.println("dst: " + dst.toString());

            copyDirectoryStructure(srcSubDir, new File(dst, subDirName));
        }
    }

    private static void copyFile(File src, File dst) {
        final long startTime = System.currentTimeMillis();

        try (InputStream inputStream = new FileInputStream(src);
             final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

             final OutputStream outputStream = new FileOutputStream(dst);
             final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);) {
            int data;
            while ((data = inputStream.read()) != -1) {
                bufferedOutputStream.write(data);
            }

            bufferedOutputStream.flush();
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e) {
            System.out.println("src: " + src + "; \ndst: " + dst);
            e.printStackTrace();
        }

        System.out.println("takes time: " + (System.currentTimeMillis() - startTime));
    }

    private static void updateFile(File src, File dst) {
        long startTime = System.currentTimeMillis();

        try (final InputStream inputStream = new FileInputStream(src);
             final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

             //append data to the end of the file
             final OutputStream outputStream = new FileOutputStream(dst, true);
             final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);) {

            int data;
            while ((data = inputStream.read()) != -1) {
                bufferedOutputStream.write(data);
            }

            bufferedOutputStream.flush();
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("takes time to read time: " + (System.currentTimeMillis() - startTime));
    }

    /**
     * Sumbolic link copied as target file (could be changed)
     * If file exists nothing happened.
     * Has copy options (replace, ignore e.t.c)
     * If directory - create empty directory in target location (but not what this directory included)
     *
     * @param src - file
     * @param dst - file
     */
    private static void copyWithNio(File src, File dst) {
        try {
            Files.copy(src.toPath(), dst.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sumbolic link copied as target file (could be changed)
     * If file exists nothing happened.
     * Has copy options (replace, ignore e.t.c)
     * If directory - create empty directory in target location (but not what this directory included)
     *
     * @param src    - file
     * @param dstDir - dir
     */
    private static void copyWithNioToDirReplaceExisting(File src, File dstDir) {
        try {
            final Path srcPath = src.toPath();
            //resolve is tricky one.
            final Path dstPath = dstDir.toPath().resolve(src.toPath().getFileName());

            Files.copy(srcPath, dstPath, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * src = D:\tmp
     * dst = D:\tmp2
     * dir = D:\tmp\test
     * <p>
     * Path relativizedPath = src.relativize(dir) -> \test
     * <p>
     * dst.resolve(relativizedPath) -> D:\tmp2\test
     */
    private static void copyFileTree() {
        try {
            Path src = srcDir.toPath();
            Path dst = dstDir.toPath();

            Files.walkFileTree(src, new FileVisitor<Path>() {

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    Path target = dst.resolve(src.relativize(dir));
                    if (!Files.exists(target)) Files.copy(dir, target);
                    return CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Path target = dst.resolve(src.relativize(file));
                    if (!Files.exists(target)) Files.copy(file, target);
                    return CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    return CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    return CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFile(File file) {
        file.delete();
    }

    /**
     * In case of call on symlink - symlink will be deleted, but not the source.
     *
     * @param file
     */
    private static void deleteFileTree(File file) {
        if (file.isDirectory()) {
            for (File singleFile : file.listFiles()) {
                if (singleFile.isDirectory()) {
                    deleteFileTree(singleFile);
                }
                singleFile.delete();
            }
        }

        if (file.isFile() || file.list().length == 0) file.delete();
    }

    private static void okIoCopyFile(File fileToCopy, File fileCopied) {
        Source source = null;
        BufferedSink buffer = null;
        try {
            source = Okio.source(fileToCopy);
            buffer = Okio.buffer(Okio.sink(fileCopied));
            buffer.writeAll(source);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                source.close();
                buffer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
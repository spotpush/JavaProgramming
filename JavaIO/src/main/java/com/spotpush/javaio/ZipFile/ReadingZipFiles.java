package com.spotpush.javaio.ZipFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class ReadingZipFiles {

    /**
     * Reads file details in a Zip File using ZipFile class
     * @throws IOException 
     */
    static void readUsingZipFile() throws IOException {
        ZipFile zipFile = new ZipFile("c://JavaIOFiles//JavaIO.zip");
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while(entries.hasMoreElements()) {
                ZipEntry zipEntry = entries.nextElement();
                System.out.println(zipEntry.getName());
            }
            System.out.println("Zip File read successfully");
        } finally {
            zipFile.close();
        }
    }
    
    /**
     * Reads file details in a zip file using ZipInputStream class
     * @throws IOException 
     */
    static void readUsingZipInputStream() throws IOException {
        BufferedInputStream bis = new BufferedInputStream
            (new FileInputStream("c://JavaIOFiles//JavaIO.zip"));
        ZipInputStream zis = new ZipInputStream(bis);
        try {
            ZipEntry zipEntry;
            while((zipEntry = zis.getNextEntry())!=null) {
                System.out.println(zipEntry.getName());
            }
            System.out.println("Zip File read successfully");
        } finally {
            zis.close();
        }
    }
        
    /**
     * Unzips a file from a source directory to a destination directory
     * creating directories where necessary
     * Calls extractFile()
     * @throws IOException 
     */
    static void unzipUtility() throws IOException {
        int bufferSize=4096;
        File destDir = new File("c://JavaIOFiles//zipfiles//extracted");
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        ZipInputStream zis = new ZipInputStream
                (new FileInputStream("c://JavaIOFiles//zipfiles//JavaIO.zip"));
        ZipEntry zipEntry = zis.getNextEntry();
        while(zipEntry != null) {
            String filePath = destDir + File.separator + zipEntry.getName();
            if(!zipEntry.isDirectory()) {
                extractFile(zis,filePath,bufferSize);
            } else {
                File dir = new File(filePath);
                dir.mkdir();
            }
            zis.closeEntry();
            zipEntry = zis.getNextEntry();
        }
        zis.close();
        System.out.println("Files extracted successfully");
    }
    
    static void extractFile(ZipInputStream zis,String filePath,int bufferSize) 
            throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream(filePath));
        byte[] bytesIn = new byte[bufferSize];
        int read=0;
        while((read=zis.read(bytesIn))!=-1) {
            bos.write(bytesIn,0,read);
        }
        bos.close();
    }
   
    public static void main(String[] args) throws Exception {
    
        System.out.println("Extracting File Names from a ZIP file using ZipFile:");
        readUsingZipFile();
        System.out.println("Extracting File Names from a ZIP file using ZipInputStream:");
        readUsingZipInputStream();
        System.out.println("Unzip a Zip file:");
        unzipUtility();
        
    
    }
}

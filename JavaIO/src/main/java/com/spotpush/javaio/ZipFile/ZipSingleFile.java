package com.spotpush.javaio.ZipFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class ZipSingleFile {

    static void zipSingleFile() {
        
        String srcFileName = "C://JavaIOFiles//zipsinglefile//testfile.txt";
        String zipFile = "C://JavaIOFiles//zipsinglefile//testfile.zip";
        int length;
        
        try {
            /**
             * holds the content of a file in memory
             */
            byte[] buffersize = new byte[1024];
            
            /**
             * This deals with file output - where the source file will be written
             * Create a new FileOutputStream (fos) Stream and pass a string
             * parameter (zipFile).  Create a new ZipOutputStream and pass fos 
             */
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
                                    
            /**
             * This deals with file input - the location of the source file
             * Create a new File (srcFile) and pass srcFileName, just this bit 
             * "The Mental Edge - Relaxation and Concentration.pdf", to it.
             * Create a new FileInputStream (fis), which reads input bytes
             * from a file (srcFile)
             */
            File srcFile = new File(srcFileName);
            FileInputStream fis = new FileInputStream(srcFile);
            System.out.println(fis.read());
            System.out.println(buffersize.length);
            
            /**
             * zos is a ZipOutputStream and putNextEntry positions the stream
             * to the start of the entry data.
             */
            
            //Using srcFileName will zip the directory
            //ZipEntry zipEntry = new ZipEntry(srcFileName);
            //zos.putNextEntry(zipEntry);
                
                
            //ZipEntry zipEntry = new ZipEntry(srcFile.getName());
            //zos.putNextEntry(zipEntry);
            

            //The following is a more efficient way of writing the above
            //it's less coe and zips up just the file and not the directory
            zos.putNextEntry(new ZipEntry(srcFile.getName()));
                        
            //This will zip up the file and directory structure
                //zos.putNextEntry(new ZipEntry(srcFileName));
            
            while((length = fis.read(buffersize))>0) {
                zos.write(buffersize,0,length);
                System.out.println(fis.read()); //this prints the bytes to the console
            }
            zos.closeEntry();
            fis.close();
        } catch (IOException ioe) {
            System.err.println("I/O Error: "+ioe);
        }  
    }
        
    public static void main(String[] args) {
    
        zipSingleFile();
    }
}

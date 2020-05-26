package com.spotpush.javaio.ZipFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class CompressingZIPFiles {

    public static void main(String[] args) {
    
        try(FileOutputStream fos = new FileOutputStream("c://JavaIOFiles/JavaIO.zip");
            ZipOutputStream zos = new ZipOutputStream(fos);
            FileInputStream fin = new FileInputStream("c://JavaIOFiles//JavaIO.txt");) {
            ZipEntry ze = new ZipEntry("JavaIO.txt");
            zos.putNextEntry(ze);
            byte[] buffer = new byte[1024];
            int len;
            while((len=fin.read(buffer))>0) {
                zos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            
        
    }
}

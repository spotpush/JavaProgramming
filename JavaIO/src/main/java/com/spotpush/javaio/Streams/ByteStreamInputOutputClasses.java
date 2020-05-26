package com.spotpush.javaio.Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class ByteStreamInputOutputClasses {

    static void byteArrayInputOutputStream() {
        
    }
    
    static void filterIOStream() {
        
        //bufferedInputStream()
        //DataInputStream
        //LineNumberInputStream
        //PushbackInputStream
    }
    
    /**
     * Uses byte streams FileInputStrem/FileOutputStream to copy
     * the contents of one file (xanadu.txt) to another (outputxanadu.txt)
     * Always close Streams
     * Byte Streams should only be used for the most primitive IO
     * Since xanadu.txt contains only text it's more appropriate to use
     * character streams
     * @throws IOException 
     */
    static void FileInputOutputStream() throws IOException {
        FileInputStream fis = new FileInputStream(
                "C://JavaIOFiles//oraclelessons//xanadu.txt");
        FileOutputStream fos = new FileOutputStream(
                "C://JavaIOFiles//oraclelessons//outputxanadu.txt");
        try {
            int c; //holds a byte value in its last 8 digits
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } finally {
            if (fis != null) {
                fis.close();
            } if (fos != null) {
                fos.close();
            }
        }
        
    }
    
    static void objectInputOutputStream() {
        
    }
    
    static void pipedInputOutputStream() {
        
    }
    
    static void sequenceInputStream() {
        //no corresponding output stream
    }
    
    public static void main(String[] args) throws IOException {
    
        try {
            FileInputOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
            
    }
}

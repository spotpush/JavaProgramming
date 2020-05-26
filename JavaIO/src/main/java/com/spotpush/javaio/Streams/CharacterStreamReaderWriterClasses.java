package com.spotpush.javaio.Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
* Character values are stored using unicode conventions
* Character streams automatically translate to and from this local character set
* Western locals, local character set is usually 8-bit ASCII
* All character stream classes descend from Reader and Writer
* FileReader and FileWriter specialise in file IO
* Character Streams are often "wrappers" for byte streams.  Character streams
* use byte streams to perform the physical IO whilst character streams handle
* the translation between characters and bytes for example
* FileReader -> FileInputStream
* FileWriter -> FileOutputStream
* @author Stephen Hardy @ spotpush.com
*/

public class CharacterStreamReaderWriterClasses {

    static void fileReaderWriter() throws FileNotFoundException, IOException {
    
        FileReader fr = new FileReader("C://JavaIOFiles//oraclelessons//xanadu.txt");
        FileWriter fw = new FileWriter("C://JavaIOFiles//oraclelessons//fileWriterxanadu.txt");
        try {
            int c; //hold a character value in its last 16 bits
            while ((c = fr.read())!=-1) {
                fw.write(c);
            }
        } finally {
            if (fr != null) {
                fr.close();
            }if (fw != null) {
                fw.close();
            }
        }
    }
    
    /**
     * BufferedReader.readLine() allows us to use bigger units than single 
     * characters a common unit being by line
     * It's important to note the line terminator since this my differ
     * between operating system
     */
    static void bufferedReaderWriter() throws FileNotFoundException,
            IOException {
        //LineNumberReader();
        /**
         * FileReader is an unbuffered process where each call  
         */
        BufferedReader br = new BufferedReader(new FileReader(
                "C://JavaIOFiles//oraclelessons//xanadu.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(
                "C://JavaIOFiles//oraclelessons//printwriterxanadu.txt"));
        try {
            String l;
            while((l = br.readLine())!=null) {
                pw.println(l);
            }
        }finally {
            if (br != null) {
                br.close();
            }if (pw != null) {
                pw.close();
            }
        }
    }
    
    /**
     * Static means this method belongs to this class rather than an object
     * When creating an object of this class then this method will need to 
     * be called and/or overridden
     * void means this method return null.  
     */
    static void charArrayReaderWriter() {
        
    } 
    
    static void filterReaderWriter() {
        //PushbackReader();
    }
    
    /**
     * InputStreamReader and OutputStreamWriter provide bridges from byte
     * streams to character streams
     */
    static void inputOutputStreamReaderWriter() {
        //FileReader();
        //FileWriter();
    }
    
    static void pipedReaderWriter() {
        
    }
    
    static void printWriter() {
        
    }
    
    static void stringReaderWriter() {
        
    }
    
    
    public static void main(String[] args) throws FileNotFoundException,
            IOException {
    
        try {
            fileReaderWriter();
            bufferedReaderWriter();
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

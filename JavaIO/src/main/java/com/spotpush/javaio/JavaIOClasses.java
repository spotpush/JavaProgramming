package com.spotpush.javaio;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
* Exploring the different classes within the java.io package
* @author Stephen Hardy @ spotpush.com
*/

public class JavaIOClasses {

    
    static void bufferedInputStream() throws IOException {
        try {
            BufferedInputStream bIS = new BufferedInputStream(new FileInputStream(
               "c://JavaIOFiles//JavaIO.txt"));
            int content = bIS.read();
            while (content != 1) {
                content += bIS.read();
            }
            bIS.close();
            System.out.print(content);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    static void inputStream() throws FileNotFoundException {
        String str="";
        try {
            InputStream iS = new FileInputStream("c://JavaIOFiles//JavaIO.txt");
            InputStreamReader r = new InputStreamReader(iS);
            BufferedReader bR = new BufferedReader(r);
            String content;
            while((content = bR.readLine())!=null) {
                str += content + "\n";
            }
            System.out.print(bR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) throws IOException {
    
        try {
            //bufferedInputStream();
            inputStream();
        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        
    }
}

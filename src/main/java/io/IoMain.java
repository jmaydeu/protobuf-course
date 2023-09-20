package io;

import example.simple.SimpleOuterClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoMain {

    private static void writeTo(SimpleOuterClass.Simple message, String path){

        try {

            FileOutputStream fos = new FileOutputStream(path);
            message.writeTo(fos);
            fos.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }


    private static void readFrom(String path){

        try {

            FileInputStream fis = new FileInputStream(path);
            SimpleOuterClass.Simple message = SimpleOuterClass.Simple.parseFrom(fis);

        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }

    public static void main(String[] args) {


        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(41)
                .setName("name")
                .setIsSimple(true)
                .build();

        String path = "c:\\temp\\simple.bin";

        writeTo(message,path);
        readFrom(path);




    }

}

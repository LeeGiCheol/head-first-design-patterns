package me.gicheol.designpattern.decorator.iodecorator;

import org.springframework.beans.factory.annotation.Value;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            String path = InputTest.class.getResource("").getPath();
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path + "test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}

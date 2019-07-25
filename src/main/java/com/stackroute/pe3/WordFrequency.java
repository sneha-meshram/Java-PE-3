package com.stackroute.pe3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordFrequency {

    public String[] calculateFrequency(String content) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        String strCurrentLine;
        while ((strCurrentLine = br.readLine()) != null) {

            String line=strCurrentLine;
        }

    }
}

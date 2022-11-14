package com.company;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //считали размер из файла
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String tempSize = br.readLine();
        int size = Integer.parseInt(tempSize);
        System.out.println(size);

        //создали новый файл
        File file = new File("file2.txt");
        File file3 = new File("file3.txt");

        PrintWriter pw3 = new PrintWriter(file3);
        
            //считали таблицу в файл2
            PrintWriter pw = new PrintWriter(file);
            for (String item : getMultiplicationTable(size)) {
                pw.println(item);
                pw3.println(item);
                System.out.println(item);
            }
            pw.close();
            pw3.println(size);
        pw3.close();


    }

    public static List<String> getMultiplicationTable(int size) {
        List<String> multiplicationTable = new ArrayList<>();

        StringBuilder tempString = new StringBuilder();
        tempString.append(String.format("%4s", ""));
        for (int i = 1; i <= size; i++) {
            tempString.append(String.format("%4d", i));
        }
        multiplicationTable.add(tempString.toString());

        for (int i = 1; i <= size; i++) {
            tempString = new StringBuilder();
            tempString.append(String.format("%4d", i));
            for (int j = 1; j <= size; j++) {
                tempString.append(String.format("%4d", i * j));
            }
            multiplicationTable.add(tempString.toString());
        }
        return multiplicationTable;
    }
}


package ru.ishchenko.task18;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Main {

    public static final String FILE_1 = "C:\\task18\\1.txt";
    public static final String FILE_2 = "C:\\task18\\2.txt";
    public static final String TEXT = "Hello Word";

    public static void createDir() {
        String dir = "C:\\task18";
        File directory = new File(dir);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Директория " + dir + " создана");
        }
    }

    public static void createFile() {
        File file = new File(FILE_1);
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("Файл " + file.getName() + " был создан");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }


    public static void writeToFile(String path, String text) {
        try (FileWriter wr = new FileWriter(path)) {
            wr.write(text);
            wr.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileChange(String path, String pathFinal) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            writeToFile(pathFinal, stringEncoding(br));
            System.out.println("Файл " + path + " был перекодирован в файл " + FILE_2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String stringEncoding(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            byte[] b2 = s.getBytes();
            sb.append(new String(b2, StandardCharsets.UTF_16LE));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        createDir();
        createFile();
        writeToFile(FILE_1, TEXT);
        fileChange(FILE_1, FILE_2);
    }
}
package ru.aston.zhemoita_av.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReadWriteFile {
    public static void main(String[] args) {
        gluingTwoFiles("file.txt", "file2.txt", "write.txt");
        replaceSymbols("replace.txt");
    }

    // 1. Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    private static List<String> reader(String file) {
        try {
            Path filePath = Paths.get(file);
            List<String> list = Files.readAllLines(filePath);

            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // 2. Написать метод, который записывает в файл строку, переданную параметром.
    private static void writer(String file, String str) {
        try {
            Path filePath = Paths.get(file);
            Files.writeString(filePath, str, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
    private static void gluingTwoFiles(String pathToFirstFile, String pathToSecondFile, String pathToWriteFile) {
        reader(pathToFirstFile).stream().forEach(s -> writer(pathToWriteFile, s + "\n"));
        reader(pathToSecondFile).stream().forEach(s -> writer(pathToWriteFile, s + "\n"));
    }

    // 4. Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’.
    private static void replaceSymbols(String file){
        try {
            Path pathToFile = Paths.get(file);
            String context = Files.readString(pathToFile);
            StringBuilder newContext = new StringBuilder();

            for (int i = 0; i < context.length(); i++) {
                char currentCharacter = context.charAt(i);

                if (!Character.isLetterOrDigit(currentCharacter)) {
                    newContext.append('$');
                } else {
                    newContext.append(currentCharacter);
                }
            }

            Files.writeString(pathToFile, String.join("", newContext.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

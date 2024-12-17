import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        File inputFile = new File("D:\\input.txt");
        if (!inputFile.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))){
               writer.write("Hello! This is a sample text. Feel free to modify it.");
                System.out.println("Файл input.txt не найден. Создан новый файл с начальным текстом.");
            } catch (IOException e) {
                System.out.println("Ошибка создания файла. " + e.getMessage());
                return;
            }
        }


        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\input.txt"))){
            int totalWords = 0;
            int longestWordSize = 0;
            String longestWord = "";
            Set<String> set = new HashSet<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                totalWords += words.length;
                for (String word : words){
                    if (!word.isEmpty()) {
                        set.add(word.toLowerCase());
                        if (word.length() > longestWordSize) {
                            longestWordSize = word.length();
                            longestWord = word;
                        }
                    }
                }
            }
            System.out.println("Общее количество слов: " + totalWords);
            System.out.println("Количество уникальных слов: " + set.size());
            System.out.println("Самое длинное слово: " + longestWord);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
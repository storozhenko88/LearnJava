package lesson16;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        readBook("book");
    }

    public static void readBook (String nameBook){
        File book = new File("src/lesson16/book");
        ArrayList<String[]> bufferSringsBook = new ArrayList<>();
        String buffer;

        if (!book.exists()){
            System.out.println("There isn't book in the directory");
        }
        else {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(book);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((buffer = bufferedReader.readLine()) != null) {
                    bufferSringsBook.add(buffer.trim().toLowerCase().split("[ .,:!?]"));
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            HashMap<String, Integer> statistic = new HashMap<>();
            int count = 0;


            for (String[] strings: bufferSringsBook) {
                for (String word: strings) {
                    if (word.length() > 2){
                        if (!statistic.containsKey(word))
                            statistic.put(word, 1);
                        else {
                            count = statistic.get(word);
                            count++;
                            statistic.put(word, count);
                        }
                    }
                }
            }



        }

    }
}

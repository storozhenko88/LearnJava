package lesson5;

public class Main {

    public static void main(String[] args) {
        String beginWord = "юукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] wordAfter = beginWord.trim().split("Z");
        StringBuffer buffer = new StringBuffer();
        int count = 0;
        for (String word: wordAfter){
            buffer.setLength(0);
            for (int i = word.length()-1; i >= 0; i--){
                buffer.append(word.charAt(i));
            }
            wordAfter[count] = buffer.toString();

            System.out.println(wordAfter[count]);
            count++;
        }


    }
}

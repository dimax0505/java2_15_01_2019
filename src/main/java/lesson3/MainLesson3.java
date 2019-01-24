package lesson3;

import java.util.*;

public class MainLesson3 {

    private static String str = "lorem ipsum dolor sit amet consectetur adipiscing " +
            "elit ipsum quis sapien sit nunc efficitur velit at neque " +
            "feugiat eget ipsum";

    public static void main(String[] args) {
        System.out.println(uniqString(str));
        System.out.println(countString(str));
    }

    //метод подсчета вхождений каждого слова
    private static Map<String,Integer> countString(String str) {
        Map<String,Integer> map = new HashMap<>();
        for (String list : getStringList(str)){
          map.put(list,(map.get(list)==null ? 1 : map.get(list)+1));
        }
        return map;
    }

    // метод возвращает отсортированный набор уникальных слов
    private static Set<String> uniqString(String str) {
      return new TreeSet<>(getStringList(str));
    }

    //метод возвращает лист отдельных слов
    private static List<String> getStringList(String str) {
        return Arrays.asList(str.split(" "));
    }


}

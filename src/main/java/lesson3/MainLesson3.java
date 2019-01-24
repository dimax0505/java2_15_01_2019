package lesson3;

import java.util.*;

public class MainLesson3 {

    public static void main(String[] args) {
        String str = "lorem ipsum dolor sit amet consectetur adipiscing " +
                "elit ipsum quis sapien sit nunc efficitur velit at neque " +
                "feugiat eget ipsum";
        System.out.println(uniqString(str));
        System.out.println(countString(str));
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "9800123456789");
        phoneBook.add("Петров", "9800987654321");
        System.out.println(phoneBook.showAll());
        System.out.println(phoneBook.get("Иванов"));
        phoneBook.add("Иванов", "111111111111");
        System.out.println(phoneBook.showAll());
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Петров"));
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

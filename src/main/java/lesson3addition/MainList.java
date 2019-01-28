package lesson3addition;

public class MainList {

    public static void main(String[] args) {
        MyList myListArray = new MyArrayList();
        myListArray.add("A");
        myListArray.add("B");
        myListArray.add("C");
        myListArray.add("D");
        myListArray.add("E");
        myListArray.add("F");
        myListArray.add("G");
        myListArray.add("H");
        myListArray.add("K");
        myListArray.add("L");
        myListArray.add("M");
        System.out.println(myListArray);
        System.out.println("Пустой ли массив - " + myListArray.isEmpty());
        System.out.println("Содержит ли лист значение С - " + myListArray.contains("C"));
        System.out.println("Содержит ли лист значение 7 - " + myListArray.contains("7"));
        myListArray.remove("D");
        System.out.println(myListArray);
        System.out.println("элемент с индексом 5 - " + myListArray.get(5));
        myListArray.set(5,"Change");
        System.out.println(myListArray);
        System.out.println("Индекс элемента E - " + myListArray.indexOf("E"));

        MyList myListLink = new MyLinkedList();
        myListLink.add("A");
        myListLink.add("B");
        myListLink.add("C");
        myListLink.add("D");
        myListLink.add("E");
        myListLink.add("N");
        myListLink.add("F");
        myListLink.add("U");
        System.out.println(myListLink);
        System.out.println("элементов в списке - " + myListLink.size());
        System.out.println("Содержит ли лист значение U - " + myListLink.contains("U"));
        System.out.println("Содержит ли лист значение 7 - " + myListLink.contains("7"));
        myListLink.remove("U");
        System.out.println(myListLink);
        System.out.println("элемент с индексом 6 -  " + myListLink.get(6));
        myListLink.set(5,"Change");
        System.out.println(myListLink);
        System.out.println("Индекс элемента E - " + myListLink.indexOf("E"));



    }
}

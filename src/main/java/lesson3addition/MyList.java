package lesson3addition;

public interface MyList {
    int size();

    boolean isEmpty();

    boolean contains(String o);

    boolean add(String o);

    boolean remove(String o);

    String get(int index);

    String set(int index, String element);

    int indexOf(String o);
}

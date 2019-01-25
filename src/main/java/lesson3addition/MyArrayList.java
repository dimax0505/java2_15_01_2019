package lesson3addition;

import java.util.Arrays;

public class MyArrayList implements MyList {
    private int size = 0;
    private final int defaultCapacity = 10;
    private String [] strings;

    MyArrayList() {
        strings = new String[defaultCapacity];
    }

    MyArrayList(int capacity){
        strings = new String[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(String o) {
        if (this.isEmpty()) return false;
        else {
            for (int i = 0; i<size; i++){
                if (strings[i].equals(o))return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(String o) {
        if (this.isEmpty() || this.size < strings.length-3) {
            strings[size] = o;
            size++;
            return true;
        }
        else {
            resize();
            strings[size] = o;
            size++;
            return true;
        }
    }



    @Override
    public boolean remove(String o) {
        for (int i = 0; i<size; i++){
            if (strings[i].equals(o)) {
                System.arraycopy(strings,i+1,strings,i,size-i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        return (index<size && index>=0) ? strings[index] : null;
    }

    @Override
    public String set(int index, String element) {
        if (index<size && index>=0) {
            String str = strings[index];
            strings[index]=element;
            return str;
        } return null;

    }

    @Override
    public int indexOf(String o) {
        for (int i = 0; i<size; i++){
            if(strings[i].equals(o))return i;
        }
        return -1;
    }

    private void resize() {
        String [] str1 = new String[strings.length*2];
        System.arraycopy(strings,0,str1,0,size);
        strings = str1;
    }

    @Override
    public String toString() {
        if (strings == null)
            return "null";

        int iMax = this.size() - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(strings[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}

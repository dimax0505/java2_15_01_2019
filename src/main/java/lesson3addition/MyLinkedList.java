package lesson3addition;

public class MyLinkedList implements MyList {

    private int size = 0;
    private MyNode nodeHead;
    private MyNode iterator;


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
        iteratorToHead();
        while (hasNext(this.iterator)) {
            if (this.iterator.getValue().equals(o)) return true;
            else this.iterator = this.iterator.getNext();
        }
        return this.iterator.getValue().equals(o);
    }

    @Override
    public boolean add(String o) {
        if (this.nodeHead == null) {
            this.nodeHead = new MyNode(o);
            this.iterator = this.nodeHead;
            size++;
            return true;
        }
        while (hasNext(this.iterator)) {
            this.iterator = this.iterator.getNext();
        }
        this.iterator.setNext(new MyNode(iterator, o));
        size++;
        return true;
    }

    @Override
    public boolean remove(String o) {
        if (this.contains(o)) {
            if (hasNext(this.iterator) && this.iterator != nodeHead) {
                this.iterator.getPrevious().setNext(this.iterator.getNext());
                this.iterator.getNext().setPrevious(this.iterator.getPrevious());
                size--;
                iterator = nodeHead;
                return true;
            } else if (this.iterator == nodeHead) {
                this.iterator.getNext().setPrevious(null);
                nodeHead = iterator.getNext();
                iterator = nodeHead;
                return true;
            } else {
                this.iterator.getPrevious().setNext(null);
                iterator = nodeHead;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (size == 0) return "список пуст";
        if (index < 0 || index >= size) return "Нет такого элемента";
        iteratorToHead();
        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }
        return iterator.getValue();
    }

    @Override
    public String set(int index, String element) {
        if (size == 0) return "список пуст";
        if (index < 0 || index >= size) return "Нет такого элемента";
        iteratorToHead();
        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }
        String str = iterator.getValue();
        iterator.setValue(element);
        return str;
    }

    @Override
    public int indexOf(String o) {
        iteratorToHead();
        for (int i=0; i<size; i++){
            if (iterator.getValue().equals(o))return i;
            iterator = iterator.getNext();
        }
        return -1;
    }

    private boolean hasNext(MyNode node) {
        return node.getNext() != null;
    }

    private void iteratorToHead() {
        this.iterator = this.nodeHead;
    }

    @Override
    public String toString() {
        if (nodeHead == null)
            return "null";
        iteratorToHead();
        StringBuilder b = new StringBuilder();
        b.append('[');
        while (hasNext(this.iterator)) {
            b.append(String.valueOf(iterator.getValue()));
            b.append(", ");
            this.iterator = this.iterator.getNext();
        }
        b.append(String.valueOf(iterator.getValue()));
        return b.append(']').toString();
    }

}

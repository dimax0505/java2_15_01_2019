package lesson3addition;

class MyNode {
    private MyNode next;
    private MyNode previous;
    private String value;


    MyNode(String value){
        this.value = value;
    }
    MyNode(MyNode node, String value){
        this.value=value;
        this.previous = node;
        this.next = null;
    }

    MyNode getNext() {
        return next;
    }

    void setNext(MyNode next) {
        this.next = next;
    }

    MyNode getPrevious() {
        return previous;
    }

    void setPrevious(MyNode previous) {
        this.previous = previous;
    }

    String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }



}

package lesson2;

class MyDataArrayExeption extends Exception {

    MyDataArrayExeption(int firstIndex, int secondIndex){
        super(String.format("Невозможно преобразовать значение ячейки %d,%d в число типа int", firstIndex, secondIndex));
    }
}

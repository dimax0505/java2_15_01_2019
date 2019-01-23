package lesson2;

public class Main {

    public static void main(String[] args) {
        // создаем массив стрингов для операций
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"6", "7", "8", "9"},
                {"11", "12", "kjg", "14"},
                {"16", "18", "19"},
        };
        // создаем объект класса майн для манипуляций
        Main m = new Main();
        //перехватываем возможные исключения
        try {
            System.out.println(m.summArrayFromString(arr));
        } catch (MySyzeArrayExeption | MyDataArrayExeption e) {
            e.printStackTrace();
        }
    }
// метод подсчета суммы элементов массива
    private int summArrayFromString(String[][] arr) throws MySyzeArrayExeption, MyDataArrayExeption {
        if (!isSyze(arr)) //выбрасываем исключение неправильного размера массива
            throw new MySyzeArrayExeption();
        int summ = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                try {
                    summ += Integer.valueOf(arr[i][j]); // считаем сумму, кастуя к Integer каждый элемент
                } catch (NumberFormatException e) {     // когда ловим исключение формата перехватываем его
                    throw new MyDataArrayExeption(i, j);// и выбрасываем вместо него свое исключение передав текущие
                }                                       // индексы
        return summ;
    }
    private boolean isSyze (String[][] arr){
        if(arr.length !=4)return false;
        for (String[] arrL2: arr) if (arrL2.length!=4)return false;
         return true;
        }
    }


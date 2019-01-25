package lesson3;


import java.util.Objects;
import java.util.TreeSet;

class PhoneBook {
    private TreeSet<Employee> phoneBook = new TreeSet<>();

    void add(String name, String phone) {
        Employee emp = new Employee(name, phone);
        if (phoneBook.contains(emp)) Objects.requireNonNull(phoneBook.ceiling(emp)).add(phone);
        else {
            phoneBook.add(emp);
        }
    }

    Employee get(String name) {
        for (Employee emp : phoneBook) {
            if (emp.getName().equals(name))return emp;
        }
        return null;
    }

    TreeSet<Employee> showAll(){
        return phoneBook;
    }
}

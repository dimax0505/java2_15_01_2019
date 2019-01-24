package lesson3;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private String name;
    private List<String> phone = new LinkedList<>();

    Employee (String name, String phone){
        this.name = name;
        this.phone.add(phone);
    }

    void add (String phone){
        this.phone.add(phone);
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[" + name + " - " + phone + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.getName());
    }
}

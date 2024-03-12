package Week1;
import java.io.*;
public class Company {

    public static class Employee{
        String name;
        int age;
        String address;

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setAddress(String address){
            this.address = address;
        }
        public void print(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Address: "+ address);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("Vo Son Long");
        emp.setAge(23);
        emp.setAddress("Ha Noi");

        emp.print();

    }

}
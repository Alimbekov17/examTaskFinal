import classes.Student;
import enums.Gender;
import service.StudentImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentService = new StudentImpl();
        List<Student> students = new LinkedList<>();
        students.add(new Student("Jack", "Sparrow", 25, Gender.MALE, 10000));
        students.add(new Student("Mary", "Hopkins", 30, Gender.FEMALE, 15400));
        students.add(new Student("Anna", "Marie", 23, Gender.FEMALE, 1000));
        students.add(new Student("David", "Beckham", 50, Gender.MALE, 12900));
        students.add(new Student("Ivan", "Knizak", 10, Gender.MALE, 1000));
        students.add(new Student("Arthur", "Fred", 31, Gender.MALE, 25000));
        students.add(new Student("Jesse", "Martins", 20, Gender.FEMALE, 0));
        students.add(new Student("Chris", "Hemsworth", 40, Gender.MALE, 250000));
        students.add(new Student("Selena", "Gordon", 13, Gender.FEMALE, 900));
        students.add(new Student("Martin", "Grey", 18, Gender.MALE, 23400));

        while (true) {
            commands();
            System.out.print("Press: ");
            String press = new Scanner(System.in).next();

            switch (press) {
                case "1" -> studentService.getByName(students).forEach(System.out::println);
                case "2" -> studentService.getByAgeAndBalance(students).forEach(System.out::println);
                case "3" -> System.out.println(studentService.getRichestBoy(students));
                case "4" -> System.out.println(studentService.getRichestGirl(students));
                case "5" -> studentService.getAllNames(students).forEach(System.out::println);
                case "6" -> studentService.getAllMoney(students).forEach(System.out::println);
                case "7" -> System.out.println(studentService.getFirstStudent(students));
                case "8" -> System.out.println(studentService.getQuantity(students));
                case "9" -> studentService.addToGroup(students).forEach(System.out::println);
                    default -> System.out.println("Wrong command!");
            }
        }



    }
    public static void commands(){
        System.out.println("""
                * 1 - аты А менен башталган студенттерди чыгарыныз.
                * 2 - жашы 15тен чон жана  акчасы 2000 ден чон балдарды чыгарыныз.
                * 3 - эн коп акчасы бар студентти чыгарыныз.
                * 4 - эн акчасы коп кызды чыгарыныз.
                * 5 - баардык студенттердин атын эле консолго чыгарынз.
                * 6 - бардык студеттердин акчасына 1000 сомдон кошуп чыгарыныз.
                * 7 - биринчи турган студентти чыгарыныз.
                * 8 - канча студент бар экен чыгарыныз.
                * 9 - балдарды жана кыздарды группага салгыла.
                """);
    }
}
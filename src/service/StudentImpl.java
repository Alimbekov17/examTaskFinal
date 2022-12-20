package service;

import classes.Student;
import enums.Gender;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class StudentImpl implements StudentService{
    @Override
    public List<Student> getByName(List<Student> students) {
        List<Student> students1 = null;
        try {
            System.out.println("Enter a letter: ");
            String letter = new Scanner(System.in).next();
            if (letter.matches("[0-9]*"))throw new Exception("Enter a letter not number!");

            students1 = students.stream().filter(x -> x.getName().startsWith(letter)).toList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students1;
    }

    @Override
    public List<Student> getByAgeAndBalance(List<Student> students) {
        return students.stream().
                filter(x -> x.getAge() > 15 && x.getBalance() > 2000 && x.getGender().equals(Gender.MALE)).toList();
    }

    @Override
    public Optional<Student> getRichestBoy(List<Student> students) {
        return students.stream().filter(x-> x.getGender().equals(Gender.MALE)).max(Comparator.comparing(Student::getBalance));
    }

    @Override
    public Optional<Student> getRichestGirl(List<Student> students) {
        return students.stream().filter(x-> x.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(Student::getBalance));

    }

    @Override
    public List<String> getAllNames(List<Student> students) {
        return students.stream().map(Student::getName).toList();
    }

    @Override
    public List<Integer> getAllMoney(List<Student> students) {
        return students.stream().map(x->x.getBalance() + 1000).toList();
    }

    @Override
    public Student getFirstStudent(List<Student> students) {
        return students.get(0);
    }

    @Override
    public int getQuantity(List<Student> students) {
        return (int) students.stream().count();
    }

    @Override
    public List<List<Student>> addToGroup(List<Student> students) {
        List<Student> boys = students.stream().filter(x -> x.getGender().equals(Gender.MALE)).toList();
        List<Student> girls = students.stream().filter(x -> x.getGender().equals(Gender.MALE)).toList();

        return List.of(boys, girls);
    }
}

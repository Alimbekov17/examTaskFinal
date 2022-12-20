package service;

import classes.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getByName(List<Student> students);
    List<Student> getByAgeAndBalance(List<Student> students);
    Optional<Student> getRichestBoy(List<Student> students);
    Optional<Student> getRichestGirl(List<Student> students);
    List<String> getAllNames(List<Student> students);
    List<Integer> getAllMoney(List<Student> students);
    Student getFirstStudent(List<Student> students);
    int getQuantity(List<Student> students);
    List<List<Student>> addToGroup(List<Student> students);




}

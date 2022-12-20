package classes;

import enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private int balance;

    @Override
    public String toString() {
        return  "\nName   : " + name +
                "\nSurname: " + surname +
                "\nAge    : " + age +
                "\nGender : " + gender +
                "\nBalance: " + balance +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}

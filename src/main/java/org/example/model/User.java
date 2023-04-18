package org.example.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String fullName;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +"\n";
    }

    public User(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}

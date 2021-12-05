package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup(32);
        student.setDate("2019-10-01");

        System.out.println(student.getFio() + " name group: " + student.getGroup()
                + " receipt date: " + student.getDate());
    }
}

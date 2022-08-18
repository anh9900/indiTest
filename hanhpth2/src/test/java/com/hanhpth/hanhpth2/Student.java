package com.hanhpth.hanhpth2;

import java.util.ArrayList;

//model đối tượng để thao tác
public class Student {
    private int id;
    private String name;
    private String email;
    private String sdt;
    private Double ĐTB;

    public Student() {
    }

    public Student(int id, String name, String email, String sdt, Double ĐTB) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sdt = sdt;
        this.ĐTB = ĐTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Double getĐTB() {
        return ĐTB;
    }

    public void setĐTB(Double ĐTB) {
        this.ĐTB = ĐTB;
    }

    public static void main(String[] args) {
        ArrayList<String> Student = new ArrayList();
        Student.add("1");
        Student.add("hue");
        Student.add("hue@gmail.com");
        Student.add("0954647467");
        Student.add("10");
        System.out.println("thong tin chi hue\n"+Student);

    }
}


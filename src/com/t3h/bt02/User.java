package com.t3h.bt02;

public class User {
    private String userName;
    private String password;
    private String name;
    private String dateOfBirth;
    private int age;
    private String job;

    public User(String userName, String password, String name, String dateOfBirth, int age, String job) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfor() {
        System.out.println("Name: " + name);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Date Of Birth:" + dateOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
    }

    public boolean changePassword(String passwordOld, String passwordNew){
        if (passwordOld.equals(passwordNew)){
            System.out.println("Mật khẩu không hợp lệ");
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return name+"_"+userName+"_"+password;
    }
}

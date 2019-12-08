package com.t3h.bt02;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        String username = "BcB";
        String password = "2345";
        manager.login(username, password);
        manager.doiMatKhau(username, password, "11111");
    }
}

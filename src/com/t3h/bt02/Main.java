package com.t3h.bt02;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        String username = "BBB";
        String password = "2345";
        manager.login(username, password);
        manager.doiMatKhau(password, "11111");
        manager.xoaNguoiDung("11111");
        manager.showAll();
    }
}

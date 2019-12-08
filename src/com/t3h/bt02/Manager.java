package com.t3h.bt02;

import java.util.ArrayList;

public class Manager {
    ArrayList<User> users = new ArrayList<>();
    User user;

    public Manager() {
        users.add(new User("AAA", "1234", "Nguyễn Văn A", "30/12/1997", 21, "No"));
        users.add(new User("BBB", "2345", "Nguyễn Văn B", "30/12/1997", 22, "Yes"));
        users.add(new User("CCC", "3456", "Nguyễn Văn C", "30/12/1997", 23, "No"));
    }

    public void dangKi(String userNameNew, String passwordNew, String nameNew, String dateOfBirdNew, int ageNew, String jobNew) {
        for (User user : users) {
            if (user.getUserName().equals(userNameNew)) {
                System.out.println("Trùng tên người dùng");
                return;
            }
        }
        users.add(new User(userNameNew, passwordNew, nameNew, dateOfBirdNew, ageNew, jobNew));
        System.out.println("Đăng kí thành công");
    }

    public void login(String userName, String password) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                System.out.println("Đăng nhập thành công");
                this.user = user;
                return;
            }
        }
        System.out.println("Đăng nhập thất bại");
    }

    public void doiMatKhau(String username, String passwordOld, String passwordNew) {
        if (this.user != null) {
            if (this.user.changePassword(passwordOld, passwordNew)) {
                this.user.setPassword(passwordNew);
                System.out.println("Đổi mật khẩu thành công");
            }
        } else {
            System.out.println("Đổi mật khẩu thất bại");
        }
    }

    public void xoaNguoiDung(String userName, String passwordOld) {
        if (this.user != null) {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUserName().equals(this.user.getUserName())) {
                    users.remove(i);
                    return;
                }
            }
            System.out.println("Xóa người dùng thành công");
        }
        System.out.println("Xóa người dùng thất bại");
    }
}
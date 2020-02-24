package com.lpq.service;

import com.lpq.pojo.User;

public interface UserService {

    boolean checkUser(User user);
    User get(int id);
    User getByStudentid(String studnetid);

}

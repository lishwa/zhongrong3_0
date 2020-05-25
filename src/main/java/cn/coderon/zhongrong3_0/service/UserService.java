package cn.coderon.zhongrong3_0.service;

import cn.coderon.zhongrong3_0.bean.User;

import java.util.List;

public interface UserService {
    List<User> getUserByCompanyId(Integer companyId);

    int addUser(User user);

    int updateUserStatus(Integer id, Integer status);

    User findByUserPhone(String phone);

    List<User> getUser(String city);
}

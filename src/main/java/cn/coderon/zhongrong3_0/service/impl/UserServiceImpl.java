package cn.coderon.zhongrong3_0.service.impl;

import cn.coderon.zhongrong3_0.bean.User;
import cn.coderon.zhongrong3_0.dao.UserMapper;
import cn.coderon.zhongrong3_0.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getUserByCompanyId(Integer companyId) {
        return userMapper.getUserByCompanyId(companyId);
    }

    @Override
    public int addUser(User user) {
        user.setCreatetime(new Date());
        user.setStatus(1);
        user.setUpdatetime(new Date());
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateUserStatus(Integer id, Integer status) {
        return userMapper.updateUserStatus(id,status);
    }

    @Override
    public User findByUserPhone(String phone) {
        return userMapper.findByUserPhone(phone);
    }

    @Override
    public List<User> getUser(String city) {
        return userMapper.getUser(city);
    }
}

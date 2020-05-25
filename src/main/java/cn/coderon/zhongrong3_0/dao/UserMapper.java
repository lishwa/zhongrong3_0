package cn.coderon.zhongrong3_0.dao;

import cn.coderon.zhongrong3_0.bean.User;
import cn.coderon.zhongrong3_0.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUserByCompanyId(Integer companyId);

    int updateUserStatus(@Param("id")Integer id, @Param("status")Integer status);

    User findByUserPhone(String phone);

    List<User> getUser(String city);
}
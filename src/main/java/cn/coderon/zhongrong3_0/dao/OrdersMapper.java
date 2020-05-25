package cn.coderon.zhongrong3_0.dao;

import cn.coderon.zhongrong3_0.bean.Orders;
import cn.coderon.zhongrong3_0.bean.OrdersExample;
import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    int getCompanyOrders(Integer companyId);

    List<Orders> getCompanyOrdersByDate(@Param("companyId") Integer companyId,@Param("dateString")  String date);

    List<Orders> selectByMarkAsRead(Integer markAsRead);

    int updateOrdersByMarkAsRead(Integer id);

    List<Orders> getUserOrders(Integer businessId);
}
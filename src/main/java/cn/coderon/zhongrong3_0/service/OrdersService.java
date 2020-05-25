package cn.coderon.zhongrong3_0.service;

import cn.coderon.zhongrong3_0.bean.Orders;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrdersService {
    int getCompanyOrders(Integer companyId);

    List<Orders> getCompanyOrdersByDate(Integer companyId, String date);

    List<Orders> getOrders(Integer markAsRead);

    int updateOrdersByMarkAsRead(Integer id);

    List<Orders> getAllOrders();

    List<Orders> getUserOrders(Integer businessId);
}

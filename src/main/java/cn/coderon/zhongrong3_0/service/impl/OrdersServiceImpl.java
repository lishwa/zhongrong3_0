package cn.coderon.zhongrong3_0.service.impl;

import cn.coderon.zhongrong3_0.bean.Orders;
import cn.coderon.zhongrong3_0.dao.OrdersMapper;
import cn.coderon.zhongrong3_0.service.OrdersService;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;
    @Override
    public int getCompanyOrders(Integer companyId) {

        return ordersMapper.getCompanyOrders(companyId);
    }

    @Override
    public List<Orders> getCompanyOrdersByDate(Integer companyId, String date) {
        return ordersMapper.getCompanyOrdersByDate(companyId,date);
    }

    @Override
    public List<Orders> getOrders(Integer markAsRead) {
        return ordersMapper.selectByMarkAsRead(markAsRead);
    }

    @Override
    public int updateOrdersByMarkAsRead(Integer id) {
        return ordersMapper.updateOrdersByMarkAsRead(id);
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersMapper.selectByExample(null);
    }

    @Override
    public List<Orders> getUserOrders(Integer businessId) {
        return ordersMapper.getUserOrders(businessId);
    }
}

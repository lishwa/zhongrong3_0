package cn.coderon.zhongrong3_0.service.impl;

import cn.coderon.zhongrong3_0.bean.Admin;
import cn.coderon.zhongrong3_0.dao.AdminMapper;
import cn.coderon.zhongrong3_0.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;
    @Override
    public Admin findAdminByAccount(String account) {
        return adminMapper.findAdminByAccount(account);
    }
}

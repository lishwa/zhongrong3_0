package cn.coderon.zhongrong3_0.service;

import cn.coderon.zhongrong3_0.bean.Admin;

public interface AdminService {
    Admin findAdminByAccount(String account);
}

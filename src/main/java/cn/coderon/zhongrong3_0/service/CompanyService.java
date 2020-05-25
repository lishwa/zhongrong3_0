package cn.coderon.zhongrong3_0.service;

import cn.coderon.zhongrong3_0.bean.Company;

import java.util.List;

public interface CompanyService {
    Company findCompanyAdminByAccount(String account);

    List<Company> getCompanyAll();

    int addCompany(Company company);

    int updateCompanyStatus(Integer companyId,Integer status);
}

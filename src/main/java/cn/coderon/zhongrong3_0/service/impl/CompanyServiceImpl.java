package cn.coderon.zhongrong3_0.service.impl;

import cn.coderon.zhongrong3_0.bean.Company;
import cn.coderon.zhongrong3_0.dao.CompanyMapper;
import cn.coderon.zhongrong3_0.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Resource
    private CompanyMapper companyMapper;
    @Override
    public Company findCompanyAdminByAccount(String account) {
        return companyMapper.findCompanyAdminByAccount(account);
    }

    @Override
    public List<Company> getCompanyAll() {
        return companyMapper.selectByExample(null);
    }

    @Override
    public int addCompany(Company company) {
        company.setStatus(1);
        return companyMapper.insertSelective(company);
    }

    @Override
    public int updateCompanyStatus(Integer companyId,Integer status) {
        Company company = new Company();
        company.setId(companyId);
        company.setStatus(status);
        return companyMapper.updateByPrimaryKeySelective(company);
    }
}

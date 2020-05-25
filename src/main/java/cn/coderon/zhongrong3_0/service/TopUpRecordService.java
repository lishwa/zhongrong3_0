package cn.coderon.zhongrong3_0.service;

import cn.coderon.zhongrong3_0.bean.TopUpRecord;

import java.util.List;

public interface TopUpRecordService {
    String getCompanyIntegralBalance(Integer companyId);

    int buyPoints(Integer companyId,Double CNY);

    List<TopUpRecord> getTopUpRecordByCompanyId(Integer companyId);
}

package cn.coderon.zhongrong3_0.service.impl;

import cn.coderon.zhongrong3_0.bean.TopUpRecord;
import cn.coderon.zhongrong3_0.dao.TopUpRecordMapper;
import cn.coderon.zhongrong3_0.service.TopUpRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class TopUpRecordServiceImpl implements TopUpRecordService {
    @Resource
    private TopUpRecordMapper topUpRecordMapper;
    @Override
    public String getCompanyIntegralBalance(Integer companyId) {

        String companyIntegralBalance = topUpRecordMapper.getCompanyIntegralBalance(companyId);
        return companyIntegralBalance;
    }

    @Override
    public int buyPoints(Integer companyId,Double CNY) {
        Date date = new Date();
        //首先定义格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String time = sdf.format(date);
        TopUpRecord topUpRecord = new TopUpRecord();
        topUpRecord.setCompanyId(companyId);
        topUpRecord.setOrderId(time+(int)((Math.random()*9+1)*10000));
        topUpRecord.setCny(CNY);
        topUpRecord.setTopUpWay("线下充值");
        topUpRecord.setCreateTime(new Date());
        topUpRecord.setUpdateTime(new Date());
        return topUpRecordMapper.insert(topUpRecord);
    }

    @Override
    public List<TopUpRecord> getTopUpRecordByCompanyId(Integer companyId) {
        return topUpRecordMapper.getTopUpRecordByCompanyId(companyId);
    }
}

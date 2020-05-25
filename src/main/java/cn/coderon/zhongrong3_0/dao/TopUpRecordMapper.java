package cn.coderon.zhongrong3_0.dao;

import cn.coderon.zhongrong3_0.bean.TopUpRecord;
import cn.coderon.zhongrong3_0.bean.TopUpRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopUpRecordMapper {
    long countByExample(TopUpRecordExample example);

    int deleteByExample(TopUpRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopUpRecord record);

    int insertSelective(TopUpRecord record);

    List<TopUpRecord> selectByExample(TopUpRecordExample example);

    TopUpRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TopUpRecord record, @Param("example") TopUpRecordExample example);

    int updateByExample(@Param("record") TopUpRecord record, @Param("example") TopUpRecordExample example);

    int updateByPrimaryKeySelective(TopUpRecord record);

    int updateByPrimaryKey(TopUpRecord record);

    String getCompanyIntegralBalance(@Param("companyId")Integer companyId);


    List<TopUpRecord> getTopUpRecordByCompanyId(Integer companyId);
}
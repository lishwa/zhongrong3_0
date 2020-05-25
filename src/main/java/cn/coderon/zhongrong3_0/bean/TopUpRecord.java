package cn.coderon.zhongrong3_0.bean;

import java.util.Date;

public class TopUpRecord {
    private Integer id;

    private String orderId;

    private Double cny;

    private Integer companyId;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private Integer createBy;

    private String topUpWay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Double getCny() {
        return cny;
    }

    public void setCny(Double cny) {
        this.cny = cny;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public String getTopUpWay() {
        return topUpWay;
    }

    public void setTopUpWay(String topUpWay) {
        this.topUpWay = topUpWay == null ? null : topUpWay.trim();
    }
}
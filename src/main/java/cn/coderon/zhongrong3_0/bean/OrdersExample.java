package cn.coderon.zhongrong3_0.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("mobile_no is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("mobile_no is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("mobile_no =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("mobile_no <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("mobile_no >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("mobile_no <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("mobile_no <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("mobile_no like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("mobile_no not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("mobile_no in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("mobile_no not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("mobile_no between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("mobile_no not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5IsNull() {
            addCriterion("mobile_no_md5 is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5IsNotNull() {
            addCriterion("mobile_no_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5EqualTo(String value) {
            addCriterion("mobile_no_md5 =", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5NotEqualTo(String value) {
            addCriterion("mobile_no_md5 <>", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5GreaterThan(String value) {
            addCriterion("mobile_no_md5 >", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5GreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no_md5 >=", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5LessThan(String value) {
            addCriterion("mobile_no_md5 <", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5LessThanOrEqualTo(String value) {
            addCriterion("mobile_no_md5 <=", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5Like(String value) {
            addCriterion("mobile_no_md5 like", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5NotLike(String value) {
            addCriterion("mobile_no_md5 not like", value, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5In(List<String> values) {
            addCriterion("mobile_no_md5 in", values, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5NotIn(List<String> values) {
            addCriterion("mobile_no_md5 not in", values, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5Between(String value1, String value2) {
            addCriterion("mobile_no_md5 between", value1, value2, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andMobileNoMd5NotBetween(String value1, String value2) {
            addCriterion("mobile_no_md5 not between", value1, value2, "mobileNoMd5");
            return (Criteria) this;
        }

        public Criteria andLevelEducationIsNull() {
            addCriterion("level_education is null");
            return (Criteria) this;
        }

        public Criteria andLevelEducationIsNotNull() {
            addCriterion("level_education is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEducationEqualTo(String value) {
            addCriterion("level_education =", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationNotEqualTo(String value) {
            addCriterion("level_education <>", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationGreaterThan(String value) {
            addCriterion("level_education >", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationGreaterThanOrEqualTo(String value) {
            addCriterion("level_education >=", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationLessThan(String value) {
            addCriterion("level_education <", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationLessThanOrEqualTo(String value) {
            addCriterion("level_education <=", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationLike(String value) {
            addCriterion("level_education like", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationNotLike(String value) {
            addCriterion("level_education not like", value, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationIn(List<String> values) {
            addCriterion("level_education in", values, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationNotIn(List<String> values) {
            addCriterion("level_education not in", values, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationBetween(String value1, String value2) {
            addCriterion("level_education between", value1, value2, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andLevelEducationNotBetween(String value1, String value2) {
            addCriterion("level_education not between", value1, value2, "levelEducation");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("order_source like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("order_source not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeIsNull() {
            addCriterion("professional_type is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeIsNotNull() {
            addCriterion("professional_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeEqualTo(String value) {
            addCriterion("professional_type =", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeNotEqualTo(String value) {
            addCriterion("professional_type <>", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeGreaterThan(String value) {
            addCriterion("professional_type >", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("professional_type >=", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeLessThan(String value) {
            addCriterion("professional_type <", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeLessThanOrEqualTo(String value) {
            addCriterion("professional_type <=", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeLike(String value) {
            addCriterion("professional_type like", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeNotLike(String value) {
            addCriterion("professional_type not like", value, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeIn(List<String> values) {
            addCriterion("professional_type in", values, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeNotIn(List<String> values) {
            addCriterion("professional_type not in", values, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeBetween(String value1, String value2) {
            addCriterion("professional_type between", value1, value2, "professionalType");
            return (Criteria) this;
        }

        public Criteria andProfessionalTypeNotBetween(String value1, String value2) {
            addCriterion("professional_type not between", value1, value2, "professionalType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNull() {
            addCriterion("income_type is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNotNull() {
            addCriterion("income_type is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeEqualTo(String value) {
            addCriterion("income_type =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotEqualTo(String value) {
            addCriterion("income_type <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThan(String value) {
            addCriterion("income_type >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("income_type >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThan(String value) {
            addCriterion("income_type <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThanOrEqualTo(String value) {
            addCriterion("income_type <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLike(String value) {
            addCriterion("income_type like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotLike(String value) {
            addCriterion("income_type not like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIn(List<String> values) {
            addCriterion("income_type in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotIn(List<String> values) {
            addCriterion("income_type not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeBetween(String value1, String value2) {
            addCriterion("income_type between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotBetween(String value1, String value2) {
            addCriterion("income_type not between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(Integer value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(Integer value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(Integer value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(Integer value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(Integer value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<Integer> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<Integer> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(Integer value1, Integer value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNull() {
            addCriterion("loan_period is null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNotNull() {
            addCriterion("loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodEqualTo(Integer value) {
            addCriterion("loan_period =", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotEqualTo(Integer value) {
            addCriterion("loan_period <>", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThan(Integer value) {
            addCriterion("loan_period >", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_period >=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThan(Integer value) {
            addCriterion("loan_period <", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("loan_period <=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIn(List<Integer> values) {
            addCriterion("loan_period in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotIn(List<Integer> values) {
            addCriterion("loan_period not in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodBetween(Integer value1, Integer value2) {
            addCriterion("loan_period between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_period not between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNull() {
            addCriterion("current_city is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNotNull() {
            addCriterion("current_city is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityEqualTo(String value) {
            addCriterion("current_city =", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotEqualTo(String value) {
            addCriterion("current_city <>", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThan(String value) {
            addCriterion("current_city >", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThanOrEqualTo(String value) {
            addCriterion("current_city >=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThan(String value) {
            addCriterion("current_city <", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThanOrEqualTo(String value) {
            addCriterion("current_city <=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLike(String value) {
            addCriterion("current_city like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotLike(String value) {
            addCriterion("current_city not like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIn(List<String> values) {
            addCriterion("current_city in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotIn(List<String> values) {
            addCriterion("current_city not in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityBetween(String value1, String value2) {
            addCriterion("current_city between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotBetween(String value1, String value2) {
            addCriterion("current_city not between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNull() {
            addCriterion("working_years is null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNotNull() {
            addCriterion("working_years is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsEqualTo(String value) {
            addCriterion("working_years =", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotEqualTo(String value) {
            addCriterion("working_years <>", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThan(String value) {
            addCriterion("working_years >", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThanOrEqualTo(String value) {
            addCriterion("working_years >=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThan(String value) {
            addCriterion("working_years <", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThanOrEqualTo(String value) {
            addCriterion("working_years <=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLike(String value) {
            addCriterion("working_years like", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotLike(String value) {
            addCriterion("working_years not like", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIn(List<String> values) {
            addCriterion("working_years in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotIn(List<String> values) {
            addCriterion("working_years not in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsBetween(String value1, String value2) {
            addCriterion("working_years between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotBetween(String value1, String value2) {
            addCriterion("working_years not between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitIsNull() {
            addCriterion("credit_card_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitIsNotNull() {
            addCriterion("credit_card_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitEqualTo(String value) {
            addCriterion("credit_card_limit =", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitNotEqualTo(String value) {
            addCriterion("credit_card_limit <>", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitGreaterThan(String value) {
            addCriterion("credit_card_limit >", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitGreaterThanOrEqualTo(String value) {
            addCriterion("credit_card_limit >=", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitLessThan(String value) {
            addCriterion("credit_card_limit <", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitLessThanOrEqualTo(String value) {
            addCriterion("credit_card_limit <=", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitLike(String value) {
            addCriterion("credit_card_limit like", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitNotLike(String value) {
            addCriterion("credit_card_limit not like", value, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitIn(List<String> values) {
            addCriterion("credit_card_limit in", values, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitNotIn(List<String> values) {
            addCriterion("credit_card_limit not in", values, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitBetween(String value1, String value2) {
            addCriterion("credit_card_limit between", value1, value2, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andCreditCardLimitNotBetween(String value1, String value2) {
            addCriterion("credit_card_limit not between", value1, value2, "creditCardLimit");
            return (Criteria) this;
        }

        public Criteria andSesameScoresIsNull() {
            addCriterion("sesame_scores is null");
            return (Criteria) this;
        }

        public Criteria andSesameScoresIsNotNull() {
            addCriterion("sesame_scores is not null");
            return (Criteria) this;
        }

        public Criteria andSesameScoresEqualTo(String value) {
            addCriterion("sesame_scores =", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresNotEqualTo(String value) {
            addCriterion("sesame_scores <>", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresGreaterThan(String value) {
            addCriterion("sesame_scores >", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresGreaterThanOrEqualTo(String value) {
            addCriterion("sesame_scores >=", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresLessThan(String value) {
            addCriterion("sesame_scores <", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresLessThanOrEqualTo(String value) {
            addCriterion("sesame_scores <=", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresLike(String value) {
            addCriterion("sesame_scores like", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresNotLike(String value) {
            addCriterion("sesame_scores not like", value, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresIn(List<String> values) {
            addCriterion("sesame_scores in", values, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresNotIn(List<String> values) {
            addCriterion("sesame_scores not in", values, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresBetween(String value1, String value2) {
            addCriterion("sesame_scores between", value1, value2, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andSesameScoresNotBetween(String value1, String value2) {
            addCriterion("sesame_scores not between", value1, value2, "sesameScores");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitIsNull() {
            addCriterion("weilidai_limit is null");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitIsNotNull() {
            addCriterion("weilidai_limit is not null");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitEqualTo(String value) {
            addCriterion("weilidai_limit =", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitNotEqualTo(String value) {
            addCriterion("weilidai_limit <>", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitGreaterThan(String value) {
            addCriterion("weilidai_limit >", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitGreaterThanOrEqualTo(String value) {
            addCriterion("weilidai_limit >=", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitLessThan(String value) {
            addCriterion("weilidai_limit <", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitLessThanOrEqualTo(String value) {
            addCriterion("weilidai_limit <=", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitLike(String value) {
            addCriterion("weilidai_limit like", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitNotLike(String value) {
            addCriterion("weilidai_limit not like", value, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitIn(List<String> values) {
            addCriterion("weilidai_limit in", values, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitNotIn(List<String> values) {
            addCriterion("weilidai_limit not in", values, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitBetween(String value1, String value2) {
            addCriterion("weilidai_limit between", value1, value2, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andWeilidaiLimitNotBetween(String value1, String value2) {
            addCriterion("weilidai_limit not between", value1, value2, "weilidaiLimit");
            return (Criteria) this;
        }

        public Criteria andFamilyCityIsNull() {
            addCriterion("family_city is null");
            return (Criteria) this;
        }

        public Criteria andFamilyCityIsNotNull() {
            addCriterion("family_city is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyCityEqualTo(String value) {
            addCriterion("family_city =", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityNotEqualTo(String value) {
            addCriterion("family_city <>", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityGreaterThan(String value) {
            addCriterion("family_city >", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityGreaterThanOrEqualTo(String value) {
            addCriterion("family_city >=", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityLessThan(String value) {
            addCriterion("family_city <", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityLessThanOrEqualTo(String value) {
            addCriterion("family_city <=", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityLike(String value) {
            addCriterion("family_city like", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityNotLike(String value) {
            addCriterion("family_city not like", value, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityIn(List<String> values) {
            addCriterion("family_city in", values, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityNotIn(List<String> values) {
            addCriterion("family_city not in", values, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityBetween(String value1, String value2) {
            addCriterion("family_city between", value1, value2, "familyCity");
            return (Criteria) this;
        }

        public Criteria andFamilyCityNotBetween(String value1, String value2) {
            addCriterion("family_city not between", value1, value2, "familyCity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIsNull() {
            addCriterion("social_security is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIsNotNull() {
            addCriterion("social_security is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEqualTo(String value) {
            addCriterion("social_security =", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotEqualTo(String value) {
            addCriterion("social_security <>", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityGreaterThan(String value) {
            addCriterion("social_security >", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("social_security >=", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLessThan(String value) {
            addCriterion("social_security <", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLessThanOrEqualTo(String value) {
            addCriterion("social_security <=", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLike(String value) {
            addCriterion("social_security like", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotLike(String value) {
            addCriterion("social_security not like", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIn(List<String> values) {
            addCriterion("social_security in", values, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotIn(List<String> values) {
            addCriterion("social_security not in", values, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBetween(String value1, String value2) {
            addCriterion("social_security between", value1, value2, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotBetween(String value1, String value2) {
            addCriterion("social_security not between", value1, value2, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundIsNull() {
            addCriterion("accumulation_fund is null");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundIsNotNull() {
            addCriterion("accumulation_fund is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundEqualTo(String value) {
            addCriterion("accumulation_fund =", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundNotEqualTo(String value) {
            addCriterion("accumulation_fund <>", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundGreaterThan(String value) {
            addCriterion("accumulation_fund >", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundGreaterThanOrEqualTo(String value) {
            addCriterion("accumulation_fund >=", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundLessThan(String value) {
            addCriterion("accumulation_fund <", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundLessThanOrEqualTo(String value) {
            addCriterion("accumulation_fund <=", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundLike(String value) {
            addCriterion("accumulation_fund like", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundNotLike(String value) {
            addCriterion("accumulation_fund not like", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundIn(List<String> values) {
            addCriterion("accumulation_fund in", values, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundNotIn(List<String> values) {
            addCriterion("accumulation_fund not in", values, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundBetween(String value1, String value2) {
            addCriterion("accumulation_fund between", value1, value2, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundNotBetween(String value1, String value2) {
            addCriterion("accumulation_fund not between", value1, value2, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andEstateInfoIsNull() {
            addCriterion("estate_info is null");
            return (Criteria) this;
        }

        public Criteria andEstateInfoIsNotNull() {
            addCriterion("estate_info is not null");
            return (Criteria) this;
        }

        public Criteria andEstateInfoEqualTo(String value) {
            addCriterion("estate_info =", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoNotEqualTo(String value) {
            addCriterion("estate_info <>", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoGreaterThan(String value) {
            addCriterion("estate_info >", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoGreaterThanOrEqualTo(String value) {
            addCriterion("estate_info >=", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoLessThan(String value) {
            addCriterion("estate_info <", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoLessThanOrEqualTo(String value) {
            addCriterion("estate_info <=", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoLike(String value) {
            addCriterion("estate_info like", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoNotLike(String value) {
            addCriterion("estate_info not like", value, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoIn(List<String> values) {
            addCriterion("estate_info in", values, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoNotIn(List<String> values) {
            addCriterion("estate_info not in", values, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoBetween(String value1, String value2) {
            addCriterion("estate_info between", value1, value2, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andEstateInfoNotBetween(String value1, String value2) {
            addCriterion("estate_info not between", value1, value2, "estateInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoIsNull() {
            addCriterion("car_info is null");
            return (Criteria) this;
        }

        public Criteria andCarInfoIsNotNull() {
            addCriterion("car_info is not null");
            return (Criteria) this;
        }

        public Criteria andCarInfoEqualTo(String value) {
            addCriterion("car_info =", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotEqualTo(String value) {
            addCriterion("car_info <>", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoGreaterThan(String value) {
            addCriterion("car_info >", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoGreaterThanOrEqualTo(String value) {
            addCriterion("car_info >=", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoLessThan(String value) {
            addCriterion("car_info <", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoLessThanOrEqualTo(String value) {
            addCriterion("car_info <=", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoLike(String value) {
            addCriterion("car_info like", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotLike(String value) {
            addCriterion("car_info not like", value, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoIn(List<String> values) {
            addCriterion("car_info in", values, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotIn(List<String> values) {
            addCriterion("car_info not in", values, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoBetween(String value1, String value2) {
            addCriterion("car_info between", value1, value2, "carInfo");
            return (Criteria) this;
        }

        public Criteria andCarInfoNotBetween(String value1, String value2) {
            addCriterion("car_info not between", value1, value2, "carInfo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationIsNull() {
            addCriterion("business_duration is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationIsNotNull() {
            addCriterion("business_duration is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationEqualTo(Integer value) {
            addCriterion("business_duration =", value, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationNotEqualTo(Integer value) {
            addCriterion("business_duration <>", value, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationGreaterThan(Integer value) {
            addCriterion("business_duration >", value, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_duration >=", value, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationLessThan(Integer value) {
            addCriterion("business_duration <", value, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationLessThanOrEqualTo(Integer value) {
            addCriterion("business_duration <=", value, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationIn(List<Integer> values) {
            addCriterion("business_duration in", values, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationNotIn(List<Integer> values) {
            addCriterion("business_duration not in", values, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationBetween(Integer value1, Integer value2) {
            addCriterion("business_duration between", value1, value2, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andBusinessDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("business_duration not between", value1, value2, "businessDuration");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountIsNull() {
            addCriterion("income_amount is null");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountIsNotNull() {
            addCriterion("income_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountEqualTo(Integer value) {
            addCriterion("income_amount =", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountNotEqualTo(Integer value) {
            addCriterion("income_amount <>", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountGreaterThan(Integer value) {
            addCriterion("income_amount >", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("income_amount >=", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountLessThan(Integer value) {
            addCriterion("income_amount <", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountLessThanOrEqualTo(Integer value) {
            addCriterion("income_amount <=", value, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountIn(List<Integer> values) {
            addCriterion("income_amount in", values, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountNotIn(List<Integer> values) {
            addCriterion("income_amount not in", values, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountBetween(Integer value1, Integer value2) {
            addCriterion("income_amount between", value1, value2, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andIncomeAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("income_amount not between", value1, value2, "incomeAmount");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIsNull() {
            addCriterion("loan_purpose is null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIsNotNull() {
            addCriterion("loan_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeEqualTo(String value) {
            addCriterion("loan_purpose =", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotEqualTo(String value) {
            addCriterion("loan_purpose <>", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeGreaterThan(String value) {
            addCriterion("loan_purpose >", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_purpose >=", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLessThan(String value) {
            addCriterion("loan_purpose <", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLessThanOrEqualTo(String value) {
            addCriterion("loan_purpose <=", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLike(String value) {
            addCriterion("loan_purpose like", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotLike(String value) {
            addCriterion("loan_purpose not like", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIn(List<String> values) {
            addCriterion("loan_purpose in", values, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotIn(List<String> values) {
            addCriterion("loan_purpose not in", values, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeBetween(String value1, String value2) {
            addCriterion("loan_purpose between", value1, value2, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotBetween(String value1, String value2) {
            addCriterion("loan_purpose not between", value1, value2, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoIsNull() {
            addCriterion("insurance_info is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoIsNotNull() {
            addCriterion("insurance_info is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoEqualTo(String value) {
            addCriterion("insurance_info =", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoNotEqualTo(String value) {
            addCriterion("insurance_info <>", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoGreaterThan(String value) {
            addCriterion("insurance_info >", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_info >=", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoLessThan(String value) {
            addCriterion("insurance_info <", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoLessThanOrEqualTo(String value) {
            addCriterion("insurance_info <=", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoLike(String value) {
            addCriterion("insurance_info like", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoNotLike(String value) {
            addCriterion("insurance_info not like", value, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoIn(List<String> values) {
            addCriterion("insurance_info in", values, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoNotIn(List<String> values) {
            addCriterion("insurance_info not in", values, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoBetween(String value1, String value2) {
            addCriterion("insurance_info between", value1, value2, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andInsuranceInfoNotBetween(String value1, String value2) {
            addCriterion("insurance_info not between", value1, value2, "insuranceInfo");
            return (Criteria) this;
        }

        public Criteria andSystemChannelIsNull() {
            addCriterion("system_channel is null");
            return (Criteria) this;
        }

        public Criteria andSystemChannelIsNotNull() {
            addCriterion("system_channel is not null");
            return (Criteria) this;
        }

        public Criteria andSystemChannelEqualTo(String value) {
            addCriterion("system_channel =", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelNotEqualTo(String value) {
            addCriterion("system_channel <>", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelGreaterThan(String value) {
            addCriterion("system_channel >", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelGreaterThanOrEqualTo(String value) {
            addCriterion("system_channel >=", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelLessThan(String value) {
            addCriterion("system_channel <", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelLessThanOrEqualTo(String value) {
            addCriterion("system_channel <=", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelLike(String value) {
            addCriterion("system_channel like", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelNotLike(String value) {
            addCriterion("system_channel not like", value, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelIn(List<String> values) {
            addCriterion("system_channel in", values, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelNotIn(List<String> values) {
            addCriterion("system_channel not in", values, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelBetween(String value1, String value2) {
            addCriterion("system_channel between", value1, value2, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andSystemChannelNotBetween(String value1, String value2) {
            addCriterion("system_channel not between", value1, value2, "systemChannel");
            return (Criteria) this;
        }

        public Criteria andDateStringIsNull() {
            addCriterion("date_string is null");
            return (Criteria) this;
        }

        public Criteria andDateStringIsNotNull() {
            addCriterion("date_string is not null");
            return (Criteria) this;
        }

        public Criteria andDateStringEqualTo(String value) {
            addCriterion("date_string =", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringNotEqualTo(String value) {
            addCriterion("date_string <>", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringGreaterThan(String value) {
            addCriterion("date_string >", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringGreaterThanOrEqualTo(String value) {
            addCriterion("date_string >=", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringLessThan(String value) {
            addCriterion("date_string <", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringLessThanOrEqualTo(String value) {
            addCriterion("date_string <=", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringLike(String value) {
            addCriterion("date_string like", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringNotLike(String value) {
            addCriterion("date_string not like", value, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringIn(List<String> values) {
            addCriterion("date_string in", values, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringNotIn(List<String> values) {
            addCriterion("date_string not in", values, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringBetween(String value1, String value2) {
            addCriterion("date_string between", value1, value2, "dateString");
            return (Criteria) this;
        }

        public Criteria andDateStringNotBetween(String value1, String value2) {
            addCriterion("date_string not between", value1, value2, "dateString");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadIsNull() {
            addCriterion("mark_as_read is null");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadIsNotNull() {
            addCriterion("mark_as_read is not null");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadEqualTo(Integer value) {
            addCriterion("mark_as_read =", value, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadNotEqualTo(Integer value) {
            addCriterion("mark_as_read <>", value, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadGreaterThan(Integer value) {
            addCriterion("mark_as_read >", value, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark_as_read >=", value, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadLessThan(Integer value) {
            addCriterion("mark_as_read <", value, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadLessThanOrEqualTo(Integer value) {
            addCriterion("mark_as_read <=", value, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadIn(List<Integer> values) {
            addCriterion("mark_as_read in", values, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadNotIn(List<Integer> values) {
            addCriterion("mark_as_read not in", values, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadBetween(Integer value1, Integer value2) {
            addCriterion("mark_as_read between", value1, value2, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andMarkAsReadNotBetween(Integer value1, Integer value2) {
            addCriterion("mark_as_read not between", value1, value2, "markAsRead");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andIsCpDataIsNull() {
            addCriterion("is_cp_data is null");
            return (Criteria) this;
        }

        public Criteria andIsCpDataIsNotNull() {
            addCriterion("is_cp_data is not null");
            return (Criteria) this;
        }

        public Criteria andIsCpDataEqualTo(Integer value) {
            addCriterion("is_cp_data =", value, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataNotEqualTo(Integer value) {
            addCriterion("is_cp_data <>", value, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataGreaterThan(Integer value) {
            addCriterion("is_cp_data >", value, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_cp_data >=", value, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataLessThan(Integer value) {
            addCriterion("is_cp_data <", value, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataLessThanOrEqualTo(Integer value) {
            addCriterion("is_cp_data <=", value, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataIn(List<Integer> values) {
            addCriterion("is_cp_data in", values, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataNotIn(List<Integer> values) {
            addCriterion("is_cp_data not in", values, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataBetween(Integer value1, Integer value2) {
            addCriterion("is_cp_data between", value1, value2, "isCpData");
            return (Criteria) this;
        }

        public Criteria andIsCpDataNotBetween(Integer value1, Integer value2) {
            addCriterion("is_cp_data not between", value1, value2, "isCpData");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
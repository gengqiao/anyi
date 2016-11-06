package com.gq.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SsoUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SsoUserExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andLoginidIsNull() {
            addCriterion("loginId is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("loginId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(String value) {
            addCriterion("loginId =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(String value) {
            addCriterion("loginId <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(String value) {
            addCriterion("loginId >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("loginId >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(String value) {
            addCriterion("loginId <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(String value) {
            addCriterion("loginId <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLike(String value) {
            addCriterion("loginId like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotLike(String value) {
            addCriterion("loginId not like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<String> values) {
            addCriterion("loginId in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<String> values) {
            addCriterion("loginId not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(String value1, String value2) {
            addCriterion("loginId between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(String value1, String value2) {
            addCriterion("loginId not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLoginnumIsNull() {
            addCriterion("loginNum is null");
            return (Criteria) this;
        }

        public Criteria andLoginnumIsNotNull() {
            addCriterion("loginNum is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnumEqualTo(Integer value) {
            addCriterion("loginNum =", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotEqualTo(Integer value) {
            addCriterion("loginNum <>", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumGreaterThan(Integer value) {
            addCriterion("loginNum >", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginNum >=", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumLessThan(Integer value) {
            addCriterion("loginNum <", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumLessThanOrEqualTo(Integer value) {
            addCriterion("loginNum <=", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumIn(List<Integer> values) {
            addCriterion("loginNum in", values, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotIn(List<Integer> values) {
            addCriterion("loginNum not in", values, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumBetween(Integer value1, Integer value2) {
            addCriterion("loginNum between", value1, value2, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotBetween(Integer value1, Integer value2) {
            addCriterion("loginNum not between", value1, value2, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNull() {
            addCriterion("lastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNotNull() {
            addCriterion("lastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateEqualTo(Date value) {
            addCriterion("lastLoginDate =", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotEqualTo(Date value) {
            addCriterion("lastLoginDate <>", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThan(Date value) {
            addCriterion("lastLoginDate >", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginDate >=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThan(Date value) {
            addCriterion("lastLoginDate <", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginDate <=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIn(List<Date> values) {
            addCriterion("lastLoginDate in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotIn(List<Date> values) {
            addCriterion("lastLoginDate not in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateBetween(Date value1, Date value2) {
            addCriterion("lastLoginDate between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginDate not between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdIsNull() {
            addCriterion("fk_site_id is null");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdIsNotNull() {
            addCriterion("fk_site_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdEqualTo(Integer value) {
            addCriterion("fk_site_id =", value, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdNotEqualTo(Integer value) {
            addCriterion("fk_site_id <>", value, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdGreaterThan(Integer value) {
            addCriterion("fk_site_id >", value, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_site_id >=", value, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdLessThan(Integer value) {
            addCriterion("fk_site_id <", value, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("fk_site_id <=", value, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdIn(List<Integer> values) {
            addCriterion("fk_site_id in", values, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdNotIn(List<Integer> values) {
            addCriterion("fk_site_id not in", values, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("fk_site_id between", value1, value2, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andFkSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_site_id not between", value1, value2, "fkSiteId");
            return (Criteria) this;
        }

        public Criteria andIsvalideIsNull() {
            addCriterion("isValide is null");
            return (Criteria) this;
        }

        public Criteria andIsvalideIsNotNull() {
            addCriterion("isValide is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalideEqualTo(Integer value) {
            addCriterion("isValide =", value, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideNotEqualTo(Integer value) {
            addCriterion("isValide <>", value, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideGreaterThan(Integer value) {
            addCriterion("isValide >", value, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideGreaterThanOrEqualTo(Integer value) {
            addCriterion("isValide >=", value, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideLessThan(Integer value) {
            addCriterion("isValide <", value, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideLessThanOrEqualTo(Integer value) {
            addCriterion("isValide <=", value, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideIn(List<Integer> values) {
            addCriterion("isValide in", values, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideNotIn(List<Integer> values) {
            addCriterion("isValide not in", values, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideBetween(Integer value1, Integer value2) {
            addCriterion("isValide between", value1, value2, "isvalide");
            return (Criteria) this;
        }

        public Criteria andIsvalideNotBetween(Integer value1, Integer value2) {
            addCriterion("isValide not between", value1, value2, "isvalide");
            return (Criteria) this;
        }
    }

    /**
     */
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
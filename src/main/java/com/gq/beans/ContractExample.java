package com.gq.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ContractExample() {
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

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(String value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(String value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(String value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(String value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(String value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(String value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLike(String value) {
            addCriterion("seq like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotLike(String value) {
            addCriterion("seq not like", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<String> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<String> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(String value1, String value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(String value1, String value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerDate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterion("registerDate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterion("registerDate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterion("registerDate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registerDate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterion("registerDate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterion("registerDate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterion("registerDate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterion("registerDate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterion("registerDate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterion("registerDate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNull() {
            addCriterion("contractAmount is null");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNotNull() {
            addCriterion("contractAmount is not null");
            return (Criteria) this;
        }

        public Criteria andContractamountEqualTo(Double value) {
            addCriterion("contractAmount =", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotEqualTo(Double value) {
            addCriterion("contractAmount <>", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThan(Double value) {
            addCriterion("contractAmount >", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThanOrEqualTo(Double value) {
            addCriterion("contractAmount >=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThan(Double value) {
            addCriterion("contractAmount <", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThanOrEqualTo(Double value) {
            addCriterion("contractAmount <=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountIn(List<Double> values) {
            addCriterion("contractAmount in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotIn(List<Double> values) {
            addCriterion("contractAmount not in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountBetween(Double value1, Double value2) {
            addCriterion("contractAmount between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotBetween(Double value1, Double value2) {
            addCriterion("contractAmount not between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andReceiptedIsNull() {
            addCriterion("receipted is null");
            return (Criteria) this;
        }

        public Criteria andReceiptedIsNotNull() {
            addCriterion("receipted is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptedEqualTo(Double value) {
            addCriterion("receipted =", value, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedNotEqualTo(Double value) {
            addCriterion("receipted <>", value, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedGreaterThan(Double value) {
            addCriterion("receipted >", value, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedGreaterThanOrEqualTo(Double value) {
            addCriterion("receipted >=", value, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedLessThan(Double value) {
            addCriterion("receipted <", value, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedLessThanOrEqualTo(Double value) {
            addCriterion("receipted <=", value, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedIn(List<Double> values) {
            addCriterion("receipted in", values, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedNotIn(List<Double> values) {
            addCriterion("receipted not in", values, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedBetween(Double value1, Double value2) {
            addCriterion("receipted between", value1, value2, "receipted");
            return (Criteria) this;
        }

        public Criteria andReceiptedNotBetween(Double value1, Double value2) {
            addCriterion("receipted not between", value1, value2, "receipted");
            return (Criteria) this;
        }

        public Criteria andContaintaxIsNull() {
            addCriterion("containTax is null");
            return (Criteria) this;
        }

        public Criteria andContaintaxIsNotNull() {
            addCriterion("containTax is not null");
            return (Criteria) this;
        }

        public Criteria andContaintaxEqualTo(String value) {
            addCriterion("containTax =", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxNotEqualTo(String value) {
            addCriterion("containTax <>", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxGreaterThan(String value) {
            addCriterion("containTax >", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxGreaterThanOrEqualTo(String value) {
            addCriterion("containTax >=", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxLessThan(String value) {
            addCriterion("containTax <", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxLessThanOrEqualTo(String value) {
            addCriterion("containTax <=", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxLike(String value) {
            addCriterion("containTax like", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxNotLike(String value) {
            addCriterion("containTax not like", value, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxIn(List<String> values) {
            addCriterion("containTax in", values, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxNotIn(List<String> values) {
            addCriterion("containTax not in", values, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxBetween(String value1, String value2) {
            addCriterion("containTax between", value1, value2, "containtax");
            return (Criteria) this;
        }

        public Criteria andContaintaxNotBetween(String value1, String value2) {
            addCriterion("containTax not between", value1, value2, "containtax");
            return (Criteria) this;
        }

        public Criteria andPreliminaryIsNull() {
            addCriterion("preliminary is null");
            return (Criteria) this;
        }

        public Criteria andPreliminaryIsNotNull() {
            addCriterion("preliminary is not null");
            return (Criteria) this;
        }

        public Criteria andPreliminaryEqualTo(Integer value) {
            addCriterion("preliminary =", value, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryNotEqualTo(Integer value) {
            addCriterion("preliminary <>", value, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryGreaterThan(Integer value) {
            addCriterion("preliminary >", value, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("preliminary >=", value, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryLessThan(Integer value) {
            addCriterion("preliminary <", value, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryLessThanOrEqualTo(Integer value) {
            addCriterion("preliminary <=", value, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryIn(List<Integer> values) {
            addCriterion("preliminary in", values, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryNotIn(List<Integer> values) {
            addCriterion("preliminary not in", values, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryBetween(Integer value1, Integer value2) {
            addCriterion("preliminary between", value1, value2, "preliminary");
            return (Criteria) this;
        }

        public Criteria andPreliminaryNotBetween(Integer value1, Integer value2) {
            addCriterion("preliminary not between", value1, value2, "preliminary");
            return (Criteria) this;
        }

        public Criteria andTianedIsNull() {
            addCriterion("tianed is null");
            return (Criteria) this;
        }

        public Criteria andTianedIsNotNull() {
            addCriterion("tianed is not null");
            return (Criteria) this;
        }

        public Criteria andTianedEqualTo(Integer value) {
            addCriterion("tianed =", value, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedNotEqualTo(Integer value) {
            addCriterion("tianed <>", value, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedGreaterThan(Integer value) {
            addCriterion("tianed >", value, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedGreaterThanOrEqualTo(Integer value) {
            addCriterion("tianed >=", value, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedLessThan(Integer value) {
            addCriterion("tianed <", value, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedLessThanOrEqualTo(Integer value) {
            addCriterion("tianed <=", value, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedIn(List<Integer> values) {
            addCriterion("tianed in", values, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedNotIn(List<Integer> values) {
            addCriterion("tianed not in", values, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedBetween(Integer value1, Integer value2) {
            addCriterion("tianed between", value1, value2, "tianed");
            return (Criteria) this;
        }

        public Criteria andTianedNotBetween(Integer value1, Integer value2) {
            addCriterion("tianed not between", value1, value2, "tianed");
            return (Criteria) this;
        }

        public Criteria andPaiedIsNull() {
            addCriterion("paied is null");
            return (Criteria) this;
        }

        public Criteria andPaiedIsNotNull() {
            addCriterion("paied is not null");
            return (Criteria) this;
        }

        public Criteria andPaiedEqualTo(Integer value) {
            addCriterion("paied =", value, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedNotEqualTo(Integer value) {
            addCriterion("paied <>", value, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedGreaterThan(Integer value) {
            addCriterion("paied >", value, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("paied >=", value, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedLessThan(Integer value) {
            addCriterion("paied <", value, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedLessThanOrEqualTo(Integer value) {
            addCriterion("paied <=", value, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedIn(List<Integer> values) {
            addCriterion("paied in", values, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedNotIn(List<Integer> values) {
            addCriterion("paied not in", values, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedBetween(Integer value1, Integer value2) {
            addCriterion("paied between", value1, value2, "paied");
            return (Criteria) this;
        }

        public Criteria andPaiedNotBetween(Integer value1, Integer value2) {
            addCriterion("paied not between", value1, value2, "paied");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNull() {
            addCriterion("paymentDate is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNotNull() {
            addCriterion("paymentDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateEqualTo(String value) {
            addCriterion("paymentDate =", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotEqualTo(String value) {
            addCriterion("paymentDate <>", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThan(String value) {
            addCriterion("paymentDate >", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThanOrEqualTo(String value) {
            addCriterion("paymentDate >=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThan(String value) {
            addCriterion("paymentDate <", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThanOrEqualTo(String value) {
            addCriterion("paymentDate <=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLike(String value) {
            addCriterion("paymentDate like", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotLike(String value) {
            addCriterion("paymentDate not like", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIn(List<String> values) {
            addCriterion("paymentDate in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotIn(List<String> values) {
            addCriterion("paymentDate not in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateBetween(String value1, String value2) {
            addCriterion("paymentDate between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotBetween(String value1, String value2) {
            addCriterion("paymentDate not between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateIsNull() {
            addCriterion("qualificationsDate is null");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateIsNotNull() {
            addCriterion("qualificationsDate is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateEqualTo(Date value) {
            addCriterion("qualificationsDate =", value, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateNotEqualTo(Date value) {
            addCriterion("qualificationsDate <>", value, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateGreaterThan(Date value) {
            addCriterion("qualificationsDate >", value, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("qualificationsDate >=", value, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateLessThan(Date value) {
            addCriterion("qualificationsDate <", value, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateLessThanOrEqualTo(Date value) {
            addCriterion("qualificationsDate <=", value, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateIn(List<Date> values) {
            addCriterion("qualificationsDate in", values, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateNotIn(List<Date> values) {
            addCriterion("qualificationsDate not in", values, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateBetween(Date value1, Date value2) {
            addCriterion("qualificationsDate between", value1, value2, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andQualificationsdateNotBetween(Date value1, Date value2) {
            addCriterion("qualificationsDate not between", value1, value2, "qualificationsdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNull() {
            addCriterion("reportDate is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("reportDate is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(Date value) {
            addCriterion("reportDate =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(Date value) {
            addCriterion("reportDate <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(Date value) {
            addCriterion("reportDate >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(Date value) {
            addCriterion("reportDate >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(Date value) {
            addCriterion("reportDate <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(Date value) {
            addCriterion("reportDate <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<Date> values) {
            addCriterion("reportDate in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<Date> values) {
            addCriterion("reportDate not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(Date value1, Date value2) {
            addCriterion("reportDate between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(Date value1, Date value2) {
            addCriterion("reportDate not between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNull() {
            addCriterion("contactsPhone is null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNotNull() {
            addCriterion("contactsPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneEqualTo(String value) {
            addCriterion("contactsPhone =", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotEqualTo(String value) {
            addCriterion("contactsPhone <>", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThan(String value) {
            addCriterion("contactsPhone >", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactsPhone >=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThan(String value) {
            addCriterion("contactsPhone <", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThanOrEqualTo(String value) {
            addCriterion("contactsPhone <=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLike(String value) {
            addCriterion("contactsPhone like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotLike(String value) {
            addCriterion("contactsPhone not like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIn(List<String> values) {
            addCriterion("contactsPhone in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotIn(List<String> values) {
            addCriterion("contactsPhone not in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneBetween(String value1, String value2) {
            addCriterion("contactsPhone between", value1, value2, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotBetween(String value1, String value2) {
            addCriterion("contactsPhone not between", value1, value2, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andJieqiadateIsNull() {
            addCriterion("jieqiaDate is null");
            return (Criteria) this;
        }

        public Criteria andJieqiadateIsNotNull() {
            addCriterion("jieqiaDate is not null");
            return (Criteria) this;
        }

        public Criteria andJieqiadateEqualTo(Date value) {
            addCriterion("jieqiaDate =", value, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateNotEqualTo(Date value) {
            addCriterion("jieqiaDate <>", value, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateGreaterThan(Date value) {
            addCriterion("jieqiaDate >", value, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateGreaterThanOrEqualTo(Date value) {
            addCriterion("jieqiaDate >=", value, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateLessThan(Date value) {
            addCriterion("jieqiaDate <", value, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateLessThanOrEqualTo(Date value) {
            addCriterion("jieqiaDate <=", value, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateIn(List<Date> values) {
            addCriterion("jieqiaDate in", values, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateNotIn(List<Date> values) {
            addCriterion("jieqiaDate not in", values, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateBetween(Date value1, Date value2) {
            addCriterion("jieqiaDate between", value1, value2, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andJieqiadateNotBetween(Date value1, Date value2) {
            addCriterion("jieqiaDate not between", value1, value2, "jieqiadate");
            return (Criteria) this;
        }

        public Criteria andHetongdateIsNull() {
            addCriterion("hetongDate is null");
            return (Criteria) this;
        }

        public Criteria andHetongdateIsNotNull() {
            addCriterion("hetongDate is not null");
            return (Criteria) this;
        }

        public Criteria andHetongdateEqualTo(Date value) {
            addCriterion("hetongDate =", value, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateNotEqualTo(Date value) {
            addCriterion("hetongDate <>", value, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateGreaterThan(Date value) {
            addCriterion("hetongDate >", value, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateGreaterThanOrEqualTo(Date value) {
            addCriterion("hetongDate >=", value, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateLessThan(Date value) {
            addCriterion("hetongDate <", value, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateLessThanOrEqualTo(Date value) {
            addCriterion("hetongDate <=", value, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateIn(List<Date> values) {
            addCriterion("hetongDate in", values, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateNotIn(List<Date> values) {
            addCriterion("hetongDate not in", values, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateBetween(Date value1, Date value2) {
            addCriterion("hetongDate between", value1, value2, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andHetongdateNotBetween(Date value1, Date value2) {
            addCriterion("hetongDate not between", value1, value2, "hetongdate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFkUserIdIsNull() {
            addCriterion("fk_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFkUserIdIsNotNull() {
            addCriterion("fk_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkUserIdEqualTo(Integer value) {
            addCriterion("fk_user_id =", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotEqualTo(Integer value) {
            addCriterion("fk_user_id <>", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdGreaterThan(Integer value) {
            addCriterion("fk_user_id >", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_user_id >=", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdLessThan(Integer value) {
            addCriterion("fk_user_id <", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("fk_user_id <=", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdIn(List<Integer> values) {
            addCriterion("fk_user_id in", values, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotIn(List<Integer> values) {
            addCriterion("fk_user_id not in", values, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdBetween(Integer value1, Integer value2) {
            addCriterion("fk_user_id between", value1, value2, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_user_id not between", value1, value2, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNull() {
            addCriterion("receiveDate is null");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNotNull() {
            addCriterion("receiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedateEqualTo(Date value) {
            addCriterion("receiveDate =", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotEqualTo(Date value) {
            addCriterion("receiveDate <>", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThan(Date value) {
            addCriterion("receiveDate >", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveDate >=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThan(Date value) {
            addCriterion("receiveDate <", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThanOrEqualTo(Date value) {
            addCriterion("receiveDate <=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateIn(List<Date> values) {
            addCriterion("receiveDate in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotIn(List<Date> values) {
            addCriterion("receiveDate not in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateBetween(Date value1, Date value2) {
            addCriterion("receiveDate between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotBetween(Date value1, Date value2) {
            addCriterion("receiveDate not between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andcollectingdataIsNull() {
            addCriterion("collectingData is null");
            return (Criteria) this;
        }

        public Criteria andcollectingdataIsNotNull() {
            addCriterion("collectingData is not null");
            return (Criteria) this;
        }

        public Criteria andcollectingdataEqualTo(Date value) {
            addCriterion("collectingData =", value, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataNotEqualTo(Date value) {
          addCriterion("collectingData <>", value, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataGreaterThan(Date value) {
            addCriterion("collectingData >", value, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataGreaterThanOrEqualTo(Date value) {
            addCriterion("collectingData >=", value, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataLessThan(Date value) {
            addCriterion("collectingData <", value, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataLessThanOrEqualTo(Date value) {
            addCriterion("collectingData <=", value, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataIn(List<Date> values) {
            addCriterion("collectingData in", values, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataNotIn(List<Date> values) {
            addCriterion("collectingData not in", values, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataBetween(Date value1, Date value2) {
            addCriterion("collectingData between", value1, value2, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andcollectingdataNotBetween(Date value1, Date value2) {
            addCriterion("collectingData not between", value1, value2, "collectingdata");
            return (Criteria) this;
        }

        public Criteria andMonitordateIsNull() {
            addCriterion("monitorDate is null");
            return (Criteria) this;
        }

        public Criteria andMonitordateIsNotNull() {
            addCriterion("monitorDate is not null");
            return (Criteria) this;
        }

        public Criteria andMonitordateEqualTo(Date value) {
            addCriterion("monitorDate =", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateNotEqualTo(Date value) {
            addCriterion("monitorDate <>", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateGreaterThan(Date value) {
            addCriterion("monitorDate >", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateGreaterThanOrEqualTo(Date value) {
            addCriterion("monitorDate >=", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateLessThan(Date value) {
            addCriterion("monitorDate <", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateLessThanOrEqualTo(Date value) {
            addCriterion("monitorDate <=", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateIn(List<Date> values) {
            addCriterion("monitorDate in", values, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateNotIn(List<Date> values) {
            addCriterion("monitorDate not in", values, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateBetween(Date value1, Date value2) {
            addCriterion("monitorDate between", value1, value2, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateNotBetween(Date value1, Date value2) {
            addCriterion("monitorDate not between", value1, value2, "monitordate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateIsNull() {
            addCriterion("analysisDate is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateIsNotNull() {
            addCriterion("analysisDate is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateEqualTo(Date value) {
            addCriterion("analysisDate =", value, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateNotEqualTo(Date value) {
            addCriterion("analysisDate <>", value, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateGreaterThan(Date value) {
            addCriterion("analysisDate >", value, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateGreaterThanOrEqualTo(Date value) {
            addCriterion("analysisDate >=", value, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateLessThan(Date value) {
            addCriterion("analysisDate <", value, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateLessThanOrEqualTo(Date value) {
            addCriterion("analysisDate <=", value, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateIn(List<Date> values) {
            addCriterion("analysisDate in", values, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateNotIn(List<Date> values) {
            addCriterion("analysisDate not in", values, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateBetween(Date value1, Date value2) {
            addCriterion("analysisDate between", value1, value2, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andAnalysisdateNotBetween(Date value1, Date value2) {
            addCriterion("analysisDate not between", value1, value2, "analysisdate");
            return (Criteria) this;
        }

        public Criteria andGongcandateIsNull() {
            addCriterion("gongcanDate is null");
            return (Criteria) this;
        }

        public Criteria andGongcandateIsNotNull() {
            addCriterion("gongcanDate is not null");
            return (Criteria) this;
        }

        public Criteria andGongcandateEqualTo(Date value) {
            addCriterion("gongcanDate =", value, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateNotEqualTo(Date value) {
            addCriterion("gongcanDate <>", value, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateGreaterThan(Date value) {
            addCriterion("gongcanDate >", value, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateGreaterThanOrEqualTo(Date value) {
            addCriterion("gongcanDate >=", value, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateLessThan(Date value) {
            addCriterion("gongcanDate <", value, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateLessThanOrEqualTo(Date value) {
            addCriterion("gongcanDate <=", value, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateIn(List<Date> values) {
            addCriterion("gongcanDate in", values, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateNotIn(List<Date> values) {
            addCriterion("gongcanDate not in", values, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateBetween(Date value1, Date value2) {
            addCriterion("gongcanDate between", value1, value2, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andGongcandateNotBetween(Date value1, Date value2) {
            addCriterion("gongcanDate not between", value1, value2, "gongcandate");
            return (Criteria) this;
        }

        public Criteria andNeishendateIsNull() {
            addCriterion("neishenDate is null");
            return (Criteria) this;
        }

        public Criteria andNeishendateIsNotNull() {
            addCriterion("neishenDate is not null");
            return (Criteria) this;
        }

        public Criteria andNeishendateEqualTo(Date value) {
            addCriterion("neishenDate =", value, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateNotEqualTo(Date value) {
            addCriterion("neishenDate <>", value, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateGreaterThan(Date value) {
            addCriterion("neishenDate >", value, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateGreaterThanOrEqualTo(Date value) {
            addCriterion("neishenDate >=", value, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateLessThan(Date value) {
            addCriterion("neishenDate <", value, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateLessThanOrEqualTo(Date value) {
            addCriterion("neishenDate <=", value, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateIn(List<Date> values) {
            addCriterion("neishenDate in", values, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateNotIn(List<Date> values) {
            addCriterion("neishenDate not in", values, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateBetween(Date value1, Date value2) {
            addCriterion("neishenDate between", value1, value2, "neishendate");
            return (Criteria) this;
        }

        public Criteria andNeishendateNotBetween(Date value1, Date value2) {
            addCriterion("neishenDate not between", value1, value2, "neishendate");
            return (Criteria) this;
        }

        public Criteria andExpertdateIsNull() {
            addCriterion("expertDate is null");
            return (Criteria) this;
        }

        public Criteria andExpertdateIsNotNull() {
            addCriterion("expertDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpertdateEqualTo(Date value) {
            addCriterion("expertDate =", value, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateNotEqualTo(Date value) {
            addCriterion("expertDate <>", value, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateGreaterThan(Date value) {
            addCriterion("expertDate >", value, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateGreaterThanOrEqualTo(Date value) {
            addCriterion("expertDate >=", value, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateLessThan(Date value) {
            addCriterion("expertDate <", value, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateLessThanOrEqualTo(Date value) {
            addCriterion("expertDate <=", value, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateIn(List<Date> values) {
            addCriterion("expertDate in", values, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateNotIn(List<Date> values) {
            addCriterion("expertDate not in", values, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateBetween(Date value1, Date value2) {
            addCriterion("expertDate between", value1, value2, "expertdate");
            return (Criteria) this;
        }

        public Criteria andExpertdateNotBetween(Date value1, Date value2) {
            addCriterion("expertDate not between", value1, value2, "expertdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateIsNull() {
            addCriterion("assessDate is null");
            return (Criteria) this;
        }

        public Criteria andAssessdateIsNotNull() {
            addCriterion("assessDate is not null");
            return (Criteria) this;
        }

        public Criteria andAssessdateEqualTo(Date value) {
            addCriterion("assessDate =", value, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateNotEqualTo(Date value) {
            addCriterion("assessDate <>", value, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateGreaterThan(Date value) {
            addCriterion("assessDate >", value, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("assessDate >=", value, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateLessThan(Date value) {
            addCriterion("assessDate <", value, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateLessThanOrEqualTo(Date value) {
            addCriterion("assessDate <=", value, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateIn(List<Date> values) {
            addCriterion("assessDate in", values, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateNotIn(List<Date> values) {
            addCriterion("assessDate not in", values, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateBetween(Date value1, Date value2) {
            addCriterion("assessDate between", value1, value2, "assessdate");
            return (Criteria) this;
        }

        public Criteria andAssessdateNotBetween(Date value1, Date value2) {
            addCriterion("assessDate not between", value1, value2, "assessdate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateIsNull() {
            addCriterion("scheduledDate is null");
            return (Criteria) this;
        }

        public Criteria andScheduleddateIsNotNull() {
            addCriterion("scheduledDate is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleddateEqualTo(Date value) {
            addCriterion("scheduledDate =", value, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateNotEqualTo(Date value) {
            addCriterion("scheduledDate <>", value, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateGreaterThan(Date value) {
            addCriterion("scheduledDate >", value, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateGreaterThanOrEqualTo(Date value) {
            addCriterion("scheduledDate >=", value, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateLessThan(Date value) {
            addCriterion("scheduledDate <", value, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateLessThanOrEqualTo(Date value) {
            addCriterion("scheduledDate <=", value, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateIn(List<Date> values) {
            addCriterion("scheduledDate in", values, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateNotIn(List<Date> values) {
            addCriterion("scheduledDate not in", values, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateBetween(Date value1, Date value2) {
            addCriterion("scheduledDate between", value1, value2, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andScheduleddateNotBetween(Date value1, Date value2) {
            addCriterion("scheduledDate not between", value1, value2, "scheduleddate");
            return (Criteria) this;
        }

        public Criteria andActualdateIsNull() {
            addCriterion("actualDate is null");
            return (Criteria) this;
        }

        public Criteria andActualdateIsNotNull() {
            addCriterion("actualDate is not null");
            return (Criteria) this;
        }

        public Criteria andActualdateEqualTo(Date value) {
            addCriterion("actualDate =", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateNotEqualTo(Date value) {
            addCriterion("actualDate <>", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateGreaterThan(Date value) {
            addCriterion("actualDate >", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateGreaterThanOrEqualTo(Date value) {
            addCriterion("actualDate >=", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateLessThan(Date value) {
            addCriterion("actualDate <", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateLessThanOrEqualTo(Date value) {
            addCriterion("actualDate <=", value, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateIn(List<Date> values) {
            addCriterion("actualDate in", values, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateNotIn(List<Date> values) {
            addCriterion("actualDate not in", values, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateBetween(Date value1, Date value2) {
            addCriterion("actualDate between", value1, value2, "actualdate");
            return (Criteria) this;
        }

        public Criteria andActualdateNotBetween(Date value1, Date value2) {
            addCriterion("actualDate not between", value1, value2, "actualdate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateIsNull() {
            addCriterion("getReplyDate is null");
            return (Criteria) this;
        }

        public Criteria andGetreplydateIsNotNull() {
            addCriterion("getReplyDate is not null");
            return (Criteria) this;
        }

        public Criteria andGetreplydateEqualTo(Date value) {
            addCriterion("getReplyDate =", value, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateNotEqualTo(Date value) {
            addCriterion("getReplyDate <>", value, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateGreaterThan(Date value) {
            addCriterion("getReplyDate >", value, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("getReplyDate >=", value, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateLessThan(Date value) {
            addCriterion("getReplyDate <", value, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateLessThanOrEqualTo(Date value) {
            addCriterion("getReplyDate <=", value, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateIn(List<Date> values) {
            addCriterion("getReplyDate in", values, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateNotIn(List<Date> values) {
            addCriterion("getReplyDate not in", values, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateBetween(Date value1, Date value2) {
            addCriterion("getReplyDate between", value1, value2, "getreplydate");
            return (Criteria) this;
        }

        public Criteria andGetreplydateNotBetween(Date value1, Date value2) {
            addCriterion("getReplyDate not between", value1, value2, "getreplydate");
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
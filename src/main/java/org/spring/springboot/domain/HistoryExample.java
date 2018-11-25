package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryExample() {
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

        public Criteria andHistoryIdIsNull() {
            addCriterion("historyId is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIsNotNull() {
            addCriterion("historyId is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdEqualTo(Integer value) {
            addCriterion("historyId =", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotEqualTo(Integer value) {
            addCriterion("historyId <>", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThan(Integer value) {
            addCriterion("historyId >", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("historyId >=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThan(Integer value) {
            addCriterion("historyId <", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("historyId <=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIn(List<Integer> values) {
            addCriterion("historyId in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotIn(List<Integer> values) {
            addCriterion("historyId not in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdBetween(Integer value1, Integer value2) {
            addCriterion("historyId between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("historyId not between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("sampleId is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("sampleId is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(Integer value) {
            addCriterion("sampleId =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(Integer value) {
            addCriterion("sampleId <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(Integer value) {
            addCriterion("sampleId >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sampleId >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(Integer value) {
            addCriterion("sampleId <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sampleId <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<Integer> values) {
            addCriterion("sampleId in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<Integer> values) {
            addCriterion("sampleId not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(Integer value1, Integer value2) {
            addCriterion("sampleId between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sampleId not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ipAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ipAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ipAddress =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ipAddress <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ipAddress >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ipAddress >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ipAddress <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ipAddress <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ipAddress like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ipAddress not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ipAddress in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ipAddress not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ipAddress between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ipAddress not between", value1, value2, "ipAddress");
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
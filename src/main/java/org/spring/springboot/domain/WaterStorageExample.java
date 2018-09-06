package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class WaterStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterStorageExample() {
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

        public Criteria andWaterStorageIdIsNull() {
            addCriterion("waterStorageId is null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdIsNotNull() {
            addCriterion("waterStorageId is not null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdEqualTo(Integer value) {
            addCriterion("waterStorageId =", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdNotEqualTo(Integer value) {
            addCriterion("waterStorageId <>", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdGreaterThan(Integer value) {
            addCriterion("waterStorageId >", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterStorageId >=", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdLessThan(Integer value) {
            addCriterion("waterStorageId <", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdLessThanOrEqualTo(Integer value) {
            addCriterion("waterStorageId <=", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdIn(List<Integer> values) {
            addCriterion("waterStorageId in", values, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdNotIn(List<Integer> values) {
            addCriterion("waterStorageId not in", values, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdBetween(Integer value1, Integer value2) {
            addCriterion("waterStorageId between", value1, value2, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waterStorageId not between", value1, value2, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescIsNull() {
            addCriterion("waterStorageDesc is null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescIsNotNull() {
            addCriterion("waterStorageDesc is not null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescEqualTo(String value) {
            addCriterion("waterStorageDesc =", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescNotEqualTo(String value) {
            addCriterion("waterStorageDesc <>", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescGreaterThan(String value) {
            addCriterion("waterStorageDesc >", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescGreaterThanOrEqualTo(String value) {
            addCriterion("waterStorageDesc >=", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescLessThan(String value) {
            addCriterion("waterStorageDesc <", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescLessThanOrEqualTo(String value) {
            addCriterion("waterStorageDesc <=", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescLike(String value) {
            addCriterion("waterStorageDesc like", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescNotLike(String value) {
            addCriterion("waterStorageDesc not like", value, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescIn(List<String> values) {
            addCriterion("waterStorageDesc in", values, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescNotIn(List<String> values) {
            addCriterion("waterStorageDesc not in", values, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescBetween(String value1, String value2) {
            addCriterion("waterStorageDesc between", value1, value2, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andWaterStorageDescNotBetween(String value1, String value2) {
            addCriterion("waterStorageDesc not between", value1, value2, "waterStorageDesc");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsIsNull() {
            addCriterion("AvgStorageHrs is null");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsIsNotNull() {
            addCriterion("AvgStorageHrs is not null");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsEqualTo(Integer value) {
            addCriterion("AvgStorageHrs =", value, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsNotEqualTo(Integer value) {
            addCriterion("AvgStorageHrs <>", value, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsGreaterThan(Integer value) {
            addCriterion("AvgStorageHrs >", value, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsGreaterThanOrEqualTo(Integer value) {
            addCriterion("AvgStorageHrs >=", value, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsLessThan(Integer value) {
            addCriterion("AvgStorageHrs <", value, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsLessThanOrEqualTo(Integer value) {
            addCriterion("AvgStorageHrs <=", value, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsIn(List<Integer> values) {
            addCriterion("AvgStorageHrs in", values, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsNotIn(List<Integer> values) {
            addCriterion("AvgStorageHrs not in", values, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsBetween(Integer value1, Integer value2) {
            addCriterion("AvgStorageHrs between", value1, value2, "avgStorageHrs");
            return (Criteria) this;
        }

        public Criteria andAvgStorageHrsNotBetween(Integer value1, Integer value2) {
            addCriterion("AvgStorageHrs not between", value1, value2, "avgStorageHrs");
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
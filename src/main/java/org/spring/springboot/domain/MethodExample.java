package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class MethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MethodExample() {
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

        public Criteria andMethodIdIsNull() {
            addCriterion("methodId is null");
            return (Criteria) this;
        }

        public Criteria andMethodIdIsNotNull() {
            addCriterion("methodId is not null");
            return (Criteria) this;
        }

        public Criteria andMethodIdEqualTo(Integer value) {
            addCriterion("methodId =", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotEqualTo(Integer value) {
            addCriterion("methodId <>", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdGreaterThan(Integer value) {
            addCriterion("methodId >", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("methodId >=", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdLessThan(Integer value) {
            addCriterion("methodId <", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("methodId <=", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdIn(List<Integer> values) {
            addCriterion("methodId in", values, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotIn(List<Integer> values) {
            addCriterion("methodId not in", values, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("methodId between", value1, value2, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("methodId not between", value1, value2, "methodId");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNull() {
            addCriterion("indexName is null");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNotNull() {
            addCriterion("indexName is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNameEqualTo(String value) {
            addCriterion("indexName =", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotEqualTo(String value) {
            addCriterion("indexName <>", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThan(String value) {
            addCriterion("indexName >", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("indexName >=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThan(String value) {
            addCriterion("indexName <", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThanOrEqualTo(String value) {
            addCriterion("indexName <=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLike(String value) {
            addCriterion("indexName like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotLike(String value) {
            addCriterion("indexName not like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIn(List<String> values) {
            addCriterion("indexName in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotIn(List<String> values) {
            addCriterion("indexName not in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameBetween(String value1, String value2) {
            addCriterion("indexName between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotBetween(String value1, String value2) {
            addCriterion("indexName not between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIsNull() {
            addCriterion("methodType is null");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIsNotNull() {
            addCriterion("methodType is not null");
            return (Criteria) this;
        }

        public Criteria andMethodTypeEqualTo(String value) {
            addCriterion("methodType =", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotEqualTo(String value) {
            addCriterion("methodType <>", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThan(String value) {
            addCriterion("methodType >", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("methodType >=", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThan(String value) {
            addCriterion("methodType <", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThanOrEqualTo(String value) {
            addCriterion("methodType <=", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLike(String value) {
            addCriterion("methodType like", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotLike(String value) {
            addCriterion("methodType not like", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIn(List<String> values) {
            addCriterion("methodType in", values, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotIn(List<String> values) {
            addCriterion("methodType not in", values, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeBetween(String value1, String value2) {
            addCriterion("methodType between", value1, value2, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotBetween(String value1, String value2) {
            addCriterion("methodType not between", value1, value2, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodValueIsNull() {
            addCriterion("methodValue is null");
            return (Criteria) this;
        }

        public Criteria andMethodValueIsNotNull() {
            addCriterion("methodValue is not null");
            return (Criteria) this;
        }

        public Criteria andMethodValueEqualTo(String value) {
            addCriterion("methodValue =", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueNotEqualTo(String value) {
            addCriterion("methodValue <>", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueGreaterThan(String value) {
            addCriterion("methodValue >", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueGreaterThanOrEqualTo(String value) {
            addCriterion("methodValue >=", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueLessThan(String value) {
            addCriterion("methodValue <", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueLessThanOrEqualTo(String value) {
            addCriterion("methodValue <=", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueLike(String value) {
            addCriterion("methodValue like", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueNotLike(String value) {
            addCriterion("methodValue not like", value, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueIn(List<String> values) {
            addCriterion("methodValue in", values, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueNotIn(List<String> values) {
            addCriterion("methodValue not in", values, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueBetween(String value1, String value2) {
            addCriterion("methodValue between", value1, value2, "methodValue");
            return (Criteria) this;
        }

        public Criteria andMethodValueNotBetween(String value1, String value2) {
            addCriterion("methodValue not between", value1, value2, "methodValue");
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
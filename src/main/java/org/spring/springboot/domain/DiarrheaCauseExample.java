package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class DiarrheaCauseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiarrheaCauseExample() {
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

        public Criteria andDHcauseIDIsNull() {
            addCriterion("DHcauseID is null");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDIsNotNull() {
            addCriterion("DHcauseID is not null");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDEqualTo(Integer value) {
            addCriterion("DHcauseID =", value, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDNotEqualTo(Integer value) {
            addCriterion("DHcauseID <>", value, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDGreaterThan(Integer value) {
            addCriterion("DHcauseID >", value, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("DHcauseID >=", value, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDLessThan(Integer value) {
            addCriterion("DHcauseID <", value, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDLessThanOrEqualTo(Integer value) {
            addCriterion("DHcauseID <=", value, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDIn(List<Integer> values) {
            addCriterion("DHcauseID in", values, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDNotIn(List<Integer> values) {
            addCriterion("DHcauseID not in", values, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDBetween(Integer value1, Integer value2) {
            addCriterion("DHcauseID between", value1, value2, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHcauseIDNotBetween(Integer value1, Integer value2) {
            addCriterion("DHcauseID not between", value1, value2, "DHcauseID");
            return (Criteria) this;
        }

        public Criteria andDHDescIsNull() {
            addCriterion("DHDesc is null");
            return (Criteria) this;
        }

        public Criteria andDHDescIsNotNull() {
            addCriterion("DHDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDHDescEqualTo(String value) {
            addCriterion("DHDesc =", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescNotEqualTo(String value) {
            addCriterion("DHDesc <>", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescGreaterThan(String value) {
            addCriterion("DHDesc >", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescGreaterThanOrEqualTo(String value) {
            addCriterion("DHDesc >=", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescLessThan(String value) {
            addCriterion("DHDesc <", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescLessThanOrEqualTo(String value) {
            addCriterion("DHDesc <=", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescLike(String value) {
            addCriterion("DHDesc like", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescNotLike(String value) {
            addCriterion("DHDesc not like", value, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescIn(List<String> values) {
            addCriterion("DHDesc in", values, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescNotIn(List<String> values) {
            addCriterion("DHDesc not in", values, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescBetween(String value1, String value2) {
            addCriterion("DHDesc between", value1, value2, "DHDesc");
            return (Criteria) this;
        }

        public Criteria andDHDescNotBetween(String value1, String value2) {
            addCriterion("DHDesc not between", value1, value2, "DHDesc");
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
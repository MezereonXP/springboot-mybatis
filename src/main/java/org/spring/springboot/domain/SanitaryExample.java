package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class SanitaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SanitaryExample() {
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

        public Criteria andSanitaryTypeIdIsNull() {
            addCriterion("sanitaryTypeId is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdIsNotNull() {
            addCriterion("sanitaryTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdEqualTo(Integer value) {
            addCriterion("sanitaryTypeId =", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdNotEqualTo(Integer value) {
            addCriterion("sanitaryTypeId <>", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdGreaterThan(Integer value) {
            addCriterion("sanitaryTypeId >", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryTypeId >=", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdLessThan(Integer value) {
            addCriterion("sanitaryTypeId <", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryTypeId <=", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdIn(List<Integer> values) {
            addCriterion("sanitaryTypeId in", values, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdNotIn(List<Integer> values) {
            addCriterion("sanitaryTypeId not in", values, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryTypeId between", value1, value2, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryTypeId not between", value1, value2, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescIsNull() {
            addCriterion("sanitaryTypeDesc is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescIsNotNull() {
            addCriterion("sanitaryTypeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescEqualTo(String value) {
            addCriterion("sanitaryTypeDesc =", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescNotEqualTo(String value) {
            addCriterion("sanitaryTypeDesc <>", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescGreaterThan(String value) {
            addCriterion("sanitaryTypeDesc >", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("sanitaryTypeDesc >=", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescLessThan(String value) {
            addCriterion("sanitaryTypeDesc <", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescLessThanOrEqualTo(String value) {
            addCriterion("sanitaryTypeDesc <=", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescLike(String value) {
            addCriterion("sanitaryTypeDesc like", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescNotLike(String value) {
            addCriterion("sanitaryTypeDesc not like", value, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescIn(List<String> values) {
            addCriterion("sanitaryTypeDesc in", values, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescNotIn(List<String> values) {
            addCriterion("sanitaryTypeDesc not in", values, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescBetween(String value1, String value2) {
            addCriterion("sanitaryTypeDesc between", value1, value2, "sanitaryTypeDesc");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeDescNotBetween(String value1, String value2) {
            addCriterion("sanitaryTypeDesc not between", value1, value2, "sanitaryTypeDesc");
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
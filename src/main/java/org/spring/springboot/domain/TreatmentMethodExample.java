package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class TreatmentMethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TreatmentMethodExample() {
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

        public Criteria andTreatmentMethodIdIsNull() {
            addCriterion("treatmentMethodId is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdIsNotNull() {
            addCriterion("treatmentMethodId is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdEqualTo(Integer value) {
            addCriterion("treatmentMethodId =", value, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdNotEqualTo(Integer value) {
            addCriterion("treatmentMethodId <>", value, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdGreaterThan(Integer value) {
            addCriterion("treatmentMethodId >", value, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("treatmentMethodId >=", value, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdLessThan(Integer value) {
            addCriterion("treatmentMethodId <", value, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("treatmentMethodId <=", value, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdIn(List<Integer> values) {
            addCriterion("treatmentMethodId in", values, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdNotIn(List<Integer> values) {
            addCriterion("treatmentMethodId not in", values, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("treatmentMethodId between", value1, value2, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("treatmentMethodId not between", value1, value2, "treatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescIsNull() {
            addCriterion("treatmentMethodDesc is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescIsNotNull() {
            addCriterion("treatmentMethodDesc is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescEqualTo(String value) {
            addCriterion("treatmentMethodDesc =", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescNotEqualTo(String value) {
            addCriterion("treatmentMethodDesc <>", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescGreaterThan(String value) {
            addCriterion("treatmentMethodDesc >", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescGreaterThanOrEqualTo(String value) {
            addCriterion("treatmentMethodDesc >=", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescLessThan(String value) {
            addCriterion("treatmentMethodDesc <", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescLessThanOrEqualTo(String value) {
            addCriterion("treatmentMethodDesc <=", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescLike(String value) {
            addCriterion("treatmentMethodDesc like", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescNotLike(String value) {
            addCriterion("treatmentMethodDesc not like", value, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescIn(List<String> values) {
            addCriterion("treatmentMethodDesc in", values, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescNotIn(List<String> values) {
            addCriterion("treatmentMethodDesc not in", values, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescBetween(String value1, String value2) {
            addCriterion("treatmentMethodDesc between", value1, value2, "treatmentMethodDesc");
            return (Criteria) this;
        }

        public Criteria andTreatmentMethodDescNotBetween(String value1, String value2) {
            addCriterion("treatmentMethodDesc not between", value1, value2, "treatmentMethodDesc");
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
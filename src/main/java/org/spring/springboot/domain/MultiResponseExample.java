package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class MultiResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MultiResponseExample() {
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

        public Criteria andBaseIdIsNull() {
            addCriterion("baseId is null");
            return (Criteria) this;
        }

        public Criteria andBaseIdIsNotNull() {
            addCriterion("baseId is not null");
            return (Criteria) this;
        }

        public Criteria andBaseIdEqualTo(Integer value) {
            addCriterion("baseId =", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotEqualTo(Integer value) {
            addCriterion("baseId <>", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThan(Integer value) {
            addCriterion("baseId >", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("baseId >=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThan(Integer value) {
            addCriterion("baseId <", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("baseId <=", value, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdIn(List<Integer> values) {
            addCriterion("baseId in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotIn(List<Integer> values) {
            addCriterion("baseId not in", values, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdBetween(Integer value1, Integer value2) {
            addCriterion("baseId between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andBaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("baseId not between", value1, value2, "baseId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdIsNull() {
            addCriterion("healthCenterId is null");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdIsNotNull() {
            addCriterion("healthCenterId is not null");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdEqualTo(Integer value) {
            addCriterion("healthCenterId =", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdNotEqualTo(Integer value) {
            addCriterion("healthCenterId <>", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdGreaterThan(Integer value) {
            addCriterion("healthCenterId >", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("healthCenterId >=", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdLessThan(Integer value) {
            addCriterion("healthCenterId <", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("healthCenterId <=", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdIn(List<Integer> values) {
            addCriterion("healthCenterId in", values, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdNotIn(List<Integer> values) {
            addCriterion("healthCenterId not in", values, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdBetween(Integer value1, Integer value2) {
            addCriterion("healthCenterId between", value1, value2, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("healthCenterId not between", value1, value2, "healthCenterId");
            return (Criteria) this;
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

        public Criteria andCentreWaterTreatmentIdIsNull() {
            addCriterion("centreWaterTreatmentId is null");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdIsNotNull() {
            addCriterion("centreWaterTreatmentId is not null");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdEqualTo(Integer value) {
            addCriterion("centreWaterTreatmentId =", value, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdNotEqualTo(Integer value) {
            addCriterion("centreWaterTreatmentId <>", value, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdGreaterThan(Integer value) {
            addCriterion("centreWaterTreatmentId >", value, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("centreWaterTreatmentId >=", value, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdLessThan(Integer value) {
            addCriterion("centreWaterTreatmentId <", value, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("centreWaterTreatmentId <=", value, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdIn(List<Integer> values) {
            addCriterion("centreWaterTreatmentId in", values, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdNotIn(List<Integer> values) {
            addCriterion("centreWaterTreatmentId not in", values, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdBetween(Integer value1, Integer value2) {
            addCriterion("centreWaterTreatmentId between", value1, value2, "centreWaterTreatmentId");
            return (Criteria) this;
        }

        public Criteria andCentreWaterTreatmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("centreWaterTreatmentId not between", value1, value2, "centreWaterTreatmentId");
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
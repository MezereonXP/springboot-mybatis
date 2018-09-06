package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class TurbidityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TurbidityExample() {
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

        public Criteria andTurbidityIdIsNull() {
            addCriterion("turbidityId is null");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdIsNotNull() {
            addCriterion("turbidityId is not null");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdEqualTo(Integer value) {
            addCriterion("turbidityId =", value, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdNotEqualTo(Integer value) {
            addCriterion("turbidityId <>", value, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdGreaterThan(Integer value) {
            addCriterion("turbidityId >", value, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("turbidityId >=", value, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdLessThan(Integer value) {
            addCriterion("turbidityId <", value, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdLessThanOrEqualTo(Integer value) {
            addCriterion("turbidityId <=", value, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdIn(List<Integer> values) {
            addCriterion("turbidityId in", values, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdNotIn(List<Integer> values) {
            addCriterion("turbidityId not in", values, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdBetween(Integer value1, Integer value2) {
            addCriterion("turbidityId between", value1, value2, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("turbidityId not between", value1, value2, "turbidityId");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescIsNull() {
            addCriterion("turbidityDesc is null");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescIsNotNull() {
            addCriterion("turbidityDesc is not null");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescEqualTo(String value) {
            addCriterion("turbidityDesc =", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescNotEqualTo(String value) {
            addCriterion("turbidityDesc <>", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescGreaterThan(String value) {
            addCriterion("turbidityDesc >", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescGreaterThanOrEqualTo(String value) {
            addCriterion("turbidityDesc >=", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescLessThan(String value) {
            addCriterion("turbidityDesc <", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescLessThanOrEqualTo(String value) {
            addCriterion("turbidityDesc <=", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescLike(String value) {
            addCriterion("turbidityDesc like", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescNotLike(String value) {
            addCriterion("turbidityDesc not like", value, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescIn(List<String> values) {
            addCriterion("turbidityDesc in", values, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescNotIn(List<String> values) {
            addCriterion("turbidityDesc not in", values, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescBetween(String value1, String value2) {
            addCriterion("turbidityDesc between", value1, value2, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityDescNotBetween(String value1, String value2) {
            addCriterion("turbidityDesc not between", value1, value2, "turbidityDesc");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueIsNull() {
            addCriterion("turbidityValue is null");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueIsNotNull() {
            addCriterion("turbidityValue is not null");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueEqualTo(Float value) {
            addCriterion("turbidityValue =", value, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueNotEqualTo(Float value) {
            addCriterion("turbidityValue <>", value, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueGreaterThan(Float value) {
            addCriterion("turbidityValue >", value, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueGreaterThanOrEqualTo(Float value) {
            addCriterion("turbidityValue >=", value, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueLessThan(Float value) {
            addCriterion("turbidityValue <", value, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueLessThanOrEqualTo(Float value) {
            addCriterion("turbidityValue <=", value, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueIn(List<Float> values) {
            addCriterion("turbidityValue in", values, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueNotIn(List<Float> values) {
            addCriterion("turbidityValue not in", values, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueBetween(Float value1, Float value2) {
            addCriterion("turbidityValue between", value1, value2, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbidityValueNotBetween(Float value1, Float value2) {
            addCriterion("turbidityValue not between", value1, value2, "turbidityValue");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodIsNull() {
            addCriterion("turbiditymethod is null");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodIsNotNull() {
            addCriterion("turbiditymethod is not null");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodEqualTo(String value) {
            addCriterion("turbiditymethod =", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodNotEqualTo(String value) {
            addCriterion("turbiditymethod <>", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodGreaterThan(String value) {
            addCriterion("turbiditymethod >", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodGreaterThanOrEqualTo(String value) {
            addCriterion("turbiditymethod >=", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodLessThan(String value) {
            addCriterion("turbiditymethod <", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodLessThanOrEqualTo(String value) {
            addCriterion("turbiditymethod <=", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodLike(String value) {
            addCriterion("turbiditymethod like", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodNotLike(String value) {
            addCriterion("turbiditymethod not like", value, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodIn(List<String> values) {
            addCriterion("turbiditymethod in", values, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodNotIn(List<String> values) {
            addCriterion("turbiditymethod not in", values, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodBetween(String value1, String value2) {
            addCriterion("turbiditymethod between", value1, value2, "turbiditymethod");
            return (Criteria) this;
        }

        public Criteria andTurbiditymethodNotBetween(String value1, String value2) {
            addCriterion("turbiditymethod not between", value1, value2, "turbiditymethod");
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
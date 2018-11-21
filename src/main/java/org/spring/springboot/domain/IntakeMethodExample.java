package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class IntakeMethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntakeMethodExample() {
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

        public Criteria andIntakeMethodIdIsNull() {
            addCriterion("intakeMethodId is null");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdIsNotNull() {
            addCriterion("intakeMethodId is not null");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdEqualTo(Integer value) {
            addCriterion("intakeMethodId =", value, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdNotEqualTo(Integer value) {
            addCriterion("intakeMethodId <>", value, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdGreaterThan(Integer value) {
            addCriterion("intakeMethodId >", value, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("intakeMethodId >=", value, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdLessThan(Integer value) {
            addCriterion("intakeMethodId <", value, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("intakeMethodId <=", value, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdIn(List<Integer> values) {
            addCriterion("intakeMethodId in", values, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdNotIn(List<Integer> values) {
            addCriterion("intakeMethodId not in", values, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("intakeMethodId between", value1, value2, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("intakeMethodId not between", value1, value2, "intakeMethodId");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescIsNull() {
            addCriterion("intakeMethodDesc is null");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescIsNotNull() {
            addCriterion("intakeMethodDesc is not null");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescEqualTo(String value) {
            addCriterion("intakeMethodDesc =", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescNotEqualTo(String value) {
            addCriterion("intakeMethodDesc <>", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescGreaterThan(String value) {
            addCriterion("intakeMethodDesc >", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescGreaterThanOrEqualTo(String value) {
            addCriterion("intakeMethodDesc >=", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescLessThan(String value) {
            addCriterion("intakeMethodDesc <", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescLessThanOrEqualTo(String value) {
            addCriterion("intakeMethodDesc <=", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescLike(String value) {
            addCriterion("intakeMethodDesc like", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescNotLike(String value) {
            addCriterion("intakeMethodDesc not like", value, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescIn(List<String> values) {
            addCriterion("intakeMethodDesc in", values, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescNotIn(List<String> values) {
            addCriterion("intakeMethodDesc not in", values, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescBetween(String value1, String value2) {
            addCriterion("intakeMethodDesc between", value1, value2, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andIntakeMethodDescNotBetween(String value1, String value2) {
            addCriterion("intakeMethodDesc not between", value1, value2, "intakeMethodDesc");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("visible is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("visible is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(Integer value) {
            addCriterion("visible =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(Integer value) {
            addCriterion("visible <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(Integer value) {
            addCriterion("visible >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("visible >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(Integer value) {
            addCriterion("visible <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("visible <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<Integer> values) {
            addCriterion("visible in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<Integer> values) {
            addCriterion("visible not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(Integer value1, Integer value2) {
            addCriterion("visible between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("visible not between", value1, value2, "visible");
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
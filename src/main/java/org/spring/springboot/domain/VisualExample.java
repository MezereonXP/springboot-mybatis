package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class VisualExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisualExample() {
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

        public Criteria andVisualIDIsNull() {
            addCriterion("visualID is null");
            return (Criteria) this;
        }

        public Criteria andVisualIDIsNotNull() {
            addCriterion("visualID is not null");
            return (Criteria) this;
        }

        public Criteria andVisualIDEqualTo(Integer value) {
            addCriterion("visualID =", value, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDNotEqualTo(Integer value) {
            addCriterion("visualID <>", value, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDGreaterThan(Integer value) {
            addCriterion("visualID >", value, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("visualID >=", value, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDLessThan(Integer value) {
            addCriterion("visualID <", value, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDLessThanOrEqualTo(Integer value) {
            addCriterion("visualID <=", value, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDIn(List<Integer> values) {
            addCriterion("visualID in", values, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDNotIn(List<Integer> values) {
            addCriterion("visualID not in", values, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDBetween(Integer value1, Integer value2) {
            addCriterion("visualID between", value1, value2, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualIDNotBetween(Integer value1, Integer value2) {
            addCriterion("visualID not between", value1, value2, "visualID");
            return (Criteria) this;
        }

        public Criteria andVisualDescIsNull() {
            addCriterion("visualDesc is null");
            return (Criteria) this;
        }

        public Criteria andVisualDescIsNotNull() {
            addCriterion("visualDesc is not null");
            return (Criteria) this;
        }

        public Criteria andVisualDescEqualTo(String value) {
            addCriterion("visualDesc =", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescNotEqualTo(String value) {
            addCriterion("visualDesc <>", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescGreaterThan(String value) {
            addCriterion("visualDesc >", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescGreaterThanOrEqualTo(String value) {
            addCriterion("visualDesc >=", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescLessThan(String value) {
            addCriterion("visualDesc <", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescLessThanOrEqualTo(String value) {
            addCriterion("visualDesc <=", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescLike(String value) {
            addCriterion("visualDesc like", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescNotLike(String value) {
            addCriterion("visualDesc not like", value, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescIn(List<String> values) {
            addCriterion("visualDesc in", values, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescNotIn(List<String> values) {
            addCriterion("visualDesc not in", values, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescBetween(String value1, String value2) {
            addCriterion("visualDesc between", value1, value2, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescNotBetween(String value1, String value2) {
            addCriterion("visualDesc not between", value1, value2, "visualDesc");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsIsNull() {
            addCriterion("visualDescDetails is null");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsIsNotNull() {
            addCriterion("visualDescDetails is not null");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsEqualTo(String value) {
            addCriterion("visualDescDetails =", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsNotEqualTo(String value) {
            addCriterion("visualDescDetails <>", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsGreaterThan(String value) {
            addCriterion("visualDescDetails >", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("visualDescDetails >=", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsLessThan(String value) {
            addCriterion("visualDescDetails <", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsLessThanOrEqualTo(String value) {
            addCriterion("visualDescDetails <=", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsLike(String value) {
            addCriterion("visualDescDetails like", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsNotLike(String value) {
            addCriterion("visualDescDetails not like", value, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsIn(List<String> values) {
            addCriterion("visualDescDetails in", values, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsNotIn(List<String> values) {
            addCriterion("visualDescDetails not in", values, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsBetween(String value1, String value2) {
            addCriterion("visualDescDetails between", value1, value2, "visualDescDetails");
            return (Criteria) this;
        }

        public Criteria andVisualDescDetailsNotBetween(String value1, String value2) {
            addCriterion("visualDescDetails not between", value1, value2, "visualDescDetails");
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
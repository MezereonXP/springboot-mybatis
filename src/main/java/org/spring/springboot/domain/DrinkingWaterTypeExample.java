package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class DrinkingWaterTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrinkingWaterTypeExample() {
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

        public Criteria andDrinkWaterIdIsNull() {
            addCriterion("drinkWaterId is null");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdIsNotNull() {
            addCriterion("drinkWaterId is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdEqualTo(Integer value) {
            addCriterion("drinkWaterId =", value, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdNotEqualTo(Integer value) {
            addCriterion("drinkWaterId <>", value, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdGreaterThan(Integer value) {
            addCriterion("drinkWaterId >", value, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drinkWaterId >=", value, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdLessThan(Integer value) {
            addCriterion("drinkWaterId <", value, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("drinkWaterId <=", value, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdIn(List<Integer> values) {
            addCriterion("drinkWaterId in", values, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdNotIn(List<Integer> values) {
            addCriterion("drinkWaterId not in", values, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdBetween(Integer value1, Integer value2) {
            addCriterion("drinkWaterId between", value1, value2, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drinkWaterId not between", value1, value2, "drinkWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescIsNull() {
            addCriterion("drinkWaterDesc is null");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescIsNotNull() {
            addCriterion("drinkWaterDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescEqualTo(String value) {
            addCriterion("drinkWaterDesc =", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescNotEqualTo(String value) {
            addCriterion("drinkWaterDesc <>", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescGreaterThan(String value) {
            addCriterion("drinkWaterDesc >", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescGreaterThanOrEqualTo(String value) {
            addCriterion("drinkWaterDesc >=", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescLessThan(String value) {
            addCriterion("drinkWaterDesc <", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescLessThanOrEqualTo(String value) {
            addCriterion("drinkWaterDesc <=", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescLike(String value) {
            addCriterion("drinkWaterDesc like", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescNotLike(String value) {
            addCriterion("drinkWaterDesc not like", value, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescIn(List<String> values) {
            addCriterion("drinkWaterDesc in", values, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescNotIn(List<String> values) {
            addCriterion("drinkWaterDesc not in", values, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescBetween(String value1, String value2) {
            addCriterion("drinkWaterDesc between", value1, value2, "drinkWaterDesc");
            return (Criteria) this;
        }

        public Criteria andDrinkWaterDescNotBetween(String value1, String value2) {
            addCriterion("drinkWaterDesc not between", value1, value2, "drinkWaterDesc");
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
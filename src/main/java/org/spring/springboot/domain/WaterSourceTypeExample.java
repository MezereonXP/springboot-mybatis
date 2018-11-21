package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class WaterSourceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterSourceTypeExample() {
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

        public Criteria andWaterSourceIdIsNull() {
            addCriterion("waterSourceId is null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdIsNotNull() {
            addCriterion("waterSourceId is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdEqualTo(Integer value) {
            addCriterion("waterSourceId =", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdNotEqualTo(Integer value) {
            addCriterion("waterSourceId <>", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdGreaterThan(Integer value) {
            addCriterion("waterSourceId >", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterSourceId >=", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdLessThan(Integer value) {
            addCriterion("waterSourceId <", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("waterSourceId <=", value, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdIn(List<Integer> values) {
            addCriterion("waterSourceId in", values, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdNotIn(List<Integer> values) {
            addCriterion("waterSourceId not in", values, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("waterSourceId between", value1, value2, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waterSourceId not between", value1, value2, "waterSourceId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescIsNull() {
            addCriterion("waterSourceDesc is null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescIsNotNull() {
            addCriterion("waterSourceDesc is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescEqualTo(String value) {
            addCriterion("waterSourceDesc =", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescNotEqualTo(String value) {
            addCriterion("waterSourceDesc <>", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescGreaterThan(String value) {
            addCriterion("waterSourceDesc >", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescGreaterThanOrEqualTo(String value) {
            addCriterion("waterSourceDesc >=", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescLessThan(String value) {
            addCriterion("waterSourceDesc <", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescLessThanOrEqualTo(String value) {
            addCriterion("waterSourceDesc <=", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescLike(String value) {
            addCriterion("waterSourceDesc like", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescNotLike(String value) {
            addCriterion("waterSourceDesc not like", value, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescIn(List<String> values) {
            addCriterion("waterSourceDesc in", values, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescNotIn(List<String> values) {
            addCriterion("waterSourceDesc not in", values, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescBetween(String value1, String value2) {
            addCriterion("waterSourceDesc between", value1, value2, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDescNotBetween(String value1, String value2) {
            addCriterion("waterSourceDesc not between", value1, value2, "waterSourceDesc");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsIsNull() {
            addCriterion("waterSourceDetails is null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsIsNotNull() {
            addCriterion("waterSourceDetails is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsEqualTo(String value) {
            addCriterion("waterSourceDetails =", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsNotEqualTo(String value) {
            addCriterion("waterSourceDetails <>", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsGreaterThan(String value) {
            addCriterion("waterSourceDetails >", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("waterSourceDetails >=", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsLessThan(String value) {
            addCriterion("waterSourceDetails <", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsLessThanOrEqualTo(String value) {
            addCriterion("waterSourceDetails <=", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsLike(String value) {
            addCriterion("waterSourceDetails like", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsNotLike(String value) {
            addCriterion("waterSourceDetails not like", value, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsIn(List<String> values) {
            addCriterion("waterSourceDetails in", values, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsNotIn(List<String> values) {
            addCriterion("waterSourceDetails not in", values, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsBetween(String value1, String value2) {
            addCriterion("waterSourceDetails between", value1, value2, "waterSourceDetails");
            return (Criteria) this;
        }

        public Criteria andWaterSourceDetailsNotBetween(String value1, String value2) {
            addCriterion("waterSourceDetails not between", value1, value2, "waterSourceDetails");
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
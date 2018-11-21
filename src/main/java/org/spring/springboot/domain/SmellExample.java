package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class SmellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmellExample() {
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

        public Criteria andSmellIdIsNull() {
            addCriterion("smellId is null");
            return (Criteria) this;
        }

        public Criteria andSmellIdIsNotNull() {
            addCriterion("smellId is not null");
            return (Criteria) this;
        }

        public Criteria andSmellIdEqualTo(Integer value) {
            addCriterion("smellId =", value, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdNotEqualTo(Integer value) {
            addCriterion("smellId <>", value, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdGreaterThan(Integer value) {
            addCriterion("smellId >", value, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("smellId >=", value, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdLessThan(Integer value) {
            addCriterion("smellId <", value, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdLessThanOrEqualTo(Integer value) {
            addCriterion("smellId <=", value, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdIn(List<Integer> values) {
            addCriterion("smellId in", values, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdNotIn(List<Integer> values) {
            addCriterion("smellId not in", values, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdBetween(Integer value1, Integer value2) {
            addCriterion("smellId between", value1, value2, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellIdNotBetween(Integer value1, Integer value2) {
            addCriterion("smellId not between", value1, value2, "smellId");
            return (Criteria) this;
        }

        public Criteria andSmellDescIsNull() {
            addCriterion("smellDesc is null");
            return (Criteria) this;
        }

        public Criteria andSmellDescIsNotNull() {
            addCriterion("smellDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSmellDescEqualTo(String value) {
            addCriterion("smellDesc =", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescNotEqualTo(String value) {
            addCriterion("smellDesc <>", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescGreaterThan(String value) {
            addCriterion("smellDesc >", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescGreaterThanOrEqualTo(String value) {
            addCriterion("smellDesc >=", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescLessThan(String value) {
            addCriterion("smellDesc <", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescLessThanOrEqualTo(String value) {
            addCriterion("smellDesc <=", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescLike(String value) {
            addCriterion("smellDesc like", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescNotLike(String value) {
            addCriterion("smellDesc not like", value, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescIn(List<String> values) {
            addCriterion("smellDesc in", values, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescNotIn(List<String> values) {
            addCriterion("smellDesc not in", values, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescBetween(String value1, String value2) {
            addCriterion("smellDesc between", value1, value2, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescNotBetween(String value1, String value2) {
            addCriterion("smellDesc not between", value1, value2, "smellDesc");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsIsNull() {
            addCriterion("smellDescDetails is null");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsIsNotNull() {
            addCriterion("smellDescDetails is not null");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsEqualTo(String value) {
            addCriterion("smellDescDetails =", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsNotEqualTo(String value) {
            addCriterion("smellDescDetails <>", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsGreaterThan(String value) {
            addCriterion("smellDescDetails >", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("smellDescDetails >=", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsLessThan(String value) {
            addCriterion("smellDescDetails <", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsLessThanOrEqualTo(String value) {
            addCriterion("smellDescDetails <=", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsLike(String value) {
            addCriterion("smellDescDetails like", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsNotLike(String value) {
            addCriterion("smellDescDetails not like", value, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsIn(List<String> values) {
            addCriterion("smellDescDetails in", values, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsNotIn(List<String> values) {
            addCriterion("smellDescDetails not in", values, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsBetween(String value1, String value2) {
            addCriterion("smellDescDetails between", value1, value2, "smellDescDetails");
            return (Criteria) this;
        }

        public Criteria andSmellDescDetailsNotBetween(String value1, String value2) {
            addCriterion("smellDescDetails not between", value1, value2, "smellDescDetails");
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
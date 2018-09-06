package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class CycleTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CycleTeamExample() {
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

        public Criteria andCycleTeamIdIsNull() {
            addCriterion("cycleTeamId is null");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdIsNotNull() {
            addCriterion("cycleTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdEqualTo(Integer value) {
            addCriterion("cycleTeamId =", value, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdNotEqualTo(Integer value) {
            addCriterion("cycleTeamId <>", value, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdGreaterThan(Integer value) {
            addCriterion("cycleTeamId >", value, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycleTeamId >=", value, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdLessThan(Integer value) {
            addCriterion("cycleTeamId <", value, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("cycleTeamId <=", value, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdIn(List<Integer> values) {
            addCriterion("cycleTeamId in", values, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdNotIn(List<Integer> values) {
            addCriterion("cycleTeamId not in", values, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("cycleTeamId between", value1, value2, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andCycleTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cycleTeamId not between", value1, value2, "cycleTeamId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdIsNull() {
            addCriterion("testCycleId is null");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdIsNotNull() {
            addCriterion("testCycleId is not null");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdEqualTo(Integer value) {
            addCriterion("testCycleId =", value, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdNotEqualTo(Integer value) {
            addCriterion("testCycleId <>", value, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdGreaterThan(Integer value) {
            addCriterion("testCycleId >", value, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("testCycleId >=", value, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdLessThan(Integer value) {
            addCriterion("testCycleId <", value, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdLessThanOrEqualTo(Integer value) {
            addCriterion("testCycleId <=", value, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdIn(List<Integer> values) {
            addCriterion("testCycleId in", values, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdNotIn(List<Integer> values) {
            addCriterion("testCycleId not in", values, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdBetween(Integer value1, Integer value2) {
            addCriterion("testCycleId between", value1, value2, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTestCycleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("testCycleId not between", value1, value2, "testCycleId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("teamId is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("teamId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("teamId =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("teamId <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("teamId >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teamId >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("teamId <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("teamId <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("teamId in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("teamId not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("teamId between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teamId not between", value1, value2, "teamId");
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
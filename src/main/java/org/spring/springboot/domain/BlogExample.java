package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blogId is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blogId is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blogId =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blogId <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blogId >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogId >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blogId <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogId <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blogId in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blogId not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blogId between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogId not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNull() {
            addCriterion("locationId is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("locationId is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("locationId =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("locationId <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("locationId >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationId >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("locationId <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("locationId <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("locationId in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("locationId not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("locationId between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("locationId not between", value1, value2, "locationId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
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
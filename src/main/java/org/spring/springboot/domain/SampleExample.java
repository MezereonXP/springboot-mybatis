package org.spring.springboot.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SampleExample() {
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

        public Criteria andWaterIdIsNull() {
            addCriterion("waterId is null");
            return (Criteria) this;
        }

        public Criteria andWaterIdIsNotNull() {
            addCriterion("waterId is not null");
            return (Criteria) this;
        }

        public Criteria andWaterIdEqualTo(Integer value) {
            addCriterion("waterId =", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotEqualTo(Integer value) {
            addCriterion("waterId <>", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThan(Integer value) {
            addCriterion("waterId >", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterId >=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThan(Integer value) {
            addCriterion("waterId <", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("waterId <=", value, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdIn(List<Integer> values) {
            addCriterion("waterId in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotIn(List<Integer> values) {
            addCriterion("waterId not in", values, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdBetween(Integer value1, Integer value2) {
            addCriterion("waterId between", value1, value2, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waterId not between", value1, value2, "waterId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdIsNull() {
            addCriterion("waterTypeId is null");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdIsNotNull() {
            addCriterion("waterTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdEqualTo(Integer value) {
            addCriterion("waterTypeId =", value, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdNotEqualTo(Integer value) {
            addCriterion("waterTypeId <>", value, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdGreaterThan(Integer value) {
            addCriterion("waterTypeId >", value, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterTypeId >=", value, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdLessThan(Integer value) {
            addCriterion("waterTypeId <", value, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("waterTypeId <=", value, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdIn(List<Integer> values) {
            addCriterion("waterTypeId in", values, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdNotIn(List<Integer> values) {
            addCriterion("waterTypeId not in", values, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("waterTypeId between", value1, value2, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waterTypeId not between", value1, value2, "waterTypeId");
            return (Criteria) this;
        }

        public Criteria andValidationIdIsNull() {
            addCriterion("validationId is null");
            return (Criteria) this;
        }

        public Criteria andValidationIdIsNotNull() {
            addCriterion("validationId is not null");
            return (Criteria) this;
        }

        public Criteria andValidationIdEqualTo(Integer value) {
            addCriterion("validationId =", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdNotEqualTo(Integer value) {
            addCriterion("validationId <>", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdGreaterThan(Integer value) {
            addCriterion("validationId >", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("validationId >=", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdLessThan(Integer value) {
            addCriterion("validationId <", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdLessThanOrEqualTo(Integer value) {
            addCriterion("validationId <=", value, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdIn(List<Integer> values) {
            addCriterion("validationId in", values, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdNotIn(List<Integer> values) {
            addCriterion("validationId not in", values, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdBetween(Integer value1, Integer value2) {
            addCriterion("validationId between", value1, value2, "validationId");
            return (Criteria) this;
        }

        public Criteria andValidationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("validationId not between", value1, value2, "validationId");
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

        public Criteria andDrinkingWaterIdIsNull() {
            addCriterion("drinkingWaterId is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdIsNotNull() {
            addCriterion("drinkingWaterId is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdEqualTo(Integer value) {
            addCriterion("drinkingWaterId =", value, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdNotEqualTo(Integer value) {
            addCriterion("drinkingWaterId <>", value, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdGreaterThan(Integer value) {
            addCriterion("drinkingWaterId >", value, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drinkingWaterId >=", value, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdLessThan(Integer value) {
            addCriterion("drinkingWaterId <", value, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("drinkingWaterId <=", value, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdIn(List<Integer> values) {
            addCriterion("drinkingWaterId in", values, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdNotIn(List<Integer> values) {
            addCriterion("drinkingWaterId not in", values, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdBetween(Integer value1, Integer value2) {
            addCriterion("drinkingWaterId between", value1, value2, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andDrinkingWaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drinkingWaterId not between", value1, value2, "drinkingWaterId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdIsNull() {
            addCriterion("waterSourceTypeId is null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdIsNotNull() {
            addCriterion("waterSourceTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdEqualTo(Integer value) {
            addCriterion("waterSourceTypeId =", value, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdNotEqualTo(Integer value) {
            addCriterion("waterSourceTypeId <>", value, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdGreaterThan(Integer value) {
            addCriterion("waterSourceTypeId >", value, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterSourceTypeId >=", value, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdLessThan(Integer value) {
            addCriterion("waterSourceTypeId <", value, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("waterSourceTypeId <=", value, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdIn(List<Integer> values) {
            addCriterion("waterSourceTypeId in", values, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdNotIn(List<Integer> values) {
            addCriterion("waterSourceTypeId not in", values, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("waterSourceTypeId between", value1, value2, "waterSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andWaterSourceTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waterSourceTypeId not between", value1, value2, "waterSourceTypeId");
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

        public Criteria andDeliveryMethodIdIsNull() {
            addCriterion("deliveryMethodId is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdIsNotNull() {
            addCriterion("deliveryMethodId is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdEqualTo(Integer value) {
            addCriterion("deliveryMethodId =", value, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdNotEqualTo(Integer value) {
            addCriterion("deliveryMethodId <>", value, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdGreaterThan(Integer value) {
            addCriterion("deliveryMethodId >", value, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryMethodId >=", value, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdLessThan(Integer value) {
            addCriterion("deliveryMethodId <", value, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryMethodId <=", value, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdIn(List<Integer> values) {
            addCriterion("deliveryMethodId in", values, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdNotIn(List<Integer> values) {
            addCriterion("deliveryMethodId not in", values, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("deliveryMethodId between", value1, value2, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryMethodId not between", value1, value2, "deliveryMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdIsNull() {
            addCriterion("inTakeMethodId is null");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdIsNotNull() {
            addCriterion("inTakeMethodId is not null");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdEqualTo(Integer value) {
            addCriterion("inTakeMethodId =", value, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdNotEqualTo(Integer value) {
            addCriterion("inTakeMethodId <>", value, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdGreaterThan(Integer value) {
            addCriterion("inTakeMethodId >", value, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inTakeMethodId >=", value, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdLessThan(Integer value) {
            addCriterion("inTakeMethodId <", value, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("inTakeMethodId <=", value, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdIn(List<Integer> values) {
            addCriterion("inTakeMethodId in", values, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdNotIn(List<Integer> values) {
            addCriterion("inTakeMethodId not in", values, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("inTakeMethodId between", value1, value2, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andInTakeMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inTakeMethodId not between", value1, value2, "inTakeMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdIsNull() {
            addCriterion("centralizedWaterTreatmentMethodId is null");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdIsNotNull() {
            addCriterion("centralizedWaterTreatmentMethodId is not null");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdEqualTo(Integer value) {
            addCriterion("centralizedWaterTreatmentMethodId =", value, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdNotEqualTo(Integer value) {
            addCriterion("centralizedWaterTreatmentMethodId <>", value, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdGreaterThan(Integer value) {
            addCriterion("centralizedWaterTreatmentMethodId >", value, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("centralizedWaterTreatmentMethodId >=", value, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdLessThan(Integer value) {
            addCriterion("centralizedWaterTreatmentMethodId <", value, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("centralizedWaterTreatmentMethodId <=", value, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdIn(List<Integer> values) {
            addCriterion("centralizedWaterTreatmentMethodId in", values, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdNotIn(List<Integer> values) {
            addCriterion("centralizedWaterTreatmentMethodId not in", values, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("centralizedWaterTreatmentMethodId between", value1, value2, "centralizedWaterTreatmentMethodId");
            return (Criteria) this;
        }

        public Criteria andCentralizedWaterTreatmentMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("centralizedWaterTreatmentMethodId not between", value1, value2, "centralizedWaterTreatmentMethodId");
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

        public Criteria andWaterStorageIdIsNull() {
            addCriterion("waterStorageId is null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdIsNotNull() {
            addCriterion("waterStorageId is not null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdEqualTo(Integer value) {
            addCriterion("waterStorageId =", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdNotEqualTo(Integer value) {
            addCriterion("waterStorageId <>", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdGreaterThan(Integer value) {
            addCriterion("waterStorageId >", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterStorageId >=", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdLessThan(Integer value) {
            addCriterion("waterStorageId <", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdLessThanOrEqualTo(Integer value) {
            addCriterion("waterStorageId <=", value, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdIn(List<Integer> values) {
            addCriterion("waterStorageId in", values, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdNotIn(List<Integer> values) {
            addCriterion("waterStorageId not in", values, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdBetween(Integer value1, Integer value2) {
            addCriterion("waterStorageId between", value1, value2, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("waterStorageId not between", value1, value2, "waterStorageId");
            return (Criteria) this;
        }

        public Criteria andWaterShortageIsNull() {
            addCriterion("waterShortage is null");
            return (Criteria) this;
        }

        public Criteria andWaterShortageIsNotNull() {
            addCriterion("waterShortage is not null");
            return (Criteria) this;
        }

        public Criteria andWaterShortageEqualTo(String value) {
            addCriterion("waterShortage =", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageNotEqualTo(String value) {
            addCriterion("waterShortage <>", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageGreaterThan(String value) {
            addCriterion("waterShortage >", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageGreaterThanOrEqualTo(String value) {
            addCriterion("waterShortage >=", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageLessThan(String value) {
            addCriterion("waterShortage <", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageLessThanOrEqualTo(String value) {
            addCriterion("waterShortage <=", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageLike(String value) {
            addCriterion("waterShortage like", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageNotLike(String value) {
            addCriterion("waterShortage not like", value, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageIn(List<String> values) {
            addCriterion("waterShortage in", values, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageNotIn(List<String> values) {
            addCriterion("waterShortage not in", values, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageBetween(String value1, String value2) {
            addCriterion("waterShortage between", value1, value2, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andWaterShortageNotBetween(String value1, String value2) {
            addCriterion("waterShortage not between", value1, value2, "waterShortage");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationIsNull() {
            addCriterion("potentialContamination is null");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationIsNotNull() {
            addCriterion("potentialContamination is not null");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationEqualTo(String value) {
            addCriterion("potentialContamination =", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationNotEqualTo(String value) {
            addCriterion("potentialContamination <>", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationGreaterThan(String value) {
            addCriterion("potentialContamination >", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationGreaterThanOrEqualTo(String value) {
            addCriterion("potentialContamination >=", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationLessThan(String value) {
            addCriterion("potentialContamination <", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationLessThanOrEqualTo(String value) {
            addCriterion("potentialContamination <=", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationLike(String value) {
            addCriterion("potentialContamination like", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationNotLike(String value) {
            addCriterion("potentialContamination not like", value, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationIn(List<String> values) {
            addCriterion("potentialContamination in", values, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationNotIn(List<String> values) {
            addCriterion("potentialContamination not in", values, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationBetween(String value1, String value2) {
            addCriterion("potentialContamination between", value1, value2, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationNotBetween(String value1, String value2) {
            addCriterion("potentialContamination not between", value1, value2, "potentialContamination");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceIsNull() {
            addCriterion("potentialContaminationDistance is null");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceIsNotNull() {
            addCriterion("potentialContaminationDistance is not null");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceEqualTo(Integer value) {
            addCriterion("potentialContaminationDistance =", value, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceNotEqualTo(Integer value) {
            addCriterion("potentialContaminationDistance <>", value, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceGreaterThan(Integer value) {
            addCriterion("potentialContaminationDistance >", value, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("potentialContaminationDistance >=", value, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceLessThan(Integer value) {
            addCriterion("potentialContaminationDistance <", value, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("potentialContaminationDistance <=", value, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceIn(List<Integer> values) {
            addCriterion("potentialContaminationDistance in", values, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceNotIn(List<Integer> values) {
            addCriterion("potentialContaminationDistance not in", values, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceBetween(Integer value1, Integer value2) {
            addCriterion("potentialContaminationDistance between", value1, value2, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPotentialContaminationDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("potentialContaminationDistance not between", value1, value2, "potentialContaminationDistance");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceIsNull() {
            addCriterion("populationServedBySource is null");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceIsNotNull() {
            addCriterion("populationServedBySource is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceEqualTo(Integer value) {
            addCriterion("populationServedBySource =", value, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceNotEqualTo(Integer value) {
            addCriterion("populationServedBySource <>", value, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceGreaterThan(Integer value) {
            addCriterion("populationServedBySource >", value, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("populationServedBySource >=", value, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceLessThan(Integer value) {
            addCriterion("populationServedBySource <", value, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceLessThanOrEqualTo(Integer value) {
            addCriterion("populationServedBySource <=", value, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceIn(List<Integer> values) {
            addCriterion("populationServedBySource in", values, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceNotIn(List<Integer> values) {
            addCriterion("populationServedBySource not in", values, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceBetween(Integer value1, Integer value2) {
            addCriterion("populationServedBySource between", value1, value2, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPopulationServedBySourceNotBetween(Integer value1, Integer value2) {
            addCriterion("populationServedBySource not between", value1, value2, "populationServedBySource");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsIsNull() {
            addCriterion("physicalIndicators is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsIsNotNull() {
            addCriterion("physicalIndicators is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsEqualTo(Integer value) {
            addCriterion("physicalIndicators =", value, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsNotEqualTo(Integer value) {
            addCriterion("physicalIndicators <>", value, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsGreaterThan(Integer value) {
            addCriterion("physicalIndicators >", value, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("physicalIndicators >=", value, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsLessThan(Integer value) {
            addCriterion("physicalIndicators <", value, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsLessThanOrEqualTo(Integer value) {
            addCriterion("physicalIndicators <=", value, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsIn(List<Integer> values) {
            addCriterion("physicalIndicators in", values, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsNotIn(List<Integer> values) {
            addCriterion("physicalIndicators not in", values, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsBetween(Integer value1, Integer value2) {
            addCriterion("physicalIndicators between", value1, value2, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andPhysicalIndicatorsNotBetween(Integer value1, Integer value2) {
            addCriterion("physicalIndicators not between", value1, value2, "physicalIndicators");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(Float value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(Float value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(Float value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(Float value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(Float value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(Float value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<Float> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<Float> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(Float value1, Float value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(Float value1, Float value2) {
            addCriterion("temp not between", value1, value2, "temp");
            return (Criteria) this;
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

        public Criteria andSmellDetailIsNull() {
            addCriterion("smellDetail is null");
            return (Criteria) this;
        }

        public Criteria andSmellDetailIsNotNull() {
            addCriterion("smellDetail is not null");
            return (Criteria) this;
        }

        public Criteria andSmellDetailEqualTo(String value) {
            addCriterion("smellDetail =", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailNotEqualTo(String value) {
            addCriterion("smellDetail <>", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailGreaterThan(String value) {
            addCriterion("smellDetail >", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailGreaterThanOrEqualTo(String value) {
            addCriterion("smellDetail >=", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailLessThan(String value) {
            addCriterion("smellDetail <", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailLessThanOrEqualTo(String value) {
            addCriterion("smellDetail <=", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailLike(String value) {
            addCriterion("smellDetail like", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailNotLike(String value) {
            addCriterion("smellDetail not like", value, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailIn(List<String> values) {
            addCriterion("smellDetail in", values, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailNotIn(List<String> values) {
            addCriterion("smellDetail not in", values, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailBetween(String value1, String value2) {
            addCriterion("smellDetail between", value1, value2, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andSmellDetailNotBetween(String value1, String value2) {
            addCriterion("smellDetail not between", value1, value2, "smellDetail");
            return (Criteria) this;
        }

        public Criteria andVisualIdIsNull() {
            addCriterion("visualId is null");
            return (Criteria) this;
        }

        public Criteria andVisualIdIsNotNull() {
            addCriterion("visualId is not null");
            return (Criteria) this;
        }

        public Criteria andVisualIdEqualTo(Integer value) {
            addCriterion("visualId =", value, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdNotEqualTo(Integer value) {
            addCriterion("visualId <>", value, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdGreaterThan(Integer value) {
            addCriterion("visualId >", value, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visualId >=", value, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdLessThan(Integer value) {
            addCriterion("visualId <", value, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdLessThanOrEqualTo(Integer value) {
            addCriterion("visualId <=", value, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdIn(List<Integer> values) {
            addCriterion("visualId in", values, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdNotIn(List<Integer> values) {
            addCriterion("visualId not in", values, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdBetween(Integer value1, Integer value2) {
            addCriterion("visualId between", value1, value2, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visualId not between", value1, value2, "visualId");
            return (Criteria) this;
        }

        public Criteria andVisualDetailIsNull() {
            addCriterion("visualDetail is null");
            return (Criteria) this;
        }

        public Criteria andVisualDetailIsNotNull() {
            addCriterion("visualDetail is not null");
            return (Criteria) this;
        }

        public Criteria andVisualDetailEqualTo(String value) {
            addCriterion("visualDetail =", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailNotEqualTo(String value) {
            addCriterion("visualDetail <>", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailGreaterThan(String value) {
            addCriterion("visualDetail >", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailGreaterThanOrEqualTo(String value) {
            addCriterion("visualDetail >=", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailLessThan(String value) {
            addCriterion("visualDetail <", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailLessThanOrEqualTo(String value) {
            addCriterion("visualDetail <=", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailLike(String value) {
            addCriterion("visualDetail like", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailNotLike(String value) {
            addCriterion("visualDetail not like", value, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailIn(List<String> values) {
            addCriterion("visualDetail in", values, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailNotIn(List<String> values) {
            addCriterion("visualDetail not in", values, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailBetween(String value1, String value2) {
            addCriterion("visualDetail between", value1, value2, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andVisualDetailNotBetween(String value1, String value2) {
            addCriterion("visualDetail not between", value1, value2, "visualDetail");
            return (Criteria) this;
        }

        public Criteria andOtherInformationIsNull() {
            addCriterion("otherInformation is null");
            return (Criteria) this;
        }

        public Criteria andOtherInformationIsNotNull() {
            addCriterion("otherInformation is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInformationEqualTo(String value) {
            addCriterion("otherInformation =", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationNotEqualTo(String value) {
            addCriterion("otherInformation <>", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationGreaterThan(String value) {
            addCriterion("otherInformation >", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationGreaterThanOrEqualTo(String value) {
            addCriterion("otherInformation >=", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationLessThan(String value) {
            addCriterion("otherInformation <", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationLessThanOrEqualTo(String value) {
            addCriterion("otherInformation <=", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationLike(String value) {
            addCriterion("otherInformation like", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationNotLike(String value) {
            addCriterion("otherInformation not like", value, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationIn(List<String> values) {
            addCriterion("otherInformation in", values, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationNotIn(List<String> values) {
            addCriterion("otherInformation not in", values, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationBetween(String value1, String value2) {
            addCriterion("otherInformation between", value1, value2, "otherInformation");
            return (Criteria) this;
        }

        public Criteria andOtherInformationNotBetween(String value1, String value2) {
            addCriterion("otherInformation not between", value1, value2, "otherInformation");
            return (Criteria) this;
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

        public Criteria andTurbidityDetailIsNull() {
            addCriterion("turbidityDetail is null");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailIsNotNull() {
            addCriterion("turbidityDetail is not null");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailEqualTo(String value) {
            addCriterion("turbidityDetail =", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailNotEqualTo(String value) {
            addCriterion("turbidityDetail <>", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailGreaterThan(String value) {
            addCriterion("turbidityDetail >", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailGreaterThanOrEqualTo(String value) {
            addCriterion("turbidityDetail >=", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailLessThan(String value) {
            addCriterion("turbidityDetail <", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailLessThanOrEqualTo(String value) {
            addCriterion("turbidityDetail <=", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailLike(String value) {
            addCriterion("turbidityDetail like", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailNotLike(String value) {
            addCriterion("turbidityDetail not like", value, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailIn(List<String> values) {
            addCriterion("turbidityDetail in", values, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailNotIn(List<String> values) {
            addCriterion("turbidityDetail not in", values, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailBetween(String value1, String value2) {
            addCriterion("turbidityDetail between", value1, value2, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andTurbidityDetailNotBetween(String value1, String value2) {
            addCriterion("turbidityDetail not between", value1, value2, "turbidityDetail");
            return (Criteria) this;
        }

        public Criteria andFeElementIsNull() {
            addCriterion("feElement is null");
            return (Criteria) this;
        }

        public Criteria andFeElementIsNotNull() {
            addCriterion("feElement is not null");
            return (Criteria) this;
        }

        public Criteria andFeElementEqualTo(Float value) {
            addCriterion("feElement =", value, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementNotEqualTo(Float value) {
            addCriterion("feElement <>", value, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementGreaterThan(Float value) {
            addCriterion("feElement >", value, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementGreaterThanOrEqualTo(Float value) {
            addCriterion("feElement >=", value, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementLessThan(Float value) {
            addCriterion("feElement <", value, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementLessThanOrEqualTo(Float value) {
            addCriterion("feElement <=", value, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementIn(List<Float> values) {
            addCriterion("feElement in", values, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementNotIn(List<Float> values) {
            addCriterion("feElement not in", values, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementBetween(Float value1, Float value2) {
            addCriterion("feElement between", value1, value2, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeElementNotBetween(Float value1, Float value2) {
            addCriterion("feElement not between", value1, value2, "feElement");
            return (Criteria) this;
        }

        public Criteria andFeMethodIsNull() {
            addCriterion("feMethod is null");
            return (Criteria) this;
        }

        public Criteria andFeMethodIsNotNull() {
            addCriterion("feMethod is not null");
            return (Criteria) this;
        }

        public Criteria andFeMethodEqualTo(String value) {
            addCriterion("feMethod =", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodNotEqualTo(String value) {
            addCriterion("feMethod <>", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodGreaterThan(String value) {
            addCriterion("feMethod >", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodGreaterThanOrEqualTo(String value) {
            addCriterion("feMethod >=", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodLessThan(String value) {
            addCriterion("feMethod <", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodLessThanOrEqualTo(String value) {
            addCriterion("feMethod <=", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodLike(String value) {
            addCriterion("feMethod like", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodNotLike(String value) {
            addCriterion("feMethod not like", value, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodIn(List<String> values) {
            addCriterion("feMethod in", values, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodNotIn(List<String> values) {
            addCriterion("feMethod not in", values, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodBetween(String value1, String value2) {
            addCriterion("feMethod between", value1, value2, "feMethod");
            return (Criteria) this;
        }

        public Criteria andFeMethodNotBetween(String value1, String value2) {
            addCriterion("feMethod not between", value1, value2, "feMethod");
            return (Criteria) this;
        }

        public Criteria andCr6ElementIsNull() {
            addCriterion("cr6Element is null");
            return (Criteria) this;
        }

        public Criteria andCr6ElementIsNotNull() {
            addCriterion("cr6Element is not null");
            return (Criteria) this;
        }

        public Criteria andCr6ElementEqualTo(Float value) {
            addCriterion("cr6Element =", value, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementNotEqualTo(Float value) {
            addCriterion("cr6Element <>", value, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementGreaterThan(Float value) {
            addCriterion("cr6Element >", value, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementGreaterThanOrEqualTo(Float value) {
            addCriterion("cr6Element >=", value, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementLessThan(Float value) {
            addCriterion("cr6Element <", value, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementLessThanOrEqualTo(Float value) {
            addCriterion("cr6Element <=", value, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementIn(List<Float> values) {
            addCriterion("cr6Element in", values, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementNotIn(List<Float> values) {
            addCriterion("cr6Element not in", values, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementBetween(Float value1, Float value2) {
            addCriterion("cr6Element between", value1, value2, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6ElementNotBetween(Float value1, Float value2) {
            addCriterion("cr6Element not between", value1, value2, "cr6Element");
            return (Criteria) this;
        }

        public Criteria andCr6MethodIsNull() {
            addCriterion("cr6Method is null");
            return (Criteria) this;
        }

        public Criteria andCr6MethodIsNotNull() {
            addCriterion("cr6Method is not null");
            return (Criteria) this;
        }

        public Criteria andCr6MethodEqualTo(String value) {
            addCriterion("cr6Method =", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodNotEqualTo(String value) {
            addCriterion("cr6Method <>", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodGreaterThan(String value) {
            addCriterion("cr6Method >", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodGreaterThanOrEqualTo(String value) {
            addCriterion("cr6Method >=", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodLessThan(String value) {
            addCriterion("cr6Method <", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodLessThanOrEqualTo(String value) {
            addCriterion("cr6Method <=", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodLike(String value) {
            addCriterion("cr6Method like", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodNotLike(String value) {
            addCriterion("cr6Method not like", value, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodIn(List<String> values) {
            addCriterion("cr6Method in", values, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodNotIn(List<String> values) {
            addCriterion("cr6Method not in", values, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodBetween(String value1, String value2) {
            addCriterion("cr6Method between", value1, value2, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andCr6MethodNotBetween(String value1, String value2) {
            addCriterion("cr6Method not between", value1, value2, "cr6Method");
            return (Criteria) this;
        }

        public Criteria andAsElementIsNull() {
            addCriterion("asElement is null");
            return (Criteria) this;
        }

        public Criteria andAsElementIsNotNull() {
            addCriterion("asElement is not null");
            return (Criteria) this;
        }

        public Criteria andAsElementEqualTo(Float value) {
            addCriterion("asElement =", value, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementNotEqualTo(Float value) {
            addCriterion("asElement <>", value, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementGreaterThan(Float value) {
            addCriterion("asElement >", value, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementGreaterThanOrEqualTo(Float value) {
            addCriterion("asElement >=", value, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementLessThan(Float value) {
            addCriterion("asElement <", value, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementLessThanOrEqualTo(Float value) {
            addCriterion("asElement <=", value, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementIn(List<Float> values) {
            addCriterion("asElement in", values, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementNotIn(List<Float> values) {
            addCriterion("asElement not in", values, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementBetween(Float value1, Float value2) {
            addCriterion("asElement between", value1, value2, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsElementNotBetween(Float value1, Float value2) {
            addCriterion("asElement not between", value1, value2, "asElement");
            return (Criteria) this;
        }

        public Criteria andAsMethodIsNull() {
            addCriterion("asMethod is null");
            return (Criteria) this;
        }

        public Criteria andAsMethodIsNotNull() {
            addCriterion("asMethod is not null");
            return (Criteria) this;
        }

        public Criteria andAsMethodEqualTo(String value) {
            addCriterion("asMethod =", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodNotEqualTo(String value) {
            addCriterion("asMethod <>", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodGreaterThan(String value) {
            addCriterion("asMethod >", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodGreaterThanOrEqualTo(String value) {
            addCriterion("asMethod >=", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodLessThan(String value) {
            addCriterion("asMethod <", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodLessThanOrEqualTo(String value) {
            addCriterion("asMethod <=", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodLike(String value) {
            addCriterion("asMethod like", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodNotLike(String value) {
            addCriterion("asMethod not like", value, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodIn(List<String> values) {
            addCriterion("asMethod in", values, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodNotIn(List<String> values) {
            addCriterion("asMethod not in", values, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodBetween(String value1, String value2) {
            addCriterion("asMethod between", value1, value2, "asMethod");
            return (Criteria) this;
        }

        public Criteria andAsMethodNotBetween(String value1, String value2) {
            addCriterion("asMethod not between", value1, value2, "asMethod");
            return (Criteria) this;
        }

        public Criteria andMnElementIsNull() {
            addCriterion("mnElement is null");
            return (Criteria) this;
        }

        public Criteria andMnElementIsNotNull() {
            addCriterion("mnElement is not null");
            return (Criteria) this;
        }

        public Criteria andMnElementEqualTo(Float value) {
            addCriterion("mnElement =", value, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementNotEqualTo(Float value) {
            addCriterion("mnElement <>", value, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementGreaterThan(Float value) {
            addCriterion("mnElement >", value, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementGreaterThanOrEqualTo(Float value) {
            addCriterion("mnElement >=", value, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementLessThan(Float value) {
            addCriterion("mnElement <", value, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementLessThanOrEqualTo(Float value) {
            addCriterion("mnElement <=", value, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementIn(List<Float> values) {
            addCriterion("mnElement in", values, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementNotIn(List<Float> values) {
            addCriterion("mnElement not in", values, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementBetween(Float value1, Float value2) {
            addCriterion("mnElement between", value1, value2, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnElementNotBetween(Float value1, Float value2) {
            addCriterion("mnElement not between", value1, value2, "mnElement");
            return (Criteria) this;
        }

        public Criteria andMnMethodIsNull() {
            addCriterion("mnMethod is null");
            return (Criteria) this;
        }

        public Criteria andMnMethodIsNotNull() {
            addCriterion("mnMethod is not null");
            return (Criteria) this;
        }

        public Criteria andMnMethodEqualTo(String value) {
            addCriterion("mnMethod =", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodNotEqualTo(String value) {
            addCriterion("mnMethod <>", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodGreaterThan(String value) {
            addCriterion("mnMethod >", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodGreaterThanOrEqualTo(String value) {
            addCriterion("mnMethod >=", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodLessThan(String value) {
            addCriterion("mnMethod <", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodLessThanOrEqualTo(String value) {
            addCriterion("mnMethod <=", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodLike(String value) {
            addCriterion("mnMethod like", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodNotLike(String value) {
            addCriterion("mnMethod not like", value, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodIn(List<String> values) {
            addCriterion("mnMethod in", values, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodNotIn(List<String> values) {
            addCriterion("mnMethod not in", values, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodBetween(String value1, String value2) {
            addCriterion("mnMethod between", value1, value2, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andMnMethodNotBetween(String value1, String value2) {
            addCriterion("mnMethod not between", value1, value2, "mnMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementIsNull() {
            addCriterion("residualChlorineElement is null");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementIsNotNull() {
            addCriterion("residualChlorineElement is not null");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementEqualTo(Float value) {
            addCriterion("residualChlorineElement =", value, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementNotEqualTo(Float value) {
            addCriterion("residualChlorineElement <>", value, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementGreaterThan(Float value) {
            addCriterion("residualChlorineElement >", value, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementGreaterThanOrEqualTo(Float value) {
            addCriterion("residualChlorineElement >=", value, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementLessThan(Float value) {
            addCriterion("residualChlorineElement <", value, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementLessThanOrEqualTo(Float value) {
            addCriterion("residualChlorineElement <=", value, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementIn(List<Float> values) {
            addCriterion("residualChlorineElement in", values, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementNotIn(List<Float> values) {
            addCriterion("residualChlorineElement not in", values, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementBetween(Float value1, Float value2) {
            addCriterion("residualChlorineElement between", value1, value2, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineElementNotBetween(Float value1, Float value2) {
            addCriterion("residualChlorineElement not between", value1, value2, "residualChlorineElement");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodIsNull() {
            addCriterion("residualChlorineMethod is null");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodIsNotNull() {
            addCriterion("residualChlorineMethod is not null");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodEqualTo(String value) {
            addCriterion("residualChlorineMethod =", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodNotEqualTo(String value) {
            addCriterion("residualChlorineMethod <>", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodGreaterThan(String value) {
            addCriterion("residualChlorineMethod >", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodGreaterThanOrEqualTo(String value) {
            addCriterion("residualChlorineMethod >=", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodLessThan(String value) {
            addCriterion("residualChlorineMethod <", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodLessThanOrEqualTo(String value) {
            addCriterion("residualChlorineMethod <=", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodLike(String value) {
            addCriterion("residualChlorineMethod like", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodNotLike(String value) {
            addCriterion("residualChlorineMethod not like", value, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodIn(List<String> values) {
            addCriterion("residualChlorineMethod in", values, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodNotIn(List<String> values) {
            addCriterion("residualChlorineMethod not in", values, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodBetween(String value1, String value2) {
            addCriterion("residualChlorineMethod between", value1, value2, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andResidualChlorineMethodNotBetween(String value1, String value2) {
            addCriterion("residualChlorineMethod not between", value1, value2, "residualChlorineMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementIsNull() {
            addCriterion("dissolvedOxygenElement is null");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementIsNotNull() {
            addCriterion("dissolvedOxygenElement is not null");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementEqualTo(Float value) {
            addCriterion("dissolvedOxygenElement =", value, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementNotEqualTo(Float value) {
            addCriterion("dissolvedOxygenElement <>", value, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementGreaterThan(Float value) {
            addCriterion("dissolvedOxygenElement >", value, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementGreaterThanOrEqualTo(Float value) {
            addCriterion("dissolvedOxygenElement >=", value, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementLessThan(Float value) {
            addCriterion("dissolvedOxygenElement <", value, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementLessThanOrEqualTo(Float value) {
            addCriterion("dissolvedOxygenElement <=", value, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementIn(List<Float> values) {
            addCriterion("dissolvedOxygenElement in", values, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementNotIn(List<Float> values) {
            addCriterion("dissolvedOxygenElement not in", values, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementBetween(Float value1, Float value2) {
            addCriterion("dissolvedOxygenElement between", value1, value2, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenElementNotBetween(Float value1, Float value2) {
            addCriterion("dissolvedOxygenElement not between", value1, value2, "dissolvedOxygenElement");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodIsNull() {
            addCriterion("dissolvedOxygenMethod is null");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodIsNotNull() {
            addCriterion("dissolvedOxygenMethod is not null");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodEqualTo(String value) {
            addCriterion("dissolvedOxygenMethod =", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodNotEqualTo(String value) {
            addCriterion("dissolvedOxygenMethod <>", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodGreaterThan(String value) {
            addCriterion("dissolvedOxygenMethod >", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodGreaterThanOrEqualTo(String value) {
            addCriterion("dissolvedOxygenMethod >=", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodLessThan(String value) {
            addCriterion("dissolvedOxygenMethod <", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodLessThanOrEqualTo(String value) {
            addCriterion("dissolvedOxygenMethod <=", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodLike(String value) {
            addCriterion("dissolvedOxygenMethod like", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodNotLike(String value) {
            addCriterion("dissolvedOxygenMethod not like", value, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodIn(List<String> values) {
            addCriterion("dissolvedOxygenMethod in", values, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodNotIn(List<String> values) {
            addCriterion("dissolvedOxygenMethod not in", values, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodBetween(String value1, String value2) {
            addCriterion("dissolvedOxygenMethod between", value1, value2, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andDissolvedOxygenMethodNotBetween(String value1, String value2) {
            addCriterion("dissolvedOxygenMethod not between", value1, value2, "dissolvedOxygenMethod");
            return (Criteria) this;
        }

        public Criteria andNo2ElementIsNull() {
            addCriterion("no2Element is null");
            return (Criteria) this;
        }

        public Criteria andNo2ElementIsNotNull() {
            addCriterion("no2Element is not null");
            return (Criteria) this;
        }

        public Criteria andNo2ElementEqualTo(Float value) {
            addCriterion("no2Element =", value, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementNotEqualTo(Float value) {
            addCriterion("no2Element <>", value, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementGreaterThan(Float value) {
            addCriterion("no2Element >", value, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementGreaterThanOrEqualTo(Float value) {
            addCriterion("no2Element >=", value, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementLessThan(Float value) {
            addCriterion("no2Element <", value, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementLessThanOrEqualTo(Float value) {
            addCriterion("no2Element <=", value, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementIn(List<Float> values) {
            addCriterion("no2Element in", values, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementNotIn(List<Float> values) {
            addCriterion("no2Element not in", values, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementBetween(Float value1, Float value2) {
            addCriterion("no2Element between", value1, value2, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2ElementNotBetween(Float value1, Float value2) {
            addCriterion("no2Element not between", value1, value2, "no2Element");
            return (Criteria) this;
        }

        public Criteria andNo2MethodIsNull() {
            addCriterion("no2Method is null");
            return (Criteria) this;
        }

        public Criteria andNo2MethodIsNotNull() {
            addCriterion("no2Method is not null");
            return (Criteria) this;
        }

        public Criteria andNo2MethodEqualTo(String value) {
            addCriterion("no2Method =", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodNotEqualTo(String value) {
            addCriterion("no2Method <>", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodGreaterThan(String value) {
            addCriterion("no2Method >", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodGreaterThanOrEqualTo(String value) {
            addCriterion("no2Method >=", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodLessThan(String value) {
            addCriterion("no2Method <", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodLessThanOrEqualTo(String value) {
            addCriterion("no2Method <=", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodLike(String value) {
            addCriterion("no2Method like", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodNotLike(String value) {
            addCriterion("no2Method not like", value, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodIn(List<String> values) {
            addCriterion("no2Method in", values, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodNotIn(List<String> values) {
            addCriterion("no2Method not in", values, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodBetween(String value1, String value2) {
            addCriterion("no2Method between", value1, value2, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo2MethodNotBetween(String value1, String value2) {
            addCriterion("no2Method not between", value1, value2, "no2Method");
            return (Criteria) this;
        }

        public Criteria andNo3ElementIsNull() {
            addCriterion("no3Element is null");
            return (Criteria) this;
        }

        public Criteria andNo3ElementIsNotNull() {
            addCriterion("no3Element is not null");
            return (Criteria) this;
        }

        public Criteria andNo3ElementEqualTo(Float value) {
            addCriterion("no3Element =", value, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementNotEqualTo(Float value) {
            addCriterion("no3Element <>", value, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementGreaterThan(Float value) {
            addCriterion("no3Element >", value, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementGreaterThanOrEqualTo(Float value) {
            addCriterion("no3Element >=", value, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementLessThan(Float value) {
            addCriterion("no3Element <", value, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementLessThanOrEqualTo(Float value) {
            addCriterion("no3Element <=", value, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementIn(List<Float> values) {
            addCriterion("no3Element in", values, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementNotIn(List<Float> values) {
            addCriterion("no3Element not in", values, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementBetween(Float value1, Float value2) {
            addCriterion("no3Element between", value1, value2, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3ElementNotBetween(Float value1, Float value2) {
            addCriterion("no3Element not between", value1, value2, "no3Element");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateIsNull() {
            addCriterion("no3Dilutionrate is null");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateIsNotNull() {
            addCriterion("no3Dilutionrate is not null");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateEqualTo(Integer value) {
            addCriterion("no3Dilutionrate =", value, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateNotEqualTo(Integer value) {
            addCriterion("no3Dilutionrate <>", value, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateGreaterThan(Integer value) {
            addCriterion("no3Dilutionrate >", value, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("no3Dilutionrate >=", value, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateLessThan(Integer value) {
            addCriterion("no3Dilutionrate <", value, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateLessThanOrEqualTo(Integer value) {
            addCriterion("no3Dilutionrate <=", value, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateIn(List<Integer> values) {
            addCriterion("no3Dilutionrate in", values, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateNotIn(List<Integer> values) {
            addCriterion("no3Dilutionrate not in", values, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateBetween(Integer value1, Integer value2) {
            addCriterion("no3Dilutionrate between", value1, value2, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3DilutionrateNotBetween(Integer value1, Integer value2) {
            addCriterion("no3Dilutionrate not between", value1, value2, "no3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalIsNull() {
            addCriterion("no3Original is null");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalIsNotNull() {
            addCriterion("no3Original is not null");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalEqualTo(Float value) {
            addCriterion("no3Original =", value, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalNotEqualTo(Float value) {
            addCriterion("no3Original <>", value, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalGreaterThan(Float value) {
            addCriterion("no3Original >", value, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalGreaterThanOrEqualTo(Float value) {
            addCriterion("no3Original >=", value, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalLessThan(Float value) {
            addCriterion("no3Original <", value, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalLessThanOrEqualTo(Float value) {
            addCriterion("no3Original <=", value, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalIn(List<Float> values) {
            addCriterion("no3Original in", values, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalNotIn(List<Float> values) {
            addCriterion("no3Original not in", values, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalBetween(Float value1, Float value2) {
            addCriterion("no3Original between", value1, value2, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3OriginalNotBetween(Float value1, Float value2) {
            addCriterion("no3Original not between", value1, value2, "no3Original");
            return (Criteria) this;
        }

        public Criteria andNo3MethodIsNull() {
            addCriterion("no3Method is null");
            return (Criteria) this;
        }

        public Criteria andNo3MethodIsNotNull() {
            addCriterion("no3Method is not null");
            return (Criteria) this;
        }

        public Criteria andNo3MethodEqualTo(String value) {
            addCriterion("no3Method =", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodNotEqualTo(String value) {
            addCriterion("no3Method <>", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodGreaterThan(String value) {
            addCriterion("no3Method >", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodGreaterThanOrEqualTo(String value) {
            addCriterion("no3Method >=", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodLessThan(String value) {
            addCriterion("no3Method <", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodLessThanOrEqualTo(String value) {
            addCriterion("no3Method <=", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodLike(String value) {
            addCriterion("no3Method like", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodNotLike(String value) {
            addCriterion("no3Method not like", value, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodIn(List<String> values) {
            addCriterion("no3Method in", values, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodNotIn(List<String> values) {
            addCriterion("no3Method not in", values, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodBetween(String value1, String value2) {
            addCriterion("no3Method between", value1, value2, "no3Method");
            return (Criteria) this;
        }

        public Criteria andNo3MethodNotBetween(String value1, String value2) {
            addCriterion("no3Method not between", value1, value2, "no3Method");
            return (Criteria) this;
        }

        public Criteria andCodElementIsNull() {
            addCriterion("codElement is null");
            return (Criteria) this;
        }

        public Criteria andCodElementIsNotNull() {
            addCriterion("codElement is not null");
            return (Criteria) this;
        }

        public Criteria andCodElementEqualTo(Float value) {
            addCriterion("codElement =", value, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementNotEqualTo(Float value) {
            addCriterion("codElement <>", value, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementGreaterThan(Float value) {
            addCriterion("codElement >", value, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementGreaterThanOrEqualTo(Float value) {
            addCriterion("codElement >=", value, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementLessThan(Float value) {
            addCriterion("codElement <", value, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementLessThanOrEqualTo(Float value) {
            addCriterion("codElement <=", value, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementIn(List<Float> values) {
            addCriterion("codElement in", values, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementNotIn(List<Float> values) {
            addCriterion("codElement not in", values, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementBetween(Float value1, Float value2) {
            addCriterion("codElement between", value1, value2, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodElementNotBetween(Float value1, Float value2) {
            addCriterion("codElement not between", value1, value2, "codElement");
            return (Criteria) this;
        }

        public Criteria andCodMethodIsNull() {
            addCriterion("codMethod is null");
            return (Criteria) this;
        }

        public Criteria andCodMethodIsNotNull() {
            addCriterion("codMethod is not null");
            return (Criteria) this;
        }

        public Criteria andCodMethodEqualTo(String value) {
            addCriterion("codMethod =", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodNotEqualTo(String value) {
            addCriterion("codMethod <>", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodGreaterThan(String value) {
            addCriterion("codMethod >", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodGreaterThanOrEqualTo(String value) {
            addCriterion("codMethod >=", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodLessThan(String value) {
            addCriterion("codMethod <", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodLessThanOrEqualTo(String value) {
            addCriterion("codMethod <=", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodLike(String value) {
            addCriterion("codMethod like", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodNotLike(String value) {
            addCriterion("codMethod not like", value, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodIn(List<String> values) {
            addCriterion("codMethod in", values, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodNotIn(List<String> values) {
            addCriterion("codMethod not in", values, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodBetween(String value1, String value2) {
            addCriterion("codMethod between", value1, value2, "codMethod");
            return (Criteria) this;
        }

        public Criteria andCodMethodNotBetween(String value1, String value2) {
            addCriterion("codMethod not between", value1, value2, "codMethod");
            return (Criteria) this;
        }

        public Criteria andFElementIsNull() {
            addCriterion("fElement is null");
            return (Criteria) this;
        }

        public Criteria andFElementIsNotNull() {
            addCriterion("fElement is not null");
            return (Criteria) this;
        }

        public Criteria andFElementEqualTo(Float value) {
            addCriterion("fElement =", value, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementNotEqualTo(Float value) {
            addCriterion("fElement <>", value, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementGreaterThan(Float value) {
            addCriterion("fElement >", value, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementGreaterThanOrEqualTo(Float value) {
            addCriterion("fElement >=", value, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementLessThan(Float value) {
            addCriterion("fElement <", value, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementLessThanOrEqualTo(Float value) {
            addCriterion("fElement <=", value, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementIn(List<Float> values) {
            addCriterion("fElement in", values, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementNotIn(List<Float> values) {
            addCriterion("fElement not in", values, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementBetween(Float value1, Float value2) {
            addCriterion("fElement between", value1, value2, "fElement");
            return (Criteria) this;
        }

        public Criteria andFElementNotBetween(Float value1, Float value2) {
            addCriterion("fElement not between", value1, value2, "fElement");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateIsNull() {
            addCriterion("fDilutionrate is null");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateIsNotNull() {
            addCriterion("fDilutionrate is not null");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateEqualTo(Integer value) {
            addCriterion("fDilutionrate =", value, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateNotEqualTo(Integer value) {
            addCriterion("fDilutionrate <>", value, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateGreaterThan(Integer value) {
            addCriterion("fDilutionrate >", value, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fDilutionrate >=", value, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateLessThan(Integer value) {
            addCriterion("fDilutionrate <", value, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateLessThanOrEqualTo(Integer value) {
            addCriterion("fDilutionrate <=", value, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateIn(List<Integer> values) {
            addCriterion("fDilutionrate in", values, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateNotIn(List<Integer> values) {
            addCriterion("fDilutionrate not in", values, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateBetween(Integer value1, Integer value2) {
            addCriterion("fDilutionrate between", value1, value2, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFDilutionrateNotBetween(Integer value1, Integer value2) {
            addCriterion("fDilutionrate not between", value1, value2, "fDilutionrate");
            return (Criteria) this;
        }

        public Criteria andFOriginalIsNull() {
            addCriterion("fOriginal is null");
            return (Criteria) this;
        }

        public Criteria andFOriginalIsNotNull() {
            addCriterion("fOriginal is not null");
            return (Criteria) this;
        }

        public Criteria andFOriginalEqualTo(Float value) {
            addCriterion("fOriginal =", value, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalNotEqualTo(Float value) {
            addCriterion("fOriginal <>", value, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalGreaterThan(Float value) {
            addCriterion("fOriginal >", value, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalGreaterThanOrEqualTo(Float value) {
            addCriterion("fOriginal >=", value, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalLessThan(Float value) {
            addCriterion("fOriginal <", value, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalLessThanOrEqualTo(Float value) {
            addCriterion("fOriginal <=", value, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalIn(List<Float> values) {
            addCriterion("fOriginal in", values, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalNotIn(List<Float> values) {
            addCriterion("fOriginal not in", values, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalBetween(Float value1, Float value2) {
            addCriterion("fOriginal between", value1, value2, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFOriginalNotBetween(Float value1, Float value2) {
            addCriterion("fOriginal not between", value1, value2, "fOriginal");
            return (Criteria) this;
        }

        public Criteria andFMethodIsNull() {
            addCriterion("fMethod is null");
            return (Criteria) this;
        }

        public Criteria andFMethodIsNotNull() {
            addCriterion("fMethod is not null");
            return (Criteria) this;
        }

        public Criteria andFMethodEqualTo(String value) {
            addCriterion("fMethod =", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodNotEqualTo(String value) {
            addCriterion("fMethod <>", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodGreaterThan(String value) {
            addCriterion("fMethod >", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodGreaterThanOrEqualTo(String value) {
            addCriterion("fMethod >=", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodLessThan(String value) {
            addCriterion("fMethod <", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodLessThanOrEqualTo(String value) {
            addCriterion("fMethod <=", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodLike(String value) {
            addCriterion("fMethod like", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodNotLike(String value) {
            addCriterion("fMethod not like", value, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodIn(List<String> values) {
            addCriterion("fMethod in", values, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodNotIn(List<String> values) {
            addCriterion("fMethod not in", values, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodBetween(String value1, String value2) {
            addCriterion("fMethod between", value1, value2, "fMethod");
            return (Criteria) this;
        }

        public Criteria andFMethodNotBetween(String value1, String value2) {
            addCriterion("fMethod not between", value1, value2, "fMethod");
            return (Criteria) this;
        }

        public Criteria andNh3ElementIsNull() {
            addCriterion("nh3Element is null");
            return (Criteria) this;
        }

        public Criteria andNh3ElementIsNotNull() {
            addCriterion("nh3Element is not null");
            return (Criteria) this;
        }

        public Criteria andNh3ElementEqualTo(Float value) {
            addCriterion("nh3Element =", value, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementNotEqualTo(Float value) {
            addCriterion("nh3Element <>", value, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementGreaterThan(Float value) {
            addCriterion("nh3Element >", value, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementGreaterThanOrEqualTo(Float value) {
            addCriterion("nh3Element >=", value, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementLessThan(Float value) {
            addCriterion("nh3Element <", value, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementLessThanOrEqualTo(Float value) {
            addCriterion("nh3Element <=", value, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementIn(List<Float> values) {
            addCriterion("nh3Element in", values, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementNotIn(List<Float> values) {
            addCriterion("nh3Element not in", values, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementBetween(Float value1, Float value2) {
            addCriterion("nh3Element between", value1, value2, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3ElementNotBetween(Float value1, Float value2) {
            addCriterion("nh3Element not between", value1, value2, "nh3Element");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateIsNull() {
            addCriterion("nh3Dilutionrate is null");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateIsNotNull() {
            addCriterion("nh3Dilutionrate is not null");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateEqualTo(Integer value) {
            addCriterion("nh3Dilutionrate =", value, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateNotEqualTo(Integer value) {
            addCriterion("nh3Dilutionrate <>", value, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateGreaterThan(Integer value) {
            addCriterion("nh3Dilutionrate >", value, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("nh3Dilutionrate >=", value, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateLessThan(Integer value) {
            addCriterion("nh3Dilutionrate <", value, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateLessThanOrEqualTo(Integer value) {
            addCriterion("nh3Dilutionrate <=", value, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateIn(List<Integer> values) {
            addCriterion("nh3Dilutionrate in", values, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateNotIn(List<Integer> values) {
            addCriterion("nh3Dilutionrate not in", values, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateBetween(Integer value1, Integer value2) {
            addCriterion("nh3Dilutionrate between", value1, value2, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3DilutionrateNotBetween(Integer value1, Integer value2) {
            addCriterion("nh3Dilutionrate not between", value1, value2, "nh3Dilutionrate");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalIsNull() {
            addCriterion("nh3Original is null");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalIsNotNull() {
            addCriterion("nh3Original is not null");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalEqualTo(Float value) {
            addCriterion("nh3Original =", value, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalNotEqualTo(Float value) {
            addCriterion("nh3Original <>", value, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalGreaterThan(Float value) {
            addCriterion("nh3Original >", value, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalGreaterThanOrEqualTo(Float value) {
            addCriterion("nh3Original >=", value, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalLessThan(Float value) {
            addCriterion("nh3Original <", value, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalLessThanOrEqualTo(Float value) {
            addCriterion("nh3Original <=", value, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalIn(List<Float> values) {
            addCriterion("nh3Original in", values, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalNotIn(List<Float> values) {
            addCriterion("nh3Original not in", values, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalBetween(Float value1, Float value2) {
            addCriterion("nh3Original between", value1, value2, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3OriginalNotBetween(Float value1, Float value2) {
            addCriterion("nh3Original not between", value1, value2, "nh3Original");
            return (Criteria) this;
        }

        public Criteria andNh3MethodIsNull() {
            addCriterion("nh3Method is null");
            return (Criteria) this;
        }

        public Criteria andNh3MethodIsNotNull() {
            addCriterion("nh3Method is not null");
            return (Criteria) this;
        }

        public Criteria andNh3MethodEqualTo(String value) {
            addCriterion("nh3Method =", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodNotEqualTo(String value) {
            addCriterion("nh3Method <>", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodGreaterThan(String value) {
            addCriterion("nh3Method >", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodGreaterThanOrEqualTo(String value) {
            addCriterion("nh3Method >=", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodLessThan(String value) {
            addCriterion("nh3Method <", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodLessThanOrEqualTo(String value) {
            addCriterion("nh3Method <=", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodLike(String value) {
            addCriterion("nh3Method like", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodNotLike(String value) {
            addCriterion("nh3Method not like", value, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodIn(List<String> values) {
            addCriterion("nh3Method in", values, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodNotIn(List<String> values) {
            addCriterion("nh3Method not in", values, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodBetween(String value1, String value2) {
            addCriterion("nh3Method between", value1, value2, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andNh3MethodNotBetween(String value1, String value2) {
            addCriterion("nh3Method not between", value1, value2, "nh3Method");
            return (Criteria) this;
        }

        public Criteria andPhElementIsNull() {
            addCriterion("phElement is null");
            return (Criteria) this;
        }

        public Criteria andPhElementIsNotNull() {
            addCriterion("phElement is not null");
            return (Criteria) this;
        }

        public Criteria andPhElementEqualTo(Float value) {
            addCriterion("phElement =", value, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementNotEqualTo(Float value) {
            addCriterion("phElement <>", value, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementGreaterThan(Float value) {
            addCriterion("phElement >", value, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementGreaterThanOrEqualTo(Float value) {
            addCriterion("phElement >=", value, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementLessThan(Float value) {
            addCriterion("phElement <", value, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementLessThanOrEqualTo(Float value) {
            addCriterion("phElement <=", value, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementIn(List<Float> values) {
            addCriterion("phElement in", values, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementNotIn(List<Float> values) {
            addCriterion("phElement not in", values, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementBetween(Float value1, Float value2) {
            addCriterion("phElement between", value1, value2, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhElementNotBetween(Float value1, Float value2) {
            addCriterion("phElement not between", value1, value2, "phElement");
            return (Criteria) this;
        }

        public Criteria andPhMethodIsNull() {
            addCriterion("phMethod is null");
            return (Criteria) this;
        }

        public Criteria andPhMethodIsNotNull() {
            addCriterion("phMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPhMethodEqualTo(String value) {
            addCriterion("phMethod =", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodNotEqualTo(String value) {
            addCriterion("phMethod <>", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodGreaterThan(String value) {
            addCriterion("phMethod >", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodGreaterThanOrEqualTo(String value) {
            addCriterion("phMethod >=", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodLessThan(String value) {
            addCriterion("phMethod <", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodLessThanOrEqualTo(String value) {
            addCriterion("phMethod <=", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodLike(String value) {
            addCriterion("phMethod like", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodNotLike(String value) {
            addCriterion("phMethod not like", value, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodIn(List<String> values) {
            addCriterion("phMethod in", values, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodNotIn(List<String> values) {
            addCriterion("phMethod not in", values, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodBetween(String value1, String value2) {
            addCriterion("phMethod between", value1, value2, "phMethod");
            return (Criteria) this;
        }

        public Criteria andPhMethodNotBetween(String value1, String value2) {
            addCriterion("phMethod not between", value1, value2, "phMethod");
            return (Criteria) this;
        }

        public Criteria andTdsElementIsNull() {
            addCriterion("tdsElement is null");
            return (Criteria) this;
        }

        public Criteria andTdsElementIsNotNull() {
            addCriterion("tdsElement is not null");
            return (Criteria) this;
        }

        public Criteria andTdsElementEqualTo(Float value) {
            addCriterion("tdsElement =", value, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementNotEqualTo(Float value) {
            addCriterion("tdsElement <>", value, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementGreaterThan(Float value) {
            addCriterion("tdsElement >", value, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementGreaterThanOrEqualTo(Float value) {
            addCriterion("tdsElement >=", value, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementLessThan(Float value) {
            addCriterion("tdsElement <", value, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementLessThanOrEqualTo(Float value) {
            addCriterion("tdsElement <=", value, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementIn(List<Float> values) {
            addCriterion("tdsElement in", values, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementNotIn(List<Float> values) {
            addCriterion("tdsElement not in", values, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementBetween(Float value1, Float value2) {
            addCriterion("tdsElement between", value1, value2, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsElementNotBetween(Float value1, Float value2) {
            addCriterion("tdsElement not between", value1, value2, "tdsElement");
            return (Criteria) this;
        }

        public Criteria andTdsMethodIsNull() {
            addCriterion("tdsMethod is null");
            return (Criteria) this;
        }

        public Criteria andTdsMethodIsNotNull() {
            addCriterion("tdsMethod is not null");
            return (Criteria) this;
        }

        public Criteria andTdsMethodEqualTo(String value) {
            addCriterion("tdsMethod =", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodNotEqualTo(String value) {
            addCriterion("tdsMethod <>", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodGreaterThan(String value) {
            addCriterion("tdsMethod >", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodGreaterThanOrEqualTo(String value) {
            addCriterion("tdsMethod >=", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodLessThan(String value) {
            addCriterion("tdsMethod <", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodLessThanOrEqualTo(String value) {
            addCriterion("tdsMethod <=", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodLike(String value) {
            addCriterion("tdsMethod like", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodNotLike(String value) {
            addCriterion("tdsMethod not like", value, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodIn(List<String> values) {
            addCriterion("tdsMethod in", values, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodNotIn(List<String> values) {
            addCriterion("tdsMethod not in", values, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodBetween(String value1, String value2) {
            addCriterion("tdsMethod between", value1, value2, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andTdsMethodNotBetween(String value1, String value2) {
            addCriterion("tdsMethod not between", value1, value2, "tdsMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilElementIsNull() {
            addCriterion("ecoilElement is null");
            return (Criteria) this;
        }

        public Criteria andEcoilElementIsNotNull() {
            addCriterion("ecoilElement is not null");
            return (Criteria) this;
        }

        public Criteria andEcoilElementEqualTo(Float value) {
            addCriterion("ecoilElement =", value, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementNotEqualTo(Float value) {
            addCriterion("ecoilElement <>", value, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementGreaterThan(Float value) {
            addCriterion("ecoilElement >", value, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementGreaterThanOrEqualTo(Float value) {
            addCriterion("ecoilElement >=", value, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementLessThan(Float value) {
            addCriterion("ecoilElement <", value, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementLessThanOrEqualTo(Float value) {
            addCriterion("ecoilElement <=", value, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementIn(List<Float> values) {
            addCriterion("ecoilElement in", values, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementNotIn(List<Float> values) {
            addCriterion("ecoilElement not in", values, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementBetween(Float value1, Float value2) {
            addCriterion("ecoilElement between", value1, value2, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilElementNotBetween(Float value1, Float value2) {
            addCriterion("ecoilElement not between", value1, value2, "ecoilElement");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodIsNull() {
            addCriterion("ecoilMethod is null");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodIsNotNull() {
            addCriterion("ecoilMethod is not null");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodEqualTo(String value) {
            addCriterion("ecoilMethod =", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodNotEqualTo(String value) {
            addCriterion("ecoilMethod <>", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodGreaterThan(String value) {
            addCriterion("ecoilMethod >", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ecoilMethod >=", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodLessThan(String value) {
            addCriterion("ecoilMethod <", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodLessThanOrEqualTo(String value) {
            addCriterion("ecoilMethod <=", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodLike(String value) {
            addCriterion("ecoilMethod like", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodNotLike(String value) {
            addCriterion("ecoilMethod not like", value, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodIn(List<String> values) {
            addCriterion("ecoilMethod in", values, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodNotIn(List<String> values) {
            addCriterion("ecoilMethod not in", values, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodBetween(String value1, String value2) {
            addCriterion("ecoilMethod between", value1, value2, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andEcoilMethodNotBetween(String value1, String value2) {
            addCriterion("ecoilMethod not between", value1, value2, "ecoilMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementIsNull() {
            addCriterion("ammoniaNitrogenElement is null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementIsNotNull() {
            addCriterion("ammoniaNitrogenElement is not null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementEqualTo(Float value) {
            addCriterion("ammoniaNitrogenElement =", value, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementNotEqualTo(Float value) {
            addCriterion("ammoniaNitrogenElement <>", value, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementGreaterThan(Float value) {
            addCriterion("ammoniaNitrogenElement >", value, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementGreaterThanOrEqualTo(Float value) {
            addCriterion("ammoniaNitrogenElement >=", value, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementLessThan(Float value) {
            addCriterion("ammoniaNitrogenElement <", value, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementLessThanOrEqualTo(Float value) {
            addCriterion("ammoniaNitrogenElement <=", value, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementIn(List<Float> values) {
            addCriterion("ammoniaNitrogenElement in", values, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementNotIn(List<Float> values) {
            addCriterion("ammoniaNitrogenElement not in", values, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementBetween(Float value1, Float value2) {
            addCriterion("ammoniaNitrogenElement between", value1, value2, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenElementNotBetween(Float value1, Float value2) {
            addCriterion("ammoniaNitrogenElement not between", value1, value2, "ammoniaNitrogenElement");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodIsNull() {
            addCriterion("ammoniaNitrogenMethod is null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodIsNotNull() {
            addCriterion("ammoniaNitrogenMethod is not null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodEqualTo(String value) {
            addCriterion("ammoniaNitrogenMethod =", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodNotEqualTo(String value) {
            addCriterion("ammoniaNitrogenMethod <>", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodGreaterThan(String value) {
            addCriterion("ammoniaNitrogenMethod >", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ammoniaNitrogenMethod >=", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodLessThan(String value) {
            addCriterion("ammoniaNitrogenMethod <", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodLessThanOrEqualTo(String value) {
            addCriterion("ammoniaNitrogenMethod <=", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodLike(String value) {
            addCriterion("ammoniaNitrogenMethod like", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodNotLike(String value) {
            addCriterion("ammoniaNitrogenMethod not like", value, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodIn(List<String> values) {
            addCriterion("ammoniaNitrogenMethod in", values, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodNotIn(List<String> values) {
            addCriterion("ammoniaNitrogenMethod not in", values, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodBetween(String value1, String value2) {
            addCriterion("ammoniaNitrogenMethod between", value1, value2, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenMethodNotBetween(String value1, String value2) {
            addCriterion("ammoniaNitrogenMethod not between", value1, value2, "ammoniaNitrogenMethod");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionIsNull() {
            addCriterion("ammoniaNitrogenDescription is null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionIsNotNull() {
            addCriterion("ammoniaNitrogenDescription is not null");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionEqualTo(String value) {
            addCriterion("ammoniaNitrogenDescription =", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionNotEqualTo(String value) {
            addCriterion("ammoniaNitrogenDescription <>", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionGreaterThan(String value) {
            addCriterion("ammoniaNitrogenDescription >", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ammoniaNitrogenDescription >=", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionLessThan(String value) {
            addCriterion("ammoniaNitrogenDescription <", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ammoniaNitrogenDescription <=", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionLike(String value) {
            addCriterion("ammoniaNitrogenDescription like", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionNotLike(String value) {
            addCriterion("ammoniaNitrogenDescription not like", value, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionIn(List<String> values) {
            addCriterion("ammoniaNitrogenDescription in", values, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionNotIn(List<String> values) {
            addCriterion("ammoniaNitrogenDescription not in", values, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionBetween(String value1, String value2) {
            addCriterion("ammoniaNitrogenDescription between", value1, value2, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andAmmoniaNitrogenDescriptionNotBetween(String value1, String value2) {
            addCriterion("ammoniaNitrogenDescription not between", value1, value2, "ammoniaNitrogenDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementIsNull() {
            addCriterion("tetcNumberElement is null");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementIsNotNull() {
            addCriterion("tetcNumberElement is not null");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementEqualTo(Float value) {
            addCriterion("tetcNumberElement =", value, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementNotEqualTo(Float value) {
            addCriterion("tetcNumberElement <>", value, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementGreaterThan(Float value) {
            addCriterion("tetcNumberElement >", value, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementGreaterThanOrEqualTo(Float value) {
            addCriterion("tetcNumberElement >=", value, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementLessThan(Float value) {
            addCriterion("tetcNumberElement <", value, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementLessThanOrEqualTo(Float value) {
            addCriterion("tetcNumberElement <=", value, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementIn(List<Float> values) {
            addCriterion("tetcNumberElement in", values, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementNotIn(List<Float> values) {
            addCriterion("tetcNumberElement not in", values, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementBetween(Float value1, Float value2) {
            addCriterion("tetcNumberElement between", value1, value2, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberElementNotBetween(Float value1, Float value2) {
            addCriterion("tetcNumberElement not between", value1, value2, "tetcNumberElement");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionIsNull() {
            addCriterion("tetcNumberDescription is null");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionIsNotNull() {
            addCriterion("tetcNumberDescription is not null");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionEqualTo(String value) {
            addCriterion("tetcNumberDescription =", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionNotEqualTo(String value) {
            addCriterion("tetcNumberDescription <>", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionGreaterThan(String value) {
            addCriterion("tetcNumberDescription >", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("tetcNumberDescription >=", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionLessThan(String value) {
            addCriterion("tetcNumberDescription <", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionLessThanOrEqualTo(String value) {
            addCriterion("tetcNumberDescription <=", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionLike(String value) {
            addCriterion("tetcNumberDescription like", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionNotLike(String value) {
            addCriterion("tetcNumberDescription not like", value, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionIn(List<String> values) {
            addCriterion("tetcNumberDescription in", values, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionNotIn(List<String> values) {
            addCriterion("tetcNumberDescription not in", values, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionBetween(String value1, String value2) {
            addCriterion("tetcNumberDescription between", value1, value2, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andTetcNumberDescriptionNotBetween(String value1, String value2) {
            addCriterion("tetcNumberDescription not between", value1, value2, "tetcNumberDescription");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1IsNull() {
            addCriterion("additionalParameter1 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1IsNotNull() {
            addCriterion("additionalParameter1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1EqualTo(String value) {
            addCriterion("additionalParameter1 =", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1NotEqualTo(String value) {
            addCriterion("additionalParameter1 <>", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1GreaterThan(String value) {
            addCriterion("additionalParameter1 >", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1GreaterThanOrEqualTo(String value) {
            addCriterion("additionalParameter1 >=", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1LessThan(String value) {
            addCriterion("additionalParameter1 <", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1LessThanOrEqualTo(String value) {
            addCriterion("additionalParameter1 <=", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1Like(String value) {
            addCriterion("additionalParameter1 like", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1NotLike(String value) {
            addCriterion("additionalParameter1 not like", value, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1In(List<String> values) {
            addCriterion("additionalParameter1 in", values, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1NotIn(List<String> values) {
            addCriterion("additionalParameter1 not in", values, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1Between(String value1, String value2) {
            addCriterion("additionalParameter1 between", value1, value2, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter1NotBetween(String value1, String value2) {
            addCriterion("additionalParameter1 not between", value1, value2, "additionalParameter1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1IsNull() {
            addCriterion("additionalValue1 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1IsNotNull() {
            addCriterion("additionalValue1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1EqualTo(Float value) {
            addCriterion("additionalValue1 =", value, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1NotEqualTo(Float value) {
            addCriterion("additionalValue1 <>", value, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1GreaterThan(Float value) {
            addCriterion("additionalValue1 >", value, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1GreaterThanOrEqualTo(Float value) {
            addCriterion("additionalValue1 >=", value, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1LessThan(Float value) {
            addCriterion("additionalValue1 <", value, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1LessThanOrEqualTo(Float value) {
            addCriterion("additionalValue1 <=", value, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1In(List<Float> values) {
            addCriterion("additionalValue1 in", values, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1NotIn(List<Float> values) {
            addCriterion("additionalValue1 not in", values, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1Between(Float value1, Float value2) {
            addCriterion("additionalValue1 between", value1, value2, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue1NotBetween(Float value1, Float value2) {
            addCriterion("additionalValue1 not between", value1, value2, "additionalValue1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1IsNull() {
            addCriterion("additionalMethod1 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1IsNotNull() {
            addCriterion("additionalMethod1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1EqualTo(String value) {
            addCriterion("additionalMethod1 =", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1NotEqualTo(String value) {
            addCriterion("additionalMethod1 <>", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1GreaterThan(String value) {
            addCriterion("additionalMethod1 >", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1GreaterThanOrEqualTo(String value) {
            addCriterion("additionalMethod1 >=", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1LessThan(String value) {
            addCriterion("additionalMethod1 <", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1LessThanOrEqualTo(String value) {
            addCriterion("additionalMethod1 <=", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1Like(String value) {
            addCriterion("additionalMethod1 like", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1NotLike(String value) {
            addCriterion("additionalMethod1 not like", value, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1In(List<String> values) {
            addCriterion("additionalMethod1 in", values, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1NotIn(List<String> values) {
            addCriterion("additionalMethod1 not in", values, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1Between(String value1, String value2) {
            addCriterion("additionalMethod1 between", value1, value2, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod1NotBetween(String value1, String value2) {
            addCriterion("additionalMethod1 not between", value1, value2, "additionalMethod1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1IsNull() {
            addCriterion("additionalUnit1 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1IsNotNull() {
            addCriterion("additionalUnit1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1EqualTo(String value) {
            addCriterion("additionalUnit1 =", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1NotEqualTo(String value) {
            addCriterion("additionalUnit1 <>", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1GreaterThan(String value) {
            addCriterion("additionalUnit1 >", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1GreaterThanOrEqualTo(String value) {
            addCriterion("additionalUnit1 >=", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1LessThan(String value) {
            addCriterion("additionalUnit1 <", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1LessThanOrEqualTo(String value) {
            addCriterion("additionalUnit1 <=", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1Like(String value) {
            addCriterion("additionalUnit1 like", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1NotLike(String value) {
            addCriterion("additionalUnit1 not like", value, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1In(List<String> values) {
            addCriterion("additionalUnit1 in", values, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1NotIn(List<String> values) {
            addCriterion("additionalUnit1 not in", values, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1Between(String value1, String value2) {
            addCriterion("additionalUnit1 between", value1, value2, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit1NotBetween(String value1, String value2) {
            addCriterion("additionalUnit1 not between", value1, value2, "additionalUnit1");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2IsNull() {
            addCriterion("additionalParameter2 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2IsNotNull() {
            addCriterion("additionalParameter2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2EqualTo(String value) {
            addCriterion("additionalParameter2 =", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2NotEqualTo(String value) {
            addCriterion("additionalParameter2 <>", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2GreaterThan(String value) {
            addCriterion("additionalParameter2 >", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2GreaterThanOrEqualTo(String value) {
            addCriterion("additionalParameter2 >=", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2LessThan(String value) {
            addCriterion("additionalParameter2 <", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2LessThanOrEqualTo(String value) {
            addCriterion("additionalParameter2 <=", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2Like(String value) {
            addCriterion("additionalParameter2 like", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2NotLike(String value) {
            addCriterion("additionalParameter2 not like", value, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2In(List<String> values) {
            addCriterion("additionalParameter2 in", values, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2NotIn(List<String> values) {
            addCriterion("additionalParameter2 not in", values, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2Between(String value1, String value2) {
            addCriterion("additionalParameter2 between", value1, value2, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalParameter2NotBetween(String value1, String value2) {
            addCriterion("additionalParameter2 not between", value1, value2, "additionalParameter2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2IsNull() {
            addCriterion("additionalValue2 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2IsNotNull() {
            addCriterion("additionalValue2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2EqualTo(Float value) {
            addCriterion("additionalValue2 =", value, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2NotEqualTo(Float value) {
            addCriterion("additionalValue2 <>", value, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2GreaterThan(Float value) {
            addCriterion("additionalValue2 >", value, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2GreaterThanOrEqualTo(Float value) {
            addCriterion("additionalValue2 >=", value, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2LessThan(Float value) {
            addCriterion("additionalValue2 <", value, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2LessThanOrEqualTo(Float value) {
            addCriterion("additionalValue2 <=", value, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2In(List<Float> values) {
            addCriterion("additionalValue2 in", values, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2NotIn(List<Float> values) {
            addCriterion("additionalValue2 not in", values, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2Between(Float value1, Float value2) {
            addCriterion("additionalValue2 between", value1, value2, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalValue2NotBetween(Float value1, Float value2) {
            addCriterion("additionalValue2 not between", value1, value2, "additionalValue2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2IsNull() {
            addCriterion("additionalMethod2 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2IsNotNull() {
            addCriterion("additionalMethod2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2EqualTo(String value) {
            addCriterion("additionalMethod2 =", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2NotEqualTo(String value) {
            addCriterion("additionalMethod2 <>", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2GreaterThan(String value) {
            addCriterion("additionalMethod2 >", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2GreaterThanOrEqualTo(String value) {
            addCriterion("additionalMethod2 >=", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2LessThan(String value) {
            addCriterion("additionalMethod2 <", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2LessThanOrEqualTo(String value) {
            addCriterion("additionalMethod2 <=", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2Like(String value) {
            addCriterion("additionalMethod2 like", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2NotLike(String value) {
            addCriterion("additionalMethod2 not like", value, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2In(List<String> values) {
            addCriterion("additionalMethod2 in", values, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2NotIn(List<String> values) {
            addCriterion("additionalMethod2 not in", values, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2Between(String value1, String value2) {
            addCriterion("additionalMethod2 between", value1, value2, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalMethod2NotBetween(String value1, String value2) {
            addCriterion("additionalMethod2 not between", value1, value2, "additionalMethod2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2IsNull() {
            addCriterion("additionalUnit2 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2IsNotNull() {
            addCriterion("additionalUnit2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2EqualTo(String value) {
            addCriterion("additionalUnit2 =", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2NotEqualTo(String value) {
            addCriterion("additionalUnit2 <>", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2GreaterThan(String value) {
            addCriterion("additionalUnit2 >", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2GreaterThanOrEqualTo(String value) {
            addCriterion("additionalUnit2 >=", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2LessThan(String value) {
            addCriterion("additionalUnit2 <", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2LessThanOrEqualTo(String value) {
            addCriterion("additionalUnit2 <=", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2Like(String value) {
            addCriterion("additionalUnit2 like", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2NotLike(String value) {
            addCriterion("additionalUnit2 not like", value, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2In(List<String> values) {
            addCriterion("additionalUnit2 in", values, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2NotIn(List<String> values) {
            addCriterion("additionalUnit2 not in", values, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2Between(String value1, String value2) {
            addCriterion("additionalUnit2 between", value1, value2, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andAdditionalUnit2NotBetween(String value1, String value2) {
            addCriterion("additionalUnit2 not between", value1, value2, "additionalUnit2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1IsNull() {
            addCriterion("sanitaryScore1 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1IsNotNull() {
            addCriterion("sanitaryScore1 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1EqualTo(Integer value) {
            addCriterion("sanitaryScore1 =", value, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1NotEqualTo(Integer value) {
            addCriterion("sanitaryScore1 <>", value, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1GreaterThan(Integer value) {
            addCriterion("sanitaryScore1 >", value, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore1 >=", value, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1LessThan(Integer value) {
            addCriterion("sanitaryScore1 <", value, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore1 <=", value, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1In(List<Integer> values) {
            addCriterion("sanitaryScore1 in", values, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1NotIn(List<Integer> values) {
            addCriterion("sanitaryScore1 not in", values, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore1 between", value1, value2, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore1NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore1 not between", value1, value2, "sanitaryScore1");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2IsNull() {
            addCriterion("sanitaryScore2 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2IsNotNull() {
            addCriterion("sanitaryScore2 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2EqualTo(Integer value) {
            addCriterion("sanitaryScore2 =", value, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2NotEqualTo(Integer value) {
            addCriterion("sanitaryScore2 <>", value, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2GreaterThan(Integer value) {
            addCriterion("sanitaryScore2 >", value, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore2 >=", value, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2LessThan(Integer value) {
            addCriterion("sanitaryScore2 <", value, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore2 <=", value, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2In(List<Integer> values) {
            addCriterion("sanitaryScore2 in", values, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2NotIn(List<Integer> values) {
            addCriterion("sanitaryScore2 not in", values, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore2 between", value1, value2, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore2NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore2 not between", value1, value2, "sanitaryScore2");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3IsNull() {
            addCriterion("sanitaryScore3 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3IsNotNull() {
            addCriterion("sanitaryScore3 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3EqualTo(Integer value) {
            addCriterion("sanitaryScore3 =", value, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3NotEqualTo(Integer value) {
            addCriterion("sanitaryScore3 <>", value, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3GreaterThan(Integer value) {
            addCriterion("sanitaryScore3 >", value, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore3 >=", value, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3LessThan(Integer value) {
            addCriterion("sanitaryScore3 <", value, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore3 <=", value, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3In(List<Integer> values) {
            addCriterion("sanitaryScore3 in", values, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3NotIn(List<Integer> values) {
            addCriterion("sanitaryScore3 not in", values, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore3 between", value1, value2, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore3NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore3 not between", value1, value2, "sanitaryScore3");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4IsNull() {
            addCriterion("sanitaryScore4 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4IsNotNull() {
            addCriterion("sanitaryScore4 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4EqualTo(Integer value) {
            addCriterion("sanitaryScore4 =", value, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4NotEqualTo(Integer value) {
            addCriterion("sanitaryScore4 <>", value, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4GreaterThan(Integer value) {
            addCriterion("sanitaryScore4 >", value, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore4 >=", value, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4LessThan(Integer value) {
            addCriterion("sanitaryScore4 <", value, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore4 <=", value, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4In(List<Integer> values) {
            addCriterion("sanitaryScore4 in", values, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4NotIn(List<Integer> values) {
            addCriterion("sanitaryScore4 not in", values, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore4 between", value1, value2, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore4NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore4 not between", value1, value2, "sanitaryScore4");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5IsNull() {
            addCriterion("sanitaryScore5 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5IsNotNull() {
            addCriterion("sanitaryScore5 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5EqualTo(Integer value) {
            addCriterion("sanitaryScore5 =", value, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5NotEqualTo(Integer value) {
            addCriterion("sanitaryScore5 <>", value, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5GreaterThan(Integer value) {
            addCriterion("sanitaryScore5 >", value, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore5 >=", value, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5LessThan(Integer value) {
            addCriterion("sanitaryScore5 <", value, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore5 <=", value, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5In(List<Integer> values) {
            addCriterion("sanitaryScore5 in", values, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5NotIn(List<Integer> values) {
            addCriterion("sanitaryScore5 not in", values, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore5 between", value1, value2, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore5NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore5 not between", value1, value2, "sanitaryScore5");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6IsNull() {
            addCriterion("sanitaryScore6 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6IsNotNull() {
            addCriterion("sanitaryScore6 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6EqualTo(Integer value) {
            addCriterion("sanitaryScore6 =", value, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6NotEqualTo(Integer value) {
            addCriterion("sanitaryScore6 <>", value, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6GreaterThan(Integer value) {
            addCriterion("sanitaryScore6 >", value, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore6 >=", value, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6LessThan(Integer value) {
            addCriterion("sanitaryScore6 <", value, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore6 <=", value, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6In(List<Integer> values) {
            addCriterion("sanitaryScore6 in", values, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6NotIn(List<Integer> values) {
            addCriterion("sanitaryScore6 not in", values, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore6 between", value1, value2, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore6NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore6 not between", value1, value2, "sanitaryScore6");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7IsNull() {
            addCriterion("sanitaryScore7 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7IsNotNull() {
            addCriterion("sanitaryScore7 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7EqualTo(Integer value) {
            addCriterion("sanitaryScore7 =", value, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7NotEqualTo(Integer value) {
            addCriterion("sanitaryScore7 <>", value, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7GreaterThan(Integer value) {
            addCriterion("sanitaryScore7 >", value, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore7 >=", value, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7LessThan(Integer value) {
            addCriterion("sanitaryScore7 <", value, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore7 <=", value, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7In(List<Integer> values) {
            addCriterion("sanitaryScore7 in", values, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7NotIn(List<Integer> values) {
            addCriterion("sanitaryScore7 not in", values, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore7 between", value1, value2, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore7NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore7 not between", value1, value2, "sanitaryScore7");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8IsNull() {
            addCriterion("sanitaryScore8 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8IsNotNull() {
            addCriterion("sanitaryScore8 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8EqualTo(Integer value) {
            addCriterion("sanitaryScore8 =", value, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8NotEqualTo(Integer value) {
            addCriterion("sanitaryScore8 <>", value, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8GreaterThan(Integer value) {
            addCriterion("sanitaryScore8 >", value, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore8 >=", value, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8LessThan(Integer value) {
            addCriterion("sanitaryScore8 <", value, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore8 <=", value, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8In(List<Integer> values) {
            addCriterion("sanitaryScore8 in", values, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8NotIn(List<Integer> values) {
            addCriterion("sanitaryScore8 not in", values, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore8 between", value1, value2, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore8NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore8 not between", value1, value2, "sanitaryScore8");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9IsNull() {
            addCriterion("sanitaryScore9 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9IsNotNull() {
            addCriterion("sanitaryScore9 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9EqualTo(Integer value) {
            addCriterion("sanitaryScore9 =", value, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9NotEqualTo(Integer value) {
            addCriterion("sanitaryScore9 <>", value, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9GreaterThan(Integer value) {
            addCriterion("sanitaryScore9 >", value, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore9 >=", value, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9LessThan(Integer value) {
            addCriterion("sanitaryScore9 <", value, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore9 <=", value, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9In(List<Integer> values) {
            addCriterion("sanitaryScore9 in", values, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9NotIn(List<Integer> values) {
            addCriterion("sanitaryScore9 not in", values, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore9 between", value1, value2, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore9NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore9 not between", value1, value2, "sanitaryScore9");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10IsNull() {
            addCriterion("sanitaryScore10 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10IsNotNull() {
            addCriterion("sanitaryScore10 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10EqualTo(Integer value) {
            addCriterion("sanitaryScore10 =", value, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10NotEqualTo(Integer value) {
            addCriterion("sanitaryScore10 <>", value, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10GreaterThan(Integer value) {
            addCriterion("sanitaryScore10 >", value, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore10 >=", value, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10LessThan(Integer value) {
            addCriterion("sanitaryScore10 <", value, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore10 <=", value, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10In(List<Integer> values) {
            addCriterion("sanitaryScore10 in", values, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10NotIn(List<Integer> values) {
            addCriterion("sanitaryScore10 not in", values, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore10 between", value1, value2, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore10NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore10 not between", value1, value2, "sanitaryScore10");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11IsNull() {
            addCriterion("sanitaryScore11 is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11IsNotNull() {
            addCriterion("sanitaryScore11 is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11EqualTo(Integer value) {
            addCriterion("sanitaryScore11 =", value, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11NotEqualTo(Integer value) {
            addCriterion("sanitaryScore11 <>", value, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11GreaterThan(Integer value) {
            addCriterion("sanitaryScore11 >", value, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11GreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore11 >=", value, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11LessThan(Integer value) {
            addCriterion("sanitaryScore11 <", value, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11LessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore11 <=", value, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11In(List<Integer> values) {
            addCriterion("sanitaryScore11 in", values, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11NotIn(List<Integer> values) {
            addCriterion("sanitaryScore11 not in", values, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11Between(Integer value1, Integer value2) {
            addCriterion("sanitaryScore11 between", value1, value2, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryScore11NotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore11 not between", value1, value2, "sanitaryScore11");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdIsNull() {
            addCriterion("sanitaryTypeId is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdIsNotNull() {
            addCriterion("sanitaryTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdEqualTo(Integer value) {
            addCriterion("sanitaryTypeId =", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdNotEqualTo(Integer value) {
            addCriterion("sanitaryTypeId <>", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdGreaterThan(Integer value) {
            addCriterion("sanitaryTypeId >", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryTypeId >=", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdLessThan(Integer value) {
            addCriterion("sanitaryTypeId <", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryTypeId <=", value, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdIn(List<Integer> values) {
            addCriterion("sanitaryTypeId in", values, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdNotIn(List<Integer> values) {
            addCriterion("sanitaryTypeId not in", values, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryTypeId between", value1, value2, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryTypeId not between", value1, value2, "sanitaryTypeId");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreIsNull() {
            addCriterion("sanitaryScore is null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreIsNotNull() {
            addCriterion("sanitaryScore is not null");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreEqualTo(Integer value) {
            addCriterion("sanitaryScore =", value, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreNotEqualTo(Integer value) {
            addCriterion("sanitaryScore <>", value, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreGreaterThan(Integer value) {
            addCriterion("sanitaryScore >", value, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore >=", value, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreLessThan(Integer value) {
            addCriterion("sanitaryScore <", value, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreLessThanOrEqualTo(Integer value) {
            addCriterion("sanitaryScore <=", value, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreIn(List<Integer> values) {
            addCriterion("sanitaryScore in", values, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreNotIn(List<Integer> values) {
            addCriterion("sanitaryScore not in", values, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore between", value1, value2, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSanitaryScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("sanitaryScore not between", value1, value2, "sanitaryScore");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIsNull() {
            addCriterion("samplingDate is null");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIsNotNull() {
            addCriterion("samplingDate is not null");
            return (Criteria) this;
        }

        public Criteria andSamplingDateEqualTo(Date value) {
            addCriterion("samplingDate =", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotEqualTo(Date value) {
            addCriterion("samplingDate <>", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateGreaterThan(Date value) {
            addCriterion("samplingDate >", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("samplingDate >=", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateLessThan(Date value) {
            addCriterion("samplingDate <", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateLessThanOrEqualTo(Date value) {
            addCriterion("samplingDate <=", value, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateIn(List<Date> values) {
            addCriterion("samplingDate in", values, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotIn(List<Date> values) {
            addCriterion("samplingDate not in", values, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateBetween(Date value1, Date value2) {
            addCriterion("samplingDate between", value1, value2, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andSamplingDateNotBetween(Date value1, Date value2) {
            addCriterion("samplingDate not between", value1, value2, "samplingDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateIsNull() {
            addCriterion("detectDate is null");
            return (Criteria) this;
        }

        public Criteria andDetectDateIsNotNull() {
            addCriterion("detectDate is not null");
            return (Criteria) this;
        }

        public Criteria andDetectDateEqualTo(Date value) {
            addCriterion("detectDate =", value, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateNotEqualTo(Date value) {
            addCriterion("detectDate <>", value, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateGreaterThan(Date value) {
            addCriterion("detectDate >", value, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("detectDate >=", value, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateLessThan(Date value) {
            addCriterion("detectDate <", value, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateLessThanOrEqualTo(Date value) {
            addCriterion("detectDate <=", value, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateIn(List<Date> values) {
            addCriterion("detectDate in", values, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateNotIn(List<Date> values) {
            addCriterion("detectDate not in", values, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateBetween(Date value1, Date value2) {
            addCriterion("detectDate between", value1, value2, "detectDate");
            return (Criteria) this;
        }

        public Criteria andDetectDateNotBetween(Date value1, Date value2) {
            addCriterion("detectDate not between", value1, value2, "detectDate");
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

        public Criteria andGeneralCommentsIsNull() {
            addCriterion("generalComments is null");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsIsNotNull() {
            addCriterion("generalComments is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsEqualTo(String value) {
            addCriterion("generalComments =", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsNotEqualTo(String value) {
            addCriterion("generalComments <>", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsGreaterThan(String value) {
            addCriterion("generalComments >", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("generalComments >=", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsLessThan(String value) {
            addCriterion("generalComments <", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsLessThanOrEqualTo(String value) {
            addCriterion("generalComments <=", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsLike(String value) {
            addCriterion("generalComments like", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsNotLike(String value) {
            addCriterion("generalComments not like", value, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsIn(List<String> values) {
            addCriterion("generalComments in", values, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsNotIn(List<String> values) {
            addCriterion("generalComments not in", values, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsBetween(String value1, String value2) {
            addCriterion("generalComments between", value1, value2, "generalComments");
            return (Criteria) this;
        }

        public Criteria andGeneralCommentsNotBetween(String value1, String value2) {
            addCriterion("generalComments not between", value1, value2, "generalComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsIsNull() {
            addCriterion("waterQDeterminationComments is null");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsIsNotNull() {
            addCriterion("waterQDeterminationComments is not null");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsEqualTo(String value) {
            addCriterion("waterQDeterminationComments =", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsNotEqualTo(String value) {
            addCriterion("waterQDeterminationComments <>", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsGreaterThan(String value) {
            addCriterion("waterQDeterminationComments >", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("waterQDeterminationComments >=", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsLessThan(String value) {
            addCriterion("waterQDeterminationComments <", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsLessThanOrEqualTo(String value) {
            addCriterion("waterQDeterminationComments <=", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsLike(String value) {
            addCriterion("waterQDeterminationComments like", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsNotLike(String value) {
            addCriterion("waterQDeterminationComments not like", value, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsIn(List<String> values) {
            addCriterion("waterQDeterminationComments in", values, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsNotIn(List<String> values) {
            addCriterion("waterQDeterminationComments not in", values, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsBetween(String value1, String value2) {
            addCriterion("waterQDeterminationComments between", value1, value2, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andWaterQDeterminationCommentsNotBetween(String value1, String value2) {
            addCriterion("waterQDeterminationComments not between", value1, value2, "waterQDeterminationComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsIsNull() {
            addCriterion("probComments is null");
            return (Criteria) this;
        }

        public Criteria andProbCommentsIsNotNull() {
            addCriterion("probComments is not null");
            return (Criteria) this;
        }

        public Criteria andProbCommentsEqualTo(String value) {
            addCriterion("probComments =", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsNotEqualTo(String value) {
            addCriterion("probComments <>", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsGreaterThan(String value) {
            addCriterion("probComments >", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("probComments >=", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsLessThan(String value) {
            addCriterion("probComments <", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsLessThanOrEqualTo(String value) {
            addCriterion("probComments <=", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsLike(String value) {
            addCriterion("probComments like", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsNotLike(String value) {
            addCriterion("probComments not like", value, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsIn(List<String> values) {
            addCriterion("probComments in", values, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsNotIn(List<String> values) {
            addCriterion("probComments not in", values, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsBetween(String value1, String value2) {
            addCriterion("probComments between", value1, value2, "probComments");
            return (Criteria) this;
        }

        public Criteria andProbCommentsNotBetween(String value1, String value2) {
            addCriterion("probComments not between", value1, value2, "probComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsIsNull() {
            addCriterion("challengesComments is null");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsIsNotNull() {
            addCriterion("challengesComments is not null");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsEqualTo(String value) {
            addCriterion("challengesComments =", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsNotEqualTo(String value) {
            addCriterion("challengesComments <>", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsGreaterThan(String value) {
            addCriterion("challengesComments >", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("challengesComments >=", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsLessThan(String value) {
            addCriterion("challengesComments <", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsLessThanOrEqualTo(String value) {
            addCriterion("challengesComments <=", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsLike(String value) {
            addCriterion("challengesComments like", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsNotLike(String value) {
            addCriterion("challengesComments not like", value, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsIn(List<String> values) {
            addCriterion("challengesComments in", values, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsNotIn(List<String> values) {
            addCriterion("challengesComments not in", values, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsBetween(String value1, String value2) {
            addCriterion("challengesComments between", value1, value2, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andChallengesCommentsNotBetween(String value1, String value2) {
            addCriterion("challengesComments not between", value1, value2, "challengesComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsIsNull() {
            addCriterion("needsComments is null");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsIsNotNull() {
            addCriterion("needsComments is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsEqualTo(String value) {
            addCriterion("needsComments =", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsNotEqualTo(String value) {
            addCriterion("needsComments <>", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsGreaterThan(String value) {
            addCriterion("needsComments >", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("needsComments >=", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsLessThan(String value) {
            addCriterion("needsComments <", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsLessThanOrEqualTo(String value) {
            addCriterion("needsComments <=", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsLike(String value) {
            addCriterion("needsComments like", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsNotLike(String value) {
            addCriterion("needsComments not like", value, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsIn(List<String> values) {
            addCriterion("needsComments in", values, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsNotIn(List<String> values) {
            addCriterion("needsComments not in", values, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsBetween(String value1, String value2) {
            addCriterion("needsComments between", value1, value2, "needsComments");
            return (Criteria) this;
        }

        public Criteria andNeedsCommentsNotBetween(String value1, String value2) {
            addCriterion("needsComments not between", value1, value2, "needsComments");
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

        public Criteria andHealthCenterIdEqualTo(String value) {
            addCriterion("healthCenterId =", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdNotEqualTo(String value) {
            addCriterion("healthCenterId <>", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdGreaterThan(String value) {
            addCriterion("healthCenterId >", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdGreaterThanOrEqualTo(String value) {
            addCriterion("healthCenterId >=", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdLessThan(String value) {
            addCriterion("healthCenterId <", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdLessThanOrEqualTo(String value) {
            addCriterion("healthCenterId <=", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdLike(String value) {
            addCriterion("healthCenterId like", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdNotLike(String value) {
            addCriterion("healthCenterId not like", value, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdIn(List<String> values) {
            addCriterion("healthCenterId in", values, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdNotIn(List<String> values) {
            addCriterion("healthCenterId not in", values, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdBetween(String value1, String value2) {
            addCriterion("healthCenterId between", value1, value2, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andHealthCenterIdNotBetween(String value1, String value2) {
            addCriterion("healthCenterId not between", value1, value2, "healthCenterId");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorIsNull() {
            addCriterion("waterCollector is null");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorIsNotNull() {
            addCriterion("waterCollector is not null");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorEqualTo(String value) {
            addCriterion("waterCollector =", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorNotEqualTo(String value) {
            addCriterion("waterCollector <>", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorGreaterThan(String value) {
            addCriterion("waterCollector >", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorGreaterThanOrEqualTo(String value) {
            addCriterion("waterCollector >=", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorLessThan(String value) {
            addCriterion("waterCollector <", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorLessThanOrEqualTo(String value) {
            addCriterion("waterCollector <=", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorLike(String value) {
            addCriterion("waterCollector like", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorNotLike(String value) {
            addCriterion("waterCollector not like", value, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorIn(List<String> values) {
            addCriterion("waterCollector in", values, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorNotIn(List<String> values) {
            addCriterion("waterCollector not in", values, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorBetween(String value1, String value2) {
            addCriterion("waterCollector between", value1, value2, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andWaterCollectorNotBetween(String value1, String value2) {
            addCriterion("waterCollector not between", value1, value2, "waterCollector");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionIsNull() {
            addCriterion("distanceWaterCollection is null");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionIsNotNull() {
            addCriterion("distanceWaterCollection is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionEqualTo(Integer value) {
            addCriterion("distanceWaterCollection =", value, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionNotEqualTo(Integer value) {
            addCriterion("distanceWaterCollection <>", value, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionGreaterThan(Integer value) {
            addCriterion("distanceWaterCollection >", value, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("distanceWaterCollection >=", value, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionLessThan(Integer value) {
            addCriterion("distanceWaterCollection <", value, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionLessThanOrEqualTo(Integer value) {
            addCriterion("distanceWaterCollection <=", value, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionIn(List<Integer> values) {
            addCriterion("distanceWaterCollection in", values, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionNotIn(List<Integer> values) {
            addCriterion("distanceWaterCollection not in", values, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionBetween(Integer value1, Integer value2) {
            addCriterion("distanceWaterCollection between", value1, value2, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andDistanceWaterCollectionNotBetween(Integer value1, Integer value2) {
            addCriterion("distanceWaterCollection not between", value1, value2, "distanceWaterCollection");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeIsNull() {
            addCriterion("waterWaitTime is null");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeIsNotNull() {
            addCriterion("waterWaitTime is not null");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeEqualTo(Integer value) {
            addCriterion("waterWaitTime =", value, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeNotEqualTo(Integer value) {
            addCriterion("waterWaitTime <>", value, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeGreaterThan(Integer value) {
            addCriterion("waterWaitTime >", value, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterWaitTime >=", value, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeLessThan(Integer value) {
            addCriterion("waterWaitTime <", value, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("waterWaitTime <=", value, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeIn(List<Integer> values) {
            addCriterion("waterWaitTime in", values, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeNotIn(List<Integer> values) {
            addCriterion("waterWaitTime not in", values, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeBetween(Integer value1, Integer value2) {
            addCriterion("waterWaitTime between", value1, value2, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andWaterWaitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("waterWaitTime not between", value1, value2, "waterWaitTime");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseIsNull() {
            addCriterion("diarrheaCause is null");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseIsNotNull() {
            addCriterion("diarrheaCause is not null");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseEqualTo(String value) {
            addCriterion("diarrheaCause =", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseNotEqualTo(String value) {
            addCriterion("diarrheaCause <>", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseGreaterThan(String value) {
            addCriterion("diarrheaCause >", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseGreaterThanOrEqualTo(String value) {
            addCriterion("diarrheaCause >=", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseLessThan(String value) {
            addCriterion("diarrheaCause <", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseLessThanOrEqualTo(String value) {
            addCriterion("diarrheaCause <=", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseLike(String value) {
            addCriterion("diarrheaCause like", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseNotLike(String value) {
            addCriterion("diarrheaCause not like", value, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseIn(List<String> values) {
            addCriterion("diarrheaCause in", values, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseNotIn(List<String> values) {
            addCriterion("diarrheaCause not in", values, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseBetween(String value1, String value2) {
            addCriterion("diarrheaCause between", value1, value2, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andDiarrheaCauseNotBetween(String value1, String value2) {
            addCriterion("diarrheaCause not between", value1, value2, "diarrheaCause");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionIsNull() {
            addCriterion("waterSatisfaction is null");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionIsNotNull() {
            addCriterion("waterSatisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionEqualTo(Integer value) {
            addCriterion("waterSatisfaction =", value, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionNotEqualTo(Integer value) {
            addCriterion("waterSatisfaction <>", value, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionGreaterThan(Integer value) {
            addCriterion("waterSatisfaction >", value, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionGreaterThanOrEqualTo(Integer value) {
            addCriterion("waterSatisfaction >=", value, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionLessThan(Integer value) {
            addCriterion("waterSatisfaction <", value, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionLessThanOrEqualTo(Integer value) {
            addCriterion("waterSatisfaction <=", value, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionIn(List<Integer> values) {
            addCriterion("waterSatisfaction in", values, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionNotIn(List<Integer> values) {
            addCriterion("waterSatisfaction not in", values, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionBetween(Integer value1, Integer value2) {
            addCriterion("waterSatisfaction between", value1, value2, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andWaterSatisfactionNotBetween(Integer value1, Integer value2) {
            addCriterion("waterSatisfaction not between", value1, value2, "waterSatisfaction");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursIsNull() {
            addCriterion("averageStorageHours is null");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursIsNotNull() {
            addCriterion("averageStorageHours is not null");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursEqualTo(String value) {
            addCriterion("averageStorageHours =", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursNotEqualTo(String value) {
            addCriterion("averageStorageHours <>", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursGreaterThan(String value) {
            addCriterion("averageStorageHours >", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursGreaterThanOrEqualTo(String value) {
            addCriterion("averageStorageHours >=", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursLessThan(String value) {
            addCriterion("averageStorageHours <", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursLessThanOrEqualTo(String value) {
            addCriterion("averageStorageHours <=", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursLike(String value) {
            addCriterion("averageStorageHours like", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursNotLike(String value) {
            addCriterion("averageStorageHours not like", value, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursIn(List<String> values) {
            addCriterion("averageStorageHours in", values, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursNotIn(List<String> values) {
            addCriterion("averageStorageHours not in", values, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursBetween(String value1, String value2) {
            addCriterion("averageStorageHours between", value1, value2, "averageStorageHours");
            return (Criteria) this;
        }

        public Criteria andAverageStorageHoursNotBetween(String value1, String value2) {
            addCriterion("averageStorageHours not between", value1, value2, "averageStorageHours");
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
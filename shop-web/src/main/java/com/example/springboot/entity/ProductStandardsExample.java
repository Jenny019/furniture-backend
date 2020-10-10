package com.example.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductStandardsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductStandardsExample() {
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

        public Criteria andStandardIDIsNull() {
            addCriterion("standardID is null");
            return (Criteria) this;
        }

        public Criteria andStandardIDIsNotNull() {
            addCriterion("standardID is not null");
            return (Criteria) this;
        }

        public Criteria andStandardIDEqualTo(Integer value) {
            addCriterion("standardID =", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDNotEqualTo(Integer value) {
            addCriterion("standardID <>", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDGreaterThan(Integer value) {
            addCriterion("standardID >", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("standardID >=", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDLessThan(Integer value) {
            addCriterion("standardID <", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDLessThanOrEqualTo(Integer value) {
            addCriterion("standardID <=", value, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDIn(List<Integer> values) {
            addCriterion("standardID in", values, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDNotIn(List<Integer> values) {
            addCriterion("standardID not in", values, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDBetween(Integer value1, Integer value2) {
            addCriterion("standardID between", value1, value2, "standardID");
            return (Criteria) this;
        }

        public Criteria andStandardIDNotBetween(Integer value1, Integer value2) {
            addCriterion("standardID not between", value1, value2, "standardID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDIsNull() {
            addCriterion("bandProductID is null");
            return (Criteria) this;
        }

        public Criteria andBandProductIDIsNotNull() {
            addCriterion("bandProductID is not null");
            return (Criteria) this;
        }

        public Criteria andBandProductIDEqualTo(Integer value) {
            addCriterion("bandProductID =", value, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDNotEqualTo(Integer value) {
            addCriterion("bandProductID <>", value, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDGreaterThan(Integer value) {
            addCriterion("bandProductID >", value, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandProductID >=", value, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDLessThan(Integer value) {
            addCriterion("bandProductID <", value, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDLessThanOrEqualTo(Integer value) {
            addCriterion("bandProductID <=", value, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDIn(List<Integer> values) {
            addCriterion("bandProductID in", values, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDNotIn(List<Integer> values) {
            addCriterion("bandProductID not in", values, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDBetween(Integer value1, Integer value2) {
            addCriterion("bandProductID between", value1, value2, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandProductIDNotBetween(Integer value1, Integer value2) {
            addCriterion("bandProductID not between", value1, value2, "bandProductID");
            return (Criteria) this;
        }

        public Criteria andBandPriceIsNull() {
            addCriterion("bandPrice is null");
            return (Criteria) this;
        }

        public Criteria andBandPriceIsNotNull() {
            addCriterion("bandPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBandPriceEqualTo(Integer value) {
            addCriterion("bandPrice =", value, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceNotEqualTo(Integer value) {
            addCriterion("bandPrice <>", value, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceGreaterThan(Integer value) {
            addCriterion("bandPrice >", value, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandPrice >=", value, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceLessThan(Integer value) {
            addCriterion("bandPrice <", value, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceLessThanOrEqualTo(Integer value) {
            addCriterion("bandPrice <=", value, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceIn(List<Integer> values) {
            addCriterion("bandPrice in", values, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceNotIn(List<Integer> values) {
            addCriterion("bandPrice not in", values, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceBetween(Integer value1, Integer value2) {
            addCriterion("bandPrice between", value1, value2, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andBandPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("bandPrice not between", value1, value2, "bandPrice");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
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
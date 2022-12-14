package vn.com.vti.springexam.entity;

import java.util.ArrayList;
import java.util.List;

public class BusinessTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public BusinessTypeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andBusinessTypeIdIsNull() {
            addCriterion("business_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdIsNotNull() {
            addCriterion("business_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdEqualTo(String value) {
            addCriterion("business_type_id =", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdNotEqualTo(String value) {
            addCriterion("business_type_id <>", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdGreaterThan(String value) {
            addCriterion("business_type_id >", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("business_type_id >=", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdLessThan(String value) {
            addCriterion("business_type_id <", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdLessThanOrEqualTo(String value) {
            addCriterion("business_type_id <=", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdLike(String value) {
            addCriterion("business_type_id like", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdNotLike(String value) {
            addCriterion("business_type_id not like", value, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdIn(List<String> values) {
            addCriterion("business_type_id in", values, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdNotIn(List<String> values) {
            addCriterion("business_type_id not in", values, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdBetween(String value1, String value2) {
            addCriterion("business_type_id between", value1, value2, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIdNotBetween(String value1, String value2) {
            addCriterion("business_type_id not between", value1, value2, "businessTypeId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameIsNull() {
            addCriterion("business_type_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameIsNotNull() {
            addCriterion("business_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameEqualTo(String value) {
            addCriterion("business_type_name =", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameNotEqualTo(String value) {
            addCriterion("business_type_name <>", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameGreaterThan(String value) {
            addCriterion("business_type_name >", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_type_name >=", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameLessThan(String value) {
            addCriterion("business_type_name <", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameLessThanOrEqualTo(String value) {
            addCriterion("business_type_name <=", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameLike(String value) {
            addCriterion("business_type_name like", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameNotLike(String value) {
            addCriterion("business_type_name not like", value, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameIn(List<String> values) {
            addCriterion("business_type_name in", values, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameNotIn(List<String> values) {
            addCriterion("business_type_name not in", values, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameBetween(String value1, String value2) {
            addCriterion("business_type_name between", value1, value2, "businessTypeName");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNameNotBetween(String value1, String value2) {
            addCriterion("business_type_name not between", value1, value2, "businessTypeName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table business_type
     *
     * @mbg.generated do_not_delete_during_merge Mon Mar 14 10:44:07 JST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table business_type
     *
     * @mbg.generated Mon Mar 14 10:44:07 JST 2022
     */
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
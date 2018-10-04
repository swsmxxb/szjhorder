package com.szjc.OrderManag.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInventorycodeIsNull() {
            addCriterion("inventorycode is null");
            return (Criteria) this;
        }

        public Criteria andInventorycodeIsNotNull() {
            addCriterion("inventorycode is not null");
            return (Criteria) this;
        }

        public Criteria andInventorycodeEqualTo(String value) {
            addCriterion("inventorycode =", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeNotEqualTo(String value) {
            addCriterion("inventorycode <>", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeGreaterThan(String value) {
            addCriterion("inventorycode >", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeGreaterThanOrEqualTo(String value) {
            addCriterion("inventorycode >=", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeLessThan(String value) {
            addCriterion("inventorycode <", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeLessThanOrEqualTo(String value) {
            addCriterion("inventorycode <=", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeLike(String value) {
            addCriterion("inventorycode like", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeNotLike(String value) {
            addCriterion("inventorycode not like", value, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeIn(List<String> values) {
            addCriterion("inventorycode in", values, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeNotIn(List<String> values) {
            addCriterion("inventorycode not in", values, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeBetween(String value1, String value2) {
            addCriterion("inventorycode between", value1, value2, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorycodeNotBetween(String value1, String value2) {
            addCriterion("inventorycode not between", value1, value2, "inventorycode");
            return (Criteria) this;
        }

        public Criteria andInventorynameIsNull() {
            addCriterion("inventoryname is null");
            return (Criteria) this;
        }

        public Criteria andInventorynameIsNotNull() {
            addCriterion("inventoryname is not null");
            return (Criteria) this;
        }

        public Criteria andInventorynameEqualTo(String value) {
            addCriterion("inventoryname =", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameNotEqualTo(String value) {
            addCriterion("inventoryname <>", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameGreaterThan(String value) {
            addCriterion("inventoryname >", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameGreaterThanOrEqualTo(String value) {
            addCriterion("inventoryname >=", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameLessThan(String value) {
            addCriterion("inventoryname <", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameLessThanOrEqualTo(String value) {
            addCriterion("inventoryname <=", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameLike(String value) {
            addCriterion("inventoryname like", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameNotLike(String value) {
            addCriterion("inventoryname not like", value, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameIn(List<String> values) {
            addCriterion("inventoryname in", values, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameNotIn(List<String> values) {
            addCriterion("inventoryname not in", values, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameBetween(String value1, String value2) {
            addCriterion("inventoryname between", value1, value2, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andInventorynameNotBetween(String value1, String value2) {
            addCriterion("inventoryname not between", value1, value2, "inventoryname");
            return (Criteria) this;
        }

        public Criteria andSpeciIsNull() {
            addCriterion("speci is null");
            return (Criteria) this;
        }

        public Criteria andSpeciIsNotNull() {
            addCriterion("speci is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciEqualTo(String value) {
            addCriterion("speci =", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciNotEqualTo(String value) {
            addCriterion("speci <>", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciGreaterThan(String value) {
            addCriterion("speci >", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciGreaterThanOrEqualTo(String value) {
            addCriterion("speci >=", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciLessThan(String value) {
            addCriterion("speci <", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciLessThanOrEqualTo(String value) {
            addCriterion("speci <=", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciLike(String value) {
            addCriterion("speci like", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciNotLike(String value) {
            addCriterion("speci not like", value, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciIn(List<String> values) {
            addCriterion("speci in", values, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciNotIn(List<String> values) {
            addCriterion("speci not in", values, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciBetween(String value1, String value2) {
            addCriterion("speci between", value1, value2, "speci");
            return (Criteria) this;
        }

        public Criteria andSpeciNotBetween(String value1, String value2) {
            addCriterion("speci not between", value1, value2, "speci");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("creattime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("creattime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("creattime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creattime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("creattime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("creattime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("creattime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("creattime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("creattime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("creattime not between", value1, value2, "creattime");
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
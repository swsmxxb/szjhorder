package com.szjc.OrderManag.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleorderHExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleorderHExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("HID is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("HID is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(String value) {
            addCriterion("HID =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(String value) {
            addCriterion("HID <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(String value) {
            addCriterion("HID >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(String value) {
            addCriterion("HID >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(String value) {
            addCriterion("HID <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(String value) {
            addCriterion("HID <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLike(String value) {
            addCriterion("HID like", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotLike(String value) {
            addCriterion("HID not like", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<String> values) {
            addCriterion("HID in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<String> values) {
            addCriterion("HID not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(String value1, String value2) {
            addCriterion("HID between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(String value1, String value2) {
            addCriterion("HID not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andPurchasenoIsNull() {
            addCriterion("purchaseno is null");
            return (Criteria) this;
        }

        public Criteria andPurchasenoIsNotNull() {
            addCriterion("purchaseno is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasenoEqualTo(String value) {
            addCriterion("purchaseno =", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotEqualTo(String value) {
            addCriterion("purchaseno <>", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoGreaterThan(String value) {
            addCriterion("purchaseno >", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseno >=", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoLessThan(String value) {
            addCriterion("purchaseno <", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoLessThanOrEqualTo(String value) {
            addCriterion("purchaseno <=", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoLike(String value) {
            addCriterion("purchaseno like", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotLike(String value) {
            addCriterion("purchaseno not like", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoIn(List<String> values) {
            addCriterion("purchaseno in", values, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotIn(List<String> values) {
            addCriterion("purchaseno not in", values, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoBetween(String value1, String value2) {
            addCriterion("purchaseno between", value1, value2, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotBetween(String value1, String value2) {
            addCriterion("purchaseno not between", value1, value2, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderno like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderno not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andCustommanagIsNull() {
            addCriterion("custommanag is null");
            return (Criteria) this;
        }

        public Criteria andCustommanagIsNotNull() {
            addCriterion("custommanag is not null");
            return (Criteria) this;
        }

        public Criteria andCustommanagEqualTo(String value) {
            addCriterion("custommanag =", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagNotEqualTo(String value) {
            addCriterion("custommanag <>", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagGreaterThan(String value) {
            addCriterion("custommanag >", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagGreaterThanOrEqualTo(String value) {
            addCriterion("custommanag >=", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagLessThan(String value) {
            addCriterion("custommanag <", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagLessThanOrEqualTo(String value) {
            addCriterion("custommanag <=", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagLike(String value) {
            addCriterion("custommanag like", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagNotLike(String value) {
            addCriterion("custommanag not like", value, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagIn(List<String> values) {
            addCriterion("custommanag in", values, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagNotIn(List<String> values) {
            addCriterion("custommanag not in", values, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagBetween(String value1, String value2) {
            addCriterion("custommanag between", value1, value2, "custommanag");
            return (Criteria) this;
        }

        public Criteria andCustommanagNotBetween(String value1, String value2) {
            addCriterion("custommanag not between", value1, value2, "custommanag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatuserIsNull() {
            addCriterion("creatuser is null");
            return (Criteria) this;
        }

        public Criteria andCreatuserIsNotNull() {
            addCriterion("creatuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreatuserEqualTo(String value) {
            addCriterion("creatuser =", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserNotEqualTo(String value) {
            addCriterion("creatuser <>", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserGreaterThan(String value) {
            addCriterion("creatuser >", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserGreaterThanOrEqualTo(String value) {
            addCriterion("creatuser >=", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserLessThan(String value) {
            addCriterion("creatuser <", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserLessThanOrEqualTo(String value) {
            addCriterion("creatuser <=", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserLike(String value) {
            addCriterion("creatuser like", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserNotLike(String value) {
            addCriterion("creatuser not like", value, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserIn(List<String> values) {
            addCriterion("creatuser in", values, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserNotIn(List<String> values) {
            addCriterion("creatuser not in", values, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserBetween(String value1, String value2) {
            addCriterion("creatuser between", value1, value2, "creatuser");
            return (Criteria) this;
        }

        public Criteria andCreatuserNotBetween(String value1, String value2) {
            addCriterion("creatuser not between", value1, value2, "creatuser");
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

        public Criteria andCustomsIsNull() {
            addCriterion("customs is null");
            return (Criteria) this;
        }

        public Criteria andCustomsIsNotNull() {
            addCriterion("customs is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsEqualTo(String value) {
            addCriterion("customs =", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsNotEqualTo(String value) {
            addCriterion("customs <>", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsGreaterThan(String value) {
            addCriterion("customs >", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsGreaterThanOrEqualTo(String value) {
            addCriterion("customs >=", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsLessThan(String value) {
            addCriterion("customs <", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsLessThanOrEqualTo(String value) {
            addCriterion("customs <=", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsLike(String value) {
            addCriterion("customs like", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsNotLike(String value) {
            addCriterion("customs not like", value, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsIn(List<String> values) {
            addCriterion("customs in", values, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsNotIn(List<String> values) {
            addCriterion("customs not in", values, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsBetween(String value1, String value2) {
            addCriterion("customs between", value1, value2, "customs");
            return (Criteria) this;
        }

        public Criteria andCustomsNotBetween(String value1, String value2) {
            addCriterion("customs not between", value1, value2, "customs");
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
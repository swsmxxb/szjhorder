package com.szjc.OrderManag.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchaseorderBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseorderBExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("BID is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("BID is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(String value) {
            addCriterion("BID =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(String value) {
            addCriterion("BID <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(String value) {
            addCriterion("BID >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(String value) {
            addCriterion("BID >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(String value) {
            addCriterion("BID <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(String value) {
            addCriterion("BID <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLike(String value) {
            addCriterion("BID like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotLike(String value) {
            addCriterion("BID not like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<String> values) {
            addCriterion("BID in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<String> values) {
            addCriterion("BID not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(String value1, String value2) {
            addCriterion("BID between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(String value1, String value2) {
            addCriterion("BID not between", value1, value2, "bid");
            return (Criteria) this;
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

        public Criteria andInventoryidIsNull() {
            addCriterion("inventoryid is null");
            return (Criteria) this;
        }

        public Criteria andInventoryidIsNotNull() {
            addCriterion("inventoryid is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryidEqualTo(String value) {
            addCriterion("inventoryid =", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidNotEqualTo(String value) {
            addCriterion("inventoryid <>", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidGreaterThan(String value) {
            addCriterion("inventoryid >", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidGreaterThanOrEqualTo(String value) {
            addCriterion("inventoryid >=", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidLessThan(String value) {
            addCriterion("inventoryid <", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidLessThanOrEqualTo(String value) {
            addCriterion("inventoryid <=", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidLike(String value) {
            addCriterion("inventoryid like", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidNotLike(String value) {
            addCriterion("inventoryid not like", value, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidIn(List<String> values) {
            addCriterion("inventoryid in", values, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidNotIn(List<String> values) {
            addCriterion("inventoryid not in", values, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidBetween(String value1, String value2) {
            addCriterion("inventoryid between", value1, value2, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andInventoryidNotBetween(String value1, String value2) {
            addCriterion("inventoryid not between", value1, value2, "inventoryid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(BigDecimal value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(BigDecimal value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(BigDecimal value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(BigDecimal value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<BigDecimal> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<BigDecimal> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkIsNull() {
            addCriterion("specialremark is null");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkIsNotNull() {
            addCriterion("specialremark is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkEqualTo(String value) {
            addCriterion("specialremark =", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkNotEqualTo(String value) {
            addCriterion("specialremark <>", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkGreaterThan(String value) {
            addCriterion("specialremark >", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkGreaterThanOrEqualTo(String value) {
            addCriterion("specialremark >=", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkLessThan(String value) {
            addCriterion("specialremark <", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkLessThanOrEqualTo(String value) {
            addCriterion("specialremark <=", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkLike(String value) {
            addCriterion("specialremark like", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkNotLike(String value) {
            addCriterion("specialremark not like", value, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkIn(List<String> values) {
            addCriterion("specialremark in", values, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkNotIn(List<String> values) {
            addCriterion("specialremark not in", values, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkBetween(String value1, String value2) {
            addCriterion("specialremark between", value1, value2, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSpecialremarkNotBetween(String value1, String value2) {
            addCriterion("specialremark not between", value1, value2, "specialremark");
            return (Criteria) this;
        }

        public Criteria andSendaddrIsNull() {
            addCriterion("sendaddr is null");
            return (Criteria) this;
        }

        public Criteria andSendaddrIsNotNull() {
            addCriterion("sendaddr is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddrEqualTo(String value) {
            addCriterion("sendaddr =", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrNotEqualTo(String value) {
            addCriterion("sendaddr <>", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrGreaterThan(String value) {
            addCriterion("sendaddr >", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrGreaterThanOrEqualTo(String value) {
            addCriterion("sendaddr >=", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrLessThan(String value) {
            addCriterion("sendaddr <", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrLessThanOrEqualTo(String value) {
            addCriterion("sendaddr <=", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrLike(String value) {
            addCriterion("sendaddr like", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrNotLike(String value) {
            addCriterion("sendaddr not like", value, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrIn(List<String> values) {
            addCriterion("sendaddr in", values, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrNotIn(List<String> values) {
            addCriterion("sendaddr not in", values, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrBetween(String value1, String value2) {
            addCriterion("sendaddr between", value1, value2, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andSendaddrNotBetween(String value1, String value2) {
            addCriterion("sendaddr not between", value1, value2, "sendaddr");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterIsNull() {
            addCriterion("addrcontenter is null");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterIsNotNull() {
            addCriterion("addrcontenter is not null");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterEqualTo(String value) {
            addCriterion("addrcontenter =", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterNotEqualTo(String value) {
            addCriterion("addrcontenter <>", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterGreaterThan(String value) {
            addCriterion("addrcontenter >", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterGreaterThanOrEqualTo(String value) {
            addCriterion("addrcontenter >=", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterLessThan(String value) {
            addCriterion("addrcontenter <", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterLessThanOrEqualTo(String value) {
            addCriterion("addrcontenter <=", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterLike(String value) {
            addCriterion("addrcontenter like", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterNotLike(String value) {
            addCriterion("addrcontenter not like", value, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterIn(List<String> values) {
            addCriterion("addrcontenter in", values, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterNotIn(List<String> values) {
            addCriterion("addrcontenter not in", values, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterBetween(String value1, String value2) {
            addCriterion("addrcontenter between", value1, value2, "addrcontenter");
            return (Criteria) this;
        }

        public Criteria andAddrcontenterNotBetween(String value1, String value2) {
            addCriterion("addrcontenter not between", value1, value2, "addrcontenter");
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
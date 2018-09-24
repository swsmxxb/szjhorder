package com.szjc.OrderManag.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleorderExample() {
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

        public Criteria andDrwnoIsNull() {
            addCriterion("drwno is null");
            return (Criteria) this;
        }

        public Criteria andDrwnoIsNotNull() {
            addCriterion("drwno is not null");
            return (Criteria) this;
        }

        public Criteria andDrwnoEqualTo(String value) {
            addCriterion("drwno =", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoNotEqualTo(String value) {
            addCriterion("drwno <>", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoGreaterThan(String value) {
            addCriterion("drwno >", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoGreaterThanOrEqualTo(String value) {
            addCriterion("drwno >=", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoLessThan(String value) {
            addCriterion("drwno <", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoLessThanOrEqualTo(String value) {
            addCriterion("drwno <=", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoLike(String value) {
            addCriterion("drwno like", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoNotLike(String value) {
            addCriterion("drwno not like", value, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoIn(List<String> values) {
            addCriterion("drwno in", values, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoNotIn(List<String> values) {
            addCriterion("drwno not in", values, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoBetween(String value1, String value2) {
            addCriterion("drwno between", value1, value2, "drwno");
            return (Criteria) this;
        }

        public Criteria andDrwnoNotBetween(String value1, String value2) {
            addCriterion("drwno not between", value1, value2, "drwno");
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierid is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(String value) {
            addCriterion("supplierid =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(String value) {
            addCriterion("supplierid <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(String value) {
            addCriterion("supplierid >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("supplierid >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(String value) {
            addCriterion("supplierid <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(String value) {
            addCriterion("supplierid <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLike(String value) {
            addCriterion("supplierid like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotLike(String value) {
            addCriterion("supplierid not like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<String> values) {
            addCriterion("supplierid in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<String> values) {
            addCriterion("supplierid not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(String value1, String value2) {
            addCriterion("supplierid between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(String value1, String value2) {
            addCriterion("supplierid not between", value1, value2, "supplierid");
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

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
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

        public Criteria andCreattaimeIsNull() {
            addCriterion("creattaime is null");
            return (Criteria) this;
        }

        public Criteria andCreattaimeIsNotNull() {
            addCriterion("creattaime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattaimeEqualTo(Date value) {
            addCriterion("creattaime =", value, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeNotEqualTo(Date value) {
            addCriterion("creattaime <>", value, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeGreaterThan(Date value) {
            addCriterion("creattaime >", value, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creattaime >=", value, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeLessThan(Date value) {
            addCriterion("creattaime <", value, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeLessThanOrEqualTo(Date value) {
            addCriterion("creattaime <=", value, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeIn(List<Date> values) {
            addCriterion("creattaime in", values, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeNotIn(List<Date> values) {
            addCriterion("creattaime not in", values, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeBetween(Date value1, Date value2) {
            addCriterion("creattaime between", value1, value2, "creattaime");
            return (Criteria) this;
        }

        public Criteria andCreattaimeNotBetween(Date value1, Date value2) {
            addCriterion("creattaime not between", value1, value2, "creattaime");
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
package com.szjc.OrderManag.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierinfoExample() {
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

        public Criteria andSuppliercodeIsNull() {
            addCriterion("suppliercode is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIsNotNull() {
            addCriterion("suppliercode is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeEqualTo(String value) {
            addCriterion("suppliercode =", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotEqualTo(String value) {
            addCriterion("suppliercode <>", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThan(String value) {
            addCriterion("suppliercode >", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThanOrEqualTo(String value) {
            addCriterion("suppliercode >=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThan(String value) {
            addCriterion("suppliercode <", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThanOrEqualTo(String value) {
            addCriterion("suppliercode <=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLike(String value) {
            addCriterion("suppliercode like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotLike(String value) {
            addCriterion("suppliercode not like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIn(List<String> values) {
            addCriterion("suppliercode in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotIn(List<String> values) {
            addCriterion("suppliercode not in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeBetween(String value1, String value2) {
            addCriterion("suppliercode between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotBetween(String value1, String value2) {
            addCriterion("suppliercode not between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("suppliername is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("suppliername is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("suppliername =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("suppliername <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("suppliername >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("suppliername >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("suppliername <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("suppliername <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("suppliername like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("suppliername not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("suppliername in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("suppliername not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("suppliername between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("suppliername not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameIsNull() {
            addCriterion("suppliershotname is null");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameIsNotNull() {
            addCriterion("suppliershotname is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameEqualTo(String value) {
            addCriterion("suppliershotname =", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameNotEqualTo(String value) {
            addCriterion("suppliershotname <>", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameGreaterThan(String value) {
            addCriterion("suppliershotname >", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameGreaterThanOrEqualTo(String value) {
            addCriterion("suppliershotname >=", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameLessThan(String value) {
            addCriterion("suppliershotname <", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameLessThanOrEqualTo(String value) {
            addCriterion("suppliershotname <=", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameLike(String value) {
            addCriterion("suppliershotname like", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameNotLike(String value) {
            addCriterion("suppliershotname not like", value, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameIn(List<String> values) {
            addCriterion("suppliershotname in", values, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameNotIn(List<String> values) {
            addCriterion("suppliershotname not in", values, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameBetween(String value1, String value2) {
            addCriterion("suppliershotname between", value1, value2, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andSuppliershotnameNotBetween(String value1, String value2) {
            addCriterion("suppliershotname not between", value1, value2, "suppliershotname");
            return (Criteria) this;
        }

        public Criteria andContenterIsNull() {
            addCriterion("contenter is null");
            return (Criteria) this;
        }

        public Criteria andContenterIsNotNull() {
            addCriterion("contenter is not null");
            return (Criteria) this;
        }

        public Criteria andContenterEqualTo(String value) {
            addCriterion("contenter =", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterNotEqualTo(String value) {
            addCriterion("contenter <>", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterGreaterThan(String value) {
            addCriterion("contenter >", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterGreaterThanOrEqualTo(String value) {
            addCriterion("contenter >=", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterLessThan(String value) {
            addCriterion("contenter <", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterLessThanOrEqualTo(String value) {
            addCriterion("contenter <=", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterLike(String value) {
            addCriterion("contenter like", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterNotLike(String value) {
            addCriterion("contenter not like", value, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterIn(List<String> values) {
            addCriterion("contenter in", values, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterNotIn(List<String> values) {
            addCriterion("contenter not in", values, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterBetween(String value1, String value2) {
            addCriterion("contenter between", value1, value2, "contenter");
            return (Criteria) this;
        }

        public Criteria andContenterNotBetween(String value1, String value2) {
            addCriterion("contenter not between", value1, value2, "contenter");
            return (Criteria) this;
        }

        public Criteria andTelsIsNull() {
            addCriterion("tels is null");
            return (Criteria) this;
        }

        public Criteria andTelsIsNotNull() {
            addCriterion("tels is not null");
            return (Criteria) this;
        }

        public Criteria andTelsEqualTo(String value) {
            addCriterion("tels =", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotEqualTo(String value) {
            addCriterion("tels <>", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsGreaterThan(String value) {
            addCriterion("tels >", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsGreaterThanOrEqualTo(String value) {
            addCriterion("tels >=", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsLessThan(String value) {
            addCriterion("tels <", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsLessThanOrEqualTo(String value) {
            addCriterion("tels <=", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsLike(String value) {
            addCriterion("tels like", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotLike(String value) {
            addCriterion("tels not like", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsIn(List<String> values) {
            addCriterion("tels in", values, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotIn(List<String> values) {
            addCriterion("tels not in", values, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsBetween(String value1, String value2) {
            addCriterion("tels between", value1, value2, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotBetween(String value1, String value2) {
            addCriterion("tels not between", value1, value2, "tels");
            return (Criteria) this;
        }

        public Criteria andFaxsIsNull() {
            addCriterion("faxs is null");
            return (Criteria) this;
        }

        public Criteria andFaxsIsNotNull() {
            addCriterion("faxs is not null");
            return (Criteria) this;
        }

        public Criteria andFaxsEqualTo(String value) {
            addCriterion("faxs =", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsNotEqualTo(String value) {
            addCriterion("faxs <>", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsGreaterThan(String value) {
            addCriterion("faxs >", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsGreaterThanOrEqualTo(String value) {
            addCriterion("faxs >=", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsLessThan(String value) {
            addCriterion("faxs <", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsLessThanOrEqualTo(String value) {
            addCriterion("faxs <=", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsLike(String value) {
            addCriterion("faxs like", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsNotLike(String value) {
            addCriterion("faxs not like", value, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsIn(List<String> values) {
            addCriterion("faxs in", values, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsNotIn(List<String> values) {
            addCriterion("faxs not in", values, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsBetween(String value1, String value2) {
            addCriterion("faxs between", value1, value2, "faxs");
            return (Criteria) this;
        }

        public Criteria andFaxsNotBetween(String value1, String value2) {
            addCriterion("faxs not between", value1, value2, "faxs");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTypesIsNull() {
            addCriterion("types is null");
            return (Criteria) this;
        }

        public Criteria andTypesIsNotNull() {
            addCriterion("types is not null");
            return (Criteria) this;
        }

        public Criteria andTypesEqualTo(String value) {
            addCriterion("types =", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotEqualTo(String value) {
            addCriterion("types <>", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThan(String value) {
            addCriterion("types >", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThanOrEqualTo(String value) {
            addCriterion("types >=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThan(String value) {
            addCriterion("types <", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThanOrEqualTo(String value) {
            addCriterion("types <=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLike(String value) {
            addCriterion("types like", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotLike(String value) {
            addCriterion("types not like", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesIn(List<String> values) {
            addCriterion("types in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotIn(List<String> values) {
            addCriterion("types not in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesBetween(String value1, String value2) {
            addCriterion("types between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotBetween(String value1, String value2) {
            addCriterion("types not between", value1, value2, "types");
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
package com.fwk.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAagricnameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAagricnameExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andDelstateIsNull() {
            addCriterion("delstate is null");
            return (Criteria) this;
        }

        public Criteria andDelstateIsNotNull() {
            addCriterion("delstate is not null");
            return (Criteria) this;
        }

        public Criteria andDelstateEqualTo(Integer value) {
            addCriterion("delstate =", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateNotEqualTo(Integer value) {
            addCriterion("delstate <>", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateGreaterThan(Integer value) {
            addCriterion("delstate >", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("delstate >=", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateLessThan(Integer value) {
            addCriterion("delstate <", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateLessThanOrEqualTo(Integer value) {
            addCriterion("delstate <=", value, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateIn(List<Integer> values) {
            addCriterion("delstate in", values, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateNotIn(List<Integer> values) {
            addCriterion("delstate not in", values, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateBetween(Integer value1, Integer value2) {
            addCriterion("delstate between", value1, value2, "delstate");
            return (Criteria) this;
        }

        public Criteria andDelstateNotBetween(Integer value1, Integer value2) {
            addCriterion("delstate not between", value1, value2, "delstate");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andSpecifIsNull() {
            addCriterion("specif is null");
            return (Criteria) this;
        }

        public Criteria andSpecifIsNotNull() {
            addCriterion("specif is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifEqualTo(Double value) {
            addCriterion("specif =", value, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifNotEqualTo(Double value) {
            addCriterion("specif <>", value, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifGreaterThan(Double value) {
            addCriterion("specif >", value, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifGreaterThanOrEqualTo(Double value) {
            addCriterion("specif >=", value, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifLessThan(Double value) {
            addCriterion("specif <", value, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifLessThanOrEqualTo(Double value) {
            addCriterion("specif <=", value, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifIn(List<Double> values) {
            addCriterion("specif in", values, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifNotIn(List<Double> values) {
            addCriterion("specif not in", values, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifBetween(Double value1, Double value2) {
            addCriterion("specif between", value1, value2, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifNotBetween(Double value1, Double value2) {
            addCriterion("specif not between", value1, value2, "specif");
            return (Criteria) this;
        }

        public Criteria andSpecifunitIsNull() {
            addCriterion("specifunit is null");
            return (Criteria) this;
        }

        public Criteria andSpecifunitIsNotNull() {
            addCriterion("specifunit is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifunitEqualTo(Integer value) {
            addCriterion("specifunit =", value, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitNotEqualTo(Integer value) {
            addCriterion("specifunit <>", value, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitGreaterThan(Integer value) {
            addCriterion("specifunit >", value, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("specifunit >=", value, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitLessThan(Integer value) {
            addCriterion("specifunit <", value, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitLessThanOrEqualTo(Integer value) {
            addCriterion("specifunit <=", value, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitIn(List<Integer> values) {
            addCriterion("specifunit in", values, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitNotIn(List<Integer> values) {
            addCriterion("specifunit not in", values, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitBetween(Integer value1, Integer value2) {
            addCriterion("specifunit between", value1, value2, "specifunit");
            return (Criteria) this;
        }

        public Criteria andSpecifunitNotBetween(Integer value1, Integer value2) {
            addCriterion("specifunit not between", value1, value2, "specifunit");
            return (Criteria) this;
        }

        public Criteria andBuildfactureIsNull() {
            addCriterion("buildfacture is null");
            return (Criteria) this;
        }

        public Criteria andBuildfactureIsNotNull() {
            addCriterion("buildfacture is not null");
            return (Criteria) this;
        }

        public Criteria andBuildfactureEqualTo(String value) {
            addCriterion("buildfacture =", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureNotEqualTo(String value) {
            addCriterion("buildfacture <>", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureGreaterThan(String value) {
            addCriterion("buildfacture >", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureGreaterThanOrEqualTo(String value) {
            addCriterion("buildfacture >=", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureLessThan(String value) {
            addCriterion("buildfacture <", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureLessThanOrEqualTo(String value) {
            addCriterion("buildfacture <=", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureLike(String value) {
            addCriterion("buildfacture like", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureNotLike(String value) {
            addCriterion("buildfacture not like", value, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureIn(List<String> values) {
            addCriterion("buildfacture in", values, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureNotIn(List<String> values) {
            addCriterion("buildfacture not in", values, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureBetween(String value1, String value2) {
            addCriterion("buildfacture between", value1, value2, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andBuildfactureNotBetween(String value1, String value2) {
            addCriterion("buildfacture not between", value1, value2, "buildfacture");
            return (Criteria) this;
        }

        public Criteria andDiscribeIsNull() {
            addCriterion("discribe is null");
            return (Criteria) this;
        }

        public Criteria andDiscribeIsNotNull() {
            addCriterion("discribe is not null");
            return (Criteria) this;
        }

        public Criteria andDiscribeEqualTo(String value) {
            addCriterion("discribe =", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotEqualTo(String value) {
            addCriterion("discribe <>", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeGreaterThan(String value) {
            addCriterion("discribe >", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeGreaterThanOrEqualTo(String value) {
            addCriterion("discribe >=", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeLessThan(String value) {
            addCriterion("discribe <", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeLessThanOrEqualTo(String value) {
            addCriterion("discribe <=", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeLike(String value) {
            addCriterion("discribe like", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotLike(String value) {
            addCriterion("discribe not like", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeIn(List<String> values) {
            addCriterion("discribe in", values, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotIn(List<String> values) {
            addCriterion("discribe not in", values, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeBetween(String value1, String value2) {
            addCriterion("discribe between", value1, value2, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotBetween(String value1, String value2) {
            addCriterion("discribe not between", value1, value2, "discribe");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
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
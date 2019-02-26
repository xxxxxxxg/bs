package com.fwk.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAplantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAplantExample() {
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

        public Criteria andParcelidIsNull() {
            addCriterion("parcelid is null");
            return (Criteria) this;
        }

        public Criteria andParcelidIsNotNull() {
            addCriterion("parcelid is not null");
            return (Criteria) this;
        }

        public Criteria andParcelidEqualTo(Integer value) {
            addCriterion("parcelid =", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidNotEqualTo(Integer value) {
            addCriterion("parcelid <>", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidGreaterThan(Integer value) {
            addCriterion("parcelid >", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parcelid >=", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidLessThan(Integer value) {
            addCriterion("parcelid <", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidLessThanOrEqualTo(Integer value) {
            addCriterion("parcelid <=", value, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidIn(List<Integer> values) {
            addCriterion("parcelid in", values, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidNotIn(List<Integer> values) {
            addCriterion("parcelid not in", values, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidBetween(Integer value1, Integer value2) {
            addCriterion("parcelid between", value1, value2, "parcelid");
            return (Criteria) this;
        }

        public Criteria andParcelidNotBetween(Integer value1, Integer value2) {
            addCriterion("parcelid not between", value1, value2, "parcelid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidIsNull() {
            addCriterion("prodocttypeid is null");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidIsNotNull() {
            addCriterion("prodocttypeid is not null");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidEqualTo(Integer value) {
            addCriterion("prodocttypeid =", value, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidNotEqualTo(Integer value) {
            addCriterion("prodocttypeid <>", value, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidGreaterThan(Integer value) {
            addCriterion("prodocttypeid >", value, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prodocttypeid >=", value, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidLessThan(Integer value) {
            addCriterion("prodocttypeid <", value, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("prodocttypeid <=", value, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidIn(List<Integer> values) {
            addCriterion("prodocttypeid in", values, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidNotIn(List<Integer> values) {
            addCriterion("prodocttypeid not in", values, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidBetween(Integer value1, Integer value2) {
            addCriterion("prodocttypeid between", value1, value2, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andProdocttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("prodocttypeid not between", value1, value2, "prodocttypeid");
            return (Criteria) this;
        }

        public Criteria andPlantageIsNull() {
            addCriterion("plantage is null");
            return (Criteria) this;
        }

        public Criteria andPlantageIsNotNull() {
            addCriterion("plantage is not null");
            return (Criteria) this;
        }

        public Criteria andPlantageEqualTo(Integer value) {
            addCriterion("plantage =", value, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageNotEqualTo(Integer value) {
            addCriterion("plantage <>", value, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageGreaterThan(Integer value) {
            addCriterion("plantage >", value, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageGreaterThanOrEqualTo(Integer value) {
            addCriterion("plantage >=", value, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageLessThan(Integer value) {
            addCriterion("plantage <", value, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageLessThanOrEqualTo(Integer value) {
            addCriterion("plantage <=", value, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageIn(List<Integer> values) {
            addCriterion("plantage in", values, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageNotIn(List<Integer> values) {
            addCriterion("plantage not in", values, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageBetween(Integer value1, Integer value2) {
            addCriterion("plantage between", value1, value2, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantageNotBetween(Integer value1, Integer value2) {
            addCriterion("plantage not between", value1, value2, "plantage");
            return (Criteria) this;
        }

        public Criteria andPlantdateIsNull() {
            addCriterion("plantdate is null");
            return (Criteria) this;
        }

        public Criteria andPlantdateIsNotNull() {
            addCriterion("plantdate is not null");
            return (Criteria) this;
        }

        public Criteria andPlantdateEqualTo(String value) {
            addCriterion("plantdate =", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateNotEqualTo(String value) {
            addCriterion("plantdate <>", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateGreaterThan(String value) {
            addCriterion("plantdate >", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateGreaterThanOrEqualTo(String value) {
            addCriterion("plantdate >=", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateLessThan(String value) {
            addCriterion("plantdate <", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateLessThanOrEqualTo(String value) {
            addCriterion("plantdate <=", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateLike(String value) {
            addCriterion("plantdate like", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateNotLike(String value) {
            addCriterion("plantdate not like", value, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateIn(List<String> values) {
            addCriterion("plantdate in", values, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateNotIn(List<String> values) {
            addCriterion("plantdate not in", values, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateBetween(String value1, String value2) {
            addCriterion("plantdate between", value1, value2, "plantdate");
            return (Criteria) this;
        }

        public Criteria andPlantdateNotBetween(String value1, String value2) {
            addCriterion("plantdate not between", value1, value2, "plantdate");
            return (Criteria) this;
        }

        public Criteria andDutyuseridIsNull() {
            addCriterion("dutyuserid is null");
            return (Criteria) this;
        }

        public Criteria andDutyuseridIsNotNull() {
            addCriterion("dutyuserid is not null");
            return (Criteria) this;
        }

        public Criteria andDutyuseridEqualTo(Integer value) {
            addCriterion("dutyuserid =", value, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridNotEqualTo(Integer value) {
            addCriterion("dutyuserid <>", value, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridGreaterThan(Integer value) {
            addCriterion("dutyuserid >", value, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("dutyuserid >=", value, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridLessThan(Integer value) {
            addCriterion("dutyuserid <", value, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridLessThanOrEqualTo(Integer value) {
            addCriterion("dutyuserid <=", value, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridIn(List<Integer> values) {
            addCriterion("dutyuserid in", values, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridNotIn(List<Integer> values) {
            addCriterion("dutyuserid not in", values, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridBetween(Integer value1, Integer value2) {
            addCriterion("dutyuserid between", value1, value2, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andDutyuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("dutyuserid not between", value1, value2, "dutyuserid");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("explain is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("explain is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("explain =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("explain <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("explain >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("explain >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("explain <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("explain <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("explain like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("explain not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("explain in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("explain not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("explain between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("explain not between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
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
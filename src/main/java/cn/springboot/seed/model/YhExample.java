package cn.springboot.seed.model;

import java.util.ArrayList;
import java.util.List;

public class YhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YhExample() {
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

        public Criteria andYhIdIsNull() {
            addCriterion("YH_ID is null");
            return (Criteria) this;
        }

        public Criteria andYhIdIsNotNull() {
            addCriterion("YH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andYhIdEqualTo(Integer value) {
            addCriterion("YH_ID =", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotEqualTo(Integer value) {
            addCriterion("YH_ID <>", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThan(Integer value) {
            addCriterion("YH_ID >", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("YH_ID >=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThan(Integer value) {
            addCriterion("YH_ID <", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThanOrEqualTo(Integer value) {
            addCriterion("YH_ID <=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdIn(List<Integer> values) {
            addCriterion("YH_ID in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotIn(List<Integer> values) {
            addCriterion("YH_ID not in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdBetween(Integer value1, Integer value2) {
            addCriterion("YH_ID between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("YH_ID not between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhMcIsNull() {
            addCriterion("YH_MC is null");
            return (Criteria) this;
        }

        public Criteria andYhMcIsNotNull() {
            addCriterion("YH_MC is not null");
            return (Criteria) this;
        }

        public Criteria andYhMcEqualTo(String value) {
            addCriterion("YH_MC =", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcNotEqualTo(String value) {
            addCriterion("YH_MC <>", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcGreaterThan(String value) {
            addCriterion("YH_MC >", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcGreaterThanOrEqualTo(String value) {
            addCriterion("YH_MC >=", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcLessThan(String value) {
            addCriterion("YH_MC <", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcLessThanOrEqualTo(String value) {
            addCriterion("YH_MC <=", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcLike(String value) {
            addCriterion("YH_MC like", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcNotLike(String value) {
            addCriterion("YH_MC not like", value, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcIn(List<String> values) {
            addCriterion("YH_MC in", values, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcNotIn(List<String> values) {
            addCriterion("YH_MC not in", values, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcBetween(String value1, String value2) {
            addCriterion("YH_MC between", value1, value2, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMcNotBetween(String value1, String value2) {
            addCriterion("YH_MC not between", value1, value2, "yhMc");
            return (Criteria) this;
        }

        public Criteria andYhMmIsNull() {
            addCriterion("YH_MM is null");
            return (Criteria) this;
        }

        public Criteria andYhMmIsNotNull() {
            addCriterion("YH_MM is not null");
            return (Criteria) this;
        }

        public Criteria andYhMmEqualTo(String value) {
            addCriterion("YH_MM =", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmNotEqualTo(String value) {
            addCriterion("YH_MM <>", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmGreaterThan(String value) {
            addCriterion("YH_MM >", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmGreaterThanOrEqualTo(String value) {
            addCriterion("YH_MM >=", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmLessThan(String value) {
            addCriterion("YH_MM <", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmLessThanOrEqualTo(String value) {
            addCriterion("YH_MM <=", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmLike(String value) {
            addCriterion("YH_MM like", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmNotLike(String value) {
            addCriterion("YH_MM not like", value, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmIn(List<String> values) {
            addCriterion("YH_MM in", values, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmNotIn(List<String> values) {
            addCriterion("YH_MM not in", values, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmBetween(String value1, String value2) {
            addCriterion("YH_MM between", value1, value2, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhMmNotBetween(String value1, String value2) {
            addCriterion("YH_MM not between", value1, value2, "yhMm");
            return (Criteria) this;
        }

        public Criteria andYhZtIsNull() {
            addCriterion("YH_ZT is null");
            return (Criteria) this;
        }

        public Criteria andYhZtIsNotNull() {
            addCriterion("YH_ZT is not null");
            return (Criteria) this;
        }

        public Criteria andYhZtEqualTo(Integer value) {
            addCriterion("YH_ZT =", value, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtNotEqualTo(Integer value) {
            addCriterion("YH_ZT <>", value, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtGreaterThan(Integer value) {
            addCriterion("YH_ZT >", value, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtGreaterThanOrEqualTo(Integer value) {
            addCriterion("YH_ZT >=", value, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtLessThan(Integer value) {
            addCriterion("YH_ZT <", value, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtLessThanOrEqualTo(Integer value) {
            addCriterion("YH_ZT <=", value, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtIn(List<Integer> values) {
            addCriterion("YH_ZT in", values, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtNotIn(List<Integer> values) {
            addCriterion("YH_ZT not in", values, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtBetween(Integer value1, Integer value2) {
            addCriterion("YH_ZT between", value1, value2, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhZtNotBetween(Integer value1, Integer value2) {
            addCriterion("YH_ZT not between", value1, value2, "yhZt");
            return (Criteria) this;
        }

        public Criteria andYhJsIsNull() {
            addCriterion("YH_JS is null");
            return (Criteria) this;
        }

        public Criteria andYhJsIsNotNull() {
            addCriterion("YH_JS is not null");
            return (Criteria) this;
        }

        public Criteria andYhJsEqualTo(String value) {
            addCriterion("YH_JS =", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsNotEqualTo(String value) {
            addCriterion("YH_JS <>", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsGreaterThan(String value) {
            addCriterion("YH_JS >", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsGreaterThanOrEqualTo(String value) {
            addCriterion("YH_JS >=", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsLessThan(String value) {
            addCriterion("YH_JS <", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsLessThanOrEqualTo(String value) {
            addCriterion("YH_JS <=", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsLike(String value) {
            addCriterion("YH_JS like", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsNotLike(String value) {
            addCriterion("YH_JS not like", value, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsIn(List<String> values) {
            addCriterion("YH_JS in", values, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsNotIn(List<String> values) {
            addCriterion("YH_JS not in", values, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsBetween(String value1, String value2) {
            addCriterion("YH_JS between", value1, value2, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhJsNotBetween(String value1, String value2) {
            addCriterion("YH_JS not between", value1, value2, "yhJs");
            return (Criteria) this;
        }

        public Criteria andYhXbIsNull() {
            addCriterion("YH_XB is null");
            return (Criteria) this;
        }

        public Criteria andYhXbIsNotNull() {
            addCriterion("YH_XB is not null");
            return (Criteria) this;
        }

        public Criteria andYhXbEqualTo(String value) {
            addCriterion("YH_XB =", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbNotEqualTo(String value) {
            addCriterion("YH_XB <>", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbGreaterThan(String value) {
            addCriterion("YH_XB >", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbGreaterThanOrEqualTo(String value) {
            addCriterion("YH_XB >=", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbLessThan(String value) {
            addCriterion("YH_XB <", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbLessThanOrEqualTo(String value) {
            addCriterion("YH_XB <=", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbLike(String value) {
            addCriterion("YH_XB like", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbNotLike(String value) {
            addCriterion("YH_XB not like", value, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbIn(List<String> values) {
            addCriterion("YH_XB in", values, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbNotIn(List<String> values) {
            addCriterion("YH_XB not in", values, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbBetween(String value1, String value2) {
            addCriterion("YH_XB between", value1, value2, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhXbNotBetween(String value1, String value2) {
            addCriterion("YH_XB not between", value1, value2, "yhXb");
            return (Criteria) this;
        }

        public Criteria andYhNlIsNull() {
            addCriterion("YH_NL is null");
            return (Criteria) this;
        }

        public Criteria andYhNlIsNotNull() {
            addCriterion("YH_NL is not null");
            return (Criteria) this;
        }

        public Criteria andYhNlEqualTo(Integer value) {
            addCriterion("YH_NL =", value, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlNotEqualTo(Integer value) {
            addCriterion("YH_NL <>", value, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlGreaterThan(Integer value) {
            addCriterion("YH_NL >", value, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlGreaterThanOrEqualTo(Integer value) {
            addCriterion("YH_NL >=", value, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlLessThan(Integer value) {
            addCriterion("YH_NL <", value, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlLessThanOrEqualTo(Integer value) {
            addCriterion("YH_NL <=", value, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlIn(List<Integer> values) {
            addCriterion("YH_NL in", values, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlNotIn(List<Integer> values) {
            addCriterion("YH_NL not in", values, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlBetween(Integer value1, Integer value2) {
            addCriterion("YH_NL between", value1, value2, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhNlNotBetween(Integer value1, Integer value2) {
            addCriterion("YH_NL not between", value1, value2, "yhNl");
            return (Criteria) this;
        }

        public Criteria andYhZdIsNull() {
            addCriterion("YH_ZD is null");
            return (Criteria) this;
        }

        public Criteria andYhZdIsNotNull() {
            addCriterion("YH_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andYhZdEqualTo(String value) {
            addCriterion("YH_ZD =", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdNotEqualTo(String value) {
            addCriterion("YH_ZD <>", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdGreaterThan(String value) {
            addCriterion("YH_ZD >", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdGreaterThanOrEqualTo(String value) {
            addCriterion("YH_ZD >=", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdLessThan(String value) {
            addCriterion("YH_ZD <", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdLessThanOrEqualTo(String value) {
            addCriterion("YH_ZD <=", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdLike(String value) {
            addCriterion("YH_ZD like", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdNotLike(String value) {
            addCriterion("YH_ZD not like", value, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdIn(List<String> values) {
            addCriterion("YH_ZD in", values, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdNotIn(List<String> values) {
            addCriterion("YH_ZD not in", values, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdBetween(String value1, String value2) {
            addCriterion("YH_ZD between", value1, value2, "yhZd");
            return (Criteria) this;
        }

        public Criteria andYhZdNotBetween(String value1, String value2) {
            addCriterion("YH_ZD not between", value1, value2, "yhZd");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
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
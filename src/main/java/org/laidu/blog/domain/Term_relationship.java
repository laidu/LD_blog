package org.laidu.blog.domain;

public class Term_relationship extends Term_relationshipKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column term_relationships.term_order
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Integer termOrder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column term_relationships.term_order
     *
     * @return the value of term_relationships.term_order
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Integer getTermOrder() {
        return termOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column term_relationships.term_order
     *
     * @param termOrder the value for term_relationships.term_order
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setTermOrder(Integer termOrder) {
        this.termOrder = termOrder;
    }
}
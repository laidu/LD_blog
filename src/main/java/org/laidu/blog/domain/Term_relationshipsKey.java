package org.laidu.blog.domain;

public class Term_relationshipsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column term_relationships.object_id
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    private Long objectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column term_relationships.term_taxonomy_id
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    private Long termTaxonomyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column term_relationships.object_id
     *
     * @return the value of term_relationships.object_id
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column term_relationships.object_id
     *
     * @param objectId the value for term_relationships.object_id
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column term_relationships.term_taxonomy_id
     *
     * @return the value of term_relationships.term_taxonomy_id
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    public Long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column term_relationships.term_taxonomy_id
     *
     * @param termTaxonomyId the value for term_relationships.term_taxonomy_id
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    public void setTermTaxonomyId(Long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }
}
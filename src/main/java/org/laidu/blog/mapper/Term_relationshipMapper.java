package org.laidu.blog.mapper;

import org.laidu.blog.domain.Term_relationship;
import org.laidu.blog.domain.Term_relationshipKey;

public interface Term_relationshipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    int deleteByPrimaryKey(Term_relationshipKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    int insert(Term_relationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    int insertSelective(Term_relationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    Term_relationship selectByPrimaryKey(Term_relationshipKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    int updateByPrimaryKeySelective(Term_relationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    int updateByPrimaryKey(Term_relationship record);
}
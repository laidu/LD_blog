package org.laidu.blog.mapper;

import org.laidu.blog.domain.Term_relationships;
import org.laidu.blog.domain.Term_relationshipsKey;

public interface Term_relationshipsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    int deleteByPrimaryKey(Term_relationshipsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    int insert(Term_relationships record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    int insertSelective(Term_relationships record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    Term_relationships selectByPrimaryKey(Term_relationshipsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    int updateByPrimaryKeySelective(Term_relationships record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table term_relationships
     *
     * @mbg.generated Fri Sep 09 11:17:33 CST 2016
     */
    int updateByPrimaryKey(Term_relationships record);
}
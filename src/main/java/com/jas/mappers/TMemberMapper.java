package com.jas.mappers;

import com.jas.model.TMember;
import com.jas.model.TMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMemberMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int countByExample(TMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int deleteByExample(TMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int deleteByPrimaryKey(String memberId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int insert(TMember record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int insertSelective(TMember record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	List<TMember> selectByExample(TMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	TMember selectByPrimaryKey(String memberId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int updateByExampleSelective(@Param("record") TMember record, @Param("example") TMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int updateByExample(@Param("record") TMember record, @Param("example") TMemberExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int updateByPrimaryKeySelective(TMember record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_member
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	int updateByPrimaryKey(TMember record);

	String selectMaxMemberId();
}
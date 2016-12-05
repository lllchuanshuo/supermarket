package com.jas.mappers;

import com.jas.model.TSell;
import com.jas.model.TSellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSellMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int countByExample(TSellExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int deleteByExample(TSellExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int deleteByPrimaryKey(String sellId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int insert(TSell record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int insertSelective(TSell record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	List<TSell> selectByExample(TSellExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	TSell selectByPrimaryKey(String sellId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int updateByExampleSelective(@Param("record") TSell record, @Param("example") TSellExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int updateByExample(@Param("record") TSell record, @Param("example") TSellExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int updateByPrimaryKeySelective(TSell record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_sell
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	int updateByPrimaryKey(TSell record);
	
	String selectMaxSellId();
}
package com.jas.mappers;

import com.jas.model.TBuy;
import com.jas.model.TBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBuyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int countByExample(TBuyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int deleteByExample(TBuyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int deleteByPrimaryKey(String buyId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int insert(TBuy record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int insertSelective(TBuy record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	List<TBuy> selectByExample(TBuyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	TBuy selectByPrimaryKey(String buyId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int updateByExampleSelective(@Param("record") TBuy record, @Param("example") TBuyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int updateByExample(@Param("record") TBuy record, @Param("example") TBuyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int updateByPrimaryKeySelective(TBuy record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_buy
	 * @mbggenerated  Fri Nov 18 11:24:56 CST 2016
	 */
	int updateByPrimaryKey(TBuy record);
	
	String selectMaxBuyId();
}
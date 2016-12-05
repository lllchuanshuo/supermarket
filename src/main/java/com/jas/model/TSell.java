package com.jas.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;
import com.ins.core.pub.json.serialize.DateSerializer;

public class TSell {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.sell_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private String sellId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.supp_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private String suppId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.good_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private String goodId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.sum
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private Integer sum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.amount
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private BigDecimal amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.total_amount
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private BigDecimal totalAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.sell_time
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	@JsonSerialize(using = DateSerializer.class)
	@JsonDeserialize(using = DateDeserializer.class)
	private Date sellTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.others
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private String others;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.creat_by
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private String creatBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_sell.creat_time
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	private Date creatTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.sell_id
	 * @return  the value of t_sell.sell_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public String getSellId() {
		return sellId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.sell_id
	 * @param sellId  the value for t_sell.sell_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setSellId(String sellId) {
		this.sellId = sellId == null ? null : sellId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.supp_id
	 * @return  the value of t_sell.supp_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public String getSuppId() {
		return suppId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.supp_id
	 * @param suppId  the value for t_sell.supp_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setSuppId(String suppId) {
		this.suppId = suppId == null ? null : suppId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.good_id
	 * @return  the value of t_sell.good_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public String getGoodId() {
		return goodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.good_id
	 * @param goodId  the value for t_sell.good_id
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setGoodId(String goodId) {
		this.goodId = goodId == null ? null : goodId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.sum
	 * @return  the value of t_sell.sum
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public Integer getSum() {
		return sum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.sum
	 * @param sum  the value for t_sell.sum
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setSum(Integer sum) {
		this.sum = sum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.amount
	 * @return  the value of t_sell.amount
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.amount
	 * @param amount  the value for t_sell.amount
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.total_amount
	 * @return  the value of t_sell.total_amount
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.total_amount
	 * @param totalAmount  the value for t_sell.total_amount
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.sell_time
	 * @return  the value of t_sell.sell_time
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public Date getSellTime() {
		return sellTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.sell_time
	 * @param sellTime  the value for t_sell.sell_time
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setSellTime(Date sellTime) {
		this.sellTime = sellTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.others
	 * @return  the value of t_sell.others
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public String getOthers() {
		return others;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.others
	 * @param others  the value for t_sell.others
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setOthers(String others) {
		this.others = others == null ? null : others.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.creat_by
	 * @return  the value of t_sell.creat_by
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public String getCreatBy() {
		return creatBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.creat_by
	 * @param creatBy  the value for t_sell.creat_by
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setCreatBy(String creatBy) {
		this.creatBy = creatBy == null ? null : creatBy.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_sell.creat_time
	 * @return  the value of t_sell.creat_time
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public Date getCreatTime() {
		return creatTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_sell.creat_time
	 * @param creatTime  the value for t_sell.creat_time
	 * @mbggenerated  Fri Nov 18 15:59:09 CST 2016
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
}
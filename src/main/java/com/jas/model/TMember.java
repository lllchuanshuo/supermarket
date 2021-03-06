package com.jas.model;

import java.util.Date;

public class TMember {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.member_id
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private String memberId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.member_name
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private String memberName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.sex
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private String sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.idcard
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private String idcard;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.member_discount
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private Integer memberDiscount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.others
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private String others;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.create_by
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private String createBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_member.create_time
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	private Date createTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.member_id
	 * @return  the value of t_member.member_id
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.member_id
	 * @param memberId  the value for t_member.member_id
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId == null ? null : memberId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.member_name
	 * @return  the value of t_member.member_name
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.member_name
	 * @param memberName  the value for t_member.member_name
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName == null ? null : memberName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.sex
	 * @return  the value of t_member.sex
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.sex
	 * @param sex  the value for t_member.sex
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.idcard
	 * @return  the value of t_member.idcard
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public String getIdcard() {
		return idcard;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.idcard
	 * @param idcard  the value for t_member.idcard
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard == null ? null : idcard.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.member_discount
	 * @return  the value of t_member.member_discount
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public Integer getMemberDiscount() {
		return memberDiscount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.member_discount
	 * @param memberDiscount  the value for t_member.member_discount
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setMemberDiscount(Integer memberDiscount) {
		this.memberDiscount = memberDiscount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.others
	 * @return  the value of t_member.others
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public String getOthers() {
		return others;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.others
	 * @param others  the value for t_member.others
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setOthers(String others) {
		this.others = others == null ? null : others.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.create_by
	 * @return  the value of t_member.create_by
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.create_by
	 * @param createBy  the value for t_member.create_by
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_member.create_time
	 * @return  the value of t_member.create_time
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_member.create_time
	 * @param createTime  the value for t_member.create_time
	 * @mbggenerated  Wed Nov 16 18:21:00 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
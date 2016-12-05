package com.jas.mappers;

import com.jas.model.TSupplier;
import com.jas.model.TSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSupplierMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int countByExample(TSupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int deleteByExample(TSupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int deleteByPrimaryKey(String suppId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int insert(TSupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int insertSelective(TSupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    List<TSupplier> selectByExample(TSupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    TSupplier selectByPrimaryKey(String suppId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") TSupplier record, @Param("example") TSupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int updateByExample(@Param("record") TSupplier record, @Param("example") TSupplierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int updateByPrimaryKeySelective(TSupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_supplier
     *
     * @mbggenerated Fri Nov 11 18:54:21 CST 2016
     */
    int updateByPrimaryKey(TSupplier record);
    
    String selectMaxSuppId();
}
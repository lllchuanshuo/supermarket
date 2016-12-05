package com.jas.mappers;

import com.jas.model.TAdmin;
import com.jas.model.TAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    int countByExample(TAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    int deleteByExample(TAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    int insert(TAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    int insertSelective(TAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    List<TAdmin> selectByExample(TAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    int updateByExampleSelective(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    int updateByExample(@Param("record") TAdmin record, @Param("example") TAdminExample example);
}
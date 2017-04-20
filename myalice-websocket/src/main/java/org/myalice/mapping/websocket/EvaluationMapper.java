package org.myalice.mapping.websocket;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.myalice.domain.websocket.Evaluation;

public interface EvaluationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @Insert({
        "insert into evaluation (id, customer_id, ",
        "customer_conn_id, score, ",
        "create_time)",
        "values (#{id,jdbcType=VARCHAR}, #{customerId,jdbcType=VARCHAR}, ",
        "#{customerConnId,jdbcType=VARCHAR}, #{score,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, customer_id, customer_conn_id, score, create_time",
        "from evaluation"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_id", property="customerId", jdbcType=JdbcType.VARCHAR),
        @Result(column="customer_conn_id", property="customerConnId", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Evaluation> selectAll();
}
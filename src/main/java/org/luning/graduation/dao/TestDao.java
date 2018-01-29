package org.luning.graduation.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.luning.graduation.bo.TestBo;

import java.util.List;

/**
 * 测试 DAO 接口类
 *
 * Created by ln on 01/29/2018.
 */
@Mapper  // 标志为 Mybatis 的 Mapper
public interface TestDao {

    /**
     * 查询所有测试对象
     *
     */
    @Select("SELECT * FROM test")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
    })
    List<TestBo> listTest();
}

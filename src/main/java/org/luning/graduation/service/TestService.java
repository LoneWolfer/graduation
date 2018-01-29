package org.luning.graduation.service;

import org.luning.graduation.bo.TestBo;

import java.util.List;

/**
 * 测试业务逻辑接口类
 *
 * Created by ln on 01/29/2018.
 */
public interface TestService {

    /**
     * 查询所有测试对象
     *
     */
    List<TestBo> listTest();
}

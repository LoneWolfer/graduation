package org.luning.graduation.service.impl;

import org.luning.graduation.bo.TestBo;
import org.luning.graduation.dao.TestDao;
import org.luning.graduation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试业务逻辑实现类
 *
 * Created by ln on 01/29/2018.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<TestBo> listTest() {
        return testDao.listTest();
    }
}

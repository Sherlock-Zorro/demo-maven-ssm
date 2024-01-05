package com.atguigu.imperial.court.service.impl;

import com.atguigu.imperial.court.entity.Emp;
import com.atguigu.imperial.court.entity.EmpExample;
import com.atguigu.imperial.court.mapper.EmpMapper;
import com.atguigu.imperial.court.service.api.EmpService;
import com.atguigu.imperial.court.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;


    @Override
    public Emp getEmpByLogin(String loginAccount, String loginPassword) {

        // 1、密码加密
        String encodedLoginPassword = MD5Util.encode(loginPassword);

        // 2、通过 QBC 查询方式封装查询条件
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        criteria.andLoginAccountEqualTo(loginAccount).andLoginPasswordEqualTo(encodedLoginPassword);

        List<Emp> empList = empMapper.selectByExample(empExample);
        if(empList != null && empList.size() > 0){

            // 3、返回查询结果
            return empList.get(0);
        }

        return null;
    }
}

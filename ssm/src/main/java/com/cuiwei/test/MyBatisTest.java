package com.cuiwei.test;

import com.cuiwei.dao.AccountDao;
import com.cuiwei.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testMybatis() throws IOException {

        //记载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //获取SqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取Mapper代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);

        //执行
        List<Account> all = mapper.findAll();

        for (Account account : all) {
            System.out.println(account);
        }

        //释放资源
        sqlSession.close();

    }
}

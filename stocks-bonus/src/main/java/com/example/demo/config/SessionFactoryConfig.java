package com.example.demo.config;//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
////如果不想使用默认数据库连接池，需要自定义连接池，并在下文中注入，@Primary的作用是不指定注入DataSource时，默认使用该DataSource Bean
//@Configuration
//@EnableTransactionManagement
//@MapperScan("com.example.demo.mapper")
//public class SessionFactoryConfig implements TransactionManagementConfigurer{
//    /** * mybatis 配置路径 */
//    private static String MYBATIS_CONFIG = "mybatis-config.xml";
//
//    @Autowired
//    private DataSource dataSource;
//
//    private String typeAliasPackage = "com.xxx.xxx.mybati.model";
//
//    /**
//     *创建sqlSessionFactoryBean 实例
//     * 并且设置configtion 如驼峰命名.等等
//     * 设置mapper 映射路径
//     * 设置datasource数据源
//     * @return
//     * @throws Exception
//     */
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        /** 设置mybatis configuration 扫描路径 */
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
//        /** 设置datasource */
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        /** 设置typeAlias 包扫描路径 */
//        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
//        return sqlSessionFactoryBean;
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    @Bean
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
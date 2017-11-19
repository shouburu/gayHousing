//package gay.housing;
//
//
//
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.hibernate.jpa.*;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//
//@Configuration
//@EnableTransactionManagement
//@ComponentScan({"gay.housing","gay.housing.dao"})
//@PropertySource({"classpath:application.properties"})
//public class HibernateConfig {
//
//
//    @Autowired
//    private Environment environment;
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory(){
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan(new String[]{"gay.housing","gay.housing.model"});
//        //sessionFactory.setMappingResources(new String[]{"Employee.hbm.xml"});
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }
//
//    @Bean
//    public Properties hibernateProperties() {
//        Properties properties = new Properties();
//        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
//        properties.put("hibernate.show_sql", environment.getRequiredProperty("hiberante.show_sql"));
//        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
//        return properties;
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
//        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
//        dataSource.setUsername(environment.getRequiredProperty("jdbc.userName"));
//        dataSource.setUsername(environment.getRequiredProperty("jdbc.password"));
//        return dataSource;
//    }
//
//    @Bean
//    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){
//        return hemf.getSessionFactory();
//    }
//
//}
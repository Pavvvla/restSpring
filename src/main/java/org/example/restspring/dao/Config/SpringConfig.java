package org.example.restspring.dao.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Value("${login}")
    private String login;

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;

    @Value("${port}")
    private String port;

    @Value("${host}")
    private String host;

    @Value("${driver}")
    private String driver;

    @Value("${type}")
    private String type;

    @Bean
    DataSource dataSource(){
        BasicDataSource dataSourceConfig = new BasicDataSource();
        dataSourceConfig.setDriverClassName(driver);
        dataSourceConfig.setUrl("jdbc:" + type + "://" + host + ":" + port + "/" + user);
        dataSourceConfig.setUsername(login);
        dataSourceConfig.setPassword(password);

        return dataSourceConfig;
    }
}

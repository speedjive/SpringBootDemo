package framework.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by speedjive at 9:11 on 2018/7/6
 */
@Configuration
public class DBConfig {

    private final Environment env;

    @Autowired
    public DBConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public DataSource dataSource() {
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name"));
        source.setUrl(env.getRequiredProperty("spring.datasource.url"));
        source.setUsername(env.getRequiredProperty("spring.datasource.username"));
        source.setPassword(env.getRequiredProperty("spring.datasource.password"));
        return source;
    }
}

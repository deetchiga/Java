package Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class dvdrentalConfig {


    @Bean(name = "dvdrental")
    @ConfigurationProperties(prefix = "datasource.ds_dvdrental")
    public DataSource userDbMaria() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mariaJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("dvdrental") DataSource dvdrental) {
        return new JdbcTemplate(dvdrental);
    }
}
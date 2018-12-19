package pl.alburnus.mybatis.generator.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("pl.alburnus.mybatis.generator.mapper")
public class AppConfiguration {
}

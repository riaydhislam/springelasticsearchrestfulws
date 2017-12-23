package uv.springelasticsearchrestfulws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "uv.springelasticsearchrestfulws.repository")
@ComponentScan(basePackages = {"uv.springelasticsearchrestfulws.service"})
public class SpringelasticsearchrestfulwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringelasticsearchrestfulwsApplication.class, args);
	}
}

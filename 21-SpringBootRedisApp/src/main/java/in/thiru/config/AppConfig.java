package in.thiru.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.thiru.model.Student;


@Configuration
public class AppConfig 
{

	//01-Redis connection
	@Bean
	public RedisConnectionFactory cf()
	{
		return new LettuceConnectionFactory();
	}
	
	//02-Redis Template
	@Bean
	public RedisTemplate<String, Student> rt()
	{
		 RedisTemplate<String, Student> template =new RedisTemplate<>();
		 
		 template.setConnectionFactory(cf());
		 
		return template;
		
	}
	
	
	
	
}

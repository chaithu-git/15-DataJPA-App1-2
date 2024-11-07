package in.chaithanya;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.entity.User;
import in.chaithanya.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		 UserRepository repository=context.getBean(UserRepository.class);
		 
			/*
			 * User u=new User();
			 * u.setUserId(13);
			 * u.setUserName("Sripadam");
			 * u.setUsergender("male");
			 * u.setUserAge(26); 
			 * u.setUserCountry("UK");
			 * repository.save(u);
			 */
			/*
			 * List<User> findbycountry=repository.findByUserCountry("india");
			 * 
			 * findbycountry.forEach(user ->{
			 *  System.out.println(user); 
			 *  });
			 */
		 
//		 List<User> findByage=repository.findByUserAge(25);
//		 findByage.forEach(user ->{
//			 System.out.println(user);
//		 });
		 
//		 List<User> list=repository.findByUserAgeGreaterThanEqual(25);
//		 list.forEach(user -> {
//			 System.out.println(user);
//		 });
//		 
//		 List<User> list=repository.findByUserCountryIn(Arrays.asList("india","uk"));
//		 list.forEach(user ->{
//			 System.out.println(user);
//		 });
		// List<User> list=repository.findByUserCountryAndUserAge("india",25);
		 List<User> list=repository.findByUserCountryAndUserAgeAndUsergender("india", 25, "male");
				 list.forEach(user ->{
					 System.out.println(user); 
			 });
			 
	}
 
}

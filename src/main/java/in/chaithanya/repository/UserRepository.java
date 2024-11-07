package in.chaithanya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.chaithanya.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	//select * from user_master where user_country='india';
	public List<User> findByUserCountry(String userCountry);
	
	//select * from user_master where user_age=25;
	public List<User> findByUserAge(Integer userAge);
	
	//select * from user_master where user_age>=25;
	public List<User> findByUserAgeGreaterThanEqual(Integer userAge);
	
	//select * from user_master where user_country in (?,?,?);
	public List<User> findByUserCountryIn(List<String> userCountry);
	
	//select * from user_master where user_country='india'and user_age=25;
	public List<User> findByUserCountryAndUserAge(String userCountry, Integer userAge);
	
	//select * from user_master where user_country='india'and user_age=25 and user_gender=''male;
	public List<User> findByUserCountryAndUserAgeAndUsergender(String userCountry, Integer userAge, String usergender);
}

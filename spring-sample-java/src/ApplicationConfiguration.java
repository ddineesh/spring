import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.dinesh.repository.CustomerRepository;
import com.dinesh.repository.HibernateCustomerRepository;
import com.dinesh.service.CustomerService;
import com.dinesh.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.dinesh"})
public class ApplicationConfiguration {

	@Bean(name="customerService")
	/*@Scope("singleton")*/
	@Scope("prototype")
	public CustomerService getCustomerService()
	{
		/*
		 * This is example of constructor injection
		 * CustomerServiceImpl customerService= new CustomerServiceImpl(getCustomerRepository());*/
		/*
		 * This is example of setter injection
		 * customerService.setCustomerRepository(getCustomerRepository());*/
		CustomerServiceImpl customerService= new CustomerServiceImpl();
		return customerService;
	}
	
	@Bean(name="customerRepository") 
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepository();
	}
}

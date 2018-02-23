import com.dinesh.service.CustomerService;
import com.dinesh.service.CustomerServiceImpl;

public class Applicatoin {

	public static void main(String[] args) {
		
		CustomerService customerService=new CustomerServiceImpl();
		System.out.println(" Customer First Name:"+customerService.findAll().get(0).getFirstName());

	}

}

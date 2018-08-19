package kurs.springMvc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("employees")//aby pobrac dodatkowe metody z "employees"
@RestController
public class EmployeesController {
	@RequestMapping("getEmployees")
	//@getMapping("getEmployees")-mozliwosc wyboru jednej metody dostepu
	//@RequestMapping(value="getEmployees",method={RequestMethod.POST,RequestMethod.GET})-mozliosc wsparcia kilku metod dostepu
public List<Employee>getEmployees(){
	List<Employee>result=new ArrayList<>();
	result.add(new Employee("Jan","Nowak",new BigDecimal("3222.33")));
	result.add(new Employee("Adam","Kowal",new BigDecimal("2822.31")));
	result.add(new Employee("Anna","Matusiak",new BigDecimal("2522.29")));

	return result;
}
	@RequestMapping("findAny")// http://localhost:8080/employees/findAny czyli podac glowne requestMap a pozniej nastepna metode
	//@getMapping("findAny")
	//@PathVariable("firstName") mozemy z sciezki url znalezc
	public Employee findAny() 
	{
		return new  Employee("Jan","Nowak",new BigDecimal("3222.33"));
	}
	
//wyciaganie zmiennych z adresu url i uzyc je w obludze  zapytan	
}

package ma.emsi.customerfrontthymleafapp.web;


import ma.emsi.customerfrontthymleafapp.entities.Customer;
import ma.emsi.customerfrontthymleafapp.repositories.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




import java.util.List;

@Controller
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    @GetMapping("/customers")
    public String customers(Model model) {
        List<Customer> customerList = customerRepository.findAll();
        model.addAttribute("customers", customerList);
        return "customers";
    }
}

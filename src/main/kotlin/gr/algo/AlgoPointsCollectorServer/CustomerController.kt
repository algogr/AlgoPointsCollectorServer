package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController{
    @Autowired
    lateinit var customerService: CustomerServiceImpl

    @RequestMapping("/customer")
    fun Customer(@RequestParam(value="number",defaultValue = "")number:String): Customer{
        return customerService.findBycard(number)

    }
}
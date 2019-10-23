package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController{

    @Autowired
    lateinit var productService:ProductService

    @RequestMapping("/products")
    fun getAllProducts() = productService.getProducts()
}
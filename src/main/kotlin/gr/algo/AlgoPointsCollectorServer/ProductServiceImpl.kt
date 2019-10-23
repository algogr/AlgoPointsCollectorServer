package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class ProductServiceImpl: ProductService{

    @Autowired
    lateinit var repository : ProductRepository
    override fun getProducts()= repository.findAll()


}
package gr.algo.AlgoPointsCollectorServer

import gr.algo.AlgoPointsCollectorServer.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface  ProductRepository: CrudRepository<Product,Long>{
    fun findBydescription(description:String): MutableList<Product>
}

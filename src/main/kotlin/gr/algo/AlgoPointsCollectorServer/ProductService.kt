package gr.algo.AlgoPointsCollectorServer

interface ProductService {

    fun getProducts(): MutableIterable<Product>?
}
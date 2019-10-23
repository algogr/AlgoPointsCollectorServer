package gr.algo.AlgoPointsCollectorServer

interface CustomerService{
    fun getCustomers():MutableIterable<Customer>
    fun findBycard(card:String): Customer?

}
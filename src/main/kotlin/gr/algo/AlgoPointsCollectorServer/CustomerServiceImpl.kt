package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class CustomerServiceImpl:CustomerService{
    @Autowired
    lateinit var customerRepository: CustomerRepository
    @Autowired
    lateinit var cardRepository: CardRepository

    override fun getCustomers()= customerRepository.findAll()
    override fun findBycard(number: String): Customer {
        val card=cardRepository.findBynumber(number)
        println("CARD:$card")
        val customer = customerRepository.getOne(card.id)
        println("CUSTOMER:$customer")
        return customer


    }


}
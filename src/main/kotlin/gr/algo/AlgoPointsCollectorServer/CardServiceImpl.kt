package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class CardServiceImpl:CardService{

    @Autowired
    lateinit var repository:CardRepository

    override fun getCards()= repository.findAll()
    override fun getCardbyNumber(number: String)= repository.findBynumber(number)


}
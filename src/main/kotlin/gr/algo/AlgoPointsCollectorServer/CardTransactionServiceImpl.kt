package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class CardTransactionServiceImpl:CardTransactionService{
    @Autowired
    lateinit var repository: CardTransactionRepository

}
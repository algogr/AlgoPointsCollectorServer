package gr.algo.AlgoPointsCollectorServer

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository

interface CardTransactionRepository:CrudRepository<CardTransaction,Long>{

}
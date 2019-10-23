package gr.algo.AlgoPointsCollectorServer

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface CardRepository: CrudRepository<Card,Long>{
    fun findBynumber(number:String):Card

}
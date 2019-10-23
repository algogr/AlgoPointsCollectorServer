package gr.algo.AlgoPointsCollectorServer

import javax.persistence.*

@Entity
@Table

data class CardTransaction(
        @Id @GeneratedValue
        val id: Long=-1,
        val cardid: Long=-1,
        val productid: Long=-1,
        val qty: Float


)
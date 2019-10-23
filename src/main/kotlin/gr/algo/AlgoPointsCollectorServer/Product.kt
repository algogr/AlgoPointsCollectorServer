package gr.algo.AlgoPointsCollectorServer

import javax.persistence.*

@Entity
@Table

data class Product(
        @Id @GeneratedValue
        val id: Long=-1
        ,val description: String="")






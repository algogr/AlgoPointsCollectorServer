package gr.algo.AlgoPointsCollectorServer

import javax.persistence.*

@Entity
@Table

data class Customer(
    @Id @GeneratedValue
    val id:Long=-1,
    val name:String="",

    @OneToMany
    val cards: List<Card>?=null
)

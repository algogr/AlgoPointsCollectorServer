package gr.algo.AlgoPointsCollectorServer

import javax.persistence.*

@Entity
@Table

data class Card(
        @Id @GeneratedValue
        val id:Long=-1,
        val number:String="",

        @ManyToOne
        @JoinColumn(name="id_customer")
        val customer: Customer=Customer()
)
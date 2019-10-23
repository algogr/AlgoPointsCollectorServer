package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CardTransactionController{
    @Autowired
    lateinit var cardTransactionRepository: CardTransactionRepository

    @PostMapping("/insert")
    fun addTrans(@RequestParam cardId:String, @RequestParam productId:String, @RequestParam qty:String):String{
        val cardTransaction=CardTransaction(cardid = cardId.toLong(),productid = productId.toLong(),qty = qty.toFloat())
        cardTransactionRepository.save(cardTransaction)
        return "200"

    }









}
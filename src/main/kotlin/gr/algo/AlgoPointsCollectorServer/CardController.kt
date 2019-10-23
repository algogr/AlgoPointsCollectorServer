package gr.algo.AlgoPointsCollectorServer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CardController{
    @Autowired
    lateinit var cardService: CardServiceImpl

    @RequestMapping("/card")
    fun Card(@RequestParam(value="number",defaultValue = "")number:String): Card{
        return cardService.getCardbyNumber(number)
    }

}
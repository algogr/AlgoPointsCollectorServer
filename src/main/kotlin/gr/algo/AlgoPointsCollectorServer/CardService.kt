package gr.algo.AlgoPointsCollectorServer

interface CardService{
    fun getCards():MutableIterable<Card>
    fun getCardbyNumber(number:String):Card
}
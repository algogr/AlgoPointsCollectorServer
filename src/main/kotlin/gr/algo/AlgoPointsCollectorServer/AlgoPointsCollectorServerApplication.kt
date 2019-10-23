package gr.algo.AlgoPointsCollectorServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
class AlgoPointsCollectorServerApplication

fun main(args: Array<String>) {
    runApplication<AlgoPointsCollectorServerApplication>(*args)
}

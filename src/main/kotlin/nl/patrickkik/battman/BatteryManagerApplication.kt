package nl.patrickkik.battman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BatteryManagerApplication

fun main(args: Array<String>) {
	runApplication<BatteryManagerApplication>(*args)
}

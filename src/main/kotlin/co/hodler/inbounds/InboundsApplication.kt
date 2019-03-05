package co.hodler.inbounds

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InboundsApplication

fun main(args: Array<String>) {
	runApplication<InboundsApplication>(*args)
}

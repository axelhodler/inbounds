package co.hodler.inbounds

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class InboundsTests {

    @Test
    fun `is not in bounds`() {
        val rectangle = listOf(
                Coordinate(1.0, 0.0),
                Coordinate(1.0, 1.0),
                Coordinate(0.0, 1.0),
                Coordinate(0.0, 0.0)
        )
        val bounds = Inbounds(rectangle)
        assertThat(bounds.isInside(Coordinate(5.0, 5.0)))
                .isFalse()
    }

}

class Inbounds(val contents: List<Coordinate>) {
    fun isInside(coordinate: Coordinate): Boolean {
        return false
    }

}

data class Coordinate(val lat: Double, val lng: Double)


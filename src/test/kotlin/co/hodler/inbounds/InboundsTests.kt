package co.hodler.inbounds

import co.hodler.inbounds.thirdparty.Point
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

    //@Test
    fun `is in bounds`() {
        val rectangle = listOf(
                Coordinate(1.0, 0.0),
                Coordinate(1.0, 1.0),
                Coordinate(0.0, 1.0),
                Coordinate(0.0, 0.0)
        )
        val bounds = Inbounds(rectangle)
        assertThat(bounds.isInside(Coordinate(0.5, 0.5)))
                .isTrue()
    }
}

class ConversionTests {
    @Test
    fun `can convert coordinates to point`() {
        val c = Coordinate(1.0, 2.0)
        val p = toPoint(coordinate = c)
        assertThat(p.x).isEqualTo(c.lng)
        assertThat(p.y).isEqualTo(c.lat)
    }
}

class Inbounds(val contents: List<Coordinate>) {
    fun isInside(coordinate: Coordinate): Boolean {
        return false
    }
}

data class Coordinate(val lat: Double, val lng: Double)

fun toPoint(coordinate: Coordinate): Point {
   return Point(coordinate.lng, coordinate.lat)
}

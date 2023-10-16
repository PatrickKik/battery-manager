package nl.patrickkik.battman.domain

import org.springframework.format.number.money.MonetaryAmountFormatter
import java.math.BigDecimal
import java.time.LocalDate
import javax.money.MonetaryAmount

enum class Size {
    AA,
    AAA
}

data class Purchase(
    val date: LocalDate,
    val price: MonetaryAmount,
)
package nl.patrickkik.battman.domain

import java.time.LocalDate

data class AddBatteryCommand(
    val id: String,
    val size: Size,
    val brand: String,
    val capacity: Int,
    val purchase: Purchase,
)

data class StartChargeCommand(
    val id: String
)

data class ChargingCompleteCommand(
    val id: String,
    val energyAmount: Int,
)
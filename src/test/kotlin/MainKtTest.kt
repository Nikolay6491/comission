import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun moneyTransfer() {
        val transerValue1 = 10_000
        val transerValue2 = 76_000
        val transerValue3 = 590_000
        val transerValue4 = 1_000
        val summOfTransfers = 10_000
        val summOfTransfers2 = 55_000
        val accountTypeVK = "VK Pay"
        val accountTypeMC = "Mastercard"
        val accountTypeMAE = "Maestro"
        val accountTypeVisa = "Visa"
        val accountTypeWorld = "Мир"
        val resultVK10000 = moneyTransfer(transerValue1, summOfTransfers, accountTypeVK)
        val resultVK10000_2 = moneyTransfer(transerValue1, summOfTransfers2, accountTypeVK)
        val resultVK76000 = moneyTransfer(transerValue2, summOfTransfers, accountTypeVK)
        val resultMC10000 = moneyTransfer(transerValue1, summOfTransfers, accountTypeMC)
        val resultMC76000 = moneyTransfer(transerValue2, summOfTransfers, accountTypeMC)
        val resultMC590000 = moneyTransfer(transerValue3, summOfTransfers, accountTypeMC)
        val resultMAE10000 = moneyTransfer(transerValue1, summOfTransfers, accountTypeMAE)
        val resultVisa10000 = moneyTransfer(transerValue1, summOfTransfers, accountTypeVisa)
        val resultVisa590000 = moneyTransfer(transerValue3, summOfTransfers2, accountTypeVisa)
        val resultVisa1000 = moneyTransfer(transerValue4, summOfTransfers, accountTypeVisa)
        val resultWorld10000 = moneyTransfer(transerValue1, summOfTransfers, accountTypeWorld)
        val resultWorld590000 = moneyTransfer(transerValue3, summOfTransfers2, accountTypeWorld)
        val resultWorld1000 = moneyTransfer(transerValue4, summOfTransfers, accountTypeWorld)

        assertEquals("Комиссия 0 копеек", resultVK10000)
        assertEquals("Превышен лимит", resultVK10000_2)
        assertEquals("Превышен лимит", resultVK76000)
        assertEquals("Комиссия 0 копеек", resultMC10000)
        assertEquals("Комиссия 47600.0 копеек", resultMC76000)
        assertEquals("Превышен месячный лимит", resultMC590000)
        assertEquals("Комиссия 0 копеек", resultMAE10000)
        assertEquals("Комиссия 7500.0 копеек", resultVisa10000)
        assertEquals("Комиссия 3 500 копеек", resultVisa1000)
        assertEquals("Превышен месячный лимит", resultVisa590000)
        assertEquals("Комиссия 7500.0 копеек", resultWorld10000)
        assertEquals("Превышен месячный лимит", resultWorld590000)
        assertEquals("Комиссия 3 500 копеек", resultWorld1000)
    }
}
package exc2

fun main() {
    val item1 = Item(1, 3, 6.0, "Barra de Chocolate")
    val item2 = Item(2, 2, 5.0, "Batata Ruffles")
    val item3 = Item(3, 1, 7.5, "Coca-Cola de 350ml")

    val fatura = Fatura()

    fatura.adicionarItens(item1, item2, item3)
    println("Valor total: R$ ${fatura.getTotalFatura()}")
}
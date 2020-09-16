package exc3

fun main() {
    val estoque = Estoque("Teclado", 50, 10)

    estoque.mudarNome("Mouse")
    estoque.mudarQtdMinima(50)
    estoque.repor(50)
    estoque.darBaixa(10)
    println("Precisa repor? ${estoque.precisaRepor()}")
    estoque.mostra()
}
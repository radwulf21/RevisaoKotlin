package exc2

class Fatura {
    val itens = mutableListOf<Item>()
    var valorFatura = 0.0

    fun adicionarItens(vararg itens: Item) {
        this.itens.addAll(itens)
    }

    fun getTotalFatura(): Double {
        itens.forEach {
            this.valorFatura += it.preco * it.quantidade
        }

        return this.valorFatura
    }
}
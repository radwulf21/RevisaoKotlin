package exc2

class Item(numero: Int, quantidade: Int, preco: Double, descricao: String) {
    var numero = 0
    var descricao = ""
    var quantidade = 0
    var preco = 0.0

    init {
        this.numero = numero
        this.descricao = descricao

        if (quantidade < 0) {
            this.quantidade = 0
        } else {
            this.quantidade = quantidade
        }

        if (preco < 0.0) {
            this.preco = 0.0
        } else {
            this.preco = preco
        }
    }
}
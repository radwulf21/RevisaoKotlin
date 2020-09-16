package exc3

class Estoque(nome: String, qtdAtual: Int, qtdMinima: Int) {
    var nome = ""
    var qtdAtual = 0
    var qtdMinima = 0

    init {
        this.nome = nome

        if (qtdAtual < 0) {
            this.qtdAtual = 0
        } else {
            this.qtdAtual = qtdAtual
        }

        if (qtdMinima < 0) {
            this.qtdMinima = 0
        } else {
            this.qtdMinima = qtdMinima
        }
    }

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        if (qtdMinima < 0) {
            println("A quantidade mínima não pode ser negativa!")
        } else {
            this.qtdMinima = qtdMinima
            println("Quantidade mínima alterada para ${this.qtdMinima}!")
        }
    }

    fun repor(qtd: Int) {
        this.qtdAtual += qtd
        println("Quantidade reposta! Quantidade atual: ${this.qtdAtual}.")
    }

    fun darBaixa(qtd: Int) {
        if (qtd > this.qtdAtual) {
            println("Quantidade insuficiente no estoque! Quantidade atual: ${this.qtdAtual}!")
        } else {
            this.qtdAtual -= qtd
            println("O sistema deu baixa! Quantidade atual: ${this.qtdAtual}!")
        }
    }

    fun mostra() {
        println("Nome: ${this.nome}, Quantidade Atual: ${this.qtdAtual}, Quantidade Mínima: ${this.qtdMinima}")
    }

    fun precisaRepor(): Boolean {
        return this.qtdAtual <= this.qtdMinima
    }
}
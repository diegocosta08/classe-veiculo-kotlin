fun main() {
    val veiculo = Veiculo(
        marca = "Volkswagen",
        modelo = "Nivus",
        cor = "Azul",
        placa = "DGO0805",
        tipoCombustivel = "Gasolina",
        quantidadedePortas = 4,
        potencia = 150.0,
        automatico = true
    )

    veiculo.increasespeed()
    println("Velocidade após acelerar: ${veiculo.currentSpeed()} km/h")

    veiculo.reducespeed()
    println("Velocidade após reduzir: ${veiculo.currentSpeed()} km/h")

    veiculo.reducespeed()
    println("Velocidade após reduzir novamente: ${veiculo.currentSpeed()} km/h")
}

class Veiculo(
    var marca: String,
    var modelo: String,
    var cor: String,
    var placa: String,
    var tipoCombustivel: String,
    var quantidadedePortas: Int,
    var potencia: Double,
    var automatico: Boolean
) {
    var longVelocity: Double = 0.0
    var longAcceleration: Double = 10.0

    init {
        println("Veículo modelo $modelo foi criado com sucesso!")

        require(this.quantidadedePortas > 0) {
            "Erro: Um veículo precisa ter pelo menos uma porta."
        }
    }

    fun increasespeed(): Double {
        this.longVelocity += this.longAcceleration
        return this.longVelocity
    }

    fun reducespeed(): Double {
        this.longVelocity -= this.longAcceleration
        if (this.longVelocity < 0) {
            this.longVelocity = 0.0
        }
        return this.longVelocity
    }

    fun currentSpeed(): Double {
        return this.longVelocity
    }
}
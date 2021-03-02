package one.estudoskotlin.digionebank

class Pessoa {
    //propriedades declaradas
    var name: String = "Rafael"
    var  cpf: String = "123.123.123.11"
}

fun main() {
    val p = Pessoa()

    println(p.name)
    println(p.cpf)
}
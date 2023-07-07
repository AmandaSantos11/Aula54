package ex6

fun main() {
    val email = obterEmail()
    val emailValido = validarEmail(email)

    if (emailValido) {
        println("O e-mail é válido.")
    } else {
        println("O e-mail é inválido.")
    }
}
fun obterEmail(): String {
    println("Digite seu e-mail: ")
    return readlnOrNull().orEmpty()
}
fun validarEmail(email: String): Boolean {
    val regex = Regex("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")
    return regex.matches(email)
}

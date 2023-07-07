package ex2


fun main(){
    var companhias = arrayOf<CompanhiaArea>()
    companhias = companhias.plus(CompanhiaArea("Gol",352))
    companhias = companhias.plus(CompanhiaArea("Latam",201))

    CompanhiaArea.obterCompanhia(companhias)


}
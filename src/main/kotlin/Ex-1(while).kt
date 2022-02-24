fun main(){
    var id= 0
    var m21= 0
    var m50= 0
    var cont= 1

    while(id!= -99 && cont in 1..10){
    print("$cont° pessoa digite a sua idade: ")
        id= readLine()!!.toInt()
        cont++
        if (id<21){
            m21++
        }
    if (id>50){
        m50++
    }
    }
    println("\nO total de pessoas com menos de 21 anos é: $m21, " +
            "e com mais de 50 anos é: $m50.")
}
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
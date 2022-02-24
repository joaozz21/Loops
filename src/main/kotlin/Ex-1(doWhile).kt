fun main(){
    var soma=0
    do{
    print("Digite um número: ")
    val num= readLine()!!.toInt()
        soma=num+soma
    }while(num!=0)
    println("\nA soma dos números digitados é igual a: $soma")
}

/*Crie um programa que leia um número do teclado até que encontre um número igual
a zero. No final, mostre a soma dos números digitados.*/
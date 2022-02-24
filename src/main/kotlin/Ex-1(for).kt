fun main(){
    print("Os números de 1000 a 1999 que quando divididos por 11 obtemos " +
            "resto = 5 são: ")
    for(x in 1000..1999){
        val res = x % 11
        if(res == 5 ){
            print("\n$x")
        }
    }
}
/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
resto = 5. (FOR)*/
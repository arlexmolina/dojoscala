import scala.collection.mutable

object holamundo{
    
    //Luego definimos la funcion main de tipo Unit
    def main(args: Array[String]): Unit = {

        println("Hola mundoski!")
        val n = 5

        if (n == 5) {
            print("Sí, n vale 5")
        } else {
            println("Tiene otro valor")
        }

        if (n == 5) {
            print("Sí, n vale 5")
        } else {
            if (n == 6) {
            println("Vale 6")
            } else {
            println("Tiene otro valor")
            }
        }
        if (n == 5) {
            print("Sí, n vale 5")
        } else if (n == 6) {
            println("Vale 6")
        } else {
            println("Tiene otro valor")
        }

        val k = 10
        println(if(k == 10) "k vale 10" else "k no vale 10")

        val valor = 6
        println(valor match {
            case 1 => "Uno"
            case 2 => "Dos"
            case 3 => "Tres"
            case 4 => "Cuatro"
            case 5 => "Cinco"
            case 6 => "Seis"
            //El case _ funciona como un default
            case _ => "Ninguno"
        })

        var kk = 0;

        while (kk < 5) {
        
            //Igual que en java
            println("kk vale " + kk)
            kk = kk + 1
        
        }

        var kkk = 0;

        while (kkk < 5) {
        
            println("kkk vale " + kkk) //Igual que en java
            println(s"kkk vale $kkk") //Interpolación de cadenas
            
            /*Las llaves no son necesarias, pero podemos 
            utilizarlas para evaluar cadenas*/
            println(s"El siguiente es ${kkk + 1}")
            kkk = kkk + 1
        
        }

        var ak = 0;

        do {

            println(s"k vale $ak")

            ak = ak + 1
        } while (ak < 5)

        mutable.Set

        val frutas = Array("Pera", "Manzana", "Naranja")
        println(frutas.length)   //Tamaño => 3
        println(frutas.apply(1)) //Posición => Manzana
        println(frutas(1))       // Otra forma de escribir la posición => Manzana
        println(frutas.isEmpty)  //Si esta vacio => false
        println(frutas.nonEmpty)  //Si no esta vacio => true
        
        println(frutas.indexOf("Pera"))  //Posición de un objeto => 0

        val numeros = List(4, 8, 15, 16, 23, 42);

        //val numeros = List(8, 16, 30 , 32, 46, 84);

        val marcas = List("bmw", "renault", "mazda", "toyota");
        val mayus = marcas.map { x => x.toUpperCase() }
        println(mayus)

        //Tambien podemos hacerlo así, para tomarlos todos
        val allMayus = marcas.map { _.length() }
        println(allMayus)

        val lista = List(List(1,2,6), List(2,3,5))

        //Obtendremos el doble de cada sublista
        println(lista.map{(x: List[Int]) => x.map{ n => n*2}})

        //Resultado
        List(List(2, 4, 12), List(4, 6, 10))

        println(factorial(5))

    }

    def factorial(n: Int): Int = {
        if (n == 0) 
            return 1
        else
            return n * factorial(n-1)
    }
}
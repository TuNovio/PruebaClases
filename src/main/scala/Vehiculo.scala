class Vehiculo(var tipo:String, var costo:Int){
    def darTipo={1
        println(tipo)
    }
    def darCosto={
        println(costo)
    }
    def visualizarV={
        println(s"El tipo de carro es: $tipo con un costo de $costo")
    }    
}

object miVehiculo{
    
    def main(args: Array[String])={
        var mv = new Vehiculo(tipo = "Bus", costo = 120)
        print(mv.darTipo)
    }   
}
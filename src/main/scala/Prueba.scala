/*
para que sea igual que en java se inicia como metodo
los atributos de la clase se pasan como parametros
se inicializan las propiedades de la clase
*/
class Alumno(nombre:String, apellido:String, edad:Int){
    /*
    */
    def visualizar()={
        println("Nombre: " + nombre)
        println("Apellido: " + apellido)
        println("Edad: " + edad)
    }
    /*
    */
    def asignarVehiculo(nTipo:String, nCosto:Int)={
        var mv = new Vehiculo(tipo = nTipo, costo = nCosto)
        print(s"Vehiculo asignado: $nTipo con un costo de: $nCosto")
    }
}
/*
los atributos de la clase se inicializan en el objeto que se crea
nombre es el nombre del alumno 
apellido es el apellido del alumno 
edad es la edad del alumno
*/
object Principal{

    def main(args: Array[String])={
        var miAlumno = new Alumno(nombre = "Alfonso", apellido = "Gomajoa", edad = 21)
        var asignado = miAlumno.asignarVehiculo(nTipo = "Carro particular", nCosto = 500)
        println(asignado)
    }   
}
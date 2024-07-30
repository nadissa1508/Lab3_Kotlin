/**
 * Universidad del Valle de Guatemala
 * Desarrollo de Aplicaciones Móviles
 * 23764, Angie Nadissa Vela López
 * Laboratorio No. 3
 * Sistema de pedidos de comida para un restaurante 
 */

 abstract class Food (val name: String, val price: Double){
	abstract fun cook(): String
}

fun Food.discountedPrice(discount: Double): Double{
    return (price - (price * discount))
    
}

interface Dessert{
    fun eat(): String
}

abstract class Drink (name: String, price: Double): Food(name, price){
	abstract fun pour(): String
}

class Burger(name: String, price: Double) : Food(name, price){
    override fun cook(): String{
        return "Sazonar la carne, luego asar la hamburguesa por ambos lados"
    }
} 

class Pizza (name: String, price: Double) : Food(name, price){
    override fun cook(): String{
        return "Hacer la masa, agregar los toppings y hornear a 260°C por 10 minutos"
    }
} 

class IceCream ( name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String{
        return "Mezclar todos los ingredientes y almacenar durante 4 horas en el congelador, o hacerlo toda una noche"
    }
    
    override fun eat(): String{
        return "Sacar del refrigerador por 10 minutos y servir en un cono"
    }
} 

class Dona (name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String{
        return "Hacer la masa y freir en abundante aceite"
    }
    
    override fun eat(): String{
        return "Decorar con frosting blanco y servir"
    }
} 

class Juice (name: String, price: Double) : Drink(name, price){
    
    override fun cook(): String{
        return "Exprimir 5 naranjas sin que caiga zumo en el jugo"
    }
    
    override fun pour(): String{
        return "Mezclar el jugo, luego verterlo con cuidado dentro de un vaso"
    }
} 

class Limonada (name: String, price: Double) : Drink(name, price){
    
    override fun cook(): String{
        return "Mezclar agua con azucar, exprimir 2 limones frescos y agregar hielo"
    }
    
    override fun pour(): String{
        return "Verter con cuidado dentro de un vaso y agregar una rodaja de limón"
    }
}

fun main() {
    
    println("\nRestaurante el Rincón típico")
    // Instancias de diferentes alimentos
    val burger = Burger("\nHamburguesa Clásica", 50.00)
    val pizza = Pizza("Pizza Margarita", 35.50)
    val iceCream = IceCream("Helado de Vainilla", 15.50)
    val dona = Dona("Dona con frosting", 10.00)
    val juice = Juice("Jugo de Naranja", 15.50)
    val limonada = Limonada("Limonada de fresa", 25.75)

    // Llamar a la función cook() para cada alimento
    println("\nCocinando Burger: ${burger.cook()}")
    println("Cocinando Pizza: ${pizza.cook()}")
    println("Cocinando IceCream: ${iceCream.cook()}")
    println("Cocinando Dona: ${dona.cook()}")
    println("Cocinando Juice: ${juice.cook()}")
    println("Cocinando Limonada: ${limonada.cook()}")

    // Llamar a la función eat() 
    println("\nComiendo IceCream: ${iceCream.eat()}")
    println("Comiendo Dona: ${dona.eat()}")

    // Llamar a la función pour() 
    println("\nVerter Jugo: ${juice.pour()}")
    println("Verter Limonada: ${limonada.pour()}")
    
    // Calcular y mostrar el precio con descuento de la hamburguesa
    val discount = 0.20
    println("\nPrecio original de Burger: ${burger.price}")
    println("Precio con descuento de Burger: ${burger.discountedPrice(discount)}")
}
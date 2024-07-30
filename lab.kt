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

interface Dessert{
    fun eat(): String
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

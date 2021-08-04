package modelo;

public class Venta {

    private Carrito carrito;

    public Venta(Carrito carrito){
        this.carrito = carrito;
    }

    public Carrito getCarrito(){
        return this.carrito;
    }

}
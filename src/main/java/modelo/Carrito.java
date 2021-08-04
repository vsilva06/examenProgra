package modelo;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito(){
        this.productos = new ArrayList<Producto>();
    }

    public void addProducto(Producto producto){
        this.productos.add(producto);
    }

    public void removeProducto(Producto producto){
        for(int i = 0; i < productos.size(); i ++){
            if(producto.toString().equals(productos.get(i).toString())){
                productos.remove(i);
                break;
            }
        }
    }
    public void vaciarCarrito(){
        this.productos = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductos(){
        return this.productos;
    }

}
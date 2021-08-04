package Datos;

import modelo.Producto;
import modelo.Venta;

public class DatosVenta {
    private final String path = "src/main/resources/ventas.txt";
    private final Venta venta;

    public DatosVenta(Venta venta){
        this.venta = venta;

    }

    public void saveVenta(){
        new GestorArchivos().editar(path, getDatos());
    }
    private String getDatos(){
        String datos = getId();
        for(Producto producto : this.venta.getCarrito().getProductos()){
            datos += ";";
            datos += producto.getCodigo();

        }
        return datos;
    }

    private String getId(){
        String id = "0";
        String[] ventas = new GestorArchivos().verArchivo(path).split("\n");

        if(ventas.length == 0){
            return "0";
        }

        String ultimaVenta = ventas[ventas.length-1];
        String lastId = ultimaVenta.split(";")[0];

        try{
            int ultimoId = Integer.parseInt(lastId);
            id = String.valueOf(ultimoId+1);

        }catch(NumberFormatException e){
            e.printStackTrace();
        };

        return id;
    }


}
package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;

    public Producto(String codigo, String nombre,String descripcion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    @Override
    public String toString(){
        return this.codigo+";"+this.nombre+";"+this.descripcion;
    }


}
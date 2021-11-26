package com.pruebalaptop2.troyka.dominio;

public class Laptop {

    private static int cuenta=0;
    private int idcuenta;
    private String marca;
    private String modelo;
    private double precio;

    public Laptop() {
        this.idcuenta= cuenta;
        cuenta++;
}

    public Laptop(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.idcuenta= cuenta;
        cuenta++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Laptop.cuenta = cuenta;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}

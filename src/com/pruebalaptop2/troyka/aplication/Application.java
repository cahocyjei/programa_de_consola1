package com.pruebalaptop2.troyka.aplication;


import com.pruebalaptop2.troyka.dominio.Laptop;

public class Application {
    public static void main(String[] args) {

    Laptop laptop= new Laptop("HP","LN4884",144569);

    Laptop laptop1= new Laptop();
    laptop1.setMarca("Azus");
    laptop1.setModelo("AZ484");
    laptop1.setPrecio(76377287);

    Laptop laptop3= new Laptop("SONY","LN4884",144569);

    Laptop laptop4= new Laptop();
    laptop4.setMarca("UAIO");
    laptop4.setModelo("AZ484");
    laptop4.setPrecio(76377287);


        System.out.println("*************TIENDA LAPTOP2************");
        System.out.println("Cuenta: " + laptop.getIdcuenta() + "-  " + laptop);
        System.out.println("Cuenta: " + laptop1.getIdcuenta() + "-  " + laptop1);
        System.out.println("Cuenta: " + laptop3.getIdcuenta() + "-  " + laptop3);
        System.out.println("Cuenta: " + laptop4.getIdcuenta() + "-  " + laptop4);


    }
}

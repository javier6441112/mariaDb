/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mariadb;

import java.util.Scanner;

/**
 *
 * @author lestu
 */
public class MariaDB {

    Conection Conection = new Conection();

    public void ejecutable() {
        Scanner sp = new Scanner (System.in);
        int id;
        System.out.println("ingrese el id para realizar las busquedas");
        id = sp.nextInt();
        Conection.findfactura(id);
    }

    public static void main(String[] args) {
        MariaDB ej = new MariaDB();
        ej.ejecutable();
    }
}

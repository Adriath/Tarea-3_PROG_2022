/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema3;

import java.util.Scanner;

/**
 * 
 * @author Adrián Arjona
 */
public class CoheteEspacial {
// Francisco Adrián Arjona Bravo - TEMA 3
    
    // DECLARACIÓN VARIABLES DE CLASE
    
     // Constantes que nos servirán para controlar ciertas funcionalidades.
    
    static final float GRAVEDAD = 9.81f ;
    static final float PI = 3.1416f ;
    static final int MAX_ETAPAS = 5 ; // Nümero máximo de etapas que puede tener un cohete.
    static final int MIN_ETAPAS = 1 ; // Nümero mínimo de etapas que puede tener un cohete.
    
     // Variable estática que se irá incrementando ocn la creación de cada cohete.
    
    private static int contadorCohetes ;
    
    private String denominacion ; // Nombre y modelo del cohete
    private String agenciaEspacial ; // Nombre de la agencia
    private float altura ; // En metros
    private float diametro ; // En metros
    private int masa ; // En kg.
    private int etapas ; // Número de etapas de un cohete
    private boolean reutilizable ; // Indica si el cohete es o no reutilizable

    
    // CONSTRUCTORES
    
    public CoheteEspacial() { // Constructor por defecto
        
        // Inicializamos el cohete con valores por defecto.
        
        this.denominacion = "S/N" ;
        this.agenciaEspacial = "S/N" ;
        this.altura = 0 ;
        this.diametro = 0 ;
        this.masa = 0 ;
        this.etapas = 1 ;
        this.reutilizable = false ;
        boolean reutilizable = true ;
    }

    public CoheteEspacial(String denominacion, String agenciaEspacial, float altura, float diametro, int masa, int etapas, boolean reutilizable) { // Constructor con parámetros
        
        // Inicializamos el cohete con valores que se pasen al crear el objeto.
        
        this.denominacion = denominacion;
        this.agenciaEspacial = agenciaEspacial;
        this.altura = altura;
        this.diametro = diametro;
        this.masa = masa;
        this.etapas = etapas;
        this.reutilizable = reutilizable;
    }
    
    // GETTERS & SETTERS
    
        // Denominación

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    
        // Agencia espacial

    public String getAgenciaEspacial() {
        return agenciaEspacial;
    }

    public void setAgenciaEspacial(String agenciaEspacial) {
        this.agenciaEspacial = agenciaEspacial;
    }
    
        // Altura

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
        // Diámetro

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    
        // Masa

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
    
        // Etapas

    public int getEtapas() {
        return etapas;
    }
    
    public void setEtapas(int etapas) {
        
        /* En este método nos aseguramos de que un cohete nunca pueda tener un 
        númerode etapas no permitido, tiene que estar entre mínimo y máximo
        */
        
        if (etapas >= MIN_ETAPAS) // Si el parámetro etapas introducido es mayor o igual que el mínimo establecido
        {
            if (etapas > MAX_ETAPAS) // Si el parámetro introducido es mayor al máximo establecido
            {
                this.etapas = MAX_ETAPAS ; // El número de estapas será igual al máximo establecido
            }
            else
            {
                this.etapas = etapas ; // El parámetro etapas será igual a la variable etapas
            }
        }
        else
        {
            this.etapas = MIN_ETAPAS ; // La variable etapas será igual al mínimo establecido
        }
    }

        // Reutilizable
    
    public boolean isReutilizable() {
        return reutilizable;
    }

    public void setReutilizable(boolean reutilizable) {
        this.reutilizable = reutilizable;
    }
    
    // TO STRING

    @Override
    public String toString() {
        return "CoheteEspacial{" + "denominacion=" + denominacion + 
                ", agenciaEspacial=" + agenciaEspacial + 
                ", altura=" + altura + ", diametro=" + diametro + 
                ", masa=" + masa + ", etapas=" + etapas + 
                ", reutilizable=" + reutilizable + '}';
    }
    
    public static void main(String[] args) {
        
        // Mensaje de bienvenida por consola
        
        System.out.println("Bienvenido/a al programa de la clase Cohete Espacial "
                + "de Francisco Adrián Arjona Bravo");
        
        // Creación de objeto
        
        CoheteEspacial miCohete = new CoheteEspacial() ;
        
        // Solicitud al usuario de valores para el objeto
        
        Scanner entrada = new Scanner (System.in); // Creación de la clase Scanner
        
        System.out.println("Por favor, introduce un nombre para el cohete: "); // Pedimos el dato al usuario
        
        String strDenominacionCohete = entrada.nextLine() ; // Almacenamos el dato que introduzca el usuario por consola...
        miCohete.setDenominacion(strDenominacionCohete); // ...y lo asignamos al objeto.
        
        System.out.println("Nombre: " + miCohete.getDenominacion()); // Mostramos por pantalla el nombre.
        
            // Hacemos lo mismo con la agencia espacial.
        
        System.out.println("Introduce ahora el nombre de la agencia espacial: ");
        
        String strAgenciaEspacial = entrada.nextLine() ;
        miCohete.setAgenciaEspacial(strAgenciaEspacial) ;
        
        System.out.println("Estación espacial: " + miCohete.getAgenciaEspacial());

        System.out.println("Una pequeña prueba hecha en remoto");
    }
}

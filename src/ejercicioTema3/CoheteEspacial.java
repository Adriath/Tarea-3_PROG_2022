/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema3;

import java.util.Scanner;

/**
 * 
 * @author Adri�n Arjona
 */
public class CoheteEspacial {
// Francisco Adri�n Arjona Bravo - TEMA 3
    
    // ------------ EJERCICIO 1 ------------
        /* Creaci�n de proyecto, paquete, clase y recoger datos por teclado */
    
    // DECLARACI�N VARIABLES DE CLASE
    
     // Constantes que nos servir�n para controlar ciertas funcionalidades.
    
    static final float GRAVEDAD = 9.81f ;
    static final float PI = 3.1416f ;
    static final int MAX_ETAPAS = 5 ; // N�mero m�ximo de etapas que puede tener un cohete.
    static final int MIN_ETAPAS = 1 ; // N�mero m�nimo de etapas que puede tener un cohete.
    
     // Variable est�tica que se ir� incrementando ocn la creaci�n de cada cohete.
    
    private static int contadorCohetes ;
    
     // Resto de variables
    private String denominacion ; // Nombre y modelo del cohete
    private String agenciaEspacial ; // Nombre de la agencia
    private float altura ; // En metros
    private float diametro ; // En metros
    private int masa ; // En kg.
    private int etapas ; // N�mero de etapas de un cohete
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
        
        // APARTADO J
        
            // A�ado contador
            
            contadorCohetes++ ;
    }

    public CoheteEspacial(String denominacion, String agenciaEspacial, float altura, float diametro, int masa, int etapas, boolean reutilizable) { // Constructor con par�metros
        
        // Inicializamos el cohete con valores que se pasen al crear el objeto.
        
        this.denominacion = denominacion;
        this.agenciaEspacial = agenciaEspacial;
        this.altura = altura;
        this.diametro = diametro;
        this.masa = masa;
        this.etapas = etapas;
        this.reutilizable = reutilizable;
        
          // APARTADO J
        
            // A�ado contador
            
            contadorCohetes++ ;
    }
    
    // GETTERS & SETTERS
    
        // Denominaci�n

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
    
        // Di�metro

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
        
        /* En este m�todo nos aseguramos de que un cohete nunca pueda tener un 
        n�merode etapas no permitido, tiene que estar entre m�nimo y m�ximo
        */
        
        if (etapas >= MIN_ETAPAS) // Si el par�metro etapas introducido es mayor o igual que el m�nimo establecido
        {
            if (etapas > MAX_ETAPAS) // Si el par�metro introducido es mayor al m�ximo establecido
            {
                this.etapas = MAX_ETAPAS ; // El n�mero de estapas ser� igual al m�ximo establecido
            }
            else
            {
                this.etapas = etapas ; // El par�metro etapas ser� igual a la variable etapas
            }
        }
        else
        {
            this.etapas = MIN_ETAPAS ; // La variable etapas ser� igual al m�nimo establecido
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
    
    
    // ------------ EJERCICIO 4 ------------
        /* Creaci�n del m�todo public float calcularVolumen(). */
    
    public float calcularVolumen(){
        float volumen = (this.altura) * (this.diametro / 2) * (CoheteEspacial.PI) ;
        return volumen ;
    }
    
    // ------------ EJERCICIO 5 ------------
        /* Creaci�n del m�todo sumarEtapas. */
    
    public int sumarEtapas(CoheteEspacial c) {
        
        int suma = this.etapas + c.etapas ;
        return suma ;
    }
    
    
    // ------------ EJERCICIO 2 ------------
        /* Creaci�n del main, lectura de datos y asignaci�n de atributos. */
    
    
    // -----------------------------------------------------------------------
    // ------------------------- M�TODO MAIN ---------------------------------
    // -----------------------------------------------------------------------
    
    public static void main(String[] args) {
        
       // Mensaje de bienvenida por consola
        
        System.out.println("Bienvenido/a al programa de la clase Cohete Espacial "
                + "de Francisco Adri�n Arjona Bravo");
        
        // Creaci�n de objeto
        
        CoheteEspacial miCohete = new CoheteEspacial() ;
        
        // Solicitud al usuario de valores para el objeto
        
        Scanner entrada = new Scanner (System.in); // Creaci�n de la clase Scanner
        
        System.out.println("Por favor, introduce un nombre para el cohete: "); // Pedimos el dato al usuario
        
        String strDenominacionCohete = entrada.nextLine() ; // Almacenamos el dato que introduzca el usuario por consola...
        miCohete.setDenominacion(strDenominacionCohete); // ...y lo asignamos al objeto.
        
        System.out.println("Nombre: " + miCohete.getDenominacion()); // Mostramos por pantalla el nombre.
        
            // Hacemos lo mismo con la agencia espacial.
        
        System.out.println("Introduce ahora el nombre de la agencia espacial: ");
        
        String strAgenciaEspacial = entrada.nextLine() ;
        miCohete.setAgenciaEspacial(strAgenciaEspacial) ;
        
        System.out.println("Estaci�n espacial: " + miCohete.getAgenciaEspacial());
        
        // ------------ EJERCICIO 3 ------------
            /* Pedir resto de datos y mostrarlos con toString. */
        
        // Pedimos todos los datos para luego mostrarlos a la vez con toString()
        
        System.out.println("Vamos a dise�ar el cohete espacial. Por favor, introduce el nombre: ");
        miCohete.setDenominacion(entrada.nextLine());
        
        System.out.println("�Cu�l es la agencia espacial?");
        miCohete.setAgenciaEspacial(entrada.nextLine());
        
        System.out.println("Introduce la altura en metros: ");
        miCohete.setAltura(entrada.nextFloat());
        
        System.out.println("Ahora el di�metro: ");
        miCohete.setDiametro(entrada.nextFloat());
        
        System.out.println("Introdcue la masa del cohete en kg: ");
        miCohete.setMasa(entrada.nextInt());
        
        System.out.println("�Cu�ntas etapas tendr�? (entre 1 y 5)");
        miCohete.setEtapas(entrada.nextInt());
        
        System.out.println("�Es reutilizable? (true = s� / false = no)");
        miCohete.setReutilizable(entrada.nextBoolean());
        
        System.out.println(miCohete.toString());
        
        
        // ------------ EJERCICIO 6 ------------
            /* Comprobaci�n de la comprensi�n y funcionamiento del programa y 
            uso de constantes y variables est�ticas. */
            
            // Creaci�n de un objeto con el constructor por defecto
            
            CoheteEspacial defectoEjercicio6 = new CoheteEspacial() ;
            
            // Muestra por pantalla con toString()
            
            System.out.println(defectoEjercicio6.toString());
        
            
            // APARTADO A
            
                // Creamos 3 objetos con el constructor con par�metros
                
                CoheteEspacial cohete1 = new CoheteEspacial("Ariane 5", "ESA", 59f, 5.4f, 777000, 2, false) ;
                CoheteEspacial cohete2 = new CoheteEspacial("Saturno V", "NASA", 110.6f, 10.1f, 2970000, 3, false) ;
                CoheteEspacial cohete3 = new CoheteEspacial("Falcon 9", "SpaceX", 70f, 3.66f, 549054, 2, true) ;

            // APARTADO B
            
                // Mostramos los datos de los tres objetos con toString()
                
                System.out.println(cohete1.toString());
                System.out.println(cohete2.toString());
                System.out.println(cohete3.toString());
                
            // APARTADO C
            
                // Cambiamos algunas propiedades
                
                    // Cohete 1
                    cohete1.setAltura(47f); // La altura
                    cohete1.setMasa(541000); // La masa
                    // Cohete 2
                    cohete2.setDenominacion("Prototipo"); // El nombre (denominaci�n)
                    cohete2.setReutilizable(true); // Si reutilizable
                    // Cohete 3
                    cohete3.setMasa(6788000); // La masa
                    cohete3.setAgenciaEspacial("ACME"); // La agencia espacial
                    
            // APARTADO D
                    
                // Los mostramos por pantalla con toSring() para ver los cambios
                
                System.out.println("\nAhora con los cambios aplicados: \n");
                
                System.out.println(cohete1.toString());
                System.out.println(cohete2.toString());
                System.out.println(cohete3.toString());
                    
                
            // APARTADO E
            
                // Creo un objeto (cohete) inventado y lo muestro con toString()
                
                CoheteEspacial cohete4 = new CoheteEspacial("Pepinorion", "Ciudad Real", 130f, 78f, 34343432, 1, true) ;
                System.out.println("\n" + cohete4.toString());
                
            // APARTADO F
            
                // Modifico valores del cohete reci�n creado y muestro cambios con toString()
                
                cohete4.setDenominacion("Mazinger Peta"); // Nombre (denominaci�n)
                cohete4.setAgenciaEspacial("Petardos Paco S.A."); // Agencia espacial
                cohete4.setAltura(370f); // Altura
                cohete4.setDiametro(139.98f); // Di�metro
                cohete4.setMasa(940005); // Peso
                cohete4.setEtapas(5); // Etapas
                cohete4.setReutilizable(false); // Si reutilizable
                
                System.out.println("\nCambios aplicados: ");
                System.out.println(cohete4.toString());
                
            // APARTADO H
            
                // Mostramos por pantalla la suma de las etapas de los cohetes 1 y 3
                
                System.out.println("\nLa suma de etapas de " + cohete1.getDenominacion() +
                        " y " + cohete3.getDenominacion() + 
                        " es: " + cohete1.sumarEtapas(cohete3));
                
            // APARTADO I
            
                //Mostramos por pantalla el volumen de uno de los cohetes (cohete 4)
            
                System.out.println("\nEl volumen del cohete " + cohete4.getDenominacion() + 
                        " es: " + cohete4.calcularVolumen());
                
            // APARTADO K
            
                // Cambiamos el valor de etapas a 10 en el cohete 1 y lo mostramos. Deber�a dar 5
                
                cohete1.setEtapas(10);
                System.out.println("\n" + cohete1.toString());
                
            // APARTADO L
            
                // Realizamos lo mismo en cohete 2. El resultado deber�a ser 1
                
                cohete2.setEtapas(-1);
                System.out.println("\n" + cohete2.toString());
    }
   
}

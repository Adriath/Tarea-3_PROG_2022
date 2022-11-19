/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema3;

/**
 * 
 * @author Adrián Arjona
 */
public class CoheteEspacial {
    // Francisco Adrián Arjona Bravo - TEMA 3
    
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
    
    
}

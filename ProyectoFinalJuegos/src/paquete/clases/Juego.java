/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public abstract class Juego 
{
    protected String nombreJugador;
    protected int codigoJugador;
    protected boolean juegoTerminado;
    protected int numeroAcierto;
    protected int numeroError;
    protected int puntajeTotal;
    protected ArrayList<SistemaOperativoCompatible> arreglo;

    public Juego() 
    {
        System.out.println("Ingresar nombre del jugador: ");
        Scanner sc = new Scanner(System.in);
        this.nombreJugador = sc.next();
        this.numeroAcierto = 0;
        this.numeroError = 0;
        this.puntajeTotal = 0;
        this.arreglo = new ArrayList<SistemaOperativoCompatible>();
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getCodigoJugador() {
        return codigoJugador;
    }

    public void setCodigoJugador(int codigoJugador) {
        this.codigoJugador = codigoJugador;
    }

    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }

    public void setJuegoTerminado(boolean juegoTerminado) {
        this.juegoTerminado = juegoTerminado;
    }

    public int getNumeroAcierto() {
        return numeroAcierto;
    }

    public void setNumeroAcierto(int numeroAcierto) {
        this.numeroAcierto = numeroAcierto;
    }

    public int getNumeroError() {
        return numeroError;
    }

    public void setNumeroError(int numeroError) {
        this.numeroError = numeroError;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public ArrayList<SistemaOperativoCompatible> getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArrayList<SistemaOperativoCompatible> arreglo) {
        this.arreglo = arreglo;
    }
    
    public void GenerarCodigoJugador()
    {
        Random rand = new Random();
        this.codigoJugador = rand.nextInt(5000-1000+1)+1000;
    }
    
    public void AgregarSOCompatible(SistemaOperativoCompatible ref)
    {
        arreglo.add(ref); 
    }
    
    public String MostrarSOCompatible()
    {
        String cad = "";
        Iterator<SistemaOperativoCompatible> puntero = arreglo.iterator();
        while (puntero.hasNext())
        {
            SistemaOperativoCompatible aux = puntero.next();
            cad = cad + aux.VerInfo() + "\n";
        }
        return cad;
    }
   
    public abstract void IniciarJuego();
    public abstract void CalcularPuntajeTotal();

    public String VerInfo() 
    {
        return "Nombre de Jugador: " + nombreJugador + 
                "\nCodigo de Jugador: " + codigoJugador + 
                "\nNumero de Aciertos: " + numeroAcierto + 
                "\nNumero de Errores: " + numeroError + 
                "\nPuntaje Total: " + puntajeTotal;
    }   
}

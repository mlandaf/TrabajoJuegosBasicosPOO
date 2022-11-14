/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import paquete.clases.*;
import paquete.gestion.*;

/**
 *
 * @author usuario
 */
public class Prueba 
{
    public static void main(String[] args) 
    {
        //SISTEMA OPERATIVO COMPATIBLE
        SistemaOperativoCompatible objSOC = new SistemaOperativoCompatible("Windows",10);
        SistemaOperativoCompatible objSOC1 = new SistemaOperativoCompatible("Ubuntu",20.04f);
        SistemaOperativoCompatible objSOC2 = new SistemaOperativoCompatible("Android",11);
        SistemaOperativoCompatible objSOC3 = new SistemaOperativoCompatible("iOS",15.6f);
        SistemaOperativoCompatible objSOC4 = new SistemaOperativoCompatible("Mac OS",12.3f);
        ///////////////////////////////////////////////////////////////////////////////////////////
        
        //AHORCADO
        Ahorcado objA = new Ahorcado("Pedro");
        objA.AgregarSOCompatible(objSOC);
        objA.AgregarSOCompatible(objSOC1);
        objA.AgregarSOCompatible(objSOC2);
        objA.AgregarSOCompatible(objSOC3);
        objA.AgregarSOCompatible(objSOC4);
        objA.GenerarCodigoJugador();
        objA.GenerarAhorcado();
        objA.IniciarJuego();
        objA.CalcularPuntajeTotal();
        System.out.println(objA.VerInfo());
        System.out.println("\n");
        ////////////////////////////////////////////////////
        Ahorcado objA1= new Ahorcado("Ana");
        objA1.AgregarSOCompatible(objSOC);
        objA1.AgregarSOCompatible(objSOC1);
        objA1.AgregarSOCompatible(objSOC2);
        objA1.AgregarSOCompatible(objSOC3);
        objA1.AgregarSOCompatible(objSOC4);
        objA1.GenerarCodigoJugador();
        objA1.GenerarAhorcado();
        objA1.IniciarJuego();
        objA1.CalcularPuntajeTotal();
        System.out.println(objA1.VerInfo());
        System.out.println("\n");
        ////////////////////////////////////////////////////
        
        //ADIVINANZA
        Adivinanza objAD = new Adivinanza ("Pepe");
        objAD.AgregarSOCompatible(objSOC);
        objAD.AgregarSOCompatible(objSOC1);
        objAD.AgregarSOCompatible(objSOC2);
        objAD.AgregarSOCompatible(objSOC3);
        objAD.AgregarSOCompatible(objSOC4);
        objAD.GenerarCodigoJugador();
        objAD.IniciarJuego();
        objAD.CalcularPuntajeTotal();
        System.out.println(objAD.VerInfo());
        System.out.println("\n");
        ////////////////////////////////////////////////////
        Adivinanza objAD1 = new Adivinanza ("Andrea");
        objAD1.AgregarSOCompatible(objSOC);
        objAD1.AgregarSOCompatible(objSOC1);
        objAD1.AgregarSOCompatible(objSOC2);
        objAD1.AgregarSOCompatible(objSOC3);
        objAD1.AgregarSOCompatible(objSOC4);
        objAD1.GenerarCodigoJugador();
        objAD1.IniciarJuego();
        objAD1.CalcularPuntajeTotal();
        System.out.println(objAD1.VerInfo());
        System.out.println("\n");
        ////////////////////////////////////////////////////
        
        //JUEGO MATEMATICO
        JuegoMatematico objJM = new JuegoMatematico("Juan");
        objJM.AgregarSOCompatible(objSOC);
        objJM.AgregarSOCompatible(objSOC1);
        objJM.AgregarSOCompatible(objSOC2);
        objJM.AgregarSOCompatible(objSOC3);
        objJM.AgregarSOCompatible(objSOC4);
        objJM.GenerarCodigoJugador();
        objJM.IniciarJuego();
        objJM.CalcularPuntajeTotal();
        System.out.println(objJM.VerInfo());
        System.out.println("\n");
        ////////////////////////////////////////////////////
        JuegoMatematico objJM1 = new JuegoMatematico("Ximena");
        objJM1.AgregarSOCompatible(objSOC);
        objJM1.AgregarSOCompatible(objSOC1);
        objJM1.AgregarSOCompatible(objSOC2);
        objJM1.AgregarSOCompatible(objSOC3);
        objJM1.AgregarSOCompatible(objSOC4);
        objJM1.GenerarCodigoJugador();
        objJM1.IniciarJuego();
        objJM1.CalcularPuntajeTotal();
        System.out.println(objJM1.VerInfo());
        System.out.println("\n");
        
        //EXTRA
        JuegoMatematico objExtra = new JuegoMatematico("Luisa");
        objExtra.AgregarSOCompatible(objSOC);
        objExtra.AgregarSOCompatible(objSOC1);
        objExtra.AgregarSOCompatible(objSOC2);
        objExtra.AgregarSOCompatible(objSOC3);
        objExtra.AgregarSOCompatible(objSOC4);
        objExtra.GenerarCodigoJugador();
        objExtra.IniciarJuego();
        objExtra.CalcularPuntajeTotal();
        System.out.println(objExtra.VerInfo());
        System.out.println("\n");
        ////////////////////////////////////////////////////
        
        //ARREGLO DE OBJETOS
        GestionJuego refGJ = new GestionJuego();
        refGJ.Ingresar(objA);
        refGJ.Ingresar(objA1);
        refGJ.Ingresar(objAD);
        refGJ.Ingresar(objAD1);
        refGJ.Ingresar(objJM);
        refGJ.Ingresar(objJM1);
        refGJ.AgregarEnCualquierPosicion(3, objExtra);
        System.out.println("\n");
        refGJ.BuscarPorNombre();
        refGJ.MayorPuntajeTotal();
        System.out.println("\n");
        refGJ.EliminarDeArreglo();
        System.out.println(refGJ.VerInfo());
        ////////////////////////////////////////////////////
    }
}

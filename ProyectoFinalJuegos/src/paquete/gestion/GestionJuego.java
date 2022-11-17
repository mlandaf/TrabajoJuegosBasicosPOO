/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import java.util.Scanner;
import paquete.clases.*;

/**
 *
 * @author usuario
 */
public class GestionJuego 
{
    private Juego[] arreglo;
    private int conta;

    public GestionJuego()
    {
        arreglo = new Juego[100];
        conta = 0;
    }

    public Juego[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Juego[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public void Ingresar(Juego ref)
    {
        if (conta<arreglo.length)
        {
            arreglo[conta] = ref;
            conta ++;
        }
        else
        {
            System.out.println("No hay mas espacio");
        }
    }
    
    public void BuscarPorNombre()
    {
        System.out.println("Escriba el nombre a buscar: ");
        String nombreBuscar;
        Scanner sc = new Scanner(System.in);
        nombreBuscar = sc.next();
        
        boolean encontro = false;
        for (int i=0; i<conta; i++)
        {
            if(arreglo[i].getNombreJugador().equalsIgnoreCase(nombreBuscar))
            {
                System.out.println(arreglo[i].VerInfo());
                encontro = true;
            }
        }
        if (encontro == false)
        {
            System.out.println("No se encontro el nombre "+ nombreBuscar);
        }
    }
    
    public void AgregarEnCualquierPosicion(Juego referencia)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posicion en la que desee agregar los datos del jugador extra: ");
        System.out.println("¡Recuerde no exceder el tamaño!");
        int posicion = sc.nextInt();
        if (conta<arreglo.length)
        {
            if (posicion<conta)
            {
                for (int i=conta-1; i>=posicion; i--)
                {
                    arreglo[i+1] = arreglo[i];  
                }
                arreglo[posicion] =  referencia;
                conta++;          
            }
            else
            {
            System.out.println("La posicion ingresada excede el tamaño del arreglo");
            }    
        }
        else
        {
            System.out.println("No hay espacio");
        }
    }
    
    public void EliminarDeArreglo()
    {
        System.out.println("Escriba el nombre que desee eliminar del arreglo: ");
        String nombreEliminar;
        Scanner sc = new Scanner(System.in);
        nombreEliminar = sc.next();
        for (int i=0; i<conta; i++)
        {
            if(arreglo[i].getNombreJugador().equalsIgnoreCase(nombreEliminar))
            {
                for (int j = i; j<conta-1; j++) 
                {                               
                    arreglo[j]=arreglo[j+1];
                }
                arreglo[conta-1] = null;
                conta--;
            }
        }
    }
    
    public void MayorPuntajeTotal()
    {
        int max=0;
        for(int i=0; i<conta;i++)
        {
            if(arreglo[i].getPuntajeTotal()>max)
            {
            max=arreglo[i].getPuntajeTotal();
            }
        }
        for(int i=0;i<conta;i++)
        {
            if(arreglo[i].getPuntajeTotal()==max)
            {
            System.out.println("\n\nEL QUE TIENE MAYOR PUNTAJE ES:\n"
                    +arreglo[i].VerInfo());
            }
        } 
    }
    
    public String VerInfo()
    {
        System.out.println("La Lista los Sistemas Operativos Compatibles y todos los jugadores es: ");
        String cad = arreglo[0].MostrarSOCompatible();
        for(int i=0;i<conta;i++)
        {
            cad = cad + "\n" + arreglo[i].VerInfo() + "\n\n";
        }
        return cad;  
    }
}


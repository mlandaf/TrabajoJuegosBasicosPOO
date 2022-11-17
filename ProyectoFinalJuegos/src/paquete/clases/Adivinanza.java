/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;
import java.util.Scanner;
public class Adivinanza extends Juego implements Constantes02
{
    private int responnde;

    public Adivinanza() 
    {
        super();
    }

    public int getResponnde() {
        return responnde;
    }

    public void setResponnde(int responnde) {
        this.responnde = responnde;
    }

    @Override
    public void IniciarJuego() 
    {
        //advinanzas 
        this.juegoTerminado = false;
        while (this.juegoTerminado==false)
        {
            System.out.println("¡Bienvenid@ "+ this.nombreJugador + " al juego de las adivinanzas!");
            System.out.println("pregunta 1:"+ 
                    "¿Qué cosa es que cuanto más le quitas más grande es?");
            System.out.println("alternativas:\n"+"1)un agujero 2)el planeta 3)la vida"+"\nelige");
            Scanner sc = new Scanner(System.in);
            this.responnde= sc.nextInt();
            if(this.responnde==1)
            {
                System.out.println("bien hecho!!!\n"+
                        "------------------------------------------------"+"\n");
                this.numeroAcierto++;
            }
            else if(this.responnde==2 || this.responnde==3)
            {
                System.out.println("ERROR,suerte para la proxima"+
                        "\n respuesta correcta = un agujero\n"+
                        "------------------------------------------------"+"\n");
                this.numeroError++;
            }
            //adivinanzas 2
            System.out.println("pregunta 2:"+ 
                    "¿Qué es lo que se hace de noche, que no se puede hacer de día?");
            System.out.println("alternativas: \n"
                    +"1)Dormir 2)Trabajar 3)Trasnocharse"+"\nelige");
            Scanner sc2 = new Scanner(System.in);
            this.responnde= sc2.nextInt();
            if(this.responnde==3)
            {
                this.numeroAcierto++;
                System.out.println("Fantastico!!!\n"+
                        "------------------------------------------------"+"\n");
            }
            else if(this.responnde==1 || this.responnde==2)
            {
                System.out.println("MAL , NO LLORES"+
                        "\n respuesta correcta = trasnocharse\n"+
                        "------------------------------------------------"+"\n");
                this.numeroError++;
            }
            //adivinanzas 3
        
            System.out.println("pregunta 3:"+
                    "¿Qué hace un mentiroso cuando está muerto?");
            System.out.println("alternativas:\n"+
                    "1)Se muere 2)Se calla 3)se tira"+"\nelige");
            Scanner sc3 = new Scanner(System.in);
            this.responnde= sc3.nextInt();
            if(this.responnde==2)
            {
                this.numeroAcierto++;
                System.out.println("Inteligente!!!\n"+
                        "------------------------------------------------"+"\n");
            }
            else if(this.responnde==1 || this.responnde==3)
            {
                System.out.println("INCORRECTO, TU PUEDES!!!"+
                        "\n respuesta correcta = se calla\n"+
                        "------------------------------------------------"+"\n");
                this.numeroError++;
            }
            //adivinanza 4
                
            System.out.println("pregunta 4:"+ "Puede ser cruel, poético o ciego."+
            "Pero cuando no existe, la violencia se libera.");
            System.out.println("alternativas:\n"+
                    "1)un persona 2)la moral 3)la justicia"+"\nelige");
            Scanner sc4 = new Scanner(System.in);
            this.responnde= sc4.nextInt();
            if(this.responnde==3)
            {
                this.numeroAcierto++;
                System.out.println("BRILLANTE!!!\n"+
                        "------------------------------------------------"+"\n");
            }
            else if(this.responnde==1 || this.responnde==2)
            {
                System.out.println("TERRIBLE,SIGE INTENTANDO!!!"+
                        "\n respuesta correcta = la justicia\n"+
                        "------------------------------------------------"+"\n");
                this.numeroError++;
            }
            //adivinanza 5
                
            System.out.println("pregunta 5:"+ "¿Cómo se llama un perro que tiene fiebre?");
            System.out.println("alternativas.\n"+"1)hot dog 2)firulais 3)pirexia");
            Scanner sc5 = new Scanner(System.in);
            this.responnde= sc5.nextInt();
            if(this.responnde==1)
            {
                this.numeroAcierto++;
                System.out.println("ESPLENDIDO!!!\n"+
                        "------------------------------------------------"+"\n");
            }
            else if(this.responnde==2 || this.responnde==3)
            {
                System.out.println("TERRIBLE,ME DECEPCIONAS!!!"+
                        "\n respuesta correcta =hot dog \n"+
                        "------------------------------------------------"+"\n");
                this.numeroError++;
            }
            this.juegoTerminado = true;
        }
    }

    @Override
    public void CalcularPuntajeTotal() 
    {
        this.puntajeTotal = (this.numeroAcierto * VALOR_ACIERTO) - (this.numeroError * VALOR_ERROR) + VALOR_ACIERTO;
        if (this.puntajeTotal<0)
        {
            this.puntajeTotal = 0;
        }
    }

    @Override
    public String VerInfo() 
    {
        return super.VerInfo();
    }

}
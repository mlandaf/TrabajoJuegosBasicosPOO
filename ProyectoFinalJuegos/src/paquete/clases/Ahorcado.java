/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ahorcado extends Juego implements Constantes01 , Constantes02
{
    private String[] animaldomestico = {"perro","gato","conejo","hamster","cuy","tortuga","oveja","raton","cerdo","loro"};
    private String palabraSecreta;
    private int numPalabraSecreta;
    private char[] guionPalabraSecreta;
    private char[] charPalabraSecreta;
    private boolean acertado;
    private int vidaTemp;
    private boolean ganar;

    public Ahorcado() 
    {
        super();
    }

    public String[] getAnimaldomestico() {
        return animaldomestico;
    }

    public void setAnimaldomestico(String[] animaldomestico) {
        this.animaldomestico = animaldomestico;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getNumPalabraSecreta() {
        return numPalabraSecreta;
    }

    public void setNumPalabraSecreta(int numPalabraSecreta) {
        this.numPalabraSecreta = numPalabraSecreta;
    }

    public char[] getGuionPalabraSecreta() {
        return guionPalabraSecreta;
    }

    public void setGuionPalabraSecreta(char[] guionPalabraSecreta) {
        this.guionPalabraSecreta = guionPalabraSecreta;
    }

    public char[] getCharPalabraSecreta() {
        return charPalabraSecreta;
    }

    public void setCharPalabraSecreta(char[] charPalabraSecreta) {
        this.charPalabraSecreta = charPalabraSecreta;
    }

    public boolean isAcertado() {
        return acertado;
    }

    public void setAcertado(boolean acertado) {
        this.acertado = acertado;
    }

    public int getVidaTemp() {
        return vidaTemp;
    }

    public void setVidaTemp(int vidaTemp) {
        this.vidaTemp = vidaTemp;
    }

    public boolean isGanar() {
        return ganar;
    }

    public void setGanar(boolean ganar) {
        this.ganar = ganar;
    }
    

    public void GenerarAhorcado()
   {
       //ELEGIR PALABRA SECRETA
       Random rand = new Random();
       int numeroAuxiliar = rand.nextInt(animaldomestico.length);
       this.palabraSecreta = this.animaldomestico[numeroAuxiliar];
       //CON ESTA VARIABLE SE COMPARA AL FINAL SI SE GANO EL JUEGO
       this.charPalabraSecreta = this.palabraSecreta.toCharArray();
       
       //LONGITUD DE LA PALABRA SECRETA
       this.numPalabraSecreta = this.palabraSecreta.length();
       
       //TOTAL DE GUIONES DE LA PALABRA SECRETA
       this.guionPalabraSecreta = new char [this.numPalabraSecreta];
       //GENERAR UN ARRAY DE CHARS CON GUIONES DEL TAMAÑO DE LA PALABRA SECRETA
       for (int i=0; i<this.guionPalabraSecreta.length;i++)
       {
           this.guionPalabraSecreta[i] = '_';
       } 
   }
   
    @Override
    public void IniciarJuego() 
    {
        this.vidaTemp = VIDA_TOTAL;
        
       this.ganar = false;
       System.out.println("\n¡Bienvenido/a " + this.nombreJugador + " al juego del AHORCADO!" +  
               "\nEn este juego usted intentara adivinar un animal domestico" + 
               "\nLe quedan " + this.vidaTemp + " vidas" +
               "\nEl animal domestico tiene el siguiente numero de caracteres: " + this.numPalabraSecreta +
               "\n¡Recuerde escribir las letras en minusculas!");
       this.juegoTerminado = false;
       //BUCLE DEL JUEGO HASTA QUE JUEGO TERMINADO NO SEA TRUE EL JUEGO NO ACABA
       while (this.juegoTerminado == false)
       {
           System.out.println(this.guionPalabraSecreta);
           System.out.println("Escriba una letra: ");
           Scanner sc = new Scanner (System.in);
           char letra = sc.next().charAt(0); //HACEMOS QUE EL SCANNER COJA SOLO LA PRIMERA LETRA QUE ESCRIBA EL USUARIO
           this.acertado = false;
           for (int i=0;i<this.palabraSecreta.length();i++)
           {
               if (this.palabraSecreta.charAt(i)==letra)
               {
                   this.guionPalabraSecreta[i] = letra;
                   this.acertado = true;   
                   this.numeroAcierto++;
                   System.out.println("Muy bien");
                   System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
               } 
           }
           
           if (this.acertado == false)
           {
                this.numeroError++;
                 System.out.println("La letra " + letra + " no pertenece al animal domestico");
                 vidaTemp--;
                 System.out.println("Le quedan " + this.vidaTemp + " vidas");
                 if (vidaTemp==0)
                 {
                     System.out.println("¡PERDISTE! \nAgotaste todas tus vidas" + 
                             "La palabra secreta era: " + this.palabraSecreta);
                     System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
                     System.out.println("\n");
                     this.juegoTerminado = true;
                 }
           }
           else
           {
               
               if (Arrays.equals(this.charPalabraSecreta, this.guionPalabraSecreta ))
               {
                    this.ganar=true;
               }
               else
               {
                   this.ganar=false;
               } 
           }
           
           if(this.ganar==true)
               {
                   System.out.println("¡FELICITACIONES GANASTE LA PARTIDA!");
                   this.juegoTerminado=true;
                   System.out.println("La palabra secreta era: " + this.palabraSecreta);
                   System.out.println("\n");
               }
        }
    }

    @Override
    public void CalcularPuntajeTotal() 
    {
       this.puntajeTotal = (this.numeroAcierto * VALOR_ACIERTO) - (this.numeroError * VALOR_ERROR) + (this.vidaTemp * VALOR_VIDA);
       if (this.puntajeTotal<0)
       {
           this.puntajeTotal = 0;
       }
    }

    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nLa palabra secreta es: " + this.palabraSecreta + 
                "\nGanaste: " + this.ganar +
                "\nVidas restantes: " + this.vidaTemp;
    }
  
}

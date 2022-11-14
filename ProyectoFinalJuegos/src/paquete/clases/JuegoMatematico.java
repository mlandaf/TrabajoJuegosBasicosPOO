/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JuegoMatematico extends Juego implements Constantes01
{
    private int secret_num;
    private int lives_temp;
    private final int max_range = 100;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public JuegoMatematico(String nombreJugador) 
    {
        super(nombreJugador);
    }

    public int getSecret_num() 
    {
        return secret_num;
    }

    public void setSecret_num(int secret_num) 
    {
        this.secret_num = secret_num;
    }

    @Override
    public void IniciarJuego() 
    {
        this.lives_temp = VIDA_TOTAL;
        secret_num = random.nextInt(max_range-0+1)+0;
        System.out.println("Bienvenido al Juego de adivina el numero!!");
        System.out.println("Tendras que adivinar un numero aleatorio. Pero tranquil@ te daremos pistas");
        System.out.println("Empezemos!!!");
        
        while(this.lives_temp!=0 && !this.juegoTerminado)
        {
            System.out.println("Vidas restantes: " + this.lives_temp);
            System.out.println("Escriba su numero: ");
            int num = sc.nextInt();
                        
            if(num < secret_num)
            { 
                System.out.println("Es un numero mas alto!!!");
                this.lives_temp--;
                this.numeroError++;
            }
            else if(num > secret_num)
            { 
                System.out.println("Es un numero mas bajo!!!");
                this.lives_temp--;
                this.numeroError++;
            }
            else if(num == secret_num)
            {
                this.juegoTerminado= true;
                this.numeroAcierto++;
            }
            
        }
        
        if(this.juegoTerminado)
        {
            System.out.println("Ganaste");
        }
        else 
        {
            System.out.println("Perdiste. El numero era: " + secret_num);
        } 
    }

    @Override
    public void CalcularPuntajeTotal() 
    {
        this.puntajeTotal = (this.numeroAcierto * 5000) - (this.numeroError * 250) + (this.lives_temp * VALOR_VIDA);
        if (this.puntajeTotal<0)
        {
            this.puntajeTotal = 0;
        }
    }

    @Override
    public String VerInfo() 
    {
        return super.VerInfo() + 
                "\nEl numero a adivinar era: " + this.secret_num + 
                "\nTotal de vidas restantes: " + this.lives_temp;
    }
    
    
    
    
    
    
    
    
    
    
}

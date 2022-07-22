/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

/**
 *
 * @author Matias
 */
public class Ventilador 
{
    int VelocidadMaxima = 10;
    int VelocidadActual =0;
    boolean Enchufado;
    boolean Encendido;
    boolean Oscila;

    public Ventilador() 
    {
    }

    

   
    
    public Ventilador(boolean Enchufado, boolean Encendido, boolean Oscila) 
    {
        this.Enchufado = Enchufado;
        this.Encendido = Encendido;
        this.Oscila = Oscila;
    }
   
    
    public int SubirVelocidad()
    {
        if ((Enchufado==true)&&(Encendido==true)) 
        {
           setVelocidadActual(getVelocidadActual()+1);
           return VelocidadActual;
        }
       
        return 0;
    } 
    
    public int BajarVelocidad()
    {
         if ((Enchufado==true)&&(Encendido==true)) 
        {   
            if (getVelocidadActual()<10) 
            {
                setVelocidadActual(getVelocidadActual()-1);
                return VelocidadActual+1;
            }
        }
        return 0; 
    }        
    
    public boolean Enchufar ()
    {
        if (Enchufado==false) 
        {
            return Enchufado = true;
        }
        return false;
    }        
    
    public boolean Desenchufar()
    {
        if (Enchufado==true) 
        {
            return Enchufado = false;
        }
        return true;
    }     
    
    public boolean Encender()
    {
        if (Enchufado==true) 
        {
            Encendido=true;
            VelocidadActual=0;
        }
        if (Enchufado==false) 
        {
            Encendido=false;
        }
        return false;
    }        
    
    public boolean Apagar ()
    {
        if (Encendido==true) 
        {
            setEncendido(false);
            return Encendido;
        }
       return false;
    }        
    
    public boolean Oscilar()
    {
        setOscila(true);
        return Oscila;
    }        
    public boolean DesactivarOscilar()
    {
        setOscila(false);
        return Oscila;
    }        
    

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public int getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual = VelocidadActual;
    }

    public boolean isEnchufado() {
        return Enchufado;
    }

    public void setEnchufado(boolean Enchufado) {
        this.Enchufado = Enchufado;
    }

    public boolean isEncendido() {
        return Encendido;
    }

    public void setEncendido(boolean Encendido) {
        this.Encendido = Encendido;
    }

    public boolean isOscila() {
        return Oscila;
    }

    public void setOscila(boolean Oscila) {
        this.Oscila = Oscila;
    }
    
    
    
    
    
}

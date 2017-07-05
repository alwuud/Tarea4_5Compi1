/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4_5;

/**
 *
 * @author alwud
 */




public class Punto{

	private double  x, y;

	public Punto cercano;

	public Punto(double x, double  y){
		this.x=x ;
                this.y=y;
	}


	/*
		Este metodo se encarga de comprobar si el punto enviado es mas cercano al origen
		true: si el nuevo punto es mas cercano al origen
		false: en caso contrario
	*/
	public boolean checkNext(Punto nuevo){
		if(cercano== null){
			return true;
		}
		try{
               
			//return Math.sqrt(Math.pow(x- cercano.getX(),2) + Math.pow(y- cercano.getY(),2))> Math.sqrt(Math.pow(x- nuevo.getX(),2) + Math.pow(y- nuevo.getY()));
                        return Math.sqrt(Math.pow(x-cercano.getX(), 2) + Math.pow(y- cercano.getY(), 2)) > Math.sqrt(Math.pow(x- nuevo.getX(), 2)+ Math.pow(y-nuevo.getY(), 2));
                        
		}catch(Exception e){
			return false;
		}
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}
        
        //Permite asignar el punto mas cercano, que posee 
        
        public void setCercano(Punto n){
            this.cercano= n;
        }
        
        public double getDistancia(){
            return  Math.sqrt(Math.pow(x-cercano.getX(), 2) + Math.pow(y- cercano.getY(), 2));
        }
}
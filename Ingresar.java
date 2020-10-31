/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonos;

/**
 *
 * @author Usuario
 */
class Ingresar {
    
    private String marca = "";
	private Integer modelo = 0;
	
	private String color;

	
	public String getmarca(){
		return marca;
	}


	public void setmarca(String nombre){
		this.marca = marca;
	}


	public Integer getmodelo(){
		return modelo;
	}


	public void setmodelo(Integer modelo){
		this.modelo = modelo;
	}


	public String getcolor(){
		return color;
	}


	public void setcolor(String color){
		this.color = color;
	}
     @Override
    public String toString(){
        System.out.println("Informacion del Auto:\n" + "marca: " + marca + "\n" + "modelo:" + modelo + "\n" +
                "Color de Pintura: " + color);
         return null;
    
        
            }
}
    


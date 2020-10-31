/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Telefonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    public static int cai = 5;
    public static Ingresar marca1 = new Ingresar();
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
		Integer d = 0;
			
		do {
                        System.out.println("\t\t\t\tVenta de Autos KluiAlr\n\n");
			System.out.println("1: Vender Autos"); 
			System.out.println("2: Ingresar Autos");
			System.out.println("3: Salir");
                        System.out.print("Que desea hacer? : ");
			d = scn.nextInt();
		switch (d){
		case 1: 
			menu1();
		break;
		case 2:
			menu2();
		break;
		
		default: System.out.println ("");
		}
		
		}while (d!=3);
                System.out.println("Adios");
		
		}
	
	public static void menu1 () {
		
	Scanner scn = new Scanner(System.in);
        int v;
        
            System.out.println("Hay "+cai+" Autos Disponibles");
	
	           System.out.print("Cuantos Autos se Venderan: ");
                   cai = scn.nextInt();
                   System.out.print("Precio Por cada uno: ");
                   v = scn.nextInt();
                   int PT = cai*v;
                   System.out.println("Precio Total a pagar es Q"+PT);
                   System.out.println("\n\n\tVenta Exitosa");
}

	public static void menu2 () {
		
		Scanner scn = new Scanner(System.in);
		Integer d = 0;
		
		 
			System.out.print("\nIngrese Marca");
			String marca = scn.nextLine();
			
			System.out.print("Modelo");
			String modelo = scn.nextLine();
			
			
			
			System.out.print("Color de Pintura");
			String sexo = scn.nextLine();
			cai++;
			
                        
                        System.out.println("\nIngreso Exitoso\n\t\tDatos del Auto");
                        System.out.println("Marca: "+marca);
			         System.out.println("Modelo: "+modelo);
                                 System.out.println("Color de Pintura: "+sexo);
                        System.out.println("Hay "+cai+" Autos Disponibles en Nuestra Empresa");
			      
    }
    
}
        
        
        
    }
    
}

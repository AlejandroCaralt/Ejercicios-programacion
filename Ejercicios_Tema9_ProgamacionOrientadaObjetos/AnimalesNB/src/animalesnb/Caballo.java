/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalesnb;

public class Caballo{
  private String sexo, raza;
  private int edad;

  public Caballo(){
   this.sexo = "Macho";
   this.raza = "Percheron"; 
  }

  public Caballo(String s,String r){
  this.sexo = s;
  this.raza = r;
  }

  public Caballo(String s,String r,int x){
  this.sexo = s;
  this.raza = r;
  this.edad = x;
  }
  
  public String getSexo (){
      return this.sexo;
  }

  public void come(){
    System.out.println("'Le das de comer al caballo.'");
  }
  public void galopar(){
    System.out.println("'El caballo galopa.'");
  }
  public void dormir(){
    System.out.println("'El caballo se tumba a dormir.'");
  }
  public String toString(){
      return "Caballo: " + this.sexo + this.raza ;
  }
}


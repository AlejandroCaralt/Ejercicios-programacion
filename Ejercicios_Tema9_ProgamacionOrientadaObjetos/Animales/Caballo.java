package Animales;


public class Caballo{
  private String sexo, raza;
  private int edad;

  public Caballo(){
   this.sexo = "MACHO";
   this.raza = "pecheron"; 
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

  public static void come(){
    System.out.println("'Le das de comer al caballo.'");
  }
  public static void galopar(){
    System.out.println("'El caballo galopa.'");
  }
  public static void dormir(){
    System.out.println("'El caballo se tumba a dormir.'");
  }



}
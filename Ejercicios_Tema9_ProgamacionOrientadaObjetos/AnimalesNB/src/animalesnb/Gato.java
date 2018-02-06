
package animalesnb;

public class Gato extends Mamifero{
    private String raza;
    private String tipoVida = "salvaje";
    
    public Gato(){}

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoVida() {
        return tipoVida;
    }

    public void setTipoVida(String tipoVida) {
        this.tipoVida = tipoVida;
    }
    
    
}

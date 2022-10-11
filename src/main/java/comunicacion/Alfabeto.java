package comunicacion;

public class Alfabeto extends Pictograma {

    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;

    }
    public int cantidadLetras(){

        return this.letras.length;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {

        String a = "";

        for(int i = 0; i < this.letras.length; i++){

            if(i < letras.length - 1){
                a = a + this.letras[i] + ", ";
            }

            else{
                a = a + this.letras[i];
            }
            
        }

        return a;
    }

    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

}

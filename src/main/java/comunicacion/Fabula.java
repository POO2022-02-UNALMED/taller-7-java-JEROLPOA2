package comunicacion;

public class Fabula extends Escrito {

    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {

        super(origen, titulo, autor, paginas);

        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public int palabrasTotales(int a){

        return this.getPaginas() * a;
    }

    @Override
    public String toString() {
       
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.ensenanza;
    }

    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }    
    
}

package Tarea1.Mediateca;

public class Libro extends TipoSoporte{
    
    private int numeroPaginas;
    private String numeroISBN;

  
    
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getNumeroISBN() {
        return numeroISBN;
    }

    public void setNumeroISBN(String numeroISBN) {
        this.numeroISBN = numeroISBN;
    }
    
    
}

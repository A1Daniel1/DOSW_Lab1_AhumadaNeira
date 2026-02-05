package reto2;

public class Resultado {
    private int maximo;
    private int minimo;
    private int cantidad;
    private boolean mayorEsMultiploDe2;
    private boolean mayorEsDivisorDe2;
    private boolean cantidadEsPar;
    private boolean cantidadEsImpar;

    public Resultado(int maximo, int minimo, int cantidad) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public int getMaximo() { return maximo; }
    public void setMaximo(int maximo) { this.maximo = maximo; }
    
    public int getMinimo() { return minimo; }
    public void setMinimo(int minimo) { this.minimo = minimo; }
    
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    
    public boolean isMayorEsMultiploDe2() { return mayorEsMultiploDe2; }
    public void setMayorEsMultiploDe2(boolean mayorEsMultiploDe2) { 
        this.mayorEsMultiploDe2 = mayorEsMultiploDe2; 
    }
    
    public boolean isMayorEsDivisorDe2() { return mayorEsDivisorDe2; }
    public void setMayorEsDivisorDe2(boolean mayorEsDivisorDe2) { 
        this.mayorEsDivisorDe2 = mayorEsDivisorDe2; 
    }
    
    public boolean isCantidadEsPar() { return cantidadEsPar; }
    public void setCantidadEsPar(boolean cantidadEsPar) { 
        this.cantidadEsPar = cantidadEsPar; 
    }
    
    public boolean isCantidadEsImpar() { return cantidadEsImpar; }
    public void setCantidadEsImpar(boolean cantidadEsImpar) { 
        this.cantidadEsImpar = cantidadEsImpar; 
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "maximo=" + maximo +
                ", minimo=" + minimo +
                ", cantidad=" + cantidad +
                ", mayorEsMultiploDe2=" + mayorEsMultiploDe2 +
                ", mayorEsDivisorDe2=" + mayorEsDivisorDe2 +
                ", cantidadEsPar=" + cantidadEsPar +
                ", cantidadEsImpar=" + cantidadEsImpar +
                '}';
    }
}
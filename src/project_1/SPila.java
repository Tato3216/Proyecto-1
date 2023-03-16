package project_1;

public class SPila {
    public char[] actual = new char[800];
    int dimension;
    int tope;

    public void inicarPila(int dim) {
    dimension = dim;
    for(int i = dim; i < 500; i++)
    actual[i] = '\n';
    tope = -1;
    }
 
    public void pInsertar(char dato) {
        tope++;
        actual[tope] = dato;
    }
    
    
        public void pSacar() {
        tope--;
    }
        
            public char getDato() {
        return actual[tope];
    }
    
    public String getDato2() {
        char[] c = new char[1];
        c[0] = getDato();
        return new String(c);
    }
    
    public boolean getVacia() {
        if (tope < 0)
            return true;
        return false;
    }
    
    public void pMostrar() {
        if (!getVacia())
            System.out.print("Pila: " + new String(actual));
        System.out.println("\n");
    }
    
    
    public void pDestruir() {
        tope = -1;
    } 
    
}

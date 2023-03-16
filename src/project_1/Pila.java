package project_1;
import project_1.Nodo;
import project_1.SPila;

public class Pila {
    private int tope;
    private Nodo inicio;
    private Nodo finalPila;
    

    public Pila(int tope, Nodo finalPila) {
        this.tope = tope;
        this.finalPila = finalPila;
    }
    
    
    
    public boolean esVacia(){
         if(tope == 0){
            return true;
        }
        else{
            return false;
        }
    }
   
    public void iniciarPila() {
        tope = 0;
        finalPila = null;
    }
    
    public void push(Nodo nodo) {
        if (this.esVacia()){
            System.out.println("---- PILA VACIA ----");
        }
        else{
        nodo.Next = finalPila;
        finalPila = nodo;
        tope++;
        }
    }
    
    public void pop() {
        if (tope == 0){
            return;}
          if (this.esVacia()){
            System.out.println("---- PILA VACIA ----");
        }
        else{
        Nodo delete = finalPila;
        finalPila = finalPila.Next;
        delete = null;
        tope--;
        }
    }
        
    public void eliminarPila() {
        Nodo delete;
        do {
            delete = finalPila;
            finalPila = finalPila.Next;
            delete = null;
        } 
        while (delete != null);
    }
    
    public void mostrarPila() {
        Nodo n = finalPila;
        while (n != null) {
            System.out.print(n.dato);
            n = n.Next;
        }
        System.out.println("\n");
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public Nodo getFinalPila() {
        return finalPila;
    }

    public void setFinalPila(Nodo finalPila) {
        this.finalPila = finalPila;
    }


    public void Insert(char dato) {
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
        if (tope < 0){
            return true;
        }
        else{
        return false;}
    }
    
    public void pMostrar() {
        if (!getVacia()){
            System.out.print("Pila: " + new String(actual));
            }
        System.out.println("\n");
    }
    
    public void pDestruir() {
        tope = -1;
    }


}

    
    

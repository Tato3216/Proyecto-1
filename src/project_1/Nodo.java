package project_1;

public class Nodo {
    public char dato;
    public Nodo Left, Right,Root;
    Nodo Next;

    public Nodo(int dato, Nodo Left, Nodo Right,Nodo Next,Nodo Root) {
        this.dato = (char) dato;
        this.Left = Left;
        this.Right = Right;
        this.Next = Next;
        this.Root = Root;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = (char) dato;
    }

    public Nodo getLeft() {
        return Left;
    }

    public void setLeft(Nodo Left) {
        this.Left = Left;
    }

    public Nodo getRight() {
        return Right;
    }

    public void setRight(Nodo Right) {
        this.Right = Right;
    }
    
    public Nodo getNext() {
        return Next;
    }

    public void setNext(Nodo Next) {
        this.Next = Next;
    }

    public Nodo getRoot() {
        return Root;
    }

    public void setRoot(Nodo Root) {
        this.Root = Root;
    }    
    
    
}

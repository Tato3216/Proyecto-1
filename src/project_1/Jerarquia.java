package project_1;
import java.util.Stack;


public class Jerarquia {
    public static int PRES_1 = 0;
        public static int PRES_2 = 2;
        public static int NUMERO = 0;
        public static int P_IZQUIERDO = 1;
        public static int P_DERECHO = 2;
        public static int OPERADOR = 3;
        public static int COMA = 4;

        public static int det_caracter(char c) {
            int simbolo;

            if(c>='0'&&c<='9')
                simbolo=NUMERO;
            else if(c=='-'||c =='+'||c=='*'||c=='/')
                simbolo=OPERADOR;
            else if(c=='(')
                simbolo=P_IZQUIERDO;
            else if(c==')')
                simbolo=P_DERECHO;
            else if(c== ',')
                simbolo=COMA;
            else
                simbolo=-1;// Caracter no válido
            return simbolo;
        }

        public static boolean precedencia_1(Stack<Character> pila,char c) {
            int pres_pila,pres_cola;
            if(pila.isEmpty())
                return false;
            if(c=='-'||c=='+')
               pres_cola=PRES_1;
            else if(c=='*'||c=='/')
                pres_cola=PRES_2;
            else
                return false; // Caracter no operador
            char top=pila.peek();
            if(top=='-'||top=='+')
                pres_pila=PRES_1;
            else if(top=='*'||top=='/')
                pres_pila=PRES_2;
            else
                return false; // Caracter no operador
            if(pres_pila>=pres_cola)
                return true;
            return false;
        }

        public static boolean precedencia_2(char c1, char c2) {
            int pres_pila, pres_cola;
            if(c1=='-'||c1=='+')
                pres_cola=PRES_1;
            else if(c1=='*'||c1=='/')
                pres_cola = PRES_2;
            else
                return false; // Caracter no operador
            if(c2=='-'||c2=='+')
                pres_pila=PRES_1;
            else if(c2=='*'||c2=='/')
                pres_pila=PRES_2;
            else
                return false; // Caracter no operador
            if(pres_pila>=pres_cola)
                return true;

            return false;
        }
    
}

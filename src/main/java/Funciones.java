public class Funciones {

    public int factorial(int n){
        if (n == 0)
            return 1;
        else
            if(n < 0)
                return 0;//Por convenviencia lo defino como cero
            else
                return n*factorial(n-1);
    }

    static  boolean cuadradoPerfecto(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    public boolean esNumeroDeFibonacci(int n){
        return cuadradoPerfecto(5*n*n + 4) ||
                cuadradoPerfecto(5*n*n - 4);
    }
}

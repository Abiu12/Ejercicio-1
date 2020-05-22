/**
 * Esta clase realiza una serie numerica
*@author Franco Matias Abiu Mahanaim
*@version 19/04/2020
 */
import java.util.Scanner;// se importa el Scanner para poder leer el numero desde el teclado
public  class E1{
             
        public   String Serie(int a){
           String serie="";// Se declara el string vacio para despues poder agregarle los numeros
 
             int b=0;// Se declara una variable auxiliar para poder realizar la serie
        serie= ""+a;// Se le agrega el numero ingresado a la serie
        
        if(a%2!=0&&a>0){//condicion para el caso que sea un numero impar
            b=a;
            a++;
            a=a+b;
            a=a+b;
        serie=serie+","+a;}
        while(a>1){// ciclo para realizar la serie, en donde se rechazan los numeros negativos
            b=a;
        if(a%2==0){//condicion para los numeros que tienen mitad
        a=a/2;
        serie=serie+","+a;
          }
        else{//en caso de no tener mitad se realizan  operaciones con ayuda de la variable auxiliar y se continua con la serie
        b=b*2;
            a=(b+1)+a;
            serie=serie+","+a;}
        }
            
        
     return serie;//Se retorna el String que contiene la serie


}
public static void main (String[]args){
    E1 e=new E1();
    System.out.println("Introduce un numero para realizar la serie");
         Scanner sc=new Scanner(System.in);//SE crea la variable del Scanner
        int a=sc.nextInt();//Se lee el numero
        System.out.println("La serie de "+a+" es: "+e.Serie(a));
       
}
}


        
   




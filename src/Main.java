import javax.swing.JOptionPane;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("\nHOLA MARIANA_Hello and welcome!\n");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println("Hola Mundo");
        }

        //DATOS PRIMITIVOS
        /*
        int numero = 5;
        char letra = 'a';
        double temperatura = 5.25;
        float flotante = 3.14F;
        boolean respuesta = false;
        long numeroLargo = 123456789;
         */



        //DATOS NO PRIMITIVOS - pueden usar valores nulos y metodos
        /*
        Integer numeroN1 = null;
        numeroN1 = 1;

        String Nombre = "Arturo esta aqui?";
        System.out.println("Hola "+Nombre);

        //CONSTANTES - no se le puede cambiar el valor
        final int numConstante = 10;
         */

        //ENTRADA DE DATOS
        Scanner entrada = new Scanner(System.in);
        /*
        int numeroEntrada1;
        float numeroEntrada2;
        String cadena;
        char letra2;

        System.out.println("Digite un numero entero: ");
        numeroEntrada1 = entrada.nextInt();//entrada entera
        System.out.println("El numero es: "+numeroEntrada1);

        System.out.println("Digite un numero flotante: ");
        numeroEntrada2 = entrada.nextFloat();//entrada entera
        System.out.println("El numero es: "+numeroEntrada2);

        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.println("La cadena es: "+cadena);

        System.out.println("Digite una letra: ");
        letra2 = entrada.next().charAt(0);
        System.out.println("La letra es: "+letra2);

        */
        //ENTRADA DE DATOS con JOptionPane
        /*
        String cad2;
        int numJOP;
        char letraJOP;
        double doubleJOP = 5.25;

        cad2 = JOptionPane.showInputDialog("Digite cadena2: ");
        numJOP = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letraJOP = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        doubleJOP = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        JOptionPane.showMessageDialog(null, "la cadena es: "+cad2);
        JOptionPane.showMessageDialog(null, "el entero es: "+numJOP);
        JOptionPane.showMessageDialog(null, "la letra es: "+letraJOP);
        JOptionPane.showMessageDialog(null, "el decimal es: "+doubleJOP);
        */

        //OPERADORES DE INCREMENTO
        /*int numIncremento = 5;
        numIncremento++;
        System.out.println("Numero de incremento: "+numIncremento);
        numIncremento--;
        numIncremento--;
        System.out.println("Numero de incremento: "+numIncremento);
        */

        //CLASE MATH
        /*
        double base = 5;
        double expo = 2;
        double raiz;
        double resultado;
        double numAleatorio;

        raiz = Math.sqrt(base);
        resultado = Math.pow(base, expo);
        numAleatorio = Math.random();
        System.out.println("Raiz: "+ raiz);
        System.out.println("Exponente: "+ resultado);
        System.out.println("Numero ramdom: "+ numAleatorio);
         */

        //CONDICIONALES - IF
        /*
        float num1, num2,  resultado;
        System.out.println("Digite dos numeros");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        //num1 +=5;

        resultado = num1 + num2;
        System.out.println(resultado);
        System.out.println("El resultado de la suma es: "+resultado);


        if (num1>num2){
            System.out.println("numero 1 es mayor que numero 2");
        } else {
            System.out.println("numero 2 es mayor que numero 1");
        }
         */

        //SwITCH
        /*
        int datoSwitch;
        datoSwitch = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 3"));

        switch (datoSwitch){
            case 1:
                System.out.println("Es 1");
                break;
            case 2:
                System.out.println("Es 2");
                break;
            case 3:
                System.out.println("Es 3");
                break;
            default:
                System.out.println("No esta entre 1-3");
                break;
        }

         */
        //CICLO WHILE
        /*int i =1;
        while(i<10){
            System.out.println(i);
            i++;
        };

         */
        //CLCLO DO WHILE
        /*int i =11;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

         */

        //ciclo FOR
        /*
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println("Hola Mundo " + i);
        }

         */

        //ARREGLOS - ARRAYS
        // tipo_de_variable[] Nombre = new tipo_de_variable[dimension];
        /*
        int[] numA = new int[3];

        numA[0] = 1;
        numA[1] = 2;
        numA[2] = 3;

        for (int i=0;i<numA.length;i++){
            System.out.println(i);
        }
        */
        /*
        int numElementos;
        numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos"));

        char[] charA = new char[numElementos];
        for (int i=0;i<numElementos;i++){
            System.out.println("Digite el caracter "+(i+1) );
            charA[i] = entrada.next().charAt(0);
        }

        for (int i=0;i<numElementos;i++){
            System.out.println("Caracter "+(i+1) +": "+charA[i]);

        }

         */

        /*
        //BUCLE FOR EACH
        String[] nombres = {"AB","BC","DE", "EF", "GH","IJ", "KL"};

        for (String i : nombres){
            System.out.println("Nombres: "+i);
        }

        float numA2[] = new float[5];
        float sumaPositivos = 0, sumNegativos=0, mediaPos, mediaNeg;
        int conteoPositivos = 0, conteoNegativos=0, conteoCeros = 0;

        for (int i=0;i<numA2.length;i++){
            System.out.print("Digite el numero "+(i+1));
            numA2[i] = entrada.nextFloat();

            if (numA2[i]==0){
                conteoCeros++;
            } else if (numA2[i]>0) {
                sumaPositivos +=numA2[i];
                conteoPositivos++;
            }else{
                sumNegativos +=numA2[i];
                conteoNegativos++;
            }
        }
        //MEDIA
        if (conteoPositivos==0){
            System.out.println("No se puede obtener la media de los positivos");
        } else {
            mediaPos = sumaPositivos/conteoPositivos;
            System.out.println("La media de los positivos es "+mediaPos);
        }

        if (conteoNegativos==0){
            System.out.println("No se puede obtener la media de los Negativos");
        } else {
            mediaNeg = sumNegativos/conteoNegativos;
            System.out.println("La media de los negativos es "+mediaNeg);
        }

        System.out.println("La cantidad de ceros es "+conteoCeros);

         */

        //MATRICES
        /*
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        int[][] matrizD;
        int numF, numC;

        numF = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas"));
        numC = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas"));

        matrizD = new int[numF][numC];

        for (int i=0;i<numF;i++){
            for (int j=0;j<numC;j++){
                System.out.print("Digite el elemento"+i +" "+ j+" :");
                matrizD[i][j] =entrada.nextInt();
            }
            System.out.println("");
        }

        for (int i=0;i<numF;i++){
            for (int j=0;j<numC;j++){
                System.out.print(matrizD[i][j]);
            }
            System.out.println("");
        }

         */


    }
}
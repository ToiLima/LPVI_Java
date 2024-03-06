package array_rev;

import java.util.Scanner;

public class Laboratorio {

    public static void main(String[] args) {
        Ponto3D ponto1[] = new Ponto3D[5];
        Ponto3D ponto2[] = new Ponto3D[5];
        Scanner entrada = new Scanner(System.in);

        
        for(int i = 0; i < ponto1.length; i++){
            ponto1[i] = new Ponto3D();
        }
        
        for(int i = 0; i < ponto2.length; i++){
            System.out.println("Informe o número x da posicao "+ i+ " do array");
            double x = entrada.nextDouble();
            System.out.println("Informe o número y da posicao "+ i+ " do array");
            double y = entrada.nextDouble();
            System.out.println("Informe o número z da posicao "+ i+ " do array");
            double z = entrada.nextDouble();

            ponto2[i] = new Ponto3D(x, y, z);
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("Número X da posicao "+ i+ " do primeiro array: "+ ponto1[i].x);
            System.out.println("Número Y da posicao "+ i+ " do primeiro array: "+ ponto1[i].y);
            System.out.println("Número Z da posicao "+ i+ " do primeiro array: "+ ponto1[i].z);
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("Número X da posicao "+ i+ " do segundo array: "+ ponto2[i].x);
            System.out.println("Número Y da posicao "+ i+ " do segundo array: "+ ponto2[i].y);
            System.out.println("Número Z da posicao "+ i+ " do segundo array: "+ ponto2[i].z);
        }
         
         
    }
    
}

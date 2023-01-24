package academy.learnprogramming;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {// Função de entrada de informações para construir lista
        Scanner numberElement = new Scanner(System.in);
        System.out.println("Qual é a quantidade de elementos que serão lidos?");
        int numberlimit = Math.abs(numberElement.nextInt());
        int totalElements[] = new int[numberlimit];
        int totalElementsOriginal[] = new int[numberlimit];
        for (int i = 0; i < numberlimit; i++) {
            System.out.println("Qual o elemento de posição " + i + " a ser inserido?");
            int insertElement = numberElement.nextInt();
            totalElements[i] = insertElement;
            totalElementsOriginal[i] = insertElement;
        }changer(totalElements);
            wayofvetor(totalElementsOriginal);}
//        System.out.println("Lista original" + (Arrays.toString(totalElementsOriginal)));//verificador de vetor


    private static void changer(int[] totalElements) {// Função que organiza as posições no vetor.
        for (int l = 0; l < totalElements.length - 1; l++) {
            corechanger(totalElements);
            if (totalElements[l] > totalElements[l + 1]){
                corechanger(totalElements);}
            else{
            }}calculator(totalElements);}
    private static void corechanger(int[] totalElements){// Core da Função que organiza as posições no vetor.
        for (int l = 0; l < totalElements.length - 1; l++){
            if (totalElements[l] > totalElements[l + 1]) {
                int keeprData1 = totalElements[l];
                int keeprData2 = totalElements[l + 1];
                totalElements[l + 1] = keeprData1;
                totalElements[l] = keeprData2;
            }}}
    private static void calculator(int[] totalElements) {// ERRO --Função que calcula a maior diferença possível no vetor
        int maxNumb = totalElements[(totalElements.length - 1)];
        int minNumb = totalElements[0];
        int[] subHighLow = new int[1];
        int calculator = (maxNumb) - (minNumb);
        subHighLow[0] = calculator;

        System.out.println("A maior Subtração dos elementos do vetor é " + subHighLow[0]);
//        System.out.println(("Lista reordenada" + (Arrays.toString(totalElements))));//verificador de vetor
    }
    private static boolean wayofvetor(int []totalElementsOriginal){// Função que verifica se é crescente ou não
        boolean finalUpDown[] = new boolean [1];
        for (int l = 0; l < totalElementsOriginal.length - 1; l++){
            if (totalElementsOriginal[l] >= totalElementsOriginal[l + 1]){
                boolean updown = false;
                finalUpDown[0] = updown;
                break;
            }if (totalElementsOriginal[l] < totalElementsOriginal[l +1]){
                boolean updown = true;
                finalUpDown[0] = updown;
            }
        }System.out.println("O vetor está em ordem crescente? Resposta: " + finalUpDown[0]);
        return finalUpDown[0];
    }
}
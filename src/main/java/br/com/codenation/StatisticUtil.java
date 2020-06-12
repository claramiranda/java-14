package br.com.codenation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StatisticUtil {
	public static void main(String[] args) {

		//int[] numeros = {1,4,6,10,12,14};
		//int[] numeros = {10,20,30,40,50,60,70};
		//int[] numeros = {1,4,6,10,12,14};
		//median(numeros);
	}

	public static int average(int[] elements) {

			int media = 0;
			for (int i:elements) {
				media += i;

			}
			media /= elements.length;

			//System.out.println("tamanho = " + size +"\n Media = " + media);

			return media;
	}

	public static int mode(int[] elements) {
		int moda = 0;
		int[] aux = new int[10];

		for(int i : elements)
		{
			aux[i]++;
			//System.out.println("\nelements = " + elements[i] + "\ni = "+ i);
		}
		int max=0;
		for(int i=0; i<10; i++)
		{
			if (aux[i] > max)
			{
				max = aux[i];
				moda = i;
			}
			//System.out.println("\ni = "+ i + " aux[i] = " + aux[i]);
		}
		//System.out.println("moda = " + moda + " ocorrencias = " + max);
		return moda;
	}

	public static int median(int[] elements) {
		int mediana = 0;
		Arrays.sort(elements);

		int meio;
		//System.out.print("tamanho = " + elements.length + " meio = " + meio + "\n");
		if( elements.length % 2 != 0)
		{
			meio = (int) (elements.length / 2);
			mediana = elements[meio];
			//System.out.println("Tamanho do vetor: " + elements.length + " elemento do meio: " + meio);
			//System.out.println("meio" + meio +" Mediana = "+ mediana + " indice meio = " + meio + "\n");
		}
		else
		{
			meio = (int) (elements.length / 2 ) - 1;
			int aux =  meio + 1;
			mediana = elements[meio];

			System.out.println("Tamanho do vetor: " + elements.length + " Indices: " + meio + " e " + aux);
			mediana += elements[aux];
			mediana /= 2;
			//System.out.println("mediana = " + mediana + " aux = "+ aux+"\n");
			//mediana = (aux + mediana) / 2 ;
			//System.out.println("Mediana final = "+ mediana);
		}

		return mediana;
	}
}
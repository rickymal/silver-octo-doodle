package tests;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class NonDivisibleSubset {
	// Complete the cutTheSticks function below.

	public static void main(String[] args) {
	 List<String> nomes = new ArrayList<String>();
	 List<Integer> numbers = new ArrayList<Integer>();
	
	String[] input  = {
			"3",
			"Fernanda 7",
			"Fernando 9",
			"Gustavo 11",
	};
	
	int nof_students = Integer.parseInt(input[0]);
	
	
	
	for(int i = 1; i < input.length; i++) {
		nomes.add(input[i].split(" ")[0]);
		numbers.add(Integer.parseInt(input[i].split(" ")[1]));
	}
	
	System.out.println(nomes.toString());
	System.out.println(numbers.toString());
	int i = 0;
	int iteration = numbers.get(0);
	int realloc = 0;
	
	String name_to_delete = nomes.get(realloc);
	int number_to_push = numbers.get(realloc);
	
	// a raz�o do valor +1 � porque um lado se refere apenas a posi��o e o outro ao tamanho, 
	// e como os �ndices come�am em zero eu preciso ajustar
	boolean hasRightOverflowed = realloc + 1 > numbers.size(); 
	boolean isDivisible = number_to_push % 2 == 0;
	boolean hasLeftOverflowed = !(realloc > 0); // n�o pode ser negativo para ter overflow do lado esquerdo da lista
	
	
	while(numbers.size() != 1) {
		
		// encontrar o estudar a eliminar
		int rest = iteration % nof_students;
		realloc = 0;
		if(isDivisible) {
			realloc += rest;
			
		} else {
			realloc -= rest;
			realloc += nof_students;
		}
		
		// eliminar o estudante
		name_to_delete = nomes.get(realloc);
		number_to_push = numbers.get(realloc);
		nomes.remove(realloc);
		numbers.remove(realloc);
		

		
		
		// l�gica para movimenta��o circular 
		if (isDivisible) {
			if (hasRightOverflowed) {
				i = 0;
				number_to_push = number_to_push - 1;
			} else {
				i = realloc;
				number_to_push = number_to_push - 1;
			}
		} else {
			if (hasLeftOverflowed) {
				i = numbers.size() - 1;
				number_to_push = number_to_push - 1;
			} else {
				i = realloc - 1;
				number_to_push = number_to_push - 1;
			}
		}
		
		iteration = number_to_push;
		nof_students = nomes.size();
	}
	
	// prepara a lista
	
	
	
	
	}
}

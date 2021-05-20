package tests;

import java.util.ArrayList;
import java.util.List;

public class CircleJoker {
	
	public static int realloc_position(List<Integer> numbers,List<String> people, int actualPosition)
	{
		boolean isLeftOverflowed = actualPosition < 0;
		boolean isRightOverflowed = actualPosition > numbers.size();

		
		if(isLeftOverflowed) {
			return -1;
		}
		
		else if(isRightOverflowed) {
			return +1;
		}
		else {
			return 0;
		}
		
		
	}
	
	public static int[] rotate(List<Integer> numbers,List<String> people, int actualPosition, int rotation) {
		
		// verificar se eu tenho que ir para a direita ou para a esquerda
		boolean direction = rotation % 2 == 0;
		// prepara indice para rotacionar
		//int to_shift = numbers.size() % rotation;
		int to_shift = rotation % numbers.size();
		int next_index_to_remove = -1;
		// fazer o teste de overflow para a direita e para a esquerda
		int has_to_overflow;
		int new_position;
		if (direction) {
			has_to_overflow = numbers.size() - actualPosition;
		} else {
			has_to_overflow = actualPosition; //tinha errado aqui pois coloquei has_to_overfloe = to_shift
		}
		
		
		// corrigir o estouro (corrigido, estava depois do algoritmo de rotação)
		if (has_to_overflow < to_shift) {
			if (direction) {
				actualPosition -= numbers.size();
			} else {
				actualPosition += numbers.size();
			}
			
		
		}
		
		// rotacionar
		if (direction) {
			actualPosition += to_shift;
		} else {
			actualPosition -= to_shift;
		}
		
		
		
		
		try {
			next_index_to_remove = numbers.get(actualPosition);
			numbers.remove(actualPosition);
			people.remove(actualPosition);
			
			
		} catch(Exception e)  {
			System.out.println(actualPosition);
			System.out.println(numbers.size());
		}
		// remover o elemento
		// verificar se tem elementos a direita para continuar o jogo se não, passo para o início da fila
		// correção tamanho/indice
		if (people.size() - 1 < actualPosition) {
			actualPosition = 0;
		}

		return new int[] {
		 actualPosition,
		 next_index_to_remove,
		};
	}
	
	public static void main(String[] args) {
		
		String[] input  = {
				"3",
				"Fernanda 7",
				"Fernando 9",
				"Gustavo 11",
		};
		
		
		List<String> names = new ArrayList<String>();
		List<Integer> numbers = new ArrayList<Integer>();
		
		int nof_students = Integer.parseInt(input[0]);
		
		for(int i = 1; i < input.length; i++) {
			names.add(input[i].split(" ")[0]);
			numbers.add(Integer.parseInt(input[i].split(" ")[1]));
		}
		int newPosition = 0;
		int number_to_rotate = numbers.get(0);
		
		while (true) {
			System.out.println("Loopando");
			int[] result = rotate(numbers,names,newPosition,number_to_rotate);
			newPosition = result[0];
			number_to_rotate = result[1];
			
			if (names.size() != 1) {
				continue;
			} else {
			 
				System.out.println("Temos um vencedor, seu nome é: " + names.get(0));
				break;
			
			}	
			
		}
		
		
		System.out.println("tudo nosso");
		
	}
}

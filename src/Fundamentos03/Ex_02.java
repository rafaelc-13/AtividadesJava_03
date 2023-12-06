package Fundamentos03;

public class Ex_02 {
	public static void main(String[] args) {
		int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,45};
		
		if(arrayDois.length > 8) {
			System.out.println("Tamando do Array Dois - maior que 8!");
		}else if (arrayDois.length == 8){
			System.out.println("Tamando do Array Um - menor que 8");
		}else{
			System.out.println("\nTamanho do ArrayYm = "+ arrayUm.length);
		}
	}

}

package Projeto;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
			Menu();
			int escolha = lerNumero();

			switch (escolha) {
			case 1:
				Soma();
				break;
			case 2:
				Subtracao();
				break;
			case 3:
				Multiplicacao();
				break;
			case 4:
				Divisao();
				break;
			case 5:
				System.out.println("Fim, obrigado!");
				break;
			default:
				System.out.println("Número Inválido, tente novamente!");
				break;
			}
		}
	

	public static void Soma() {
		System.out.println("Digite um número para somar: ");
		int n1 = lerNumero();

		System.out.println("Digite outro número: ");
		int n2 = lerNumero();

		int resultado = n1 + n2;
		System.out.println(resultado);
	}

	public static void Subtracao() {
		System.out.println("Digite um número inteiro: ");
		int n1 = lerNumero();
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = lerNumero();

		int resultado = n1 - n2;
		System.out.println(resultado);
	}

	public static void Multiplicacao() {
		System.out.println("Digite um número inteiro: ");
		int n1 = lerNumero();
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = lerNumero();

		int resultado = n1 * n2;
		System.out.println(resultado);
	}

	public static void Divisao() {
		System.out.println("Digite um número inteiro: ");
		int n1 = lerNumero();
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = lerNumero();
		if (n2 == 0) {
			System.out.println("Não é possível dividir por zero!");
		}else {
		int resultado = n1 / n2;
		System.out.println(resultado);
		}
	}

	public static int lerNumero() {
		while (true) {
			if (sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				System.out.println("Digite um número, tente novamente!!!");
				sc.next();
			}
		}
	}

	public static void Menu() {
		System.out.println(">>>>Escolha uma opção dos operadores<<<<\n");
		System.out.println("1 - Soma (+)\n2 - Subtração (-)\n3 - Multiplicação (*)\n4 - Divisão (/)\n5 - Sair\n");

	}
}

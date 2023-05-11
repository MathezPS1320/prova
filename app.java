package prova;
import java.util.Scanner; 
import java.util.Locale;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String placaVeiculo = "";
		double valorCombustivel = 0.0,
			   consumoTotal = 0.0,
			   quantidadeQuilometrosRodados = 0.0,
			   valid = 40,
			   valorTotal = 0.0,
			   mediaPonderada = 0.0,
			   velocidadePonderada = 0.0;
		int contador = 0;	   
		double[] kmRodados = new double[]{30.7, 26.8, 22.4, 18.1, 14.5};
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sistema de Rotina Veicular: ");
		
		System.out.print("Entre com a placa do veículo: ");
		placaVeiculo = sc.nextLine();
		
		System.out.println("Entradas:");
		System.out.println("Entre com a placa do veículo:");
	
		for(int count = 0; count < kmRodados.length; count++)
		{
			System.out.print("Entre com a quantidade de quilômetros rodados a " + (valid += 20) + " km/h: ");
			quantidadeQuilometrosRodados = sc.nextDouble();
			
			if(valid == 60 && quantidadeQuilometrosRodados > 0.0)
			{
				consumoTotal += quantidadeQuilometrosRodados / 30.7;
				valorTotal = consumoTotal * 5;
				velocidadePonderada += 60;
				contador++;
			}
			if(valid == 80 && quantidadeQuilometrosRodados > 0.0)
			{
				consumoTotal += quantidadeQuilometrosRodados / 26.8;
				valorTotal = consumoTotal * 5;
				velocidadePonderada += 80;
				contador++;
			}
			if(valid == 100 && quantidadeQuilometrosRodados > 0.0)
			{
				consumoTotal += quantidadeQuilometrosRodados / 22.4;
				valorTotal = consumoTotal * 5;
				velocidadePonderada += 100;
				contador++;
			}
			if(valid == 120 && quantidadeQuilometrosRodados > 0.0)
			{
				consumoTotal += quantidadeQuilometrosRodados / 18.1;
				valorTotal = consumoTotal * 5;
				velocidadePonderada += 120;
				contador++;
			}
			if(valid == 140 && quantidadeQuilometrosRodados > 0.0)
			{
				consumoTotal += quantidadeQuilometrosRodados / 14.5;
				valorTotal = consumoTotal * 5;
				velocidadePonderada += 140;
				contador++;
			}
			
		}
		
		System.out.println("Saída Esperadas: ");
		System.out.printf("Placa de Veículo: %s%n", placaVeiculo);
		System.out.printf("Consumo Total: %.4f%n litros", consumoTotal);
		System.out.printf("Valor Total: %.2f%n", valorTotal);
		
		
		if(contador == 1)
		{
			mediaPonderada = velocidadePonderada;
			System.out.printf("Velocidade média ponderada: %.2f%n ", mediaPonderada);
			
		}else
		{
			mediaPonderada = velocidadePonderada / 5;
			System.out.printf("Velocidade média ponderada: %.2f%n ", mediaPonderada);
		}
		
	}

}

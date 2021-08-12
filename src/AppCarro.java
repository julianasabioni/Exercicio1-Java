import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro car1 = new Carro();
        System.out.println("--- Entrada de Dados - Primeiro Carro ---:");
        System.out.println("Digite o Fabricante do carro:");
        car1.setFabricante(entrada.nextLine());
        System.out.println("Digite o Modelo do carro:");
        car1.setModelo(entrada.nextLine());
        System.out.println("Digite a Cor do carro:");
        car1.setCor(entrada.nextLine());
        System.out.println("Digite a Placa do carro:");
        car1.setPlaca(entrada.nextLine());
        System.out.println("Digite o Valor do carro:");
        car1.setValor(Double.parseDouble(entrada.nextLine()));
        System.out.println("Digite o Número de Portas do carro:");
        car1.setNumeroPortas(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite o Ano de fabricação do carro:");
        car1.setAnoFabricacao(Integer.parseInt(entrada.nextLine()));

        Carro car2 = new Carro();
        System.out.println("--- Entrada de Dados - Segundo Carro ---:");
        System.out.println("Digite o Fabricante do carro:");
        car2.setFabricante(entrada.nextLine());
        System.out.println("Digite o Modelo do carro:");
        car2.setModelo(entrada.nextLine());
        System.out.println("Digite a Cor do carro:");
        car2.setCor(entrada.nextLine());
        System.out.println("Digite a Placa do carro:");
        car2.setPlaca(entrada.nextLine());
        System.out.println("Digite o Valor do carro:");
        car2.setValor(Double.parseDouble(entrada.nextLine()));
        System.out.println("Digite o Número de Portas do carro:");
        car2.setNumeroPortas(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite o Ano de fabricação do carro:");
        car2.setAnoFabricacao(Integer.parseInt(entrada.nextLine()));

        //Saída de dados
        System.out.println("---Entrada de dados - Primeiro carro ---");
        car1.imprimir();
        System.out.println("---Entrada de dados - Segundo carro ---");
        car2.imprimir();
    }
}

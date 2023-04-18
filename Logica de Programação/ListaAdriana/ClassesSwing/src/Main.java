import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do Lugar do usuário
        System.out.println("Digite o endereço do Lugar:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o nome do Lugar:");
        String nomeLugar = scanner.nextLine();
        System.out.println("Digite o tipo do Lugar:");
        String tipo = scanner.nextLine();

        Lugar lugar1 = new Lugar(endereco, nomeLugar, tipo);

        // Recebendo as informações da Pessoa do usuário
        System.out.println("\nDigite o nome da Pessoa:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Digite a idade da Pessoa:");
        String idade = scanner.nextLine();
        System.out.println("Digite a profissão da Pessoa:");
        String profissao = scanner.nextLine();

        Pessoa pessoa1 = new Pessoa(nomePessoa, idade, profissao);

        // Recebendo as informações do Veículo do usuário
        System.out.println("\nDigite o tipo do Veículo:");
        String tipoVeiculo = scanner.nextLine();
        System.out.println("Digite a marca do Veículo:");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo do Veículo:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o ano do Veículo:");
        int ano = scanner.nextInt();

        Veiculo veiculo1 = new Veiculo(tipoVeiculo, marca, modelo, ano);

        // Recebendo as informações da Viagem do usuário
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.println("\nDigite a partida da Viagem:");
        String partida = scanner.nextLine();
        System.out.println("Digite o destino da Viagem:");
        String destino = scanner.nextLine();
        System.out.println("Digite o modo de transporte da Viagem:");
        String modo = scanner.nextLine();
        System.out.println("Digite o horário da Viagem:");
        int horario = scanner.nextInt();

        Viagem viagem1 = new Viagem(partida, destino, modo, horario);

        // Exibindo as informações inseridas pelo usuário
        System.out.println("\nInformações inseridas pelo usuário:");
        System.out.println("Nome do Lugar: " + lugar1.getNome());
        System.out.println("Endereço do Lugar: " + lugar1.getEndereco());
        System.out.println("Tipo do Lugar: " + lugar1.getTipo());

        System.out.println("\nNome da Pessoa: " + pessoa1.getNome());
        System.out.println("Idade da Pessoa: " + pessoa1.getIdade());
        System.out.println("Profissão da Pessoa: " + pessoa1.getProfissao());

        System.out.println("\nTipo do Veículo: " + veiculo1.getTipo());
        System.out.println("Marca do Veículo: " + veiculo1.getMarca());
        System.out.println("Modelo do Veículo: " + veiculo1.getModelo());
        System.out.println("Ano do Veículo: " + veiculo1.getAno());

        System.out.println("\nPartida da Viagem: " + viagem1.getPartida());
        System.out.println("Destino da Viagem: " + viagem1.getDestino());
        System.out.println("Modo de transporte da Viagem: " + viagem1.getModo());
        System.out.println("Horário da Viagem: " +  viagem1.getHorario());
    }
}

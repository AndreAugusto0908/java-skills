import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Empresa software = new Empresa("Empresa do dede");

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar funcionários à empresa");
            System.out.println("2. Mostrar relatórios");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    exibirMenu(software);
                    break;
                case 2:
                    mostrarRelatorios(software);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        teclado.close();
    }
    

    public static void exibirMenu(Empresa software) {
            Scanner scanner = new Scanner(System.in);
            int opcao = 0;
    
            do {
                System.out.println("Selecione o tipo de funcionário a adicionar:");
                System.out.println("1. Diretor");
                System.out.println("2. Gerente");
                System.out.println("3. Analista Junior");
                System.out.println("4. Analista Senior");
                System.out.println("5. Retornar ao menu principal");
                System.out.print("Escolha uma opção: ");
    
                opcao = scanner.nextInt();
                scanner.nextLine();
    
                switch (opcao) {
                    case 1:
                        adicionarDiretor(software);
                        break;
                    case 2:
                        adicionarGerente(software);
                        break;
                    case 3:
                        adicionarAnalistaJunior(software);
                        break;
                    case 4:
                        adicionarAnalistaSenior(software);
                        break;
                    case 5:
                        System.out.println("Retornando ao Menu Principal...");
                        return;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } while (opcao != 5);

            scanner.close();
        }
    
        public static void adicionarDiretor(Empresa software) {
            Diretor diretor = new Diretor("Andre", "11");
            software.adicionarFuncionario(diretor);
            System.out.println("Funcionário do tipo Diretor adicionado!");
        }
    
        public static void adicionarGerente(Empresa software) {
            Gerente gerente = new Gerente("Pericles", "22");
            software.adicionarFuncionario(gerente);
            System.out.println("Funcionário do tipo Gerente adicionado!");
        }
    
        public static void adicionarAnalistaJunior(Empresa software) {
            Junior junior = new Junior("Miguel", "33");
            software.adicionarFuncionario(junior);
            System.out.println("Funcionário do tipo Analista Junior adicionado!");
        }
    
        public static void adicionarAnalistaSenior(Empresa software) {
            Senior senior = new Senior("Sergio", "44");
            software.adicionarFuncionario(senior);
            System.out.println("Funcionário do tipo Analista Senior adicionado!");
        }

        public static void mostrarRelatorios(Empresa software) {
            System.out.println("Relatórios:");
            System.out.println(software); 
        }
    
}


    

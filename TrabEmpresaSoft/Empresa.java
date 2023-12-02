import java.util.HashMap;
import java.util.Map;

public class Empresa {

    private String nome;
    private Map<String, Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new HashMap<>();
    }

    /**
     * Adiciona um funcionário ao mapa de funcionários da empresa.
     * 
     * @param funcionario O objeto do tipo Funcionario a ser adicionado ao mapa.
     */
    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.put(funcionario.getCPF(), funcionario);
    }

    /**
     * Calcula o bônus dos diretores presentes na lista de funcionários.
     * Método privado utilizado internamente para calcular os bônus dos diretores.
     */
    private void calcBonusGer() {
        for (Funcionario funcionario : funcionarios.values()) {
            if (funcionario instanceof Diretor) {
                Diretor diretor = (Diretor) funcionario;
                diretor.calcBonus(this);
            }
        }
    }

    /**
     * Calcula o faturamento total da empresa, subtraindo o salário anual de cada
     * funcionário.
     * 
     * @return O valor do faturamento da empresa.
     */
    public double faturamento() {
        double faturamento = 50000;
        for (Funcionario funcionario : funcionarios.values()) {
            faturamento -= funcionario.calcSalFinal() * 12.0;
        }
        calcBonusGer();
        return faturamento;
    }

    /**
     * Gera um relatório com os salários anuais de todos os tipos de analistas
     * 
     * @return Uma string contendo o relatório dos salários anuais de analistas
     *         todos os tipos de analistas presentes na empresa(atualmente Seniores
     *         e juniores)
     * 
     */
    public String salarioAnualAnalista() {
        StringBuilder relatorio = new StringBuilder();
        for (Funcionario funcionario : funcionarios.values()) {
            if (funcionario instanceof Analista) {
                Analista analista = (Analista) funcionario;
                relatorio.append("Tipo: ").append(analista.getClass().getSimpleName())
                        .append(" - Salario Anual: ")
                        .append(String.format("%.2f", analista.calcSalarioAnual()))
                        .append("\n");
            }
        }
        return relatorio.toString();
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("============ ").append(nome.toUpperCase()).append(" ============\n");
        dados.append(String.format("%-20s%-10s%-15s\n", "CPF", "NOME", "SALÁRIO FINAL"));

        for (Funcionario funcionario : funcionarios.values()) {
            dados.append(String.format("%-20s%-10s%-15.2f\n", funcionario.getCPF(), funcionario.nome,
                    funcionario.calcSalFinal()));
        }

        return dados.toString();
    }

}

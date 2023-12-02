import java.util.HashMap;
import java.util.Map;

public class Empresa {

    private String nome;
    private Map<String, Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.put(funcionario.getCPF(), funcionario);
    }

    private void calcBonusGer() {
        for (Funcionario funcionario : funcionarios.values()) {
            if (funcionario instanceof Diretor) {
                Diretor diretor = (Diretor) funcionario;
                diretor.calcBonus(this);
            }
        }
    }

    public double faturamento() {
        double faturamento = 50000;
        for (Funcionario funcionario : funcionarios.values()) {
            faturamento -= funcionario.calcSalFinal() * 12.0;
        }
        calcBonusGer();     
        return faturamento;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("============ ").append(nome.toUpperCase()).append(" ============\n");
        dados.append(String.format("%-20s%-10s%-15s\n", "CPF", "NOME", "SALÁRIO FINAL"));
    
        for (Funcionario funcionario : funcionarios.values()) {
            dados.append(String.format("%-20s%-10s%-15.2f\n", funcionario.getCPF(), funcionario.nome, funcionario.calcSalFinal()));
        }
    
        return dados.toString();
    }
    
}


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

    private void calcBonusGer(){
        for (Funcionario funcionario : funcionarios.values()) {
            if (funcionario instanceof Diretor) {
                Diretor diretor = (Diretor) funcionario;
                diretor.calcBonus(faturamento());
            }
        }
    }

    public double faturamento() {
        double faturamento = 0.0;
        for (Funcionario funcionario : funcionarios.values()) {
            faturamento -= funcionario.calcSalFinal() * 12.0;
        }
        calcBonusGer();     
        return faturamento;
    }
    
}


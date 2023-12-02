import java.time.LocalDate;

public class Projeto {
    private double valorProjeto;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Projeto() {
        this.dataInicio = LocalDate.now();
        valorProjeto = 0;
    }

    /**
     * Verifica se o projeto foi finalizado comparando a data de término com a data
     * de início.
     * 
     * @return true se o projeto foi finalizado (a data de término é posterior à
     *         data de início), caso contrário, false.
     */
    private boolean finalizarProjeto() {
        dataFim = LocalDate.now();
        if (dataFim.isAfter(dataInicio)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcula o valor do projeto, atribuindo um valor fixo se o projeto estiver
     * finalizado.
     * 
     * @return O valor do projeto, que é de 200.00 se o projeto foi finalizado, caso
     *         contrário, retorna 0.0.
     */
    public double valorProjeto() {
        if (finalizarProjeto()) {
            valorProjeto = 200.00;
            return valorProjeto;
        }
        return valorProjeto;
    }
}

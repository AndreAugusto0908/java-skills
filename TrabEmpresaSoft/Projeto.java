import java.time.LocalDate;

public class Projeto {
    private double valorProjeto;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Projeto (){
        this.dataInicio = LocalDate.now();
        valorProjeto = 0;
    }

    private boolean finalizarProjeto(){
        dataFim = LocalDate.now();
            if (dataFim.isAfter(dataInicio)) {
                return true; 
            } else {
                return false;
            }
        }

    public double valorProjeto(){
        if(finalizarProjeto()){
            valorProjeto = 200.00;
            return valorProjeto;
        }
        return valorProjeto;
    }
}

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Departament departament;
	private List<Contracts> contracts = new ArrayList<>();

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament){
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public void addContract(Contracts contract) {
	   contracts.add(contract);
	}

	public void removeContract(Contracts contract) {
		contracts.remove(contract);
	}

	public Double income(int year, int month) {
		Double income = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (Contracts c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				income += c.totalValue();
			}
		}
		return income;
	}

	@Override
	public String toString(){
		String toString = "Name: " + this.name + " Level: " + level.name() + " " + departament.toString();
		return toString; 
	}

}

import java.util.Date;

public class Contracts {

	private Date date;
	private double valuePorHour;
	private Integer hours;

	public Contracts(){
	}

	public Contracts(Date date, double valuePorHour, Integer hours){
		this.date = date;
		this.valuePorHour = valuePorHour;
		this.hours = hours;
	}

	public Date getDate(){
		return date;
	}

	public Double totalValue() {
		return valuePorHour * hours;
	}

}

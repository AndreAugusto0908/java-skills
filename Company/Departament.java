public class Departament {

	private String name;

	public Departament(){
	}

	public Departament(String name){
		this.name = name;
	}

	@Override
	public String toString(){
		String toString = "Departament : " + this.name;
		return toString;
	}

}

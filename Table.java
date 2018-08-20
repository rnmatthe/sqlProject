import java.util.ArrayList;

public class Table{

	private String name;
	private ArrayList<Row> rows;
	private ArrayList<Attribute> rowTemplate;
	private ArrayList<Attribute> primaryKeys;


	public Table(String name){
		this.name = name;
		rows = null;
	}

	public int size(){
		if(rows != null){
			return rows.size();
		} else {
			return 0;
		}
	}


}

class Row{

	ArrayList<String> data;

	public Row(){

	}
}

class Attribute{

	String name;

	public Attribute(String name){
		this.name = name;
	}
}
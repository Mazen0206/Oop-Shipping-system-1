
public class Client {
	private int id = 1000;
	private static int inc = 0;
	private String name;

	public Client() {
		inc++;
	}

	public Client(String name) {
		this();
		this.name = name;
		setID(id);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(int Id) {
		id += inc;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" id:" + id + " name:" + name;
	}

}

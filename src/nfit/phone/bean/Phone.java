package nfit.phone.bean;

public class Phone {
	private int id;
	private String name;
	private float price;
	
	// ������
	public Phone () {
		// ����������Ĺ������Ļ�������յĲ���ʡ new Phone()
	}
	public Phone(String name, float price) {
		// new Phone(name, price);
		super();
		this.name = name;
		this.price = price;
	}

	// getter/setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}

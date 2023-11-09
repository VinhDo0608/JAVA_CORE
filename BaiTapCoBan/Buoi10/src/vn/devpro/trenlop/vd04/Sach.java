package vn.devpro.trenlop.vd04;

public class Sach {

	String name;
	int amount;

	public Sach(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public Sach() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}

package model.client;

public class Client {
	private String id;
	private String name;
	private char sex;
	private String phone;

	public Client(String id, String name, char sex, String phone) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return this.sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return this.id + "-" + this.name;
	}
}

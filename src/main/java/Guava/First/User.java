package Guava.First;

/**
 * Hello world!
 *
 */
public class User {
	private String name;
	private String pas;
	private int age;

	public User(String name, String pas, int age) {
		this.name = name;
		this.age = age;
		this.pas = pas;
	}
	
	public User(){
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPas() {
		return pas;
	}

	public void setPas(String pas) {
		this.pas = pas;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

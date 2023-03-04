package bubble.test.ex00;

import lombok.Data;

@Data
class Dog{
	private String name;
}
public class LombokTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("≈‰≈‰");
		System.out.println(d.getName());
		
	}

}

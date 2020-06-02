public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("gender = " + wolfOne.gender);
		System.out.println("nickName = " + wolfOne.nickName);
		System.out.println("weight = " + wolfOne.weight);
		System.out.println("age = " + wolfOne.age);
		System.out.println("color = " + wolfOne.color);
		System.out.println(wolfOne.howls());
		System.out.println(wolfOne.hunt());
	}
}
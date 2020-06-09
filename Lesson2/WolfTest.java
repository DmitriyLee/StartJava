public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		//gender
		System.out.println("gender = " + wolfOne.getGender());
		wolfOne.setGender("female");
		System.out.println("new gender = " + wolfOne.getGender());

		//nickName
		System.out.println("nickName = " + wolfOne.getNickName());
		wolfOne.setNickName("Rodis");
		System.out.println("new nickName = " + wolfOne.getNickName());

		//weight
		System.out.println("weight = " + wolfOne.getWeight());
		wolfOne.setWeight(50);
		System.out.println("new weight = " + wolfOne.getWeight());

		//age
		System.out.println("age = " + wolfOne.getAga());
		wolfOne.setAge(5);
		System.out.println("new age = " + wolfOne.getAga());

		//color
		System.out.println("color = " + wolfOne.getColor());
		wolfOne.setColor("white");
		System.out.println("new color = " + wolfOne.getColor());

		System.out.println(wolfOne.howls());
		System.out.println(wolfOne.hunt());
	}
}
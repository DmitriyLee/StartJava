// Домашнее задание II:

// Создайте класс Wolf
// напишите в нем поля: пол, кличка, вес, возраст, окрас
// напишите в нем методы: идти, сидеть, бежать, выть, охотиться

// Создайте класс WolfTest с методом main

// создайте объект типа Wolf
// присвойте в нем полям экземпляра класса Wolf какие-то значения
// считайте эти значения из полей и отобразите в консоли
// вызовите методы объекта
// Покажите Д/З наставнику

// +++++++++++++++++++++++++++++++++++++++++++++++++
// Домашнее задание III:

// Модифицируйте класс Wolf
// у всех полей класса напишите модификатор доступа private
// у всех методов класса напишите модификатор доступа public
// для доступа к полям создайте геттеры и сеттеры
// в сеттере поля age реализуйте проверку: если возраст волка > 8 лет, то выведите сообщение "Некорректный возраст"
// Модифицируйте класс WolfTest
// с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
// считайте эти значения из полей с помощью геттеров и отобразите в консоли
// Покажите Д/З наставнику

public class Wolf {

	private String gender = "male";
	private String nickName = "Vir";
	private float weight = 45f;
	private int age = 7;
	private String color = "gray";

// gender
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

// nickName
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

// weight
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

// weight
	public int getAga() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

// color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

// methods
	public void go() {
		System.out.println("Волк начал движени!");
	}

	public void sit() {
		System.out.println("Волк сел!");
	}

	public void run() {
		System.out.println("Волк перешел на бег");
	}

	public boolean howls() {
		System.out.println("Волк начал выть. Завёт стаю!");
		return true;
	}

	public String hunt() {
		System.out.println("Волк охотиться вместе со стаей");
		return "Стая поймала добычу!";
	}

}
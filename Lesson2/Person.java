	// Создайте класс Person (без метода main)
	//Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
	//Проинициализируйте их какими-то значениями
	//Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java
	//Покажите Д/З наставнику

public class Person { 

	String manName = "Mark";
	String gender = "Man";
	float height = 73.2f;
	float weight = 79.4f;
	int age = 35;

	void go() {
		System.out.println("Mark начал шагать!");
	}

	void sit() {
		System.out.println("Mark сидит");
	}

	void run() {
		System.out.println("Mark начал бег!");
	}

	boolean speak() {
		System.out.println("Mark общается");
		return true;
	}

	void learnJava() {
		System.out.println("Mark занимаеться по уроку Java");
	}
}
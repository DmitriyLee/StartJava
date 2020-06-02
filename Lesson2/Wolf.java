// Домашнее задание:

// Создайте класс Wolf
// напишите в нем поля: пол, кличка, вес, возраст, окрас
// напишите в нем методы: идти, сидеть, бежать, выть, охотиться

// Создайте класс WolfTest с методом main

// создайте объект типа Wolf
// присвойте в нем полям экземпляра класса Wolf какие-то значения
// считайте эти значения из полей и отобразите в консоли
// вызовите методы объекта
// Покажите Д/З наставнику

public class Wolf {

	String gender = "cable";
	String nickName = "Vir";
	float weight = 45f;
	int age = 5;
	String color = "gray";

	void go() {
		System.out.println("Vir начал движени!");
	}

	void sit() {
		System.out.println("Vir сел!");
	}

	void run() {
		System.out.println("Vir перешел на бег");
	}

	boolean howls() {
		System.out.println("Vir начал выть. Завёт стаю!");
		return true;
	}

	String hunt() {
		System.out.println("Vir охотиться вместе со стаей");
		return "Стая поймала добычу!";
	}

}
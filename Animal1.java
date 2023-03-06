package CoreJava;

abstract class Animal1 {
    public int age;

    public Animal1(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Dog1 extends Animal1 {
    public Dog1(int age) {
        super(age);
    }

	@Override
	public String toString() {
		return "Dog1 [age=" + age + "]";
	}

    
}

class Cat extends Animal1 {
    public Cat(int age) {
        super(age);
    }

	@Override
	public String toString() {
		return "Cat [age=" + age + "]";
	}

    
}


<<<<<<< HEAD:src/main/java/com/kvvssut/tutorial/java8/lambdas/PersonInterface.java
package com.kvvssut.tutorial.java8.lambdas;

public interface PersonInterface {

	String getName();

	void setName(String name);

	int getAge();

	void setAge(int age);

	default String getPersonInfo() {
		return "Name is : " + getName() + ", Age is : " + getAge();
	}

	static String getPersonInfo(PersonInfo p) {
		return "Name is : " + p.getName() + ", Age is : " + p.getAge();
	}

}
=======
package com.kvvssut.tutorial.java8.lambdas;

public interface PersonInterface {

	String getName();

	void setName(String name);

	int getAge();

	void setAge(int age);

	default String getPersonInfo() {
		return "Name is : " + getName() + ", Age is : " + getAge();
	}

	static String getPersonInfo(PersonInfo p) {
		return "Name is : " + p.getName() + ", Age is : " + p.getAge();
	}

}
>>>>>>> origin/master:src/main/java/com/kvvssut/tutorial/java8/lambdas/PersonInterface.java

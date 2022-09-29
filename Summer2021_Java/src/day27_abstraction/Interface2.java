package day27_abstraction;

public interface Interface2 {

	default void move() {
		System.out.println("Move from Interface2");
	}
}


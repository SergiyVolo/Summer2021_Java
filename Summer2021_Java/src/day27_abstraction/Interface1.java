package day27_abstraction;

public interface Interface1 {

	default void move() {
		System.out.println("Move from Interface1");
	}
}

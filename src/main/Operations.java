package main;

public abstract class Operations {

	String response, typeOfProduct, loadType, size;

	float qty, receive, change, total = 0;

	boolean invalid = true;


	abstract void askOrder();

	abstract void calculate();
}

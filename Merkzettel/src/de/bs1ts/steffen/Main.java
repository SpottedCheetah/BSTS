package de.bs1ts.steffen;

public class Main {

    public static void main(String[] args) {
        Notebook n = new Notebook();
        n.append("hi");
        n.append("world");
        n.append("!");
        n.printNotebook();
        n.remove(2);
        n.printNotebook();
	// write your code here
    }
}

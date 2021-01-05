/*Yes, final method is inherited but you cannot override it.
*/

package core.java.programs.yogesh.finalkeyword;

class Bike12 {
	final void run() {
		System.out.println("running...");
	}
}

class FinalMethodInherited extends Bike {
	public static void main(String args[]) {
		new FinalMethodInherited().run();
	}
}
// Exercise 1

// Create a Thread called CounterLoop.
// This thread prints to the terminal all numbers up to
// a specified-in-the-constructor variable called counter.
// When a number is printed the thread pauses for 2 seconds.
// If the thread is interrupted it prints
// a message indicating that it has not finish.

// Your main should accept two arguments.
// The first is passed to a variable called patience.
// Main then initiates a CounterLoop thread and passes the second
// argument to the constructor.
// It then starts the thread.
// If the CounterLoop thread takes more time (in ms)
// than main's patience then it interrupts the thread
// and finishes.

// Before every check main waits for 1 second,
// for the thread to finish.

public class Counterloop implements Runnable {
	int counter;
	public Counterloop(int counter) throws InterruptedException {
		this.counter = counter;
	}

	public void run(){

		try {

			for (int i=0; i <= counter; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {

			System.out.println("Has not finished");

		}

	}

	public static void main(String[] args) throws InterruptedException {

		long patience = 1000 * 7;
		int counter = 5;

		Thread test = new Thread(new Counterloop(counter));

		test.start();
		long start = System.currentTimeMillis();

		while (test.isAlive()) {

			test.join(1000); // Before every check main waits for 1 second
			System.out.println("LOADING");

			if ((System.currentTimeMillis() - start) > patience && test.isAlive()) {
				System.out.println("Interrupting");
				test.interrupt();
				test.join(); // ??
			}

		}
		System.out.println("END");
	}
}

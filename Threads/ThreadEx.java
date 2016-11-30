import java.util.Vector;

//	Exercise 2

//	ThreadEx is a thread that has a Java collection
//	as a variable. The collection must be set
//	into the thread's constructor.

//	We do not want any synchronization issues so be
//	careful on your collection choice!

//	When the thread runs, it registers its ID
//	(see the getId() method) to the vector and
//	then it sleeps for 1 second.

//	Your main should initiate three
//	threads by bypassing the same collection as
//	an argument to all of them.

//	Then, it starts all three threads.
//	It waits for them to finish and then it prints:
//	a) the size of the collection and b) the collection's
//	contents by using the corresponding iterator.

public class ThreadEx implements Runnable {

	private Vector<Long> vector = new Vector<>();

	public ThreadEx(Vector<Long> vector) throws InterruptedException {
		this.vector = vector;
	}

	public void run(){

		try {

			vector.add(Thread.currentThread().getId()); // adds current thread id (long) to the vector
			Thread.sleep(1000); // waits for 1 sec

		} catch (InterruptedException e) {
			System.out.println("Has not finished");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Vector<Long> test = new Vector<>();

		// thread creation
		Thread thread1 = new Thread(new ThreadEx(test));
		Thread thread2 = new Thread(new ThreadEx(test));
		Thread thread3 = new Thread(new ThreadEx(test));

		// threads start
		thread1.start();
		thread2.start();
		thread3.start();

		// waits till finished
		thread1.join();
		thread2.join();
		thread3.join();

		// prints vector size
		System.out.println("Size: " + test.size());

		// prints vector contents
		for (int i = 0; i < test.size(); i++) {
			System.out.println("Contents: " + test.get(i));
		}

	}
}

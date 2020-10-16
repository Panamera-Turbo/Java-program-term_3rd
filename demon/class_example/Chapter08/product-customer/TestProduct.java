public class TestProduct {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Thread productorThread = new Thread(new Productor(clerk));
		Thread consumerThread = new Thread(new Consumer(clerk));
		productorThread.start();
		consumerThread.start();
	}
}

class Consumer implements Runnable {	// Ïû·ÑÕß
	Clerk clerk;
	public Consumer(Clerk clerk) {
		this.clerk = clerk;
	}
	public void run() {
		while (true) {
			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
			}
			clerk.getProduct();
		}
	}
}

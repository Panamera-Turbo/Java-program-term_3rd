class Productor implements Runnable {	// ������
	Clerk clerk;
	public Productor(Clerk clerk) {
		this.clerk = clerk;
	}
	public void run() {
		while (true) {
			try {
				Thread.sleep((int) Math.random() * 1000);
			} catch (InterruptedException e) {
			}
			clerk.addProduct();
		}
	}
}

public class Clerk {	// �ۻ�Ա
	private int product = 0;
	public synchronized void addProduct() {
		if (product >= 10) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			product++;
			System.out.println("�����������˵�" + product + "����Ʒ");
			notifyAll();
		}
	}
	public synchronized void getProduct() {
		if (this.product <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("������ȡ���˵�" + product + "����Ʒ");
			product--;
			notifyAll();
		}
	}
}
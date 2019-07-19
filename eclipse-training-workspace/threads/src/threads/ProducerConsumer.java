package threads;

public class ProducerConsumer {
	
	private int  number;
	private boolean b = false;

	public ProducerConsumer(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public synchronized void produce(int number_of_items) {
		while(b == true) {
			System.out.println("Operation : Production with number of items:" + number_of_items);
			int initial_no = this.getNumber();
			System.out.println("Previous : " + initial_no);
			int final_no = initial_no + number_of_items;
			if(final_no > 250 ) {
				try {
					wait(15000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
			setNumber(final_no);
			System.out.println("Final: " + final_no);
			b = false;
			
		}
		notifyAll();
	}
	
	public synchronized void  consume(int number_of_items) {
		
		while(b == false) {
			System.out.println("Operation :  Consumption with number of items" + number_of_items);
			int initial_no = this.getNumber();
			System.out.println("Previous : " + initial_no);
			int final_no = initial_no - number_of_items;
			if(final_no < 0) {
				try {
					wait(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			setNumber(final_no);
			System.out.println("Final: " + final_no);
			b = true;
			
			
		}
		notifyAll();
	}	
		

}
	
	

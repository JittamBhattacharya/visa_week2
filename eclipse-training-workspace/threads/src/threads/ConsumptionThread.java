package threads;

public class ConsumptionThread extends Thread{
	
	private ProducerConsumer pc;
	private Type type;
	private int number_of_items;
	
	
	public ConsumptionThread(ProducerConsumer pc, Type type, int number_of_items) {
		this.pc = pc;
		this.type = type;
		this.number_of_items = number_of_items;
	}
	
	@Override
	public void run() {
		if( type == Type.CONSUMPTION) {
			pc.consume(number_of_items);
		}else {
			pc.produce(number_of_items);
		}
	}
	
	
	
	

}

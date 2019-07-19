package threads;

public class ProducerConsumerClient {

	public static void main(String[] args) {
		
		
		ProducerConsumer pc = new ProducerConsumer(10);
		
		
		ConsumptionThread c1 = new ConsumptionThread(pc, Type.CONSUMPTION, 3);
		ConsumptionThread c2 = new ConsumptionThread(pc, Type.PRODUCTION, 4);
		ConsumptionThread c3 = new ConsumptionThread(pc, Type.CONSUMPTION	, 2);
		ConsumptionThread c4 = new ConsumptionThread(pc, Type.PRODUCTION, 8);
		ConsumptionThread c5 = new ConsumptionThread(pc, Type.PRODUCTION,10);
		ConsumptionThread c6 = new ConsumptionThread(pc, Type.CONSUMPTION, 11);
		ConsumptionThread c7 = new ConsumptionThread(pc, Type.PRODUCTION,10);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		
		
		try {
			c1.join();c2.join();c3.join();c4.join();c5.join();c6.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(pc.getNumber());
				
	
		

	}

}

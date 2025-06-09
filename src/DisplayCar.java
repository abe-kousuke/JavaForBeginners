
public class DisplayCar extends MyFrame{
	public void run() {
//		Car car1 = new Car(10,50,10,0);
//		Car car2 = new Car(300,150,-10,0);
//		for (int i = 0; i < 30; i++){
//			clear();
//			car1.draw(this);
//			car2.draw(this);
//			car1.move();
//			car2.move();
//			sleep(0.1);
//		}
		//7-1
		Car[] cars = new Car[5];
		cars[0] = new Car(10,50,1,0);
		cars[1] = new Car(30,120,2,0);
		cars[2] = new Car(50,190,3,0);
		cars[3] = new Car(70,260,4,0);
		cars[4] = new Car(90,330,5,0);
		for(int i = 0; i < 300; i++) {
			clear();
			for(int j = 0; j < cars.length; j++) {
				cars[j].draw(this);
				cars[j].move();
			}
			sleep(0.1);
		}
	}

}

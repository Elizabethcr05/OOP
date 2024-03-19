public class Main {

    public static void main(String[] args) {
 // inheritance = 	the process where one class acquires,
 // the attributes and methods of another.
		
Car car = new Car();
car.go();
		
Bicycle bike = new Bicycle();
		
car.go();
bike.stop();

Patineta patineta = new Patineta();
patineta.go();

Moto moto = new Moto ();
moto.stop();
		
System.out.println(car.door);
System.out.println(bike.pedals);
System.out.println(patineta.board);
System.out.println(moto.pato);
}
}
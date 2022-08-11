public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        System.out.println("-------각 Bus번호 다른지 확인-------");
        bus1.printBusInfoAll();
        bus2.printBusInfoAll();
        System.out.println("---------------승객+2-------------");
        bus1.ridePassenger(2);
        System.out.println("------------주유량 -50------------");
        bus1.changFuel(-50);
        System.out.println("------------주유량 +10------------");
        bus1.changFuel(10);
        System.out.println("---------------승객+45-------------");
        bus1.ridePassenger(45);
        System.out.println("---------------승객+5-------------");
        bus1.ridePassenger(5);
        System.out.println("------------주유량 -55------------");
        bus1.changFuel(-55);

        System.out.println("---------Bus 시나리오 End----------");
        System.out.println();

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        System.out.println("------각 Taxi번호 다른지 확인-------");
        taxi1.printTaxiName();
        taxi2.printTaxiName();
        System.out.println("--승객+2, 목적지 : 의정부역, 거리 : 2km--");
        taxi1.setCurrentPassenger(2);
        taxi1.setDestination("의정부역");
        taxi1.setDistanceToDest(2);
        System.out.println("------------주유량 -80------------");
        taxi1.changFuel(-80);
        System.out.println("---------------승객+5-------------");
        taxi1.setCurrentPassenger(5);
        System.out.println("--승객+3, 목적지 : 서울역, 거리 : 12km--");
        taxi1.setCurrentPassenger(3);
        taxi1.setDestination("서울역");
        taxi1.setDistanceToDest(12);
        System.out.println("------------주유량 -20------------");
        taxi1.changFuel(-20);

    }
}
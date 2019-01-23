import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Jaka jest powierzchnia pokoju? [m2]: ");
        int surface = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Jaka jest temperatura w pokoju?: ");
        int temperature = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Czy w pokoju jest klimatyzator ?: ");
        boolean ac = scanner.nextBoolean();

        room.setSurface(surface);
        room.setActualTemperature(temperature);
        room.setAirConditioner(ac);

        room.showInfo(room);
        System.out.println(room.colder());
        room.showInfo(room);
        System.out.println(room.colder());
        room.showInfo(room);
        System.out.println(room.colder());
        room.showInfo(room);
        System.out.println(room.colder());
        room.showInfo(room);

    }
}

public class Room {

    private final int minimalTemperature = 15;
    private int surface;
    private int actualTemperature;
    private boolean AirConditioner;

    boolean colder() {
        if(isAirConditioner() && actualTemperature>minimalTemperature){
            actualTemperature = actualTemperature -1;
            return true;
        }
        return false;
    }

    void showInfo(Room room){
        System.out.println("Temperature: " + room.getActualTemperature());
        System.out.println("Room surface: " +room.getSurface());
        System.out.println("Room has conditioner: " + room.isAirConditioner());
        System.out.println("-------------------------");
    }

    public Room() {
    }

    public Room(int surface, int actualTemperature, boolean AirConditioner) {
        this.surface = surface;
        this.actualTemperature = actualTemperature;
        this.AirConditioner = AirConditioner;
    }

    public int getMinimalTemperature() {
        return minimalTemperature;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(int actualTemperature) {
        if (actualTemperature < minimalTemperature) {
            System.out.println("Zbyt niska temperatura !!!");
        } else {
            this.actualTemperature = actualTemperature;
        }
    }

    public boolean isAirConditioner() {
        return AirConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        AirConditioner = airConditioner;
    }
}

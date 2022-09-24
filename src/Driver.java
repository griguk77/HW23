public class Driver extends Worker implements Drivable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public String drive() {
        return "Я таксист";
    }
}

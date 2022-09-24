public class Cook extends Worker implements Cookable{
    public Cook(String name) {
        super(name);
    }

    @Override
    public String cook() {
        return "Я кок";
    }
}

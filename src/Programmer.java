public class Programmer extends Worker implements Programmable{

    public Programmer(String name) {
        super(name);
    }

    @Override
    public String program() {
        return "Я Андроид-разработчик";
    }
}

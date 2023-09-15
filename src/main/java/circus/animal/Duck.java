package circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return toString() + "  Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm " + name + ". I am a Duck!";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public int getValue() {
        return 10;
    }

    //name is from animal class, inherited, don't make it private
    public Duck(String name) {
        this.name = name;
    }
}

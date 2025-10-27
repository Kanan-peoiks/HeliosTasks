package lesson12.task1;

public class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}

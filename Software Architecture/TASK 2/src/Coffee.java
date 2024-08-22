public class Coffee extends Beverages{
    @Override
    void addExtras() {
        System.out.println("Adding vanilla syrup");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }
}

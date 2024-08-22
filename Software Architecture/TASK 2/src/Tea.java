public class Tea extends Beverages{

    @Override
    void addExtras() {
        System.out.println("Adding vanilla syrup");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
}

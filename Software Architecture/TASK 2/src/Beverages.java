public abstract class Beverages {

    private boolean wantsExtras;

    abstract void addExtras();
    abstract void addCondiments();
    abstract void brew();

    public void boilWater(){
        System.out.println("Boiling water");

    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtras();
        }

    }

    public void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;

    }
}

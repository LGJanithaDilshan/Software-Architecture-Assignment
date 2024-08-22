public class LightDimCommand implements Command {

    private Light light;
    private int brightness = 100;
    private int history=0;

    public LightDimCommand(Light light, int newBrightness) {
        this.light = light;
        this.history=brightness;
        this.brightness = newBrightness;
    }

    @Override
    public void execute() {
        light.dim(brightness);
    }

    @Override
    public void undo() {
        if(history!=0){
            light.dim(history);
        }
        else{
            System.out.println("No dim history");
        }
    }
}

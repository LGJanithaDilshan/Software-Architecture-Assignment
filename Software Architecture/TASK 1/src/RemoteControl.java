public class RemoteControl{

    private LightOnCommand[] lightOnCommand;
    private LightOffCommand[] lightOffCommand;
    private Command history;


    RemoteControl(int slots){
        lightOnCommand = new LightOnCommand[slots];
        lightOffCommand = new LightOffCommand[slots];

    }

    public void setCommand(int slot, LightOnCommand lightOnCommand,LightOffCommand lightOffCommand){
        this.lightOnCommand[slot]= lightOnCommand;
        this.lightOffCommand[slot] = lightOffCommand;
    }

    public void onButtonWasPressed (int slot ){
        lightOnCommand[slot].execute();
        this.history =lightOnCommand[slot];
    }

    public void offButtonWasPressed (int slot ){
        lightOffCommand[slot].execute();
        this.history =lightOffCommand[slot];
    }
    public void undoButtonWasPressed (){
        if(history!=null){
            history.undo();

        }
        else{
            System.out.println("No undo history");
        }


    }

}

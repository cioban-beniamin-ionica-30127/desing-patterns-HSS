public class YSmokeSensor implements SensorForSmoke, SensorListener {

    static final String DESCRIPTION = "This is the FactoryY made Smoke Sensor.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public void detected() {
        Sms sms = new SmokeSmsAdapter(new SmokeSms());

        System.out.println("Smoke Sensor - Created by Factory Y");
        sms.sendMessage("SMOKE detected");

        SprinklerForSmoke sprinkler = new SprinklerForSmoke();
        TurnOnSprinklerCommand turnon = new TurnOnSprinklerCommand(sprinkler);
        turnon.execute();

        SingleObject logFile = SingleObject.getInstance();
        logFile.showMessage("logfile: SMOKE");

    }
}
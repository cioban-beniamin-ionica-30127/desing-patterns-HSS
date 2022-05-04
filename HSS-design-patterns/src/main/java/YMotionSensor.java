public class YMotionSensor implements SensorForMotion,SensorListener {

    static final String DESCRIPTION = "This is the FactoryY made Motion Sensor.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void detected() {

        Sms sms = new MotionSmsAdapter(new MotionSms());

        System.out.println("Motion Sensor - Created by Factory Y");
        sms.sendMessage("MOTION detected");

        AlarmForMotion alarm = new AlarmForMotion();
        StartAlarmCommand start = new StartAlarmCommand(alarm);
        start.execute();

        SingleObject logFile = SingleObject.getInstance();
        logFile.showMessage("logfile: MOTION");

    }
}

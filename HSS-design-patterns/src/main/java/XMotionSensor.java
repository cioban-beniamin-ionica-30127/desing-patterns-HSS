public class XMotionSensor implements SensorForMotion, SensorListener {

    static final String DESCRIPTION = "This is the FactoryX made Motion Sensor.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public void detected() {
        Sms sms = new MotionSmsAdapter(new MotionSms());

        System.out.println("Motion Sensor - Created by Factory X");
        sms.sendMessage("MOTION detected");

        AlarmForMotion alarm = new AlarmForMotion();
        StartAlarmCommand start = new StartAlarmCommand(alarm);
        start.execute();

        SingleObject logFile = SingleObject.getInstance();
        logFile.showMessage("logfile: MOTION");
    }
}
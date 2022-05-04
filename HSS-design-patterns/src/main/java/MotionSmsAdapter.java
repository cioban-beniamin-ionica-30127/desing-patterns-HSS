public class MotionSmsAdapter implements Sms {

    private MotionSms adaptee;
   public MotionSmsAdapter(MotionSms motionSms) {
        this.adaptee = motionSms;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS from MOTION ADAPTER: " + message);

    }
}

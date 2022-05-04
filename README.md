# desing-patterns-HSS


HSS has smoke and motion sensors. These family of sensors can be manufactured by different companies. If
smoke or motion is detected, an SMS message is sent to the homeowner. This SMS message can be sent in
different format, so adaptability is required. Furthermore, if smoke is detected a water sprinkler is turned-on,
and if a motion is detected an alarm is turned on. However, turn-off capability should be provided for these
devices. Furthermore, smoke or motion detections should be logged to file controlled by a single object.
HSS main() should allow to simulate smoke & motion sensors and turning devices off. Please provide print
statements in methods to understand what your HSS is doing.


    First sentence indicates we should use Observer Pattern
    “Family of sensors” manufactured by different factories, so Abstract Factory Pattern it is
    Adaptability for SMS, so Adapter Pattern will be used
    Different commands will be executed, so Command Pattern should be used
    Single object creation, so Singleton Pattern will be used


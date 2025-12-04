package homework_09;


public enum TrafficLight {
    RED("Stop"),
    YELLOW("Wait"),
    GREEN("Go");

    private String action;
    TrafficLight(String action) {
        this.action = action;
    }
    public String getAction() {
        return action;
    }
}



public enum Weather {
    SUMMER("warm", "+30"),
    WINTER("cold", "-20");

    private String weather;
    private String temperature;
    private Weather(String weather, String temperature) {
        this.temperature = temperature;
        this.weather = weather;
        System.out.println("Constructor " + this);
    }

    public String getWeather() {
        return this.weather;
    }

    public void printTemperature() {
        System.out.println(this.temperature);
    }

    public static void main(String[] args) {
        int u = 9;
        System.out.println(Weather.WINTER);
        System.out.println(Weather.WINTER);
        System.out.println(Weather.SUMMER);
        System.out.println(Weather.WINTER);
        int r = 9;
    }

}

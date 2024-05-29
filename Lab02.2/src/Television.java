import java.util.Arrays;

class Television {
    // static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // Fields or Instance variables
    private String brand;
    private int volume;
    private boolean isMuted;
    private int oldVolume;
    private DisplayType display = DisplayType.LED;

    // constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume){         // always named after class and begins in uppercase
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    //Business Methods
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
//        System.out.println(isConnected);

        System.out.println("Turning on your " + getBrand() + " Tv to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down " + getBrand() + "...goodbye");
    }

    public void mute() {
        if(!isMuted()) {
            oldVolume = getVolume();
            setVolume(10);    // calling setter means it automatically unmutes ( isMuted is set to false)
            isMuted = true;
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    private static boolean isValidBrand(String brand){
        boolean isValid = false;
        for(String tvBrand : VALID_BRANDS) {
            if(brand.equalsIgnoreCase(tvBrand)){
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    // Accessor Methods
    public boolean isMuted(){
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    // "Samsung", "LG", "Sony", "Toshiba"
    public void setBrand(String brand) {
        if(isValidBrand(brand)){
            this.brand = brand;
        } else {
            System.out.println("Brand: " + brand + "is invalid, must be " + Arrays.toString(VALID_BRANDS));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= Television.MIN_VOLUME && volume <= Television.MAX_VOLUME){
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.printf("Invalid Tv volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME);
        }

    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // toString() method
    public String toString() {
        String volumeString = isMuted() ? " <muted>" : String.valueOf(getVolume());

        return String.format("Television: %s, %s, Display Type: %s", getBrand(), volumeString, getDisplay());

    }
}

class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setDisplay(DisplayType.LCD);

        Television tv2 = new Television("LG", Television.MAX_VOLUME);

        Television tv3 = new Television("Toshiba", 50, DisplayType.PLASMA);


        tv1.turnOn();
        tv1.turnOff();
        System.out.println();

        tv2.turnOn();
        tv2.turnOff();
        System.out.println();

        tv3.turnOn();
        tv3.turnOff();
        System.out.println();

        System.out.println(tv1);
        System.out.println(Television.getInstanceCount() + " instances");


    }
}

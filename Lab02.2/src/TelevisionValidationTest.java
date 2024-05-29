class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setVolume(0);
        System.out.println(tv1);
        tv1.setVolume(189);
        System.out.println();

        tv1.mute();
        System.out.println(tv1);

    }
}
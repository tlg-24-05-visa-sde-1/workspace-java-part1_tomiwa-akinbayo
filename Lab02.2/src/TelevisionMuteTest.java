class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 45);
//        System.out.println(tv);

        tv.mute();  // mute it
        System.out.println(tv);

        tv.mute();  // unmute it
        System.out.println(tv);

        tv.mute();  // mute it
        System.out.println(tv);

        tv.setVolume(50);   // unmutes, volume is 50
        System.out.println(tv);
    }
}
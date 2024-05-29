package misc.test;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "57";
        int age = Integer.parseInt(ageInput);   // takes "57" -> returns int 47
        Integer agerInteger = Integer.valueOf(ageInput); //  returns an Integer object

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);  // returns primitive long
        Long populationLong = Long.valueOf(populationInput);    // returns Long object

        String sizeInput = "13.5";
        double shoeSize = Double.parseDouble(sizeInput);
        Double shoeDouble = Double.valueOf(sizeInput);
    }
}
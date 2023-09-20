package enumerations;

import example.enumerations.EnumerationOuterClass;

public class EnumerationsMain {

    public static void main(String[] args) {

        EnumerationOuterClass.Enumeration message = EnumerationOuterClass.Enumeration.newBuilder()
                .setEyeColor(EnumerationOuterClass.EyeColor.EYE_COLOR_BLUE)
                //.setEyeColorValue(2)  // same color blue
                .build();


        System.out.println(message);

    }


}

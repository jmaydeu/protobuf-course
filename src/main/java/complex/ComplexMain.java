package complex;

import example.complex.ComplexOuterClass;

import java.util.Arrays;

public class ComplexMain {

    public static ComplexOuterClass.Dummy newDummy(int id, String name){
        ComplexOuterClass.Dummy dummy = ComplexOuterClass.Dummy.newBuilder()
                .setId(id)
                .setName(name)
                .build();
        return dummy;
    }

    public static void main(String[] args) {

            ComplexOuterClass.Complex complex = ComplexOuterClass.Complex.newBuilder()
                    .setOneDummy(ComplexMain.newDummy(1,"jordi"))
                    .addAllDummies(Arrays.asList(
                            newDummy(2,"jordi"),
                            newDummy(3,"jordi")
                    ))
                    .build();

            System.out.println(complex);

    }




}

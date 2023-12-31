package simple;

import com.example.options.AnotherDummy;
import example.simple.SimpleOuterClass;

import java.util.Arrays;

public class SimpleMain {

    public static void main(String[] args) {

        //option multiple files no te Outer class
        AnotherDummy anotherMessage = AnotherDummy.newBuilder().build();

        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(42)
                .setIsSimple(true)
                .setName("Jordi")
                .addSampleList(1)
                .addSampleList(2)
                .addSampleList(3)
                .addAllSampleList(Arrays.asList(4, 5, 6))
                .build();


        System.out.println(message);

    }

}

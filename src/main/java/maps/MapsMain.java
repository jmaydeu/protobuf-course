package maps;

import example.maps.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsMain {

    private static Maps.IdWrapper newIdWrapper(int id){
        return Maps.IdWrapper.newBuilder().setId(id).build();
    }


    public static void main(String[] args) {

       Map<String, Maps.IdWrapper> mapValues = new HashMap<>();
       mapValues.put("myid2",newIdWrapper(43));

       Maps.MapExample message = Maps.MapExample.newBuilder()
               .putIds("myId", newIdWrapper(42))
               .putAllIds(mapValues)
               .build();

        System.out.println(message);
    }

}

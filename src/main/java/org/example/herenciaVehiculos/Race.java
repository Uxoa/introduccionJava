package org.example.herenciaVehiculos;

import java.util.ArrayList;
import java.util.List;

public class Race {

    List<Vehiculo> peloton = new ArrayList<>(
            List.of(
                    new Camion("Ford Truck", 20, (byte) 4),
                    new Car("Toyota", 15, (byte) 4),
                    new Moto("Harley Davidson", 30, (byte) 2)
            )
    );


    public static void startRace(List<Vehiculo> peloton){
    for (Vehiculo vehiculo : peloton){
        vehiculo.acelerar();
        System.out.println(vehiculo);

    }



    }

}

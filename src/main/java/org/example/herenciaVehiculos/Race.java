package org.example.herenciaVehiculos;

import java.lang.constant.ModuleDesc;
import java.util.ArrayList;
import java.util.List;

public class Race {

    List<Vehiculo> peloton = new ArrayList<>(
            List.of(
                    new Camion(),
                    new Car(),
                    new Monopatin(),
                    new Moto()
            )
    );


    public void startRace(){
    for (Vehiculo vehiculo : peloton){
        vehiculo.acelerar();
        System.out.println(vehiculo);

    }



    }

}

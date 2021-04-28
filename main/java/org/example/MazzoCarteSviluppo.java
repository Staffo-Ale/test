package org.example;

import java.util.Vector;

public class MazzoCarteSviluppo {
    private Vector<CarteSviluppo> carte = new Vector<>();

    public void CaricaUnaCarta(){
        Vector<MappaRisorse> costo = new Vector<>();
        Vector<MappaRisorse> input = new Vector<>();
        Vector<MappaRisorse> output = new Vector<>();
        //costo carta
        costo.add(new MappaRisorse(enumRisorse.MONETE, 2));
        costo.add(new MappaRisorse(enumRisorse.PIETRE, 2));
        //input produzione
        input.add(new MappaRisorse(enumRisorse.SCUDI, 2));
        //output produzione
        output.add(new MappaRisorse(enumRisorse.SERVITORI, 4));
        output.add(new MappaRisorse(enumRisorse.PIETRE, 2));

        //richiamo costruttore della carta
        carte.add(new CarteSviluppo(costo, input, output));

    }

}

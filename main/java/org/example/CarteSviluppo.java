package org.example;

import java.util.Vector;

public class CarteSviluppo {
    private Vector<MappaRisorse> costo = new Vector<>();
    private Vector<MappaRisorse> input = new Vector<>();
    private Vector<MappaRisorse> output = new Vector<>();

    public CarteSviluppo(Vector<MappaRisorse> costo, Vector<MappaRisorse> input, Vector<MappaRisorse> output) {
        this.costo = costo;
        this.input = input;
        this.output = output;
    }
}

package com.example.washmachine.button;


import com.example.washmachine.washmachineMethod.Rinse;
import com.example.washmachine.washmachineMethod.SpanDry;
import com.example.washmachine.washmachineMethod.Wash;

public class Washer {
    private final Wash wash;
    private final Rinse rinse;
    private final SpanDry spanDry;

    public Washer() {
        wash = new Wash();
        rinse = new Rinse();
        spanDry = new SpanDry();
    }

    public void start() {
        wash.startWash();
        rinse.startRinse();
        spanDry.startDry();
    }
}

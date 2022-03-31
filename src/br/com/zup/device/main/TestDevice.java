package br.com.zup.device.main;

import br.com.zup.device.cls.Laptop;

public class TestDevice {
    public static void main(String[] args)  {
        Laptop[] lp = new Laptop[1];

        try {
            lp[0] = new Laptop(1,"SSD", "i3", 4);
            lp[0].update();
            lp[0].deviceStatus();
            lp[0].verifyDevice();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            lp[0].improveStorageType();
            lp[0].improveProcessor("i5");
            lp[0].improveRam(32);
            lp[0].deviceStatus();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
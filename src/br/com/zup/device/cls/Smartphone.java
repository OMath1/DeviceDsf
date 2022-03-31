package br.com.zup.device.cls;

import java.util.Random;

public class Smartphone extends Device {
    public Smartphone(int age , String storageType) {
        this.age = age;
        setStorageType(storageType);
    }

    @Override
    public void update() throws Exception{
        if(getAge() >= 4) {
            throw new Exception("ERRO: Não é possível atualizar seu dispositivo por ele ter sido fabricado a 4 anos atrás");
        } else {
            Random ran = new Random();
            double ranV = ran.nextDouble() + 0.5;
            this.setSOversion(getSOversion() + ranV);
        }
    }

    @Override
    public void verifyDevice() {
        if (getAge() >= 4) {
            System.out.println("O dispositivo não é capaz de atualizar mais");
        }
    }
}

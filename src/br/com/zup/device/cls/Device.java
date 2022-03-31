package br.com.zup.device.cls;

public abstract class Device {
    protected int age;
    private String storageType;
    protected double SOversion;
    protected String processor;

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public abstract void update() throws Exception;

    public abstract void verifyDevice() throws Exception;

    public String getProcessor() {
        return processor;
    }

    public int getAge() {
        return age;
    }

    public String getStorageType() {
        return storageType;
    }

    public double getSOversion() {
        return SOversion;
    }

    public void setSOversion(double SOversion) {
        this.SOversion = SOversion;
    }

    public void deviceStatus() {
        System.out.println("------------------------------------" +
                "\nIdade: " + getAge() +
                "\nTipo de armazenamento: " + getStorageType() +
                "\nVersão do processador: " + getProcessor()
        );
        System.out.print("Versão: ");
        System.out.printf("%.2f %n", getSOversion());
    }
}
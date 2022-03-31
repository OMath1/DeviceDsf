package br.com.zup.device.cls;

import java.util.Random;

public class Laptop extends Device implements ImproveHardware {

    protected int ramLP;

    public Laptop(int age, String storageType, String processor, int ramLP) throws IllegalArgumentException {
        if (!(age < 0 || ramLP <= 0)) {
            this.age = age;
            this.ramLP = ramLP;
        } else {
            throw new IllegalArgumentException("ERRO: insira um número maior que 0");
        }

        if (processor == "i3" || processor == "i5") {
            this.processor = processor;
        } else {
            throw new IllegalArgumentException("ERRO: preencha o campo de processador corretamente");
        }

        if (storageType == "HD" || storageType == "SSD") {
            setStorageType(storageType);
        } else {
            throw new IllegalArgumentException("ERRO: preencha o campo de armazenamento corretamente");
        }

    }

    //    ------------------- Metodos da Interface ---------------------------
    @Override
    public void improveStorageType() {
        setStorageType("SSD");
    }

    @Override
    public void improveRam(int ram) throws IllegalArgumentException {
        if (getRamLP() >= 1) {
            this.ramLP = ram;
        } else {
            throw new IllegalArgumentException("ERRO: O numero não pode ser menor ou igual a zero");
        }

        if (ram >= 8 && ram <= 32) {
            this.ramLP = ram;
        } else {
            throw new IllegalArgumentException("ERRO: não é possível melhorar a ram");
        }
    }

    @Override
    public void improveProcessor(String proc) throws IllegalArgumentException {
        if (proc.equals("i5")) {
            this.processor = proc;
        } else {
            throw new IllegalArgumentException("ERRO: Coloque um processador válido");
        }
    }

//    ----------------------------------------------------------------------

    @Override
    public void update() {
        Random ran = new Random();
        double ranV = ran.nextDouble() + 0.5;
        this.setSOversion(getSOversion() + ranV);
    }


    @Override
    public void deviceStatus() {
        super.deviceStatus();
        System.out.println("Memória ram: " + getRamLP() + " GB");
    }

    @Override
    public void verifyDevice() throws Exception {
        // verificar tipo de armazenamento, processador e ram
        switch (getStorageType()) {
            case "SSD":
                System.out.println("Armazenamento atualizado");
                break;
            case "HD":
                System.out.println("AVISO: Melhore o armazenamento do seu dispositivo");
                break;
            default:
                System.out.println("O armazenamento não foi preenchido corretamente");
        }

        if (getProcessor() == "i3") {
            System.out.println("AVISO: Atualize seu processador para um i5 ou i7");
        } else if (getProcessor() == "i5") {
            System.out.println("Processador atualizado");
        }

        if (getRamLP() <= 4) {
            System.out.println("AVISO: Melhora a sua memória ram");
        }
    }

    public int getRamLP() {
        return ramLP;
    }
}
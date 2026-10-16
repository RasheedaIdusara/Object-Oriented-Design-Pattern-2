package lk.rasheeda.model;

class Patient{

    private String name;
    private String syaptom;

    public Patient(String name, String syaptom) {
        this.name = name;
        this.syaptom = syaptom;
    }

    public String getName() {
        return name;
    }

    public String getSyaptom(){
        return syaptom;
    }

}

abstract class Doctor{

    private Doctor doctor;

    public Doctor getDoctor(){
        return doctor;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public abstract void handle(Patient patient);
}

class GeneralDoctor extends Doctor{


    @Override
    public void handle(Patient patient){

        if(patient.getSyaptom().equalsIgnoreCase("Fever")){
            System.out.println("General Doctor Treating...");
        }else {
            this.getDoctor().handle(patient);
        }

    }
}

class SpecialDoctor extends Doctor{



    @Override
    public void handle(Patient patient){
        if(patient.getSyaptom().equalsIgnoreCase("Chest Pain")){
            System.out.println("Special Doctor Treating...");
        }else {
            this.getDoctor().handle(patient);
        }
    }

}

class Consultant extends Doctor{

    @Override
    public void handle(Patient patient){

        if(patient.getSyaptom().equalsIgnoreCase("Heart Problem")){
            System.out.println("Consultant Treating...");
        }else {
            System.out.println("...");
        }

    }

}

public class Test {

    public static void main(String[] args) {

        Patient patient = new Patient("Rasheeda","Fever");

        GeneralDoctor generalDoctor = new GeneralDoctor();
        SpecialDoctor specialDoctor = new SpecialDoctor();
        Consultant consultant = new Consultant();

        generalDoctor.setDoctor(specialDoctor);
        specialDoctor.setDoctor(consultant);

        generalDoctor.handle(patient);

    }

}

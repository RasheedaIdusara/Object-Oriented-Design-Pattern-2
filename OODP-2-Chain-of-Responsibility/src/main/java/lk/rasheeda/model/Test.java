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
    public void setName(String name) {
        this.name = name;
    }

}

class GeneralDoctor{
    SpecialDoctor specialDoctor;

    public void handle(Patient patient){

        if(patient.syaptom.equalsIgnoreCase("Fever")){
            System.out.println("General Doctor Treating...");
        }else {
            specialDoctor.handle(patient);
        }

    }
}

class SpecialDoctor{

    Consultant consultant;

    public void handle(Patient patient){
        if(patient.syaptom.equalsIgnoreCase("Chest Pain")){
            System.out.println("Special Doctor Treating...");
        }else {
            consultant.handle(patient);
        }
    }

}

class Consultant{

    public void handle(Patient patient){

        if(patient.syaptom.equalsIgnoreCase("Heart Problem")){
            System.out.println("Consultant Treating...");
        }else {
            System.out.println("...");
        }

    }

}

public class Test {

    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.name = "Rasheeda";
        patient.syaptom = "Fever";


        GeneralDoctor generalDoctor = new GeneralDoctor();
        SpecialDoctor specialDoctor = new SpecialDoctor();
        Consultant consultant = new Consultant();

        generalDoctor.specialDoctor = specialDoctor;
        specialDoctor.consultant = consultant;

    }

}

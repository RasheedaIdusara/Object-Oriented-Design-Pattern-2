package lk.rasheeda.model;

import javax.swing.plaf.synth.SynthOptionPaneUI;

interface OS{

    public void lanchApp();

    public void closeApp();

}

abstract class App{

    protected OS os;

    public App(OS os){
        this.os=os;
    }

    public abstract void run();
    public abstract void exit();

}

class Windows implements OS{

    @Override
    public void lanchApp() {
        System.out.println("Windows App Lanching...");
    }

    @Override
    public void closeApp() {
        System.out.println("Windows App Close...");
    }
}

class MacOs implements OS{

    @Override
    public void lanchApp() {
        System.out.println("Mac App Lanching...");
    }

    @Override
    public void closeApp() {
        System.out.println("Mac App Close...");
    }
}

class TextEditor extends App{

    public TextEditor(OS os) {
        super(os);
    }

    @Override
    public void run(){
        System.out.println("TextEditor Running...");
        os.lanchApp();
    }

    @Override
    public void exit(){
        System.out.println("TextEditor Exit...");
        os.closeApp();
    }
}

public class Test {

    public static void main(String[] args) {

        OS windows = new Windows();
        OS macOs = new MacOs();

        App app1 = new TextEditor(windows);
        App app2 = new TextEditor(macOs);

        app1.run();
        app2.run();

        app1.run();
        app2.exit();

        
    }

}

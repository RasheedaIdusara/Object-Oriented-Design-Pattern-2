package lk.rasheeda.model;

import java.util.ArrayList;

interface Component {

    public void display();

    public double getSize();

}

class File implements Component {

    private String fileName;
    private double fileSize;

    public File(String fileName, double fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public void display() {

        System.out.println("File Name: " + this.fileName + "File Size :" + this.fileSize);

    }

    @Override
    public double getSize() {
        return this.fileSize;
    }
}

class Folder implements Component {

    private String folderName;

    ArrayList<Component> componentArrayList = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(Component component) {
        componentArrayList.add(component);
    }

    public void remove(Component component) {
        componentArrayList.remove(component);
    }

    @Override
    public void display() {

        System.out.println("Folder Name: " + this.folderName);
        for (Component component : componentArrayList) {
            component.display();
        }

    }

    @Override
    public double getSize() {

        double total = 0;

        for (Component component : componentArrayList) {
            total += component.getSize();
        }
        return total;
    }
}

public class Test {

    public static void main(String[] args) {

        Folder desktopFolder = new Folder("Desktop");

        Folder documentsFolder = new Folder("Documents");

        File gameFile = new File("Game.exe",2048);

        Folder imagesFolder = new Folder("Images");

        File photoFile = new File("Photo.jpg",1.5);

        File noteFile = new File("Note.txt",1.5);

        File reportFile = new File("Report.pdf",2.0);

        desktopFolder.add(documentsFolder);
        desktopFolder.add(gameFile);
        desktopFolder.add(imagesFolder);
        imagesFolder.add(photoFile);
        documentsFolder.add(noteFile);
        documentsFolder.add(reportFile);

        desktopFolder.display();

        System.out.println("--------------------");

        System.out.println(
                "Total Size: " + desktopFolder.getSize()
        );

    }

}

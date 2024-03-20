package class23;
public class task01 {
    //Create a class File that will have the following behaviors:
    // open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
    public static void main(String[] args) {
        file [] obj={new javafile(),new pdffile(),new wordfile()};
        for (file print:obj
             ) {
            print.open();
        }
    }
}
abstract class  file{
    public abstract void open();
    public void edit(){
        System.out.println("please edit this file");
    }
    public void close(){
        System.out.println("please close this file");
    }
}
class javafile extends file{
    @Override
    public void open(){
        System.out.println(" ot open java file use intellij");
    }
}
class wordfile extends file{
    @Override
    public void open(){
        System.out.println("to open word file use ms office");
    }
}
class pdffile extends file{
    @Override
    public void open(){
        System.out.println(" to open pdf file use acrobe adobe ");
    }
}

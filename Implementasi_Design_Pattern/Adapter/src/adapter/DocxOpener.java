package adapter;

public class DocxOpener implements AdvancedDocOpener {
    @Override
    public void openOdt(String fileName) {
    }

    @Override
    public void openDocx(String fileName) {
        System.out.println("Opening .docx file. Name: "+ fileName);		
    }
}

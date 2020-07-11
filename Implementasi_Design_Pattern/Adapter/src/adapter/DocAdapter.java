package adapter;

public class DocAdapter implements DocOpener {
    AdvancedDocOpener advancedDocOpener;

    public DocAdapter(String docType){
        if(docType.equalsIgnoreCase("odt") ){
            advancedDocOpener = new OdtOpener();			
        }
        else if (docType.equalsIgnoreCase("docx")){
            advancedDocOpener = new DocxOpener();
        }	
    }

    @Override
    public void open(String docType, String fileName) {
        if(docType.equalsIgnoreCase("odt")){
           advancedDocOpener.openOdt(fileName);
        }
        else if(docType.equalsIgnoreCase("docx")){
           advancedDocOpener.openDocx(fileName);
        }
    }
}

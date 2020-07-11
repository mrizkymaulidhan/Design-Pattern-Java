package adapter;

public class AnotherDocOpener implements DocOpener {
    DocAdapter docAdapter; 

    @Override
    public void open(String docType, String fileName) {		
       if(docType.equalsIgnoreCase("pdf")){
          System.out.println("Opening .pdf file. Name: " + fileName);			
       } 
       else if(docType.equalsIgnoreCase("odt") || docType.equalsIgnoreCase("docx")){
          docAdapter = new DocAdapter(docType);
          docAdapter.open(docType, fileName);
       }
       else{
          System.out.println("Format ." + docType + " is not supported!");
       }
    }   
}

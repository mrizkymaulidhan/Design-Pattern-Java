package adapter;

public class OdtOpener implements AdvancedDocOpener {
   @Override
   public void openOdt(String fileName) {
      System.out.println("Opening .odt file. Name: "+ fileName);		
   }

   @Override
   public void openDocx(String fileName) {
   }
}

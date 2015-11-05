/**
 * Write a description of WhichCountriesExport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {
      public void listExporters(CSVParser parser,String exportOfInterst){
         
          //for each row in the CSV File
          for(CSVRecord record:parser){
              //look at the "Exports"colum
              String export=record.get("Exports");
              //Check if it contains exportOfInterest
              if(export.contains(exportOfInterst)){
                  //If so,write down the "Country"from that row
                  String country=record.get("Country");
                  System.out.println(country);
              }
          }
}
public void whoExportsCoffee(){
    FileResource fr=new FileResource();
    CSVParser parser1=fr.getCSVParser();
    CSVParser parser2=fr.getCSVParser();
    listExporters(parser1,"flowers");
    listExporters(parser2,"cotton");
    
    } 
}

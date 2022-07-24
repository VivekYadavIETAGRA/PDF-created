import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
/**
 * This class is used to create a pdf file using iText jar.
 * @author w3spoint
 */
public class VivekPdf {
  public static void main(String args[]){
    try {
       	//Create Document instance.
	Document document = new Document();
 
	//Create OutputStream instance.
	OutputStream outputStream = 
		new FileOutputStream(new File("F:\\VivekPdf.pdf"));
 
	//Create PDFWriter instance.
        PdfWriter.getInstance(document, outputStream);
 
        //Open the document.
        document.open();
 
        //Add content to the document.
        document.add(new Paragraph("Vipin Kumar, " +
       	"Instiute oF Engineering And Technology." + "Electronic And Communication"));
 
        //Close document and outputStream.
        document.close();
        outputStream.close();
 
        System.out.println("Pdf created successfully.");
    } catch (Exception e) {
	e.printStackTrace();
    }
  }
}
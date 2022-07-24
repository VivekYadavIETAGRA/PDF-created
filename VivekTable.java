import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
/**
 * This class is used to create a pdf file using iText jar.
 * @author w3spoint
 */
public class VivekTable {
  public static void main(String args[]){
    try {
	//Create Document instance.
	Document document = new Document();
 
	//Create OutputStream instance.
	OutputStream outputStream = 
	    new FileOutputStream(new File("F:\\VivekTable.pdf"));
 
	//Create PDFWriter instance.
        PdfWriter.getInstance(document, outputStream);
 
        //Open the document.
        document.open();
 
        //Create Table object, Here 4 specify the no. of columns
        PdfPTable pdfPTable = new PdfPTable(4);
 
        //Create cells
        PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("KSHITIJ"));
        PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("AYUSH"));
        PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("YASH"));
        PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("VIVEK "));
		PdfPCell pdfPCell5 = new PdfPCell(new Paragraph("VIPIN "));
        PdfPCell pdfPCell6 = new PdfPCell(new Paragraph("SHIVANSHU "));
        PdfPCell pdfPCell7 = new PdfPCell(new Paragraph("SHIVA "));
        PdfPCell pdfPCell8 = new PdfPCell(new Paragraph("LAND"));
 
        //Add cells to table
        pdfPTable.addCell(pdfPCell1);
        pdfPTable.addCell(pdfPCell2);
        pdfPTable.addCell(pdfPCell3);
        pdfPTable.addCell(pdfPCell4);
		pdfPTable.addCell(pdfPCell5);
        pdfPTable.addCell(pdfPCell6);
        pdfPTable.addCell(pdfPCell7);
        pdfPTable.addCell(pdfPCell8);
 
        //Add content to the document using Table objects.
        document.add(pdfPTable);
 
        //Close document and outputStream.
        document.close();
        outputStream.close();
 
        System.out.println("Pdf created successfully.");
    } catch (Exception e) {
	e.printStackTrace();
    }
  }
}

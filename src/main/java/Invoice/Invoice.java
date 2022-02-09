/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Nisha
 */
public class Invoice {

    public static void main(String[] args) throws IOException {
        System.out.println("hhh");
        
        String path = "invoice.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        
        PdfFont font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
        PdfFont boldFont = PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
        
        Text text = new Text("Font Style Creation").setFont(font);
        Text text1 = new Text(" SET FONT Style").setFont(boldFont);
        
        Paragraph paragraph = new Paragraph().add(text).add(text1);
                
        document.add(paragraph);
        
        document.close();

        System.out.println("helloo....");

    }
}

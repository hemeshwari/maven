/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import java.io.FileNotFoundException;

/**
 *
 * @author Nisha
 */
public class Invoice {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hhh");

        String path = "invoice.pdf";

        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);

        document.close();

        System.out.println("helloo....");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

/**
 *
 * @author Nisha
 */
public class Invoice {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hhh");

        List list = new List();
        list.add("java");
        list.add("kotlin");
        list.add("c");
        list.add("c++");
        list.add("c#");
        list.add("ruby");
        list.add("python");
        list.add("swift");
        
        String path = "invoice.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        document.add(list);
       
        document.close();

        System.out.println("helloo....");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;

/**
 *
 * @author Nisha
 */
public class Invoice {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hhh");

        String path = "invoice.pdf";
        String para = "There are many variations of passages of Lorem "
                + "Ipsum available, but the majority have suffered alteration "
                + "in some form, by injected humour, or randomised words which "
                + "don't look even slightly believable. If you are going to use "
                + "a passage of Lorem Ipsum, you need to be sure there isn't "
                + "anything embarrassing hidden in the middle of text. All the "
                + "Lorem Ipsum generators on the Internet tend to repeat "
                + "predefined chunks as necessary, making this the first true "
                + "generator on the Internet. It uses a dictionary of over 200 "
                + "Latin words, combined with a handful of model sentence "
                + "structures, to generate Lorem Ipsum which looks reasonable. "
                + "The generated Lorem Ipsum is therefore always free from "
                + "repetition, injected humour, or non-characteristic words etc.";
               
        Paragraph paragraph = new Paragraph(para);
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);
        document.add(paragraph);

        document.close();

        System.out.println("helloo....");

    }
}

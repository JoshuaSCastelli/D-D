/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
package d.d;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Joshua
 *
public class editPDF extends Character{
    editPDF(){
        
    }
    public void manipulatePdf(String src, String dest) throws IOException, DocumentException{
        PdfReader reader = new PdfReader(src);
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
        
        AcroFields form = stamper.getAcroFields();
        System.out.println(form.getFields());
        form.setField("PlayerName","blahblah");
        stamper.close();
    }
}

*/
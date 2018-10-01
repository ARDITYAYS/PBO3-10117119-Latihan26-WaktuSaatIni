/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan26waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini dapat menyesuaikan waktu dengan yang ada di komputer
 */
public class PBO310117119Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysofWeek = cal.get(Calendar.DAY_OF_WEEK);
        SimpleDateFormat FormatIndo = new SimpleDateFormat
        ("dd MM yyyy HH:mm:ss");
        String[] strDays = new String[]
        {"Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("Hari ini adalah hari : " 
                + (strDays[daysofWeek]) + ", " + FormatIndo.format(date));

    }

}

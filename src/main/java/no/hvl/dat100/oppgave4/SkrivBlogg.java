package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        try{
            System.out.println("Skriver til fil : " + mappe + filnavn);
            System.out.println("Innhold");
            System.out.println(samling.toString());
            return true;
        }
        catch (Exception e) {
            System.out.println("Noe gikk galt : " + e.getMessage());
            return false;
        }

	}
}

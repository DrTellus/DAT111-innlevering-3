package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    //Oppgave a
    private Innlegg[] innleggsTabell;
    private int nesteLedig;



    //oppgave b
	public Blogg() {
        innleggsTabell = new Innlegg[20];
        nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggsTabell = new Innlegg[lengde];
        nesteLedig = 0;
	}

    //oppgave c
	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggsTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i<nesteLedig; i++){
            if(innleggsTabell[i].erLik(innlegg)){
                return 1;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) !=-1;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggsTabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        if (finnes(innlegg)){
            return false;
        }
        if (!ledigPlass()){
            return false;
        }
        innleggsTabell[nesteLedig] = innlegg;
        nesteLedig++;
        return true;

	}
        @Override
        public String toString() {
            //Oppgave i
            String resultat = nesteLedig + "\n";
            for(int i = 0; i<nesteLedig; i++){
                resultat = resultat + innleggsTabell[i].toString();
            }
            return resultat;
        }



	}

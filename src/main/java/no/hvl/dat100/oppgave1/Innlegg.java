package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {

	// Oppgave 1a)
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    //Oppgave 1b)
    public Innlegg(int id, String bruker, String dato){
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
    }
    public Innlegg(int id, String bruker, String dato, int likes){
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

    //Oppgave 1c)
	public int getId(){
        return id;
    }
    public String getBruker(){
        return bruker;
    }
    public String getDato(){
        return dato;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setBruker(String bruker){
        this.bruker = bruker;
    }
    public void setDato(String dato){
        this.dato = dato;
    }

    public int getLikes(){
        return likes;
    }

    //oppgave 1d)
    public void doLike(){
        likes++;
    }

    //Oppgave 1e) ("1\nOle Olsen\n23-10\n7\n")
    @Override
    public String toString(){
        return id +"\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }
    //oppgave 1f)
    public boolean erLik(Innlegg innlegg){
        //som returnerer true hvis og kun hvis innlegget har samme id som innlegget innlegg git med som parameter.
        return this.id == innlegg.getId();
        //setter klasseID til å være lik id fra innlegget.

    }
    }














	

	

	



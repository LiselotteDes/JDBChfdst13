package be.vdab;
import java.time.LocalDate;

class Werknemer {
    private long id;
    private String voornaam;
    private String familienaam;
    private LocalDate geboorte;
    private LocalDate indienst;
    public Werknemer(long id, String voornaam, String familienaam, LocalDate geboorte, LocalDate indienst) {
        this.id = id;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.geboorte = geboorte;
        this.indienst = indienst;
    }
    @Override
    public String toString() {
        return voornaam + ' ' + familienaam;
    }
    public boolean isJarig() {
        // Maakt een LocalDate object met de datum van vandaag.
        LocalDate vandaag = LocalDate.now();
        // Een werknemer is vandaag jarig als zijn geboortemaand gelijk is aan de maand van vandaag 
        // én zijn geboortedag is gelijk aan de dag van vandaag
        return geboorte.getMonth() == vandaag.getMonth() && geboorte.getDayOfMonth() == vandaag.getDayOfMonth();
    }
}

package fr.uga.iut2.genconf.modele;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hippo
 */
public class Conference implements Serializable, Comparable<Conference> {

    private static final long serialVersionUID = 1L;  // nécessaire pour la sérialisation
    private final GenConf genconf;
    private String nom;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Utilisateur administrateur;  // association qualifiée par l'email
    private final Map<String, Utilisateur> inscrits;//associattion qualifié par l'email
    private final Map<String, Session> sessions;//association qualifié par les noms
    private Programme programme;
            

    // Invariant de classe : !dateDebut.isAfter(dateFin)
    //     On utilise la négation ici pour exprimer (dateDebut <= dateFin), ce
    //     qui est équivalent à !(dateDebut > dateFin).

    public static Conference initialiseConference(GenConf genconf, String nom, LocalDate dateDebut, LocalDate dateFin, Utilisateur admin) {
        Conference conf = new Conference(genconf, nom, dateDebut, dateFin);
        conf.ajouteAdministrateur(admin);
        return conf;
    }

    public Conference(GenConf genconf, String nom, LocalDate dateDebut, LocalDate dateFin) {
        assert !dateDebut.isAfter(dateFin);
        this.genconf = genconf;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.inscrits = new HashMap<>();
        this.sessions = new HashMap<>();
        definirProgramme();
    }

    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nomConf){
        this.nom = nomConf;
    }
    
    public Utilisateur getAdmin(){
        return this.administrateur;
    }
    
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        assert !dateDebut.isAfter(this.dateFin);
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        assert !this.dateDebut.isAfter(dateFin);
        this.dateFin = dateFin;
    }
    
    public void modifieAdmin(String ancienNom){
        getAdmin().getConfs().remove(ancienNom);
        getAdmin().addConferenceAdministree(this);
    }
    
    public void ajouteAdministrateur(Utilisateur admin) {
        assert !this.administrateur.equals(null);
        this.administrateur = admin;
        admin.addConferenceAdministree(this);
    }

    public Map<String, Session> getSessions() {
        return sessions;
    }    

    public Programme getProgramme() {
        return programme;
    }
    
    public void definirProgramme(){
        this.programme = new Programme(this);
    }

    @Override
    public int compareTo(Conference conf) {
        if (this.getDateDebut().isBefore(conf.getDateDebut())){
            return -1;
        }else if (this.getDateDebut().isAfter(conf.getDateDebut())){
            return 1;
        }else 
            return 0;
    }   
}

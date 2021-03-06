package fr.uga.iut2.genconf.modele;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import fr.uga.iut2.genconf.util.*;

/**
 *
 * @author hippo
 */
public class GenConf implements Serializable {

    private static final long serialVersionUID = 1L;  // nécessaire pour la sérialisation
    private final HashMap<String, Utilisateur> utilisateurs;  // association qualifiée par l'email
    private final HashMap<String, Conference> conferences;  // association qualifiée par le nom

    public GenConf() {
        this.utilisateurs = new HashMap<>();
        this.conferences = new HashMap<>();
        
    }

    public boolean ajouteUtilisateur(String email, String nom, String prenom) {
        if (this.utilisateurs.containsKey(email)) {
            return false;
        } else {
            this.utilisateurs.put(email, new Utilisateur(email, nom, prenom));
            return true;
        }
    }

    public void nouvelleConference(String nom, LocalDate dateDebut, LocalDate dateFin, String adminEmail) {
        assert !getConferences().containsKey(nom);
        assert getUsers().containsKey(adminEmail);
        Utilisateur admin = getUsers().get(adminEmail);
        Conference conf = Conference.initialiseConference(this, nom, dateDebut, dateFin, admin);
        getConferences().put(nom, conf);
    }
    
    public HashMap<String, Conference> getConferences(){
        return this.conferences;
    }
    
    public HashMap<String, Utilisateur> getUsers(){
        return this.utilisateurs;
    }
}

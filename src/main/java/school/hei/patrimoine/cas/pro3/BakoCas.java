package school.hei.patrimoine.cas.pro3;

import school.hei.patrimoine.cas.Cas;
import school.hei.patrimoine.modele.Argent;
import school.hei.patrimoine.modele.Devise;
import school.hei.patrimoine.modele.Personne;
import school.hei.patrimoine.modele.possession.Compte;
import school.hei.patrimoine.modele.possession.FluxArgent;
import school.hei.patrimoine.modele.possession.Materiel;
import school.hei.patrimoine.modele.possession.Possession;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;

public class BakoCas extends Cas {
    public BakoCas(LocalDate ajd, LocalDate finSimulation, Personne possesseur) {
        super(ajd, finSimulation, possesseur);
    }

    @Override
    protected Devise devise() {
        return Devise.MGA;
    }

    @Override
    protected String nom() {
        return "etudiant cas";
    }

    @Override
    protected void init() {

    }

    @Override
    protected void suivi() {

    }

    @Override
    public Set<Possession> possessions() {
    var compte_courant_BNI=new Compte("BNI",LocalDate.of(2025, Month.APRIL,8), Argent.ariary(2_000_000));
    var compte_epargne_BMOI=new Compte("BMOI",LocalDate.of(2025,Month.APRIL,8),Argent.ariary(625_000));
    var coffre_fort=new Compte("coffre fort",LocalDate.of(2025,Month.APRIL,8),Argent.ariary(1_750_000));

        new FluxArgent("SalaireNet",compte_courant_BNI,LocalDate.of(2025,Month.MAY,2),LocalDate.of(2025,Month.DECEMBER,31),2,Argent.ariary(2_125_000-200_000 ));
        new FluxArgent("epargne",compte_epargne_BMOI,LocalDate.of(2025,Month.MAY,3),LocalDate.of(2025,Month.DECEMBER,31),3,Argent.ariary(200_000));
        new FluxArgent("loyer",compte_courant_BNI,LocalDate.of(2025,Month.MAY,1),LocalDate.of(2025,Month.DECEMBER,31),1,Argent.ariary(-600_000));
        new FluxArgent("depense_quotidien",compte_courant_BNI,LocalDate.of(2025,Month.MAY,1),LocalDate.of(2025,Month.DECEMBER,31),1,Argent.ariary(-700_000));
    var ordinateur_portable=new Materiel(
            "ordinateur portable",
            LocalDate.of(2025,Month.APRIL,8),
            LocalDate.of(2025,Month.APRIL,8),
            Argent.ariary(3_000_000),
            -0.12

    );

        return Set.of(compte_courant_BNI,compte_epargne_BMOI,coffre_fort,ordinateur_portable);
    }
}




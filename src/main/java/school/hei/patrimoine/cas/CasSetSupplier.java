package school.hei.patrimoine.cas;

import school.hei.patrimoine.cas.pro3.BakoCas;
import school.hei.patrimoine.modele.Argent;
import school.hei.patrimoine.modele.Personne;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;
import java.util.function.Supplier;

public class CasSetSupplier implements Supplier<CasSet> {
  @Override
  public CasSet get() {
    return new CasSet(
            Set.of(
                    new BakoCas(
                            LocalDate.of(2025, Month.MARCH,8),
                            LocalDate.of(2025,Month.DECEMBER,31),
                            new Personne("bako")
                    )
            ),
            Argent.ariary(13_711_657)
    );
  }
}

package repository;
import model.Produkt;

public class ProduktRepository extends InMemoryRepository<Produkt> {
    public ProduktRepository() {
        super();
    }

    @Override
    public Produkt update(Produkt entity) {
        return null;
    }
}

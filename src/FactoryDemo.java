import java.util.Objects;

public class FactoryDemo {

    public static void main(String[] args) {
        Advert advert1 = AdvertFactory.createAdverts("Sale Real Estate");
        Objects.requireNonNull(advert1).create();

        Advert advert2 = AdvertFactory.createAdverts("Rent Real Estate");
        Objects.requireNonNull(advert2).create();
    }
}
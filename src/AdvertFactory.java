public class AdvertFactory {

    public static Advert createAdverts(String advertType) {
        if (advertType.equalsIgnoreCase("Sale Real Estate")) {
            return new SaleRealEstate();
        } else if (advertType.equalsIgnoreCase("Rent Real Estate")) {
            return new RentRealEstate();
        }
        return null;
    }
}
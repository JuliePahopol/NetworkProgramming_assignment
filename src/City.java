public class City {
    private int ref;
    private String cityRoNom;
    private String cityRoAcc;
    private String cityRoGen;
    private String cityRoDat;
    private String cityRoVoc; // New field for vocative case
    private String cityEnGender;
    private String cityEnNom;
    private String cityState;

    // Updated constructor to include vocative case
    public City(int ref, String cityRoNom, String cityRoAcc, String cityRoGen,
            String cityRoDat, String cityRoVoc, String cityEnGender, String cityEnNom, String cityState) {
        this.ref = ref;
        this.cityRoNom = cityRoNom;
        this.cityRoAcc = cityRoAcc;
        this.cityRoGen = cityRoGen;
        this.cityRoDat = cityRoDat;
        this.cityRoVoc = cityRoVoc;
        this.cityEnGender = cityEnGender;
        this.cityEnNom = cityEnNom;
        this.cityState = cityState;
    }

    // Getters
    public int getRef() {
        return ref;
    }

    public String getCityEnNom() {
        return cityEnNom;
    }

    public String getAllAttributes() {
        return String.format(
                "ref=%d | city_ro_nom=%s | city_ro_acc=%s | city_ro_gen=%s | city_ro_dat=%s | city_ro_voc=%s | "
                        + "city_en_gender=%s | city_en_nom=%s | city_state=%s",
                ref, cityRoNom, cityRoAcc, cityRoGen, cityRoDat, cityRoVoc, cityEnGender, cityEnNom, cityState);
    }
}

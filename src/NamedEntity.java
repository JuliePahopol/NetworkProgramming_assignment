public class NamedEntity {
    private String entRoNom;
    private String entRoAcc;
    private String entRoGen;
    private String entRoDat;
    private String entEnGender;
    private int cityRef;
    private String type;

    public NamedEntity(String entRoNom, String entRoAcc, String entRoGen,
                       String entRoDat, String entEnGender, int cityRef, String type) {
        this.entRoNom = entRoNom;
        this.entRoAcc = entRoAcc;
        this.entRoGen = entRoGen;
        this.entRoDat = entRoDat;
        this.entEnGender = entEnGender;
        this.cityRef = cityRef;
        this.type = type;
    }

    public int getCityRef() {
        return cityRef;
    }

    public String getType() {
        return type;
    }

    public String getAllAttributes() {
        return String.format(
            "ent_ro_nom=%s | ent_ro_acc=%s | ent_ro_gen=%s | ent_ro_dat=%s "
          + "| ent_en_gender=%s | city_ref=%d | type=%s",
            entRoNom, entRoAcc, entRoGen, entRoDat,
            entEnGender, cityRef, type
        );
    }
}

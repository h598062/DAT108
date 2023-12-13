@Entity
public class Bok {
    @Id 
    private Integer id;
    private String tittel;
    private String bildefil; // Navnet på bildefilen
    @OneToMany(mappedBy = "bok", fetch = FetchType.EAGER)
    private List<Anmeldelse> anmeldelser;
    public void leggTilAnmeldelse(Anmeldelse anmeldelse)
    public int getAvrundetSnittrating() // gir avrundet snitt 1,2,3,4 eller 5
}

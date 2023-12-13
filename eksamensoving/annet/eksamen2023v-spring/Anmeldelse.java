@Entity
public class Anmeldelse {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rating; // 1 .. 5
    private String tekst;
    private String anmelder;
    @ManyToOne 
    @JoinColumn(name = "bok_id")
    private Bok bok;
}
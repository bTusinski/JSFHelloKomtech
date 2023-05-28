package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Pracownicy", schema = "dbo", catalog = "HelloKomtechDb")
public class PracownicyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "prac_id")
    private int pracId;
    @Basic
    @Column(name = "prac_imie")
    private String pracImie;
    @Basic
    @Column(name = "prac_nazwisko")
    private String pracNazwisko;
    @Basic
    @Column(name = "prac_wiek")
    private Integer pracWiek;
    @Basic
    @Column(name = "prac_nr_telefonu")
    private String pracNrTelefonu;
    @Basic
    @Column(name = "prac_email")
    private String pracEmail;

    public int getPracId() {
        return pracId;
    }

    public void setPracId(int pracId) {
        this.pracId = pracId;
    }

    public String getPracImie() {
        return pracImie;
    }

    public void setPracImie(String pracImie) {
        this.pracImie = pracImie;
    }

    public String getPracNazwisko() {
        return pracNazwisko;
    }

    public void setPracNazwisko(String pracNazwisko) {
        this.pracNazwisko = pracNazwisko;
    }

    public Integer getPracWiek() {
        return pracWiek;
    }

    public void setPracWiek(Integer pracWiek) {
        this.pracWiek = pracWiek;
    }

    public String getPracNrTelefonu() {
        return pracNrTelefonu;
    }

    public void setPracNrTelefonu(String pracNrTelefonu) {
        this.pracNrTelefonu = pracNrTelefonu;
    }

    public String getPracEmail() {
        return pracEmail;
    }

    public void setPracEmail(String pracEmail) {
        this.pracEmail = pracEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PracownicyEntity that = (PracownicyEntity) o;

        if (pracId != that.pracId) return false;
        if (pracImie != null ? !pracImie.equals(that.pracImie) : that.pracImie != null) return false;
        if (pracNazwisko != null ? !pracNazwisko.equals(that.pracNazwisko) : that.pracNazwisko != null) return false;
        if (pracWiek != null ? !pracWiek.equals(that.pracWiek) : that.pracWiek != null) return false;
        if (pracNrTelefonu != null ? !pracNrTelefonu.equals(that.pracNrTelefonu) : that.pracNrTelefonu != null)
            return false;
        if (pracEmail != null ? !pracEmail.equals(that.pracEmail) : that.pracEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pracId;
        result = 31 * result + (pracImie != null ? pracImie.hashCode() : 0);
        result = 31 * result + (pracNazwisko != null ? pracNazwisko.hashCode() : 0);
        result = 31 * result + (pracWiek != null ? pracWiek.hashCode() : 0);
        result = 31 * result + (pracNrTelefonu != null ? pracNrTelefonu.hashCode() : 0);
        result = 31 * result + (pracEmail != null ? pracEmail.hashCode() : 0);
        return result;
    }
}

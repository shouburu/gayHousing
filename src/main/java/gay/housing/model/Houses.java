package gay.housing.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "houses")
public class Houses {

    @Id
    @GeneratedValue
    @Column(name = "house_id")
    private Integer house_id;

    @Column(name = "street")
    private String street;

    @Column(name = "unit")
    private String unit;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private Integer zip;

    @Column(name = "display_name")
    private String display_name;

    @Column(name = "latitute")
    private Float latitute;

    @Column(name = "longitude")
    private Float longitude;

    @Column(name = "pictures")
    private String pictures;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "last_login")
    private Timestamp last_login;

    @Column(name = "is_active")
    private Integer is_active;

    public Houses() {}

    public Houses(Integer house_id, String street, String unit, String city, String state, Integer zip, String display_name, Float latitute, Float longitude, String pictures, Timestamp created_at, Timestamp last_login, Integer is_active) {
        this.house_id = house_id;
        this.street = street;
        this.unit = unit;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.display_name = display_name;
        this.latitute = latitute;
        this.longitude = longitude;
        this.pictures = pictures;
        this.created_at = created_at;
        this.last_login = last_login;
        this.is_active = is_active;
    }

    public Integer getHouse_id() {
        return house_id;
    }

    public void setHouse_id(Integer house_id) {
        this.house_id = house_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Float getLatitute() {
        return latitute;
    }

    public void setLatitute(Float latitute) {
        this.latitute = latitute;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getLast_login() {
        return last_login;
    }

    public void setLast_login(Timestamp last_login) {
        this.last_login = last_login;
    }

    public Integer getIs_active() {
        return is_active;
    }

    public void setIs_active(Integer is_active) {
        this.is_active = is_active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Houses)) return false;

        Houses houses = (Houses) o;

        if (!house_id.equals(houses.house_id)) return false;
        if (street != null ? !street.equals(houses.street) : houses.street != null) return false;
        if (unit != null ? !unit.equals(houses.unit) : houses.unit != null) return false;
        if (city != null ? !city.equals(houses.city) : houses.city != null) return false;
        if (state != null ? !state.equals(houses.state) : houses.state != null) return false;
        if (!zip.equals(houses.zip)) return false;
        if (display_name != null ? !display_name.equals(houses.display_name) : houses.display_name != null)
            return false;
        if (latitute != null ? !latitute.equals(houses.latitute) : houses.latitute != null) return false;
        if (longitude != null ? !longitude.equals(houses.longitude) : houses.longitude != null) return false;
        if (pictures != null ? !pictures.equals(houses.pictures) : houses.pictures != null) return false;
        if (!created_at.equals(houses.created_at)) return false;
        if (!last_login.equals(houses.last_login)) return false;
        return is_active.equals(houses.is_active);
    }

    @Override
    public int hashCode() {
        int result = house_id.hashCode();
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + zip.hashCode();
        result = 31 * result + (display_name != null ? display_name.hashCode() : 0);
        result = 31 * result + (latitute != null ? latitute.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (pictures != null ? pictures.hashCode() : 0);
        result = 31 * result + created_at.hashCode();
        result = 31 * result + last_login.hashCode();
        result = 31 * result + is_active.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Houses{" +
                "house_id=" + house_id +
                ", street='" + street + '\'' +
                ", unit='" + unit + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", display_name='" + display_name + '\'' +
                ", latitute=" + latitute +
                ", longitude=" + longitude +
                ", pictures='" + pictures + '\'' +
                ", created_at=" + created_at +
                ", last_login=" + last_login +
                ", is_active=" + is_active +
                '}';
    }
}

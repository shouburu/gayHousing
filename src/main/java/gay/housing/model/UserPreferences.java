package gay.housing.model;

import javax.persistence.Column;
import java.sql.Timestamp;

public class UserPreferences {

    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "rent_lower")
    private Integer rent_lower;

    @Column(name = "rent_higher")
    private Integer rent_higher;

    @Column(name = "desired_zip")
    private Integer desired_zip;

    @Column(name = "num_cats")
    private Integer num_cats;

    @Column(name = "num_dogs")
    private Integer num_dogs;

    @Column(name = "num_children")
    private Integer num_children;

    @Column(name = "accepts_children")
    private Integer accepts_children;

    @Column(name = "is_smoker")
    private Integer is_smoker;

    @Column(name = "party_level")
    private Integer party_level;

    @Column(name = "clean_level")
    private Integer clean_level;

    @Column(name = "age")
    private Integer age;

    @Column(name = "age_importance")
    private Integer age_importance;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "num_occupants")
    private Integer num_occupants;

    @Column(name = "last_updated")
    private Timestamp last_updated;

    public UserPreferences() {}

    public UserPreferences(Integer user_id, Integer rent_lower, Integer rent_higher, Integer desired_zip, Integer num_cats, Integer num_dogs, Integer num_children, Integer accepts_children, Integer is_smoker, Integer party_level, Integer clean_level, Integer age, Integer age_importance, String occupation, Integer num_occupants, Timestamp last_updated) {
        this.user_id = user_id;
        this.rent_lower = rent_lower;
        this.rent_higher = rent_higher;
        this.desired_zip = desired_zip;
        this.num_cats = num_cats;
        this.num_dogs = num_dogs;
        this.num_children = num_children;
        this.accepts_children = accepts_children;
        this.is_smoker = is_smoker;
        this.party_level = party_level;
        this.clean_level = clean_level;
        this.age = age;
        this.age_importance = age_importance;
        this.occupation = occupation;
        this.num_occupants = num_occupants;
        this.last_updated = last_updated;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRent_lower() {
        return rent_lower;
    }

    public void setRent_lower(Integer rent_lower) {
        this.rent_lower = rent_lower;
    }

    public Integer getRent_higher() {
        return rent_higher;
    }

    public void setRent_higher(Integer rent_higher) {
        this.rent_higher = rent_higher;
    }

    public Integer getDesired_zip() {
        return desired_zip;
    }

    public void setDesired_zip(Integer desired_zip) {
        this.desired_zip = desired_zip;
    }

    public Integer getNum_cats() {
        return num_cats;
    }

    public void setNum_cats(Integer num_cats) {
        this.num_cats = num_cats;
    }

    public Integer getNum_dogs() {
        return num_dogs;
    }

    public void setNum_dogs(Integer num_dogs) {
        this.num_dogs = num_dogs;
    }

    public Integer getNum_children() {
        return num_children;
    }

    public void setNum_children(Integer num_children) {
        this.num_children = num_children;
    }

    public Integer getAccepts_children() {
        return accepts_children;
    }

    public void setAccepts_children(Integer accepts_children) {
        this.accepts_children = accepts_children;
    }

    public Integer getIs_smoker() {
        return is_smoker;
    }

    public void setIs_smoker(Integer is_smoker) {
        this.is_smoker = is_smoker;
    }

    public Integer getParty_level() {
        return party_level;
    }

    public void setParty_level(Integer party_level) {
        this.party_level = party_level;
    }

    public Integer getClean_level() {
        return clean_level;
    }

    public void setClean_level(Integer clean_level) {
        this.clean_level = clean_level;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge_importance() {
        return age_importance;
    }

    public void setAge_importance(Integer age_importance) {
        this.age_importance = age_importance;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getNum_occupants() {
        return num_occupants;
    }

    public void setNum_occupants(Integer num_occupants) {
        this.num_occupants = num_occupants;
    }

    public Timestamp getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Timestamp last_updated) {
        this.last_updated = last_updated;
    }


}

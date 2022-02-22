package web.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    private long id;
    private String carname;
    private String colour;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

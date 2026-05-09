package de.hs.callum.ghostnet.entity;

import jakarta.persistence.*;

@Entity
public class GhostNet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitude;
    private Double longitude;
    private Double size;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Person reporter;

    @ManyToOne
    private Person rescuer;

    public GhostNet() {
    }

    public Long getId() {
        return id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getReporter() {
        return reporter;
    }

    public void setReporter(Person reporter) {
        this.reporter = reporter;
    }

    public Person getRescuer() {
        return rescuer;
    }

    public void setRescuer(Person rescuer) {
        this.rescuer = rescuer;
    }
}
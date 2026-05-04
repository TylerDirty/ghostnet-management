package de.hs.callum.ghostnet.entity;

import jakarta.persistence.*;

@Entity
public class GhostNet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double latitude;
    private double longitude;
    private double size;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Person reporter;

    @ManyToOne
    private Person rescuer;

    public GhostNet() {
    }

    public Long getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
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
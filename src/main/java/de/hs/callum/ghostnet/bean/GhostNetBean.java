package de.hs.callum.ghostnet.bean;

import de.hs.callum.ghostnet.entity.GhostNet;
import de.hs.callum.ghostnet.entity.Status;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class GhostNetBean {

    private GhostNet ghostNet = new GhostNet();

    public GhostNetBean() {
        ghostNet.setStatus(Status.GEMELDET);
    }

    public GhostNet getGhostNet() {
        return ghostNet;
    }

    public void setGhostNet(GhostNet ghostNet) {
        this.ghostNet = ghostNet;
    }

    public String createGhostNet() {
        System.out.println("Geisternetz wurde erfasst:");
        System.out.println("Latitude: " + ghostNet.getLatitude());
        System.out.println("Longitude: " + ghostNet.getLongitude());
        System.out.println("Size: " + ghostNet.getSize());

        return "index.xhtml?faces-redirect=true";
    }
}
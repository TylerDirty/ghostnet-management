package de.hs.callum.ghostnet.bean;

import de.hs.callum.ghostnet.entity.GhostNet;
import de.hs.callum.ghostnet.entity.Status;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import de.hs.callum.ghostnet.repository.GhostNetRepository;
import jakarta.inject.Inject;

@Named
@RequestScoped
public class GhostNetBean {

    private GhostNet ghostNet = new GhostNet();
    @Inject
    private GhostNetRepository repository;

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
        repository.save(ghostNet);

        System.out.println("Geisternetz wurde gespeichert!");

        return "index.xhtml?faces-redirect=true";
    }
}
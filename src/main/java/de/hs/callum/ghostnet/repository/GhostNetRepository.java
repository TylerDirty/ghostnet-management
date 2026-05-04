package de.hs.callum.ghostnet.repository;

import de.hs.callum.ghostnet.entity.GhostNet;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@ApplicationScoped
public class GhostNetRepository {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("ghostnetPU");

    public void save(GhostNet ghostNet) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(ghostNet);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
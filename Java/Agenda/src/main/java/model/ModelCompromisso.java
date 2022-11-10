package model;

import entidade.Compromisso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ModelCompromisso {

    public EntityManager getEm() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AgendaPU");
        return factory.createEntityManager();
    }

    public void salvar(Compromisso c) throws Exception {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            if (c.getId() == null) {
                em.persist(c);
            } else {
                em.merge(c);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Compromisso> listarCompromisso() {
        EntityManager em = getEm();
        try {
            return em.createQuery("select c from Compromisso c").getResultList();
        } finally {
            em.close();
        }
    }

    public void excluir(Long id) {
        EntityManager em = getEm();
        Compromisso c = em.find(Compromisso.class, id);
        try {
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }
}

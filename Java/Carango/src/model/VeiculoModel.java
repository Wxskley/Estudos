package model;

import entidade.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VeiculoModel {

    public EntityManager getEm() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CarangoPU");
        return factory.createEntityManager();
    }

    public void salvar(Veiculo v) throws Exception {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            if (v.getId() == null) {
                em.persist(v);
            } else {
                em.merge(v);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Veiculo> listaVeiculos() {
        EntityManager em = getEm();
        try {
            return em.createQuery("select v from Veiculo v ").getResultList();
        } finally {
            em.close();
        }
    }

    public void excluir(Veiculo v) {
        EntityManager em = getEm();
        em.remove(v);
    }
}

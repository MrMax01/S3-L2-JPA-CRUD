package massimomauro.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventDAO {
    private final EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Evento event){
        EntityTransaction transiction = em.getTransaction();
        try{
            transiction.begin();
            em.persist(event);
            transiction.commit();
            System.out.println("Evento salvato!");
        }catch(Exception e){
            System.err.println("Errore nel salvataggio nel DB");
        }
    }

    public Evento findById(long id) {
        // SELECT * FROM students WHERE students.id=1
        return em.find(Evento.class, id);
    }
    public void delete(long id){
        Evento found = findById(id);
        if(found!=null){
            EntityTransaction transiction = em.getTransaction();
            try{
                transiction.begin();
                em.remove(found);
                transiction.commit();
            }catch (Exception e){
                System.err.println("Si è presentato un errore nell'eliminare l'evento");
            }
        }else{
            System.err.println("Elemento non trovato!");
        }

    }
    public void refreshFromDB(Evento event){
        em.refresh(event);
        System.out.println("Oggetto ripristinato!");
    }
}

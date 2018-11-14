package com.example.demo;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Data Access Object - provide some specific data operations without exposing details of the database
 * Access data for the Vehicle entity.
 * Repository annotation allows Spring to find and configure the DAO.
 * Transactional annotation will cause Spring to call begin() and commit()
 * at the start/end of the method. If exception occurs it will also call rollback().
 */
@Repository
@Transactional
public class VehiclesDao {

    //PersistenceContext annotation used to specify there is a database source.
    //EntityManager is used to create and remove persistent entity instances,
    //to find entities by their primary key, and to query over entities.
    @PersistenceContext
    private EntityManager entityManager;

    //Insert vehicle into the database.
    public void create(Vehicle newVehicle) {
        entityManager.persist(newVehicle);
        return;
    }

    //Return the vehicle with the passed-in id.
    public Vehicle getById(int id) {
        return entityManager.find(Vehicle.class, id);
    }

    public void delete(int id) {
        if (entityManager.contains(id))
            entityManager.remove(id);
        else
            entityManager.remove(entityManager.merge(id));
        return;
    }

    public void update(Vehicle vehicle) {
        if (entityManager.contains(vehicle))
            entityManager.merge(vehicle);
        else
            return;
    }

    public List getLatest() {
        return entityManager.createQuery("SELECT * FROM vehicles").setMaxResults(10).getResultList();
    }
}
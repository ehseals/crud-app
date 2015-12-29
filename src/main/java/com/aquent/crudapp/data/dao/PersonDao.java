package com.aquent.crudapp.data.dao;

import com.aquent.crudapp.domain.Person;
import java.util.List;

/**
 * Operations on the "person" table.
 */
public interface PersonDao {

    /**
     * Retrieves all of the person records.
     *
     * @return list of person records
     */
    List<Person> listPeople();
    
    /**
     *     
     * @param personId
     * @return returns the clients that are not could possible be clients
     * 
     */

    Integer createPerson(Person person);

    /**
     * Retrieves a person record by ID.
     *
     * @param id the person ID
     * @return the person record
     */
    Person readPerson(Integer id);

    /**
     * Updates an existing person record.
     *
     * @param person the new values to save
     */
    void updatePerson(Person person);

    /**
     * Deletes a person record by ID.
     *
     * @param id the person ID
     */
    void deletePerson(Integer id);
    
    void addClientToPerson(Integer id, Integer clientToAdd);

	List<Person> listPossiblePeople(Integer clientId);

	List<Person> listAClientsPeople(Integer clientId);

}

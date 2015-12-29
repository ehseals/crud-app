package com.aquent.crudapp.service;

import java.util.List;

import com.aquent.crudapp.domain.Person;

/**
 * Person operations.
 */
public interface PersonService {

    /**
     * Retrieves all of the person records.
     *
     * @return list of person records
     */
    List<Person> listPeople();
    
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

    /**
     * Validates populated person data.
     *
     * @param person the values to validate
     * @return list of error messages
     */
    List<String> validatePerson(Person person);

	void addClientToPerson(Integer personId, Integer clientToAdd);
    
    /**
     * 
     * @param personId
     * @param clientId
     * makes the the client id a client of the person id
     */

	List<Person> listPossiblePeople(Integer clientId); 
	
	List<Person> listAClientsPeople(Integer clientId);

	


}

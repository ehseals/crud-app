package com.aquent.crudapp.service;

import java.util.List;

import com.aquent.crudapp.domain.Client;

public interface ClientService {

	
	 
	     /**
     * Retrieves all of the person records.
     *
     * @return list of client records
     */
    List<Client> listClients();
    
    /**
     * 
     * @param id
     * @return list the possible clients that a person can add
     */
    
	
	/**List<Client> listPossibleclients(Integer id); */

    /**
     * Creates a new person record
     *
     * @param 	client values to save
     * @return the new person ID
     */
    Integer createClient(Client client);

    /**
     * Retrieves a Client record by ID.
     *
     * @param id the person ID
     * @return the person record
     */
    
    Client readClient(Integer id);

    /**
     * Updates an existing client record.
     *
     * @param person the new values to save
     */
    void updateClient(Client client);

    /**
     * Deletes a client record by ID.
     *
     * @param id the person ID
     */
    void deleteClient(Integer id);

    /**
     * Validates populated client data.
     *
     * @param person the values to validate
     * @return list of error messages
     */
    List<String> validateClient(Client client);

	List<Client> listPossibleClients(Integer Id);
	
	List<Client> listClients(Integer Id);
	 

}

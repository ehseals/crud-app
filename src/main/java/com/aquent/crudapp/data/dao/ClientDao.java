package com.aquent.crudapp.data.dao;

import java.util.List;

import com.aquent.crudapp.domain.Client;

public interface ClientDao {
	
	 /**
     * Retrieves all of the client records.
     *
     * @return list of person records
     */
    List<Client> listClients();
    
    /**
     * 
     * @param client
     * @return the client id of the new client that has just been created
     */

    Integer createClient(Client client);

    /**
     * Retrieves a person record by ID.
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
     * Deletes a person record by ID.
     *
     * @param id the person ID
     */
    void deleteClient(Integer id);

	List<Client> getPossibleClients(Integer id);

	List<Client> listClients(Integer id);


}

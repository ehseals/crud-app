package com.aquent.crudapp.data.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aquent.crudapp.data.dao.ClientDao;
import com.aquent.crudapp.domain.Client;



public class ClientJdbcDao implements ClientDao {
	
	private static final String SQL_LIST_CLIENTS = "SELECT * FROM client ORDER BY name";
	private static final String SQL_READ_CLIENT = "SELECT * FROM client WHERE client_id = :clientId";
	private static final String SQL_DELETE_CLIENT = "DELETE FROM client WHERE client_id = :clientId";
	private static final String SQL_UPDATE_CLIENT = "UPDATE client SET (name, street_address, city, state, zip_code, phone_number, uri)"
            + " = (:name, :streetAddress, :city, :state, :zipCode, :phoneNumber, :uri)"
            + " WHERE client_id = :clientId";
	private static final String SQL_CREATE_CLIENT = "Insert into client (name, street_address, city, state, zip_code, phone_number, uri)"
            + " values (:name, :streetAddress, :city, :state, :zipCode, :phoneNumber, :uri)";
	private static final String LIST_CLIENTS = "Select C.* from Client C join associations A ON c.Client_Id = A.client_id  where A.person_id = :personId";
	private static final String LIST_POSSIBLE_CLIENTS = "Select * from Client where client_id not in ( Select client_id from associations where person_id = :personId )";

	
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Client> listClients() {
        return namedParameterJdbcTemplate.getJdbcOperations().query(SQL_LIST_CLIENTS, new ClientRowMapper());
    }
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Client readClient(Integer clientId) {
        return namedParameterJdbcTemplate.queryForObject(SQL_READ_CLIENT, Collections.singletonMap("clientId", clientId), new ClientRowMapper());
    }
	
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public void deleteClient(Integer clientId) {
        namedParameterJdbcTemplate.update(SQL_DELETE_CLIENT, Collections.singletonMap("clientId", clientId));
    }
    
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public void updateClient(Client client) {
        namedParameterJdbcTemplate.update(SQL_UPDATE_CLIENT, new BeanPropertySqlParameterSource(client));
    }
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public Integer createClient(Client client) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(SQL_CREATE_CLIENT, new BeanPropertySqlParameterSource(client), keyHolder);
        return keyHolder.getKey().intValue();
    }
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Client> getPossibleClients(Integer id){
    	return  namedParameterJdbcTemplate.query(LIST_POSSIBLE_CLIENTS, Collections.singletonMap("personId", id), new ClientRowMapper());
    }
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Client> listClients(Integer id){
    	return  namedParameterJdbcTemplate.query(LIST_CLIENTS, Collections.singletonMap("personId", id), new ClientRowMapper());
    }

   
	
    private static final class ClientRowMapper implements RowMapper<Client> {

        @Override
        public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
            Client client = new Client();
            client.setClientId(rs.getInt("client_id"));
            client.setName(rs.getString("name"));
            client.setStreetAddress(rs.getString("street_address"));
            client.setCity(rs.getString("city"));
            client.setState(rs.getString("state"));
            client.setZipCode(rs.getString("zip_code"));
            client.setPhoneNumber(rs.getString("phone_number"));
            client.setUri(rs.getString("uri"));
            return client;            
        }
    }

}

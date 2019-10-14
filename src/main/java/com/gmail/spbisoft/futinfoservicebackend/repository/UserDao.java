package com.gmail.spbisoft.futinfoservicebackend.repository;

import com.gmail.spbisoft.futinfoservicebackend.model.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {

	DAOUser findByUsername(String username);

}

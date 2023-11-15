package in.thiru.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.thiru.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{

}

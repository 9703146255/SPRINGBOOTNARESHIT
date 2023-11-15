package in.thiru.dao;

import org.springframework.data.repository.CrudRepository;

import in.thiru.model.Publisher;

public interface PublisherDao extends CrudRepository<Publisher, Integer>
{

}

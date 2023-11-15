package in.thiru.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.thiru.model.Insurance;


@Repository
public interface InsuranceDao extends JpaRepository<Insurance, Integer>{

}

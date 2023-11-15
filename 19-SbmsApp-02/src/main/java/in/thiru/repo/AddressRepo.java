package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

	Address getByUserId(Integer userId);
}

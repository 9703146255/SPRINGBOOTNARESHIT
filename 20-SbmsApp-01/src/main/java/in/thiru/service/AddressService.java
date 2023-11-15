package in.thiru.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import in.thiru.model.Address;

@Service
public class AddressService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void refreshAddress(Address address) {
        entityManager.refresh(address);
    }

    // Other methods...
}



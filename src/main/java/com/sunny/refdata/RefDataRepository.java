package com.sunny.refdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sunny.refdata.RefData;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository("refDataRepository")
public interface RefDataRepository extends CrudRepository<RefData, Long> {

}

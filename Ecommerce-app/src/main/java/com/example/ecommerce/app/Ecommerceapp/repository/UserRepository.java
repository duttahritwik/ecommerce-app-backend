package com.example.ecommerce.app.Ecommerceapp.repository;

import com.example.ecommerce.app.Ecommerceapp.entity.UserMetaData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserMetaData, Long> {
    UserMetaData findAllByUniqueId(String uniqueID);
    UserMetaData save(UserMetaData userMetaData);
}

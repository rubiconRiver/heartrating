package com.heartrating.heartrating.Repository;

import com.heartrating.heartrating.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "userREST", path="userREST")
public interface UserRepository extends JpaRepository<UserModel, Long> {
  //  UserModel findByEmail(String email);
}

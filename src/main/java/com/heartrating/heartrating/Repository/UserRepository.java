package com.heartrating.heartrating.Repository;

import com.heartrating.heartrating.Model.UserModel;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "userREST", path="userREST")
public interface UserRepository extends JpaRepository<UserModel, Long> {
  Boolean existsByName(String name);
  UserModel findUserModelByName(String name);
}

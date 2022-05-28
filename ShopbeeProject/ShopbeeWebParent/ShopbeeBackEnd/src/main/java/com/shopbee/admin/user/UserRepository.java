package com.shopbee.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shopbee.common.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
 
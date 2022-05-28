package com.shopbee.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopbee.common.entity.Role;

@Repository
public interface RoleRepository  extends CrudRepository<Role, Integer>{

}

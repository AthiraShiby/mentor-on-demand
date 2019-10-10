package com.project.Users;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface UsersRepository extends CrudRepository<Users, Long> {

    @Query(value="select * from users u where u.user_name=?1",nativeQuery=true)
    Users searchUserName(String userName);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value="update users u set active=false where u.user_name=?1",nativeQuery=true)
    void blockUser(String userName);
}

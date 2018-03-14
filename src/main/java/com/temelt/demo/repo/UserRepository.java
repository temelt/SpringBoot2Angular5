package com.temelt.demo.repo;

import com.temelt.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tanert on 14.03.2018.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
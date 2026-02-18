package com.pipo_petr.pipo_links_short.repository;

import com.pipo_petr.pipo_links_short.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

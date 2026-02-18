package com.pipo_petr.pipo_links_short.repository;

import com.pipo_petr.pipo_links_short.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}

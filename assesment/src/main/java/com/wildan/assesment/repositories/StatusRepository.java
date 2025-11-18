package com.wildan.assesment.repositories;

import com.wildan.assesment.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status , Integer> {
}

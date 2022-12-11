package com.notes.repository;

import com.notes.domain.RationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RationDataRespository extends JpaRepository<RationData, Long> {
}

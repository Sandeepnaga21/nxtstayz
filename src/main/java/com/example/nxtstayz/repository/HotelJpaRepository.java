package com.example.nxtstayz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nxtstayz.model.*;
import java.util.List;

@Repository
public interface HotelJpaRepository extends JpaRepository<Hotel, Integer> {

}

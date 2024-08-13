package com.example.nxtstayz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nxtstayz.model.Room;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room, Integer> {

}

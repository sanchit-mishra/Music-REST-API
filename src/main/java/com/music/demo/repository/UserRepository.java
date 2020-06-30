package com.music.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.demo.modal.Music;

public interface UserRepository extends JpaRepository<Music, Integer> {
	
}

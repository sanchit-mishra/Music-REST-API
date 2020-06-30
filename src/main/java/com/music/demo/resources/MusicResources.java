package com.music.demo.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.music.demo.modal.Music;
import com.music.demo.repository.UserRepository;


@RestController
@RequestMapping("/music")
public class MusicResources {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping
	public List<Music> getAll(){
		
		return userRepo.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Music> getById(@PathVariable("id") final Integer id){
		return userRepo.findById(id);
	}	
	
}

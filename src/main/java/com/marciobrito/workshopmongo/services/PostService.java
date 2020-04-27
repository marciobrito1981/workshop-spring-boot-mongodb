package com.marciobrito.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marciobrito.workshopmongo.entities.Post;
import com.marciobrito.workshopmongo.entities.User;
import com.marciobrito.workshopmongo.repository.PostRepository;
import com.marciobrito.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
		
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
}

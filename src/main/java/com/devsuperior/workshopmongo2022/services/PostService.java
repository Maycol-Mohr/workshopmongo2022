package com.devsuperior.workshopmongo2022.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.workshopmongo2022.models.dto.PostDTO;
import com.devsuperior.workshopmongo2022.models.entities.Post;
import com.devsuperior.workshopmongo2022.repositories.PostRepository;
import com.devsuperior.workshopmongo2022.services.exceptions.ResourceNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public PostDTO findById(String id) {
		Post entity = getEntityById(id);
		return new PostDTO(entity);
	}
	
	private Post getEntityById(String id) {
		Optional<Post> result = repository.findById(id);
		return result.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado"));
	}
}
package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.repositories.CategoryRepository;


//Essa anotation registra a classe  como um componente que vai participar  do sistema de injeção de dependencia automatizado do spring
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<CategoryDTO> list = findAll();
		
		
		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		
		  

		
		
	}

}

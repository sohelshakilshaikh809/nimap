package com.NimapInfotech.Nimap.ProductDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.NimapInfotech.Nimap.ProductEntity.Product;
import com.NimapInfotech.Nimap.ProductRepo.ProductRepository;

public class ProductSer {

	@Autowired
	private ProductRepository productRepository;
		
	public Iterable<Product> getAll(Integer pageNumber,Integer pageSize)
	{
		Pageable pageable=PageRequest.of(pageNumber, pageSize);
		
		Page<Product> page=productRepository.findAll(pageable);
		Iterable<Product> cat=page.getContent();
		return cat;
	}
}

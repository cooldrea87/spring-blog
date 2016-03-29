package com.millky.blog.infrastructure.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.millky.blog.domain.model.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer> {

	public Page<Post> findByCategoryId(int categoryId, Pageable pageable);

	public Page<Post> findByPostTagListTagName(String tagName, Pageable pageable);
}

package com.example.demo1.repository;

import com.example.demo1.modal.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface HumanRepository extends CrudRepository<Human, Long> {
}

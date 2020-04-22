package com.rjstudio360.onlinebookstore.repository;

import com.rjstudio360.onlinebookstore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
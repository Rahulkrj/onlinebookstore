package com.rjstudio360.onlinebookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

/**
 * @author Rahul
 * @version 0.0.1-SNAPSHOT
 */
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

  @Autowired
  private EntityManager entityManager;

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType)
        .toArray(Class[]::new));
  }
}

package com.matrix.elasticsearchservice.repositories;

import com.matrix.elasticsearchservice.entities.UserEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface UserRepository extends ElasticsearchRepository<UserEntity, UUID> {
}

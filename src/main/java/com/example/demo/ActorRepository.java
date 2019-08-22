package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface ActorRepository extends CrudRepository<Actor, Long> {
}

package com.s0hel.sandbox.dynamodb.repository;

import com.s0hel.sandbox.dynamodb.entity.Video;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface VideoRepository extends CrudRepository<Video, String> {
}

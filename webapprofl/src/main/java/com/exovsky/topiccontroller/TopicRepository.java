package com.exovsky.topiccontroller;


import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, java.lang.String>{

    Topic findOne(String id);

    void delete(String id);
}

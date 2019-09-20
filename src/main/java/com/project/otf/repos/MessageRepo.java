package com.project.otf.repos;

import com.project.otf.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message,Long> {
}

package ru.job4j.grabber.repository;

import ru.job4j.grabber.model.Post;

import java.util.List;

public interface Store {

    void save(Post post);

    List<Post> getAll();

}

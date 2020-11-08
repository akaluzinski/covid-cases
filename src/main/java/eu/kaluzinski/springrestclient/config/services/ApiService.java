package eu.kaluzinski.springrestclient.config.services;

import eu.kaluzinski.springrestclient.config.model.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);

}

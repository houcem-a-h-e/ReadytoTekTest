package com.readytotek.testapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.readytotek.testapi.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>  {
	User findByUserId(String id);
	@Query(value =
	        "SELECT * FROM User u WHERE u.score < :score " +
	        "ORDER BY u.score DESC LIMIT 5",
	        nativeQuery = true)
	    List<User> findUsersBeforeScore(int score);

	    @Query(value =
	        "SELECT * FROM User u WHERE u.score > :score " +
	        "ORDER BY u.score ASC LIMIT 5",
	        nativeQuery = true)
	    List<User> findUsersAfterScore(int score);

}

package com.matrimony.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.matrimony.model.User;
import com.matrimony.model.UserInterest;

@Repository
public interface InterestRepository extends JpaRepository<UserInterest, Long> {


}

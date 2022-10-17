package com.AmusementPark.AmusementPark.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.AmusementPark.AmusementPark.Entity.Activity;

@Repository
public interface ActivityRepository extends PagingAndSortingRepository<Activity, Integer> {

}
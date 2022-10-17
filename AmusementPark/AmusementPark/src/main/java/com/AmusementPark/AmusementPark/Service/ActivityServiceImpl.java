package com.AmusementPark.AmusementPark.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.AmusementPark.AmusementPark.Entity.Activity;
import com.AmusementPark.AmusementPark.Repository.ActivityRepository;
import com.AmusementPark.AmusementPark.GlobalException.ActivityAlreadyExistsException;
import com.AmusementPark.AmusementPark.GlobalException.ActivityNotFoundException;
@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
    ActivityRepository activityRepository;
	
	 public String addActivity(Activity activity) {
		
		Activity existingActivity = activityRepository.findById(activity.getActivityId()).orElse(null);
		
		if(existingActivity==null) {
			
			activityRepository.save(activity);
			return "Activity added successfully";
		}
		else {
			throw new ActivityAlreadyExistsException("Activity already exists!");
		}
	}

	
	
	public Activity updateActivity(Activity activity) throws ActivityNotFoundException {
		Activity existingActivity = activityRepository.findById(activity.getActivityId()).orElse(null);
		
		if(existingActivity==null) {
			throw new ActivityNotFoundException("No such activity exists!!");
		}

		else {
			existingActivity.setCharges(activity.getCharges());
			existingActivity.setDescription(activity.getDescription());
			return activityRepository.save(existingActivity);
			//return "updated successfully";
		}
	} 
	
}


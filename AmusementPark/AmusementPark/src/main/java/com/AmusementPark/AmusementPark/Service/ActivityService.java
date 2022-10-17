package com.AmusementPark.AmusementPark.Service;
import com.AmusementPark.AmusementPark.Entity.Activity;
import com.AmusementPark.AmusementPark.GlobalException.ActivityAlreadyExistsException;
import com.AmusementPark.AmusementPark.GlobalException.ActivityNotFoundException;

public interface ActivityService  {
	
	//method to add Activity
	public String addActivity (Activity activity) throws ActivityAlreadyExistsException;
	
	
	public Activity updateActivity(Activity activity) throws ActivityNotFoundException;

}

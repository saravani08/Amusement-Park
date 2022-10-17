
package com.AmusementPark.AmusementPark.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AmusementPark.AmusementPark.Entity.Activity;
import com.AmusementPark.AmusementPark.GlobalException.ActivityNotFoundException;
import com.AmusementPark.AmusementPark.Repository.ActivityRepository;
import com.AmusementPark.AmusementPark.Service.ActivityService;
import com.AmusementPark.AmusementPark.Service.ActivityServiceImpl;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@RestController
//@RequestMapping("/activity")
public class ActivityController {
	
	
	@Autowired
	ActivityRepository activityRepository;
	@Autowired
	ActivityService activityService;
	private static Logger logger = LogManager.getLogger();
	
	@PostMapping("/insertActivity")
	public String addActivity(@RequestBody Activity activity)  {
		return activityService.addActivity(activity);
	}
	
	
		
	@PutMapping("/updateActivity")
	ResponseEntity<Activity> update(@RequestBody  Activity activity) throws ActivityNotFoundException  {
		
		logger.info("Sending request to Update a Activity");
		Activity updatedActivity = activityService.updateActivity(activity);
		logger.info("Updated theActivity in the Database");
		return new ResponseEntity<>(updatedActivity,HttpStatus.OK);
		
		
	}
}
	
	/*@DeleteMapping("/deleteActivty/{activityId}")
	public ResponseEntity<String> delete(@PathVariable int activityId){
		return iActivityservice.deleteActivity(activityId);
	}*/


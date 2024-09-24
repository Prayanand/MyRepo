package com.newgenone.serviceflow.activity.ngdatetime;

import java.time.LocalDate;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;

import com.newgenone.serviceflow.activity.AbstractOmniProcess;
import com.newgenone.serviceflow.activity.IOmniErrorHandler;
import com.newgenone.serviceflow.activity.IOmniProcessFlowContext;
import com.newgenone.serviceflow.activity.NGActivityDef;
import com.newgenone.serviceflow.activity.NGOutputParameter;
import com.newgenone.serviceflow.activity.ProcessContext;
import com.newgenone.serviceflow.activity.NGActivityDef.ActivityType;

/**
 * @author nitin_tomar
 *
 */

/*
 * @NGActivityDef- This annotation is used to defined the class an Service Flow activity
 * Parameters :
 * activityName - Name of the activity to be displayed in Service Flow or Flow Chart
 * activityDescription - Description of the Activity
 * activityType - Type of The Activity (Normal or Scope) Possible values are ActivityType.NORMAL/ActivityType.SCOPE*/

@NGActivityDef(activityName="Get Current Date",activityDescription="This activity return current Date", activityType=ActivityType.NORMAL)
public class CustomerDeDupeStatusActivity extends AbstractOmniProcess { //User has to extend the AbstractOmniProcess to override the function

	/*
	 * @NGOutputParameter- This annotation is used to defined the class an Service Flow activity input/output parameters
	 * Parameters :
	 * displayLabelName - Name of the activity to be displayed in Service Flow or Flow Chart
	 * descriptionText - Description of the Activity
	 * */
	 
	@NGOutputParameter(displayLabelName="Current Date",  descriptionText="current Date")
	public String currentDate;

	public String getCurrentDate() {
		System.out.println("Pragyanand");
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	@Override
	public IOmniProcessFlowContext executeActivity(IOmniProcessFlowContext context) throws Exception {
		ProcessContext currentDateCtx=(ProcessContext)context;
		
		// This section can be utilized to invoke any functionality developed by the user for specific use cases or custom Java code.
		// Input/output parameters can be defined using annotations.
		
		//Write your code here
		
		LocalDate now = LocalDate.now(); //Example to get Current Date
		
		
		//Code End
		
		//Setting the output in Process Context
		currentDateCtx.setOutParam(currentDate, now);// This function is used to set the current value in the output Parameters
		return currentDateCtx;
	}

	@Override
	public IOmniErrorHandler getErrorHandler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub

	}

}

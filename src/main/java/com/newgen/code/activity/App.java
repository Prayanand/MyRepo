package com.newgenone.serviceflow.activity;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ApplicationContext;

import com.newgenone.serviceflow.activity.ngdatetime.GetCurrentDate;

public class App 
{
	static ApplicationContext mainAppContext=null;
    public static void main( String[] args )
    {
		try{
			//Create Process Context
			ProcessContext pCtx=new ProcessContext();
			
			//Create an Object of the Activity and call the execute method to check the value;
			GetCurrentDate gtDacte=new GetCurrentDate();
			gtDacte.executeActivity(pCtx);
			
			
		}catch (UnsatisfiedDependencyException e){
			System.out.println(e.getMessage());
		}catch(BeanCreationException e){
			e.printStackTrace();
			System.out.println("Rule Defination can not be executed due to syntax error");
		}
		catch(Exception e){
			System.out.println("Error Message :"+e.getMessage());
			e.printStackTrace();
		}catch(Throwable th){
			th.printStackTrace();
		}
    }
}

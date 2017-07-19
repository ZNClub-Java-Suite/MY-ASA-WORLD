// Navigation controller : adds dynamic content to navigation main headings & redirection within app

'use strict';

app.controller('navCtrl',
function($scope,$rootScope){
 	
	$scope.clickOptions= function(op,name){
		
		// add Appointment
		if(op=='add' && name=='Appointment'){
			
			$rootScope.addAppt=!$rootScope.addAppt;
			
			$rootScope.evalAppt=false;
			$rootScope.viewScore=false;
			$rootScope.addScore=false;
			$rootScope.viewAttd=false;
			$rootScope.addAttd=false;
			$rootScope.viewSchedule=false;
			$rootScope.viewBirthday=false;
			$rootScope.viewProfile=false;
		}
		// evaluate Appointment
		else if(op=='evaluate' && name=='Appointment'){
			
			$rootScope.evalAppt=!$rootScope.evalAppt;
			
			
			$rootScope.addAppt=false;
			$rootScope.viewScore=false;
			$rootScope.addScore=false;
			$rootScope.viewAttd=false;
			$rootScope.addAttd=false;
			$rootScope.viewSchedule=false;
			$rootScope.viewBirthday=false;
			$rootScope.viewProfile=false;
		}
		// add Attendance
		else if(op=='add' && name=='Attendance'){
			
			$rootScope.addAttd=!$rootScope.addAttd;
			
			$rootScope.evalAppt=false;
			$rootScope.addAppt=false;
			$rootScope.viewAttd=false;
			$rootScope.viewScore=false;
			$rootScope.addScore=false;
			$rootScope.viewSchedule=false;
			$rootScope.viewBirthday=false;
			$rootScope.viewProfile=false;
		}
		// view Attendance
		else if(op=='view' && name=='Attendance'){
			
			$rootScope.viewAttd=!$rootScope.viewAttd;
			
			$rootScope.evalAppt=false;
			$rootScope.addAppt=false;
			$rootScope.addAttd=false;			
			$rootScope.viewScore=false;
			$rootScope.addScore=false;
			$rootScope.viewSchedule=false;
			$rootScope.viewBirthday=false;
			$rootScope.viewProfile=false;
		}
		// add to Scoreboard
		else if(op=='add to' && name=='Scoreboard'){
			
			$rootScope.addScore=!$rootScope.addScore;
			
			$rootScope.evalAppt=false;
			$rootScope.addAppt=false;
			$rootScope.viewScore=false;
			$rootScope.viewAttd=false;
			$rootScope.addAttd=false;
			$rootScope.viewSchedule=false;
			$rootScope.viewBirthday=false;
			$rootScope.viewProfile=false;
			
		}
		// view Scoreboard
		else if(op=='view' && name=='Scoreboard'){
			
			$rootScope.viewScore=!$rootScope.viewScore;
			
			$rootScope.evalAppt=false;
			$rootScope.addAppt=false;
			$rootScope.addScore=false;
			$rootScope.viewAttd=false;
			$rootScope.addAttd=false;
			$rootScope.viewSchedule=false;
			$rootScope.viewBirthday=false;
			$rootScope.viewProfile=false;
		}
		// view Schedule
		else if(op=='view' && name=='Schedule'){
			
			$rootScope.viewSchedule=!$rootScope.viewSchedule;
			
			$rootScope.evalAppt=false;
			$rootScope.addAppt=false;
			$rootScope.viewScore=false;
			$rootScope.addScore=false;
			$rootScope.viewAttd=false;
			$rootScope.addAttd=false;
			$rootScope.viewBirthday=false;
			$rootScope.viewProfile=false;
		}
		
		else if(op=='view' && name=='Birthday'){
			
			$rootScope.viewBirthday=!$rootScope.viewBirthday;
			
			$rootScope.evalAppt=false;
			$rootScope.addAppt=false;
			$rootScope.viewScore=false;
			$rootScope.addScore=false;
			$rootScope.viewAttd=false;
			$rootScope.addAttd=false;
			$rootScope.viewSchedule=false;			
			$rootScope.viewProfile=false;
			
		}
		
		else if(op=='view' && name=='Profile'){
			
			$rootScope.viewProfile=!$rootScope.viewProfile;
			
			$rootScope.evalAppt=false;
			$rootScope.addAppt=false;
			$rootScope.viewScore=false;
			$rootScope.addScore=false;
			$rootScope.viewAttd=false;
			$rootScope.addAttd=false;
			$rootScope.viewSchedule=false;
			$rootScope.viewBirthday=false;
		}
		
		
	}
	
	$scope.clickAppt= function(){
		$scope.navigation=true;
		$scope.option = {'name':'Appointment','options':['add','evaluate']};
	} 
	
	$scope.clickAttd= function(){
		$scope.navigation=true;
		$scope.option = {'name':'Attendance','options':['add','view']};
	} 
	
	
	$scope.clickScore= function(){
		$scope.navigation=true;
		$scope.option = {'name':'Scoreboard','options':['add to','view']};
	} 
	
	$scope.clickSchedule= function(){
		$scope.navigation=true;
		$scope.option = {'name':'Schedule','options':['view']};
	} 
	
	$scope.clickBirthday= function(){
		$scope.navigation=true;
		$scope.option = {'name':'Birthday','options':['view']};
	} 
	
	$scope.clickProfile= function(){
		$scope.navigation=true;
		$scope.option = {'name':'Profile','options':['view']};
	} 
	

}
); 
// Navigation controller : adds dynamic content to navigation main headings & redirection within app

app.controller('navCtrl',
function($scope){
 	
	$scope.clickAppt= function(){
		$scope.navigation=true;
		$scope.option = {'name':'Appointment','options':['add','eval','score']};
	} 
}
); 
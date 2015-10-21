function Hello($scope, $http) {
    $http.get('http://localhost:8080/restangularjs/rest/messageservice/hw').
        success(function(data) {
            $scope.message = data;
        });
}
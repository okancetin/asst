var app = angular.module('tomatoBusiness', []);

app.controller('MainCtrl', function($scope, $http) {

    $scope.getBySize = function (id) {
        //  alert(id);

        $scope.sales = [];
        var HTTP_REQ_URL = "http://localhost:7001/TomatoBook/sales/";
        var variable = id;
        var URL = HTTP_REQ_URL.concat(variable);

        $http.get(URL).
        then(function(response) {
            $scope.sales = response.data;
            $scope.IsVisible = true;
        });
    };

});


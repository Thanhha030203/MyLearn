angular.module("myapp",["ngRoute"]).config(function($routeProvider){
    $routeProvider
    .when("/home",{ 
        templateUrl : "home.html"
    })
    .when("/contact",{ 
        templateUrl : "Contact.html"
    })
    .when("/about",{ 
        templateUrl : "about.html"
    })
})
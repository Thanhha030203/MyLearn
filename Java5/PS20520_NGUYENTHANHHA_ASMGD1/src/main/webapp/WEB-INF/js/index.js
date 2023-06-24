var app = angular.module("indexApp", ["ngRoute"]);
app.config(function ($routeProvider) {
    $routeProvider
        .when("/index", {
            templateUrl: "index.html"
        })
        .when("/cart", {
            templateUrl: "cart.html"
        })
        .when("/account", {
            templateUrl: "../admin/new-account.html"
        })
        .when("/new-account", {
            templateUrl: "new-account.html"
        })
        .when("/new-book", {
            templateUrl: "new-book.html"
        })
        .when("/product", {
            templateUrl: "product.html"
        })
        .otherwise({
            templateUrl: "content.html"
        })
});
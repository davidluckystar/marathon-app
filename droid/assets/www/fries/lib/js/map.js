var map;
var directionsDisplay;
var SAINT_PETE = new google.maps.LatLng(59.935838, 30.274715);
function initialize() {
    map = new google.maps.Map(document.getElementById("map_canvas"), {
        center: SAINT_PETE,
        zoom: 13,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        backgroundColor: 'white'
    });
}

$(document).ready(function() {
    initialize();
    $('#centerMap').click(function(){
        google.maps.event.trigger(map, "resize");
    });
});
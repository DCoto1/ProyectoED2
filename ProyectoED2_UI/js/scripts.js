let map;

function initMap() {
  const nodosRuta = [];
  map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: 9.748917, lng: -83.753428},
    zoom: 10,
  });
  let response;
  fetch("http://localhost:8080/api/proyecto/getLugares",{
      headers: {
          'Content-Type': 'application/json',
          'Access-Control-Allow-Origin': '*'
      }
  })
      .then(
          response => {
              return response.json();
          }
      )
      .then(
          json => {
            var select = document.getElementById("select");
            for (var i = 0; i < json.length; i++){
              var marker = new google.maps.Marker({
                position: { lat: json[i].latitud, lng: json[i].longitud },
                map,
                title: json[i].nombre,
              });
              google.maps.event.addListener(marker, 'click', function() {
                map.panTo(this.getPosition());
              }); 
              select.insertAdjacentHTML("beforeend", "<option value='"+ json[i].id +"'>"+ json[i].nombre +"</option>");
              nodosRuta.push(new google.maps.LatLng(
                json[i].latitud,
                json[i].longitud
              ));
            }
            const rutaEnlazada = new google.maps.Polyline({
              path: nodosRuta,
              geodesic: true,
              strokeColor: "#00000",
              strokeOpacity: 1.0,
              strokeWeight: 2,
            });
      
            rutaEnlazada.setMap(map);

          }
      )
}

window.initMap = initMap;

function buscarLugarTuristico(){
  console.log(document.getElementById("select").value);
  fetch("http://localhost:8080/api/proyecto/getLugares/" + document.getElementById("select").value,{
      headers: {
          'Content-Type': 'application/json',
          'Access-Control-Allow-Origin': '*'
      }
  })
      .then(
          response => {
              return response.json();
          }
      )
      .then(
          json => {
              map.panTo({ lat: json.latitud, lng: json.longitud });
              map.setZoom(14);
              // google.maps.event.addListener(marker, 'click', function() {
              //   map.panTo(this.getPosition());
              //   map.setZoom(14);
              // }); 
           
          }
      )
}


let map, infowindow;
let totalMetros = 0; 
function initMap() {
    infowindow = new google.maps.InfoWindow();
  map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: 9.748917, lng: -83.753428},
    zoom: 10,
  });
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
          for (var i = 0; i < json.length; i++){
            new google.maps.Marker({
              position: { lat: json[i].latitud, lng: json[i].longitud },
              map,
              title: json[i].nombre,
            });

          }
          document.getElementById("cantidadUbicaciones").innerText = json.length;
          crearAristas();
        }
    )
}

function llenarSelects(){
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
            var select2 = document.getElementById("select2");
            var select3 = document.getElementById("select3");
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
              select2.insertAdjacentHTML("beforeend", "<option value='"+ json[i].id +"'>"+ json[i].nombre +"</option>");
              select3.insertAdjacentHTML("beforeend", "<option value='"+ json[i].id +"'>"+ json[i].nombre +"</option>");

            }
          }
      )
}

function buscarLugarTuristico(){
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
            google.maps.event.clearListeners(map, 'mouseover');
            initMap();
            crearAdyacentes(json.latitud, json.longitud);
            
        
          }
      )

}

function crearAdyacentes(latitud, longitud){
    fetch("http://localhost:8080/api/proyecto/getLugaresAdyacentes/" + document.getElementById("select").value,{
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
            for (var i = 0; i < json.length; i++){
                let lineaMaps= new google.maps.Polyline(
                    {
                    path:  [{lat: latitud, lng: longitud}, {lat: json[i].latitud, lng: json[i].longitud}],
                    geodesic: true,
                    strokeColor: "#008000",
                    strokeOpacity: 1.0,
                    strokeWeight: 2,
                    }
                );
                lineaMaps.setMap(map);
                map.panTo({ lat: latitud, lng: longitud});
                map.setZoom(15);
                
            }
            
        
          }
      )  
}

function crearAristas(){
    const lineSymbol = {
        path: google.maps.SymbolPath.FORWARD_CLOSED_ARROW,
      };
    fetch("http://localhost:8080/api/proyecto/getAristas",{
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
                var totalMetros = 0;
                for (var i = 0; i < json.length; i++){
                    peso = json[i].peso;
                    let lineaMaps = new google.maps.Polyline({
                        path: [{lat: json[i].inicio.latitud, lng: json[i].inicio.longitud}, {lat: json[i].fin.latitud, lng: json[i].fin.longitud}],
                        icons: [
                            {
                              icon: lineSymbol,
                              offset: "100%",
                            },
                          ],
                        geodesic: true,
                        strokeColor: "#00000",
                        strokeOpacity: 1.0,
                        strokeWeight: 2,
                    });
                    lineaMaps.setMap(map);
                    var distancia = calcularMetros(json[i].inicio.latitud, json[i].fin.latitud, json[i].inicio.longitud, json[i].fin.longitud);
                    crearInfoWindows(lineaMaps, json[i].peso, distancia);
                    totalMetros = totalMetros + distancia;
                    
                } 
                var monto = (totalMetros / 10) * 6075.58;
                document.getElementById("distancia").innerText = Math.round(totalMetros) + " metros";
                document.getElementById("coste").innerText = "₡ " + Math.round(monto);
            }

        )  
}

function calcularMetros(lat1, lat2, lon1, lon2){
    var R = 6378.137;
    var dLat = lat2 * Math.PI / 180 - lat1 * Math.PI / 180;
    var dLon = lon2 * Math.PI / 180 - lon1 * Math.PI / 180;
    var a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
            Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180) *
                    Math.sin(dLon / 2) * Math.sin(dLon / 2);
    var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    var d = R * c;
    d = d * 1000;

    return d;
}

function crearInfoWindows(lineaMaps, peso, distancia){
    google.maps.event.addListener(lineaMaps, 'mouseover', function(event) {
        infowindow.setContent("Distancia: " + Math.round(distancia)  + " m / Peso: " + peso);
        infowindow.setPosition(event.latLng);
        infowindow.open(map);
    }); 
}


function crearRuta(){
    let arista = [];
    var select2 = document.getElementById("select2");
    var select3 = document.getElementById("select3");
    
    fetch("http://localhost:8080/api/proyecto/getCaminoMinimo/" + select2.value + "/" + select3.value ,{
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
                for (var i = 0; i < json.length; i++){
                    arista.push(new google.maps.LatLng(
                        json[i].latitud,
                        json[i].longitud
                    ))
                    let lineaMaps = new google.maps.Polyline(
                        {
                        path: arista,
                        geodesic: true,
                        strokeColor: "#0000FF",
                        strokeOpacity: 1.0,
                        strokeWeight: 2,
                        }
                    );
                    initMap() 
                    lineaMaps.setMap(map);

                }
  
            }
        )  
}


window.initMap = initMap;



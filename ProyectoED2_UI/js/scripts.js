let map;
let totalMetros = 0; 
function initMap() {
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
            var marker = new google.maps.Marker({
              position: { lat: json[i].latitud, lng: json[i].longitud },
              map,
              title: json[i].nombre,
            });
            google.maps.event.addListener(marker, 'click', function() {
              map.panTo(this.getPosition());
            }); 

          }
          document.getElementById("cantidadUbicaciones").insertAdjacentText("beforeend", json.length);
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

                    var lat1 = json[i].inicio.latitud;
                    var lat2 = json[i].fin.latitud;
                    var lon1 = json[i].inicio.longitud;
                    var lon2 = json[i].fin.longitud;

                    var R = 6378.137;
                    var dLat = lat2 * Math.PI / 180 - lat1 * Math.PI / 180;
                    var dLon = lon2 * Math.PI / 180 - lon1 * Math.PI / 180;
                    var a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                            Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180) *
                                    Math.sin(dLon / 2) * Math.sin(dLon / 2);
                    var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                    var d = R * c;
                    d = d * 1000;
                    
                    totalMetros = totalMetros + d;
                    
                }
                var monto = (totalMetros / 1.8) * 3827;
                console.log(totalMetros);
                console.log(monto);
                document.getElementById("distancia").insertAdjacentText("beforeend", Math.round(totalMetros) + " metros");
                document.getElementById("coste").insertAdjacentText("beforeend", "₡ " + Math.round(monto));
            }

        )  
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

// function crearRuta(l1, l2){
//     let ruta = [];
//     fetch("http://localhost:8080/api/proyecto/getLugares",{
//         headers: {
//             'Content-Type': 'application/json',
//             'Access-Control-Allow-Origin': '*'
//         }
//     })
//         .then(
//             response => {
//                 return response.json();
//             }
//         )
//         .then(
//             json => {

//               for (var i = 0; i < json.length; i++){
//                 if (json[i].id == l1 || json[i].id == l2){
//                     ruta.push(new google.maps.LatLng(
//                         json[i].latitud,
//                         json[i].longitud
//                       ));
                    
//                 }
//               }
//               map.panTo(ruta[0]);
//               let rutaEnlazada = new google.maps.Polyline({
//               path: ruta,
//               geodesic: true,
//               strokeColor: "#00000",
//               strokeOpacity: 1.0,
//               strokeWeight: 2,
//               });
              
//               map.setZoom(10);
//               rutaEnlazada.setMap(map);
  
//             }
//         )

// }



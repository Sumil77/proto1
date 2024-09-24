function calculateRadius(boundingBox) {
    const minLat = parseFloat(boundingBox[0]);
    const maxLat = parseFloat(boundingBox[1]);
    const minLon = parseFloat(boundingBox[2]);
    const maxLon = parseFloat(boundingBox[3]);
    const width = maxLon - minLon;
    const height = maxLat - minLat;
    const averageDimension = (width + height) / 2;
    const radiusInMeters = averageDimension * 111320;

    return radiusInMeters / 2;
}

function fetchCoordinatesAndRadius(areaName) {
    const url = `https://nominatim.openstreetmap.org/search?q=${encodeURIComponent(areaName)}&format=json`;

    fetch(url)
        .then(response => {
            if (!response.ok) {
                throw new Error('Error fetching coordinates');
            }
            return response.json();
        })
        .then(data => {
            if (data.length > 0) {
                const { lat, lon, boundingbox } = data[0];
                const radius = calculateRadius(boundingbox);
                console.log('Coordinates:', lat, lon);
                console.log('Estimated Radius (meters):', radius);
            } else {
                console.log('No results found for the area.');
            }
        })
        .catch(error => console.error('Error:', error));
}

var map = L.map('map').setView([28.7041, 77.1025], 12);
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);



function showAlert() {
    alert('Alert button clicked!');
}




// Initialize your geofencing and polygon logic...

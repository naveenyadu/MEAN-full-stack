var obj= { "firstName": "John", "lastName": "Carter" };

var p1= JSON.parse(JSON.stringify(obj));

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="Wick";

console.log(p1.firstName+" "+p1.lastName);

p1.middleName= "Snow";

console.log(p1.middleName);
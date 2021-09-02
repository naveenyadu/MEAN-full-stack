var obj= "var p1={ firstName: 'John', lastName: 'Carter' };";

eval(obj);

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="Wick";

console.log(p1.firstName+" "+p1.lastName);

p1.middleName= "Snow";

console.log(p1.middleName);
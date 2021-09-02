var recursiveMap=function(arr,func){
  if(arr.length===1){
      return func(arr);
  }
  else
  {
      return [func(arr[0])].concat(recursiveMap(arr.slice(1),func));
  }
}
var multiplyByTwonumbers=function(v){
  return v*2;
}
var result =recursiveMap([1,2,3,4],multiplyByTwonumbers);
console.log(result);
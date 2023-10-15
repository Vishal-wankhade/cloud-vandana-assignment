// "this is a sunny day"

function reverseWords(s){
   
   var arr = s.split(" ");


var arr2 =[];


for (let i = 0; i < arr.length; i++){
   var item = arr[i].split("").reverse().join("");
//    console.log(item);
   arr2.push(item);


}

   return arr2.join(' ');




}



console.log(reverseWords("This is a sunny day"));

// output : sihT si a ynnus yad
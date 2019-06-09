const arr1 = ['a','b','c','x'];
const arr2 = ['e','r','q','a'];

function checkCommonItem(arr1,arr2){
    let map = mapArray(arr1);
    arr2.forEach(element => {
        if(map[element]){
            return true;
        }
    });
    return false;
}

function mapArray(arr){
    let map = {};
    arr.forEach((el)=>{
        if(!map[el]){
            map[el] = true;
        }
    });
    return map;
}

checkCommonItem(arr1,arr2);
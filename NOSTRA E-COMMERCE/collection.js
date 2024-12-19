var productContainer=document.getElementById("product")
var search =document.getElementById("search")
var productlist = productContainer.querySelectorAll("div")
search .addEventListener("keyup",function(){
    var entervalue=event.target.value.toUpperCase()

    for(count=0;count<productlist.length;count=count+1){
        var productname = productlist[count].querySelector("h1").textContent
        if(productname.toUpperCase().indexOf(entervalue)<0){
            productlist[count].style.display="none"
        }
        else{
            productlist[count].style.display="block"
        }
    }
})
var sidenav=document.querySelector(".side-navbar")
function shownavbar(){
    sidenav.style.left="0%"
}
function closenavbar(){
    sidenav.style.left="-60%"
}

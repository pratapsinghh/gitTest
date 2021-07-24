const navSlide=()=>{
    const burger=document.querySelector(".burger");
    const nav=document.querySelector(".nav-link");
    const nav_link=document.querySelectorAll('.nav_link li');
    
    burger.addEventListener('click',()=>{
        nav.classList.toggle("nav-active");
    });
    
    navLinks.forEach((link,index)=>
    {
        console.log(index);
    });
}
  

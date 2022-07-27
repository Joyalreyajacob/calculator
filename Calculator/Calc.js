var screen = document.getElementById('screen');

function btnclick(btnobj) {
    screen.value += btnobj.value;
    console.log(screen.value)
}
function calculation() {
    var c = eval(screen.value)
    screen.value=c
    console.log(c)
}
function clears() {
    screen.value=''
    console.log(screen.value);
    
}
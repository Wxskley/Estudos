const secondCol = document.querySelector("#sec")
const minuteCol = document.querySelector("#minute")
const hourCol = document.querySelector("#hour")
setInterval(() => {
    const date = new Date();
    const seconds = date.getSeconds();
    secondCol.innerHTML = getZero(seconds);
    const minutes = date.getMinutes();
    minuteCol.innerHTML = getZero(minutes);
    const hours = date.getHours();
    hourCol.innerHTML = getZero(hours);
}, 1000);
function getZero(num) {
    return num < 10 ? `0${num}` : num;
}
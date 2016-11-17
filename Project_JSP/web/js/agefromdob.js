function calcAge() {
    var Bdate = document.getElementById('dob').value;
    var Bday = +new Date(Bdate);
    Bdate += ((Date.now() - Bday) / (31557600000));
    var theBday = document.getElementById('age');
    theBday.innerHTML = Bdate;
}
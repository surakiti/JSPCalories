/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$('#birthdate').on('change', function(){
    console.log('change');
    
    var date = new Date()
    var year = $('#birthdate').val().split('-');
    $('#age').val(date.getFullYear()-year[0]);
})

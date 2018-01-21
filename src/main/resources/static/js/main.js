/**
 *
 */
$('document').ready(function() {
    $('.table eBtn').on('click', function(event){
        event.preventDefault();

        $('.myForm #studentEditModalNorm').modal();
    })
});

/**
 *
 */
$('document').ready(function() {
    /**
     * Student Edit form
     */
    $('.nBtn, .table .eBtn').on('click', function(event){
        event.preventDefault();
        var action = $(this).attr('action');
        var href = $(this).attr('href');
        if(action=='edit'){
            $.get(href, function(student, status){
                $('.myForm #inputStudentId').val(student.id);
                $('.myForm #inputStudentName').val(student.name);
                $('.myForm #inputStudentCourse').val(student.course);
            });
            $('.myForm #studentEditModalNorm').modal();
        } else {
            $('.myForm #inputStudentId').val('');
            $('.myForm #inputStudentName').val('');
            $('.myForm #inputStudentCourse').val("");

            $('.myForm #studentEditModalNorm').modal();
        }
    })/* END student edit form*/

    /**
     * Delete Student
     */
     $('.table .delBtn').on('click', function(event){
        event.preventDefault();
        var action = $(this).attr('action');
        var href = $(this).attr('href');

        $.get(href, function(student, status){
            $('.myForm #inputStudentIdDelete').val(student.id);

            $('.myForm #studentDeleteModalNorm').modal();
        });
     });
});

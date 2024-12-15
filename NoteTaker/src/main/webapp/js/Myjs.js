 
 $(document).ready(function (e){
			$("#add_note_form").on("submit",function(event){
				event.preventDefault();
				
				
				let form= new FormData(this);
				$.ajax({
					url:"SaveNoteServlet",
					type: 'POST',
                    data: form,
                    success: function (data, textStatus, jqXHR) {
                        //success..
                        console.log(data);

                        if (data.trim() === 'done') {
                            swal({
                                icon: "success",
                                text: "Successfully done"                                
                            }).then(function(){
	location.reload();
});
                            
                        } else {
                            swal({
                                icon: "error",
                                text: "error ! something went wrong"
                            });
                        }

                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        //error...
                        swal({
                            icon: "error",
                            text: "error ! something went wrong"
                        });
                    },
                    processData: false,
                    contentType: false
				});
			});
			
		});
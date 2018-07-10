
function validate(){
	alert("inicia la validacion ..");
	var name=document.getElementById('name');
	if(name== null){
		alert("Please enter a valid name");
		alert("if");
		return false;
	}else{
		alert("else");
		return true;
	}
}


function doAjaxPost() {
    // get the form values
    var name = $('#name').val();
    var url = window.location;
   alert('name: '+name);
    $.ajax({
        type: "POST",
        url: url+"/home", 
        data: "name=" +name, 
        success: function(data){
            // we have the response
        	//alert('response.status: '+data);
//            if(response.status == "SUCCESS"){
//            	
//               alert('succes ...'+name);
//             }else{
//            	 alert('error111 ...'+name);
//             }
//        	 $().redirect( url+"/home",  {
//                 'name': name
//              });
//        	$.post(url+"/home", { 'name': name});
//        	    $("#resp").html("");
//        	    $("#resp").html(data);
        	window.location.href ="/home?name="+name;
//        	$( "body" ).html(data);
        //	window.location.replace(url+"/home?name="+name);
        	
         },
         error: function(e){
             alert('Error: ' + e);
         }
    });
}





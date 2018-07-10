//var editor;
$(document).ready( function () {
	
//    editor = new $.fn.dataTable.Editor( {
//        "ajax": "../views/addCliente.jsp",
//        "table": "#employeesTable",
//        "fields": [ {
//                "label": "First name:",
//                "name": "nombre"
//            }, {
//                "label": "Last name:",
//                "name": "apellido"
//            }, {
//                "label": "email:",
//                "name": "email"
//            }, {
//                "label": "direccion:",
//                "name": "direccion"
//            }
//        ]
//    } );
	
	 var table = $('#employeesTable').DataTable({
			"sAjaxSource": "/allClientes",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "idCliente"},
		      { "mData": "nombre" },
				  { "mData": "apellido" },
				  { "mData": "email" },
				  { "mData": "direccion" },
			      {
		                data: null,
		                className: "center",
		                defaultContent: '<a href="" class="editor_edit">Edit</a> '
		          },
		          {
		                data: null,
		                className: "center",
		                defaultContent: '<a href="" class="editor_remove">Delete</a>'
		          }
			]
	 });
	 
	    // New record
	    $('a.editor_create').on('click', function (e) {
	        e.preventDefault();
	 
	        editor.create( {
	            title: 'Create new record',
	            buttons: 'Add'
	        } );
	    } );
	 
	    // Edit record
	    $('#employeesTable').on('click', 'a.editor_edit', function (e) {
	        e.preventDefault();
	 
	        editor.edit( $(this).closest('tr'), {
	            title: 'Edit record',
	            buttons: 'Update'
	        } );
	    } );
	 
	    // Delete a record
	    $('#employeesTable').on('click', 'a.editor_remove', function (e) {
	        e.preventDefault();
	 
	        editor.remove( $(this).closest('tr'), {
	            title: 'Delete record',
	            message: 'Are you sure you wish to remove this record?',
	            buttons: 'Delete'
	        } );
	    } );
});
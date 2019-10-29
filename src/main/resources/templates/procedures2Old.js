$(document).ready(function() {
	setTimeout(function() {
		getProcedures();
   }, 1000);
})

function getProcedures() {
	$.ajax({
		type : "GET",
		url : "http://localhost:8080/proceduresapp/procedures",
		success : function(data) {
			var list = $('<ul class="list-group"></ul>');
			$('p').append(list);
			$.each(data, function(index, procedures) {
				list.append('<li class="list-group-item">' + "TO UPDATE PROCEDURE: " + procedures.proName + ", USE ID NUMBER: " + procedures.proId +'</li>')
			});
		}
	});
}

function updateProcedure() {
		
		var proId = document.getElementById('proId').value;
		var proName = document.getElementById('proName').value;
		var proSpeciality = document.getElementById('proSpeciality').value;
		var proInstruments = document.getElementById('proInstruments').value;
		
		var procedures = new Object();
		
		procedures.proId = proId;
		procedures.proName = proName;
		procedures.proSpeciality = proSpeciality;
		procedures.proInstruments = proInstruments;
		
		var proceduresJSON = JSON.stringify(procedures);
		
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/proceduresapp/procedures",
			contentType : "application/json",
			data : proceduresJSON,
			success : function(data) {
				console.log(data);
			},
			error : function(data) {
				console.log(data);
			},
			dataType : 'json'
		});
	}
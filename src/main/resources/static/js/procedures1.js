function addProcedure() {
	var proName = document.getElementById('proName').value;
	var proSpeciality = document.getElementById('proSpeciality').value;
	var proInstruments = document.getElementById('proInstruments').value;
	
	var procedures = new Object();
	
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
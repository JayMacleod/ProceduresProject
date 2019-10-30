$(document).ready(function() {
	getProcedures();
})

function getProcedures() {
	let request = new XMLHttpRequest();
	request.open("GET", "http://"+location.host +":8081" + "/proceduresapp/procedures");
	request.onload = function() {
		let mainlist = document.getElementById("procedures");
		mainlist.innerHTML = "";
		let list = document.createElement("ul");
		list.className ="list-group";
		let data = JSON.parse(request.response);
		for(let procedure of data) {
			let listItem = document.createElement("li");
			listItem.className = "list-group-item";
			listItem.innerText = "TO UPDATE PROCEDURE: " + procedure.proName + ", USE ID NUMBER: " + procedure.proId;
			list.appendChild(listItem);
		}
		mainlist.appendChild(list)
	}
	request.send();
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
			url : "http://"+location.host +":8081" + "/proceduresapp/procedures",
			contentType : "application/json",
			data : proceduresJSON,
			success : function(data) {
				console.log(data);
				getProcedures();
			},
			error : function(data) {
				console.log(data);
			},
			dataType : 'json'
		});
		request.send();
		return false;
}
		
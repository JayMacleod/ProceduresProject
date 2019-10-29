$(document).ready(function() {
	getProcedures();
})

function getProcedures() {
	let request = new XMLHttpRequest();
	request.open("GET", "http://localhost:8080/proceduresapp/procedures");
	request.onload = function() {
		let mainlist = document.getElementById("procedures");
		mainlist.innerHTML = "";
		let list = document.createElement("ul");
		list.className ="list-group";
		let data = JSON.parse(request.response);
		for(let procedure of data) {
			let listItem = document.createElement("li");
			listItem.className = "list-group-item";
			listItem.innerText = "Procedure: " + procedure.proName + ", Speciality: " + procedure.proSpeciality+ ", Instruments: " + procedure.proInstruments;
			list.appendChild(listItem);
		}
		mainlist.appendChild(list)
	}
	request.send();

//function getProcedures() {
//	$.ajax({
//		type : "GET",
//		url : "http://localhost:8080/proceduresapp/procedures",
//		success : function(data) {
//			var list = $('<ul class="list-group"></ul>');
//			$('p').append(list);
//			$.each(data, function(index, procedures) {
//				list.append('<li class="list-group-item">' + "PROCEDURE NAME: " + procedures.proName
//				+ ", SPECIALITY: " + procedures.proSpeciality + ", INSTRUMENTS: " + procedures.proInstruments + '</li>')
//			});
//		}
//	});
}
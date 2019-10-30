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
			listItem.innerText = + procedure.proName + " (" + procedure.proSpeciality + ")" + ", Instruments: " + procedure.proInstruments;
			list.appendChild(listItem);
		}
		mainlist.appendChild(list)
	}
	request.send();

}
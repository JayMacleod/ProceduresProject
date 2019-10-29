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
			listItem.innerText = "TO REMOVE PROCEDURE: " + procedure.proName + ", USE ID NUMBER: " + procedure.proId;
			list.appendChild(listItem);
		}
		mainlist.appendChild(list)
	}
	request.send();
}
//	$.ajax({
//		type : "GET",
//		url : "http://localhost:8080/proceduresapp/procedures",
//		success : function(data) {
//			var list = $('<ul class="list-group"></ul>');
//			$('p').append(list);
//			$.each(data, function(index, procedures) {
//				list.append('<li class="list-group-item">' + "TO REMOVE PROCEDURE: " + procedures.proName + ", USE ID NUMBER: " + procedures.proId +'</li>')
//			});
//		}
//	});
//}

function deleteProcedure() {
	
	var proId = document.getElementById('proId').value;
	
	let request = new XMLHttpRequest();
	request.open("DELETE", "http://localhost:8080/proceduresapp/procedures/" + proId);
	request.onload=function(){
		getProcedures();
	}
	
	request.send();
	return false;
}

//	$.ajax({
//		type : "DELETE",
//		url : "http://localhost:8080/proceduresapp/procedures/" + proId,
//		contentType : "application/json",
//		data : proceduresJSON,
//		success : function(data) {
//			getProcedures();
//		},
//		error : function(data) {
//			console.log(data);
//		},
//		dataType : 'json'
//	});


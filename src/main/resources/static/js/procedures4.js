function findById() {
	
	var proId = document.getElementById('proId').value;
	var procedures = new Object();
	
	procedures.proId = proId;
	
	var proceduresJSON = JSON.stringify(procedures);
	
	$.ajax({
		type : "GET",
		url : "http://localhost:8080/proceduresapp/showById" + ProId,
		success : function(data) {
			var list = $('<ul class="list-group"></ul>');
			$('p').append(list);
			$.each(data, function(index, procedures) {
				list.append('<li class="list-group-item">' + procedures.proId + ", PROCEDURE NAME: " + procedures.proName
				+ ", SPECIALITY: " + procedures.proSpeciality + ", INSTRUMENTS: " + procedures.proInstruments + '</li>')
			});
		}
	});
}

function register() {
		var errTag = document.getElementById("err");
		errTag.innerHTML = "";
		
		var mID = document.fm.memberID.value;
		var mName = document.fm.memberName.value;
		
		document.fm.memberID.style.backgroundColor = "white";
		document.fm.memberName.style.backgroundColor = "white";
		
		var errorMessages = [];
		if (mID == "") {
			errorMessages.push("社員番号を入力してください。");
			document.fm.memberID.style.backgroundColor = "red";
		}
		if (mName == "") {
			errorMessages.push("社員名を入力してください。");
			document.fm.memberName.style.backgroundColor = "red";
		}
		if (errorMessages.length > 0) {
			var msg = errorMessages.join("<br>");
			errTag.innerHTML = msg;
			return;
		}
	}
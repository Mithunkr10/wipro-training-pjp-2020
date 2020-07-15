//clock for web page
	function curtime(){
		var t=new Date();
		var h=t.getHours();
		var m=t.getMinutes();
		var s=t.getSeconds();
		m=check(m);
		s=check(s);
		document.getElementById("txt").value=h+':'+m+':'+s;
		var ta=setTimeout(curtime,1000);
	}
	function check(a)
	{
		if(a<10) a='0'+a;
		return a;
	}
curtime();
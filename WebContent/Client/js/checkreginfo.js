/*校验*/
function checkid(ssn) {
    if(ssn.length!=11) {
        document.getElementById("idErr").innerHTML="<font color='red'>请输入11位的手机号！</font>"
        return false;
    }
    document.getElementById("idErr").innerHTML="";
    return true;
}

function checkpw(ssn) {
    if(ssn=="" || ssn==null) {
        document.getElementById("pwErr").innerHTML="<font color='red'>密码不能为空！</font>";
        return false;
    }
    document.getElementById("pwErr").innerHTML="";
    return true;
}
function checkrpw(ssn) {
    if(ssn!=document.getElementById("pw").value.toString()) {
        document.getElementById("rpwErr").innerHTML="<font color='red'>两次密码不一致！</font>";
        return false;
    }
    document.getElementById("rpwErr").innerHTML="";
    return true;
}
function checkun(ssn) {
    if(ssn==null || ssn=="") {
        document.getElementById("unErr").innerHTML="<font color='red'>请输入真实姓名！</font>";
        return false;
    }
    document.getElementById("unErr").innerHTML="";
    return true;
}

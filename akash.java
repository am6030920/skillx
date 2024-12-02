var modal = document.getElementById("myModal");
var span = document.getElementsByClassName("close")[0];

function showModal(memberName, description) {
    document.getElementById("modal-title").textContent = memberName;
    document.getElementById("modal-description").textContent = description;
    modal.style.display = "block";
}

span.onclick = function() {
    modal.style.display = "none";
}

window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
function filterMembers() {
    var section = document.getElementById("section-filter").value;
    var members = document.querySelectorAll(".member");

    members.forEach(function(member) {
        if (section === "all" || member.querySelector("h3:nth-child(4)").textContent.includes(section)) {
            member.style.display = "block";
        } else {
            member.style.display = "none";
        }
    });
}
html {
    scroll-behavior: smooth;
}

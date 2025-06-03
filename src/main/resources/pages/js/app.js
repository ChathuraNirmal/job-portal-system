let title = document.getElementById("title");
let salary = document.getElementById("salary");
let description = document.getElementById("description");
let salaryDate = document.getElementById("salaryDate");
let companyId = document.getElementById("companyId");

let BtnSubmitOnClick = document.getElementById("submit-btn");

let cards = document.getElementById("cards");

// post a job

function funcBtnSubmitOnClick(event) {
  event.preventDefault();
  let requestBody = {
    title: title.value,
    salary: salary.value,
    description: description.value,
    salaryDate: salaryDate.value,
    companyId: companyId.value,
  };

  fetch("http://localhost:8080/set-job", {
    method: "POST",
    body: JSON.stringify(requestBody),
    headers: {
      "Content-Type": "application/json",
    },
  })
    .then((Response) => {
      if (Response.ok) {
        console.log("done");
      }
      return;
    })
    .then((data) => {
      title.value = "";
      salary.value = "";
      description.value = "";
      salaryDate.value = "";
      companyId.value = "";
    })
    .catch((Error) => {
      console.error(Error);
    });
}

BtnSubmitOnClick.addEventListener("click", funcBtnSubmitOnClick);

// get all jobs

fetch("http://localhost:8080/getAll-jobs")
  .then((res) => res.json())
  .then((jobs) => {
    let card = "";

    jobs.forEach((element) => {
      console.log(element);

      card += ` <div class="max-w-md mx-auto bg-white border border-gray-200 rounded-xl shadow p-6 hover:shadow-lg transition duration-300">
  <div class="flex items-center justify-between mb-4">
    <div>
      <h5 class="text-lg font-semibold text-gray-900">${element.title}</h5>
      <p class="text-sm text-gray-500">Company Id : ${element.companyId}</p>
    </div>
  </div>

  <p class="text-sm text-gray-700 mb-4">
${element.description}   
</p>

  <ul class="text-sm text-gray-600 mb-4 space-y-1">
    <li>Salary : ${element.salary} 💼</li>
    <li>Salary Date : ${element.salaryDate}</li>
  </ul>

  <div class="flex justify-between items-center">
    <button class="text-white bg-blue-600 hover:bg-blue-700 font-medium rounded-lg text-sm px-4 py-2 transition">Apply Now</button>
    <span class="text-xs text-gray-500">Posted 2 days ago</span>
  </div>
</div>`;
    });
    cards.innerHTML = card;
  });
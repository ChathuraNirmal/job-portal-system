let nav = document.getElementById("nav");

nav.innerHTML = `<nav class="bg-white border-b border-gray-200 shadow-sm">
  <div class="max-w-screen-xl flex flex-wrap items-center justify-between mx-auto p-4">
    <a href="/" class="flex items-center space-x-3">
        <img src="img/image.png" class="h-8" alt="JobPortal Logo" />
        <span class="self-center text-2xl font-bold text-gray-900">JobPortal</span>
    </a>
    <button data-collapse-toggle="navbar-default" type="button" class="inline-flex items-center p-2 w-10 h-10 justify-center text-sm text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200" aria-controls="navbar-default" aria-expanded="false">
        <span class="sr-only">Open main menu</span>
        <svg class="w-5 h-5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 17 14">
            <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M1 1h15M1 7h15M1 13h15"/>
        </svg>
    </button>
    <div class="hidden w-full md:block md:w-auto" id="navbar-default">
      <ul class="font-medium flex flex-col p-4 md:p-0 mt-4 border border-gray-100 rounded-lg bg-gray-50 md:flex-row md:space-x-8 md:mt-0 md:border-0 md:bg-white">
        <li>
          <a href="/" class="block py-2 px-3 text-white bg-blue-700 rounded md:bg-transparent md:text-blue-700 md:p-0" aria-current="page">Home</a>
        </li>
        <li>
          <a href="/companies" class="block py-2 px-3 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:hover:text-blue-700 md:p-0">Companies</a>
        </li>
        <li>
          <a href="#" 
   data-modal-target="companyRegistrationModal" 
   data-modal-toggle="companyRegistrationModal" 
   class="block py-2 px-3 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:hover:text-blue-700 md:p-0">
   Company Registration
</a>
        </li>
<a href="#" 
   data-modal-target="jobModal" 
   data-modal-toggle="jobModal" 
   class="block py-2 px-3 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:hover:text-blue-700 md:p-0">
   Post a Job
</a>

        </li>
        <li>
          <a href="/login" class="block py-2 px-3 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:hover:text-blue-700 md:p-0">Login</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Modal -->
<div id="jobModal" tabindex="-1" aria-hidden="true" class="fixed top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto inset-0 bg-black bg-opacity-50 flex items-center justify-center">
  <div class="bg-white rounded-lg shadow-lg w-full max-w-4xl">
    <div class="flex justify-between items-center p-4 border-b">
      <h3 class="text-xl font-semibold text-gray-800">
        Post a Job
      </h3>
      <button type="button" class="text-gray-500 hover:text-gray-700" data-modal-hide="jobModal">
        <svg class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24">
          <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M6 18L18 6M6 6l12 12" />
        </svg>
      </button>
    </div>
    <form action="/set-job" method="POST" class="p-6 space-y-4">
      <!-- Title -->
      <div>
        <label for="title" class="block mb-1 text-sm font-medium text-gray-700">Job Title</label>
        <input type="text" id="title" name="title" required class="w-full p-2.5 border border-gray-300 rounded-md focus:ring-blue-500 focus:border-blue-500">
      </div>

      <!-- Description -->
      <div>
        <label for="description" class="block mb-1 text-sm font-medium text-gray-700">Job Description</label>
        <textarea id="description" name="discription" rows="3" required class="w-full p-2.5 border border-gray-300 rounded-md focus:ring-blue-500 focus:border-blue-500"></textarea>
      </div>

      <!-- Salary -->
      <div>
        <label for="salary" class="block mb-1 text-sm font-medium text-gray-700">Salary</label>
        <input type="number" id="salary" name="salary" step="0.01" required class="w-full p-2.5 border border-gray-300 rounded-md focus:ring-blue-500 focus:border-blue-500">
      </div>

      <!-- Salary Date -->
      <div>
        <label for="salaryDate" class="block mb-1 text-sm font-medium text-gray-700">Salary Date</label>
        <input type="text" id="salaryDate" name="salaryDate" placeholder="e.g. Monthly / Weekly / Per Hour" required class="w-full p-2.5 border border-gray-300 rounded-md focus:ring-blue-500 focus:border-blue-500">
      </div>

      <!-- Company ID -->
      <div>
        <label for="companyId" class="block mb-1 text-sm font-medium text-gray-700">Company ID</label>
        <input type="number" id="companyId" name="companyId" required class="w-full p-2.5 border border-gray-300 rounded-md focus:ring-blue-500 focus:border-blue-500">
      </div>

      <!-- Submit Button -->
      <div class="text-right pt-4">
        <button type="submit" id="submit-btn" class="bg-blue-600 text-white px-6 py-2 rounded-md hover:bg-blue-700">Submit</button>
      </div>
    </form>
  </div>
</div>


 

<div id="companyRegistrationModal" tabindex="-1" aria-hidden="true" class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 w-full md:inset-0 h-modal md:h-full">
  <div class="relative p-4 w-full max-w-md h-full md:h-auto">
    <!-- Modal content -->
    <div class="relative bg-white rounded-lg shadow dark:bg-gray-100">
      <!-- Modal header -->
      <div class="flex justify-between items-start p-5 rounded-t border-b border-gray-200">
        <h3 class="text-xl font-semibold text-gray-900">
          Company Registration
        </h3>
        <button type="button" class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center" data-modal-hide="companyRegistrationModal">
          <svg aria-hidden="true" class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20" ><path fill-rule="evenodd" d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
          <span class="sr-only">Close modal</span>
        </button>
      </div>

      <!-- Modal body -->
      <form class="px-6 pb-6 space-y-6" id="companyForm">
        <!-- ID (hidden or readonly) -->
        <input type="hidden" id="id" name="id" value="">

        <!-- Location -->
        <div>
          <label for="location" class="block mb-2 text-sm font-medium text-gray-700">Location</label>
          <input type="text" id="location" name="location" placeholder="Enter location" required
            class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5" />
        </div>

        <!-- Name -->
        <div>
          <label for="name" class="block mb-2 text-sm font-medium text-gray-700">Company Name</label>
          <input type="text" id="name" name="name" placeholder="Enter company name" required
            class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5" />
        </div>

        <!-- Industry -->
        <div>
          <label for="industry" class="block mb-2 text-sm font-medium text-gray-700">Industry</label>
          <input type="text" id="industry" name="industry" placeholder="Enter industry type" required
            class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5" />
        </div>

        <!-- Submit button -->
        <button type="submit"
          class="w-full text-white bg-blue-600 hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center">
          Register Company
        </button>
      </form>
    </div>
  </div>
</div>



`;

function validateForm() {
    var carMake = document.getElementById("carMake").value;
    var carModel = document.getElementById("carModel").value;
    var carYear = document.getElementById("carYear").value;
    var carColor = document.getElementById("carColor").value;
  
    // Perform your validation logic here
    // You can use conditions and regular expressions to validate the input fields
  
    // Example validation: All fields must be filled
    if (carMake === "" || carModel === "" || carYear === "" || carColor === "") {
      alert("Please fill in all fields");
      return false;
    }
  
    return true; // Submit the form if all validations pass
  }
  
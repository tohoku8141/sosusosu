// Function to check if a number is prime
function isPrime(num) {
  if (num <= 1) {
    return false;
  }
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
}

// Function to display if the entered number is prime or not and nearby primes
function checkPrime() {
  const numberInput = document.getElementById("numberInput").value;
  const resultElement = document.getElementById("result");
  
  if (numberInput === "") {
    resultElement.textContent = "Please enter a number.";
    return;
  }

  const number = parseInt(numberInput);
  if (isPrime(number)) {
    resultElement.textContent = `${number} is a prime number.`;
  } else {
    resultElement.textContent = `${number} is not a prime number. Nearby primes: ${findNearbyPrimes(number)}`;
  }
}

// Function to find nearby primes for a non-prime number
function findNearbyPrimes(num) {
  let lower = num - 1;
  let upper = num + 1;

  while (true) {
    if (isPrime(lower)) {
      return lower;
    } else if (isPrime(upper)) {
      return upper;
    }
    lower--;
    upper++;
  }
}

// Function to handle the quiz answer submission
function checkAnswer() {
  const quizQuestion = document.getElementById("quizQuestion");
  const quizResult = document.getElementById("quizResult");
  const totalUsers = document.getElementById("totalUsers");
  const numPrimes = document.getElementById("numPrimes");
  const numNonPrimes = document.getElementById("numNonPrimes");

  // Here, you can implement quiz logic based on user input and update statistics

  // Example:
  // quizQuestion.textContent = "Is 7 a prime number?";
  // if (document.getElementById("prime").checked) {
  //   quizResult.textContent = "Correct!";
  //   // Update statistics accordingly
  //   numPrimes.textContent = parseInt(numPrimes.textContent) + 1;
  // } else {
  //   quizResult.textContent = "Incorrect!";
  //   // Update statistics accordingly
  //   numNonPrimes.textContent = parseInt(numNonPrimes.textContent) + 1;
  // }
}

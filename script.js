function checkPrime() {
  const userInput = document.getElementById('userInput').value;

  if (userInput === '' || userInput <= 1 || !Number.isInteger(+userInput)) {
    document.getElementById('result').innerText = 'Please enter a valid positive integer greater than 1.';
    return;
  }

  let isPrime = true;
  for (let i = 2; i <= Math.sqrt(userInput); i++) {
    if (userInput % i === 0) {
      isPrime = false;
      break;
    }
  }

  if (isPrime) {
    document.getElementById('result').innerText = `${userInput} is a prime number!`;
  } else {
    document.getElementById('result').innerText = `${userInput} is not a prime number.`;
  }
}

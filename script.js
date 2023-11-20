function checkPrime() {
  const numberInput = document.getElementById('numberInput').value;
  const resultDisplay = document.getElementById('result');

  if (numberInput === '' || isNaN(numberInput) || numberInput <= 1) {
    resultDisplay.textContent = 'Please enter a valid positive integer greater than 1.';
    return;
  }

  const number = parseInt(numberInput);
  let isPrime = true;

  for (let i = 2; i <= Math.sqrt(number); i++) {
    if (number % i === 0) {
      isPrime = false;
      break;
    }
  }

  if (isPrime) {
    resultDisplay.textContent = `${number} is a prime number!`;
  } else {
    resultDisplay.textContent = `${number} is not a prime number.`;
  }
}

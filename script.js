function checkPrime() {
  const number = document.getElementById('numberInput').value;

  if (number <= 1) {
    document.getElementById('result').innerText = 'Please enter a number greater than 1.';
    return;
  }

  let isPrime = true;

  for (let i = 2; i <= Math.sqrt(number); i++) {
    if (number % i === 0) {
      isPrime = false;
      break;
    }
  }

  if (isPrime) {
    document.getElementById('result').innerText = number + ' is a prime number.';
  } else {
    document.getElementById('result').innerText = number + ' is not a prime number.';
  }
}

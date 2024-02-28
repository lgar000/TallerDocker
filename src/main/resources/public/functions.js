function calculateCos() {
    const cosNumber = document.getElementById('cosNumber').value;

    if (isNaN(cosNumber)) {
        alert('Please enter a valid number.');
        return false;
    }

    fetch(`/cos/${cosNumber}`)
        .then(response => response.text())
        .then(result => {
            document.getElementById('cosResult').innerText = result;
        })
        .catch(error => console.error('Error:', error));

    return false;
}

function calculateSin() {
    const sinNumber = document.getElementById('sinNumber').value;

    if (isNaN(sinNumber)) {
        alert('Please enter a valid number.');
        return false;
    }

    fetch(`/sin/${sinNumber}`)
        .then(response => response.text())
        .then(result => {
            document.getElementById('sinResult').innerText = result;
        })
        .catch(error => console.error('Error:', error));

    return false;
}

function checkPalindrome(){
    const wordPalindrome = document.getElementById('palindromeId').value;
    const validateWord = /^[a-zA-Z]+$/;

    if(!validateWord.test(wordPalindrome)){
        alert('Please enter a valid word.');
        return false;
    }

    fetch(`/palindrome/${wordPalindrome}`)
    .then(response => response.text())
    .then(result => {
        document.getElementById('palindromeResult').innerText = result;
    })
    .catch(error => console.error('Error:', error));

    return false;
}

function calculateVector(){
    const vectornumberOne= document.getElementById('vectornumberOne').value;
    const vectornumberTwo= document.getElementById('vectornumberTwo').value;

    if(isNaN(vectornumberOne) || isNaN(vectornumberTwo)){
        alert('Please verify that the values entered are numbers');
        return false;
    }

    fetch(`/vector/${vectornumberOne}/${vectornumberTwo}`)
    .then(response => response.text())
    .then(result =>{
        document.getElementById('vectorResult').innerText = result;
    })
    .catch(error => console.error('Error:', error));

    return false;

}



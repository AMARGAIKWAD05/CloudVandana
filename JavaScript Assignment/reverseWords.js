function reverseWords(sentence) {
 // Split the sentence into words
 const words = sentence.split(' ');
 // Reverse each word and store them in an array
 const reversedWords = words.map(word => reverseWord(word));
 // Join the reversed words back into a sentence
 const reversedSentence = reversedWords.join(' ');
 return reversedSentence;
}
function reverseWord(word) {
 // Convert the word to an array of characters, reverse it, and join it back
 return word.split('').reverse().join('');
}
// Read input from the user
const readline = require('readline').createInterface({
 input: process.stdin,
 output: process.stdout
});
readline.question('Enter a sentence: ', (sentence) => {
 const reversedSentence = reverseWords(sentence);
 console.log('Reversed sentence:', reversedSentence);
 readline.close();
});
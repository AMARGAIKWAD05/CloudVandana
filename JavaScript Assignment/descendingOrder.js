// array
const numbers = [10, 3, 1, 8, 5, 7];

// Custom comparison function for descending order
function descendingOrder(a, b) {
    return b - a;
}

// Sort the array in descending order
numbers.sort(descendingOrder);

// Display the sorted array
console.log("Sorted array in descending order:", numbers);

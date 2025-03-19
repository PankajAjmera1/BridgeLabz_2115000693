// 2. Program to Sort the Array and Find the 2nd Largest and 2nd Smallest Element

// Function to generate 10 random 3-digit numbers, sort the array, and find 2nd largest and 2nd smallest
function findSecondLargestAndSmallestSorted() {
    const numbers = [];
    
    // Generate 10 random 3-digit numbers
    for (let i = 0; i < 10; i++) {
        const randomNum = Math.floor(Math.random() * 900) + 100; // Random 3-digit number
        numbers.push(randomNum);
    }

    console.log("Random Numbers: ", numbers);

    // Sort the array
    numbers.sort((a, b) => a - b);
    console.log("Sorted Numbers: ", numbers);

    const secondLargest = numbers[numbers.length - 2];
    const secondSmallest = numbers[1];

    console.log("2nd Largest: ", secondLargest);
    console.log("2nd Smallest: ", secondSmallest);
}

// Call the function
findSecondLargestAndSmallestSorted();

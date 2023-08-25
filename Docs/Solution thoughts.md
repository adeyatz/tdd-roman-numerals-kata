### Thoughts on how to approach the task
- Use a Map object to hold the Key Value pairs for the Roman numeral values:  
1, I  
5, V  
10, X  
50, L  
100, C  
500, D  
1000, M  

- Use a loop and start at the largest roman number and work towards the smaller number, decrementing the arabic number value if Roman number used in result
- Add 'special case' roman numeral combinations for:

4, IV  
9, IX  
40, XL  
90, XC  
400, CD  
900, CM  

- Use a CSV file to hold the test cases
- Use a StringBuilder to assemble the result 
- Start with 1 = I
- Limit Max 3000

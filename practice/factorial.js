// n=5 5*4*3*2*1=120

function factorial (num) {
	if (num == 1) {
		return 1;
	} else if (num == 0) {
		return 0;
	} else {
		return num = num * factorial(num-1);
	}
}

const solution = factorial(5);

console.log(solution);
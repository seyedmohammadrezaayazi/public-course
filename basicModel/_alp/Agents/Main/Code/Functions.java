double factorial(int number)
{/*ALCODESTART::1765172723107*/
int i=1;
double result=1;
while(i<number+1){
	result*=i;//result=result*i;
	i++;
}

return result;
/*ALCODEEND*/}


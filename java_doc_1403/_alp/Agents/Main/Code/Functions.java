double factoril(int number)
{/*ALCODESTART::1746633203543*/
double result=1;
int tmp=1;
for(int i=1;i<number+1;i++){
	result*=i;
}
traceln(result);
return result;
/*ALCODEEND*/}


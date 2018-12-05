#include "stdafx.h"
#include<iostream>
#include <string>
using namespace std;



inline int count(char *s)
{
int i,num=0,word=0;
for(i=0;i<20;i++)
{if(s[i]==' ')
{word=0;
}
else if(word==0&&s[i]!=' '&&s[i]!=0)
{
word=1;
num++;
}
}
return num;
}
int main()
{inline int count(char*s);
char s[20];
int num;
cout<<"please enter a sentence:";
cin.getline(s,20);
num=count(s);
cout<<"the number of the words is:"<<num<<endl;
return 0;
}

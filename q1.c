#include <stdio.h>
#include "q1.h"
#include <stdlib.h>
void talk(PersonPtr p)
{


   printf("\nHi my name is,%s\n",p->name);
   printf("\nand my age is %d\n",p->age);
}
void commentAboutAge(PersonPtr p)
{

  if (p->age < 5)
  {
     printf("\nbaby\n");
  }
  if (p->age == 5)
  {
     printf("\ntime to start school\n");
  }
}
PersonPtr make_person(String aName, int anAge)
{
  PersonPtr p = malloc(sizeof(struct Person));
  p->name = aName;
  p->age = anAge;
  return p;
}
int main()
{
  PersonPtr ls,wp;

  ls = make_person("Luke Skywalker",34);
  wp = make_person("Winston Peters",48);

  talk(ls);
  talk(wp);
  return 0;
}

import java.util.*;


class stu
{
public String na;
 int id;
int m,n;
int tol;
double avg;
stu(String nam,int i,int a,nt b)

{
na=nam;
id=i;
m=a;
n=b;

}
int total()
{

return tol;
}
void cal()
{
tol=m+n;
avg=tol/3;

}
int idd()
{
return id;

}
public String toString()
{
return "name "+na+"id"+id;
}

}
class stucompare implements Comparator<stu>
{
public int compare(stu s1,stu s2)
{
return Int.compare(s1.id(),s2.id());

}

}
public class hello
{
public static void main(String[] args)
{
Hashset<stu> s= new Hashset<>();
s.add(new stu("jaswanth",1,23,24));
s.add(new stu("jas",2,22,24));
List<stu> hs= new ArrayList<stu>(s);
for(stu i:s)
{
  i.cal();
}
for(stu i:s)
{
  System.out.println(i);
}

Collections.sort(hs, new stucompare());
for(stu i:hs)
{
  
  System.out.println(i);

}



}



}
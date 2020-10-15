import java.util.*;

class Avenger{
    String name,power,weapon,planet;
    int age;
    
    Scanner s=new Scanner(System.in);
    
    void getDetails(int i){
        System.out.println("enter the avenger "+(i+1)+" details: ");
        System.out.print("name: ");
        name=s.nextLine();    
        System.out.print("age: ");
        age=s.nextInt();
        System.out.print("power: ");
        s.nextLine();
        power=s.nextLine();
        System.out.print("weapon: ");
        
        weapon=s.nextLine();
        System.out.print("planet: ");
        planet=s.nextLine();
    }
    void display(int i){
        System.out.println("the details of avenger "+(i+1)+" are:");
        System.out.println("name  : "+name+"\nage   : "+ age+"\npower : "+ power+"\nweapon: "+ weapon+"\nplanet: "+planet);
    }
}

public class Avengers_arrayOfObjects
{
	public static void main(String[] args) {
	    Avenger avengers[]=new Avenger[5];
	    for(int i=0;i<5;i++){
	        avengers[i]=new Avenger();
	        avengers[i].getDetails(i);
	        
	    }
	    for(int i=0;i<5;i++)
	        avengers[i].display(i);
	    //avengers[2].display();
	}
}

/*
enter the avenger 1 details: 
name: bruce banner
age: 41
power: hulk
weapon: body
planet: earth
enter the avenger 2 details: 
name: thor odinson
age: 10000
power: god of thunder
weapon: hammer mjolin
planet: asgard
enter the avenger 3 details: 
name: steve rogers
age: 95
power: captain america
weapon: shield
planet: earth
enter the avenger 4 details: 
name: natasha romanoff
age: 35
power: black widow
weapon: baton and taser
planet: earth
enter the avenger 5 details: 
name: clint barton
age: 45
power: hawkeye
weapon: bow and arrow
planet: earth
the details of avenger 1 are:
name  : bruce banner
age   : 41
power : hulk
weapon: body
planet: earth
the details of avenger 2 are:
name  : thor odinson
age   : 10000
power : god of thunder
weapon: hammer mjolin
planet: asgard
the details of avenger 3 are:
name  : steve rogers
age   : 95
power : captain america
weapon: shield
planet: earth
the details of avenger 4 are:
name  : natasha romanoff
age   : 35
power : black widow
weapon: baton and taser
planet: earth
the details of avenger 5 are:
name  : clint barton
age   : 45
power : hawkeye
weapon: bow and arrow
planet: earth

*/
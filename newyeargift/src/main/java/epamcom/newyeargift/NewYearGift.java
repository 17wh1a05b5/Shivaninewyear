package epamcom.newyeargift;

import java.util.ArrayList;
import java.util.*;
public class NewYearGift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Sweets> l = new ArrayList();
        l.add(new Choclate("DairyMilk",50,20.5f,60));
		l.add(new Choclate("MilkyBar",20,10.2f,40));
		l.add(new Choclate("FiveStar",30,21.5f,55));
		l.add(new Choclate("KitKat",60,30.2f,65));
		l.add(new ChewingGum("JustJelly",5,5.1f,45));
		l.add(new ChewingGum("JollyRancher",10,5.1f,50));
		l.add(new ChewingGum("JellyBelly",15,7.5f,65));
		l.add(new Caramel("Hershey's_Kisses",60,8.1f,90));
		l.add(new Caramel("LaffyTaffy",90,30.1f,75));
		l.add(new Caramel("Nerds",10,2.6f,10));
		l.add(new  Caramel("MilkyWay",30,15.6f,25));
        l.add(new Caramel("DoubleBubbleGum",5,3.0f,15));
        List<Sweets> choc = new ArrayList();
        float totalWt = 0;
        for(Sweets s: l)
            totalWt+=s.weight;
        System.out.println("\nTotal Weight of the Gift is : "+totalWt);
        for(Sweets s: l){
            if(s instanceof Choclate)
                choc.add(s);
        }
        System.out.println("\nLet's get to sorting......\n");
        System.out.println("Enter your choice to sort based on :\n");
        System.out.println("1.Cost\n2.Weight\n3.SweetContent\n");
        int option = sc.nextInt();
        if(option == 1)Collections.sort(choc,new sortByCost());
        else if(option == 2)Collections.sort(choc,new sortByWeight());
        else Collections.sort(choc,new sortBySweetContent());
        System.out.println("Choclates Present in the Gift are:");
		for(Sweets s:choc){
			System.out.println(s.name+" "+s.cost+" "+s.weight+" "+s.sweetContent);
		}
		System.out.println("Do you Want List of Caramels(y/n)");
		char c=sc.next().charAt(0);
		if(c=='y'){
			System.out.print("Enter the Option :\n1.Cost\n2.Weight\n3.SweetContent\n");
			option=sc.nextInt();
			System.out.println("Enter the Range");
			int min=sc.nextInt();
			int max=sc.nextInt();
			if(option==1) {
				for(Sweets cur:l) {
					if(cur instanceof Caramel && cur.cost>=min && cur.cost<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else if(option==2) {
				for(Sweets cur:l) {
					
					if(cur instanceof Caramel && cur.weight>=min && cur.weight<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else {
				for(Sweets cur:l) {
					
					if(cur instanceof Caramel && cur.sweetContent>=min && cur.sweetContent<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
		}
		sc.close();
	}
}

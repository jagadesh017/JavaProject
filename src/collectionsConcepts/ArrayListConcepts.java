package collectionsConcepts;

import java.util.ArrayList;

public class ArrayListConcepts {
	public static void main(String[] args) {
    // add all family members name and age in two different objects and print the same
        FamilyMembers fm = new FamilyMembers("Jagadeesh", 30);
        FamilyMembers fm1 = new FamilyMembers("keerthi", 28);
        FamilyMembers fm2 = new FamilyMembers("hrudhitha", 4);
        FamilyMembers fm3 = new FamilyMembers("nihitha", 2);

        ArrayList<FamilyMembers> list = new ArrayList<>();
        list.add(fm);
        list.add(fm1);
        list.add(fm2);
        list.add(fm3);

        for(FamilyMembers a: list){
            System.out.println(a.name);
            System.out.println(a.age);
        }
	}
}
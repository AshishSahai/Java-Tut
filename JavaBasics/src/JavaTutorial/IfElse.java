package JavaTutorial;

public class IfElse {
	
	public void EqualString(String s) {
		String a[]= new String[5];
		a[0]="Tara";
		a[1]="Sara";
		a[2]="Kiara";
		a[3]="Fara";
		a[4]="Lara";
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==s) {
				System.out.println("Match Found at:"+(i+1));
				count++;
			}
			
		}
		if (count==0) {
			System.out.print("Not Found");
		}
		
	}

	public static void main(String[] args) {
		IfElse obj=new IfElse();
		obj.EqualString("Gemo");
	
		
		
	
		}

}

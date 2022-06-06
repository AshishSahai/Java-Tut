package JavaTutorial;

public class SortAscending {

	public static void main(String[] args) {
		
		int Array[]= {2,5,1,6,8,3,4,11,2,7,9};
		
		for(int i=0;i<Array.length;i++) {
			for(int j=i+1;j<Array.length;j++) {
				int Temp=0;
				if(Array[i]>Array[j]) {
					Temp=Array[i];
					Array[i]=Array[j];
					Array[j]=Temp;
				}
				
			}
			System.out.print(Array[i]+" ");
		}
		

	}

}

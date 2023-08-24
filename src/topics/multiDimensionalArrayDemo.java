package topics;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] sehirler =new String[3][3];
		sehirler[0][0]="istanbul";
		sehirler[0][1]="Edirne";
		sehirler[0][2]="Bursa";
		sehirler[1][0]="Siirt";
		sehirler[1][1]="Şırnak";
		sehirler[1][2]="Mardin";
		sehirler[2][0]="İzmir";
		sehirler[2][1]="Aydın";
		sehirler[2][2]="Çanakkale";
		for(int i=0;i<=2;i++) {
			System.out.println("-------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		System.out.println("***********");
		
		
		int[] [] a = { 
				{1, 2, 3},
				{1,5,6},
				{23,55},
			};
	             
	        // calculate the length of each row
	        System.out.println("Length of row 1: " + a[0].length);
	        System.out.println("Length of row 2: " + a[1].length);
	        System.out.println("Length of row 3: " + a[2].length);
	        for(int i =0; i<a.length;i++) {
	        	for(int j=0;j<a[i].length;j++) {
	        		System.out.println("Dizinin elemanları: "+ a[i][j]);
	        	}
	        }
	       	        
	        System.out.println("----------------");
		
		int[][] array={
				{1,2,4,9},
				{2,5,9},
				{8,90,8,23,32,323,4234,2342,34234},
				{22,42,3},
				
		};
			
	        for(int m=0;m<array.length;m++) {
	        	for(int n=0;n<array[m].length;n++) {
	        		System.out.println("Dizinin elemanları: "+array[m][n]);
	        	}
	        }
	        
	      
	}

}

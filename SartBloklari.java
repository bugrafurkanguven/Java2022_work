package intro;

public class SartBloklari {

	public static void main(String[] args) {
		int not = 35;
		// 50 ve üzeri : geçti
		// 40-49 : bütünleme 
		// 0-39 : kaldı
		
		if(not>=50){
			System.out.println("Dersten Geçti");
		}else if ( not>=40) {
			System.out.println("Bütünlemeye Girecek");
		}else {
			System.out.println("DErsten Kaldı");
		}
	}

}

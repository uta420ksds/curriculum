package check;
//定数は別パッケージなのでインポートする
import constants.Constants;

public class Check {
	private static String firstName = "余宮";
	private static String lastName = "将太";
	
	public static void main(String[]args) {
		//printNameメソッドの呼び出し
		printName(firstName,lastName);
		//インスタンスの作成
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		//Petクラス、robotPetクラスそれぞれのintroduceメソッドの呼び出し
		pet.introduce();
		robotPet.introduce();
	}
	private static void printName(String firstName,String lastName) {
		//連結処理
		String fullName = firstName + lastName;
		//連結文字列の出力
		System.out.println("printNameメソッド → "+fullName);
	}
}


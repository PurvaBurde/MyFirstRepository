package method_overriding;

public class Tree {
	
	public int Taste() {
		return 1;
	}
	public void Leaves() {
		
	}

	public static void main(String[] args) {

	}

}
class Mango extends Tree{
	//Override- Taste
	public int Taste() {
		return 1;
	}
}

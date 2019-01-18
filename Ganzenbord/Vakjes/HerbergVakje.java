package Ganzenbord.Vakjes;

public class HerbergVakje extends Vakje {


	public HerbergVakje(int nummer) {
		super(nummer);
	}

	@Override
	public String toString() {
		return super.toString() + "\tHerberg";
	}
}

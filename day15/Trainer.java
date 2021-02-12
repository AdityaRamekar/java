package day15;

import java.io.Serializable;
public class Trainer implements Serializable {

	static transient private int trid;
	private String trname;
	private int expYears;
	public Trainer(int trid, String trname,int expYears) {
		super();
		this.trid = trid;
		this.trname = trname;
		this.expYears = expYears;
	}
	@Override
	public String toString() {
		return "Trainer [trid=" + trid + ", trname=" + trname + ", expYears=" + expYears + "]";
	}
	
}

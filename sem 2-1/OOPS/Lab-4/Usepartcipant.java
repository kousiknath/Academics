import festival.*;
import personal.*;
public class Usepartcipant 
{
	public static void main(String args[])
	{
		Participant p[] = new Participant[4];
		p[0] = new Participant("Bits","BITS PILANI","dance");
		p[0].col.getCollege();	
		p[1] = new Participant("iitk","IIT","coding");
		p[1].event.setposition(12);
		p[1].event.getposition();
		
		
	}

}

package Domashna3zad1;

public class PC {

	public int memorija;
	public int HardDisk;
	public String tipnamemorija;
	public String golemina ="GB";
	public String disk;
	public String ssd;
	
	public PC () {
		this.memorija = 2;
		this.tipnamemorija = "DDR4";
		this.HardDisk =160;
		this.disk="HDD";
		this.ssd="SSD m.2";
		

	}
    public void prvMetod (int zgolemimemorija, int novSSDdisk)
    {
    	System.out.println("Memorijata beshe " + this.memorija + golemina +" , sega iznesuva " + (zgolemimemorija + memorija) + golemina + ".");
    	System.out.println("Tipot na memorijata e " + this.tipnamemorija);
    	System.out.println("Noviot disk e " + this.ssd + " ima golemina od " + novSSDdisk + golemina + ". Prethodno imashe " + this.disk + " , i iznesuvashe " + this.HardDisk + golemina + ".");
    }
    
}

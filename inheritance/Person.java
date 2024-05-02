package inheritance;

class Person {
	protected String nama;
	protected String alamat;
    protected String hobi;
	
	//Default Constructor
	public Person() {
		System.out.println("Nama: "+nama);
		System.out.println("Alamat: "+alamat);
	}
	
	//Constructor dengan parameter
	public Person(String nama,String alamat, String hobi) {
		this.nama = nama;
		this.alamat = alamat;
        this.hobi = hobi;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getAlamat() {
		return alamat;
	}

    public String getHobi(){
        return hobi;
    }
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public void job(String job)
	{
		System.out.println("Pekerjaan "+job);
	}
	
	public void identity()
	{
		System.out.println("Nama: "+getNama());
		System.out.println("Alamat: "+getAlamat());
		System.out.println("Hobi: "+getHobi());
	}
}

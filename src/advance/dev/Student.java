package advance.dev;

	public Student() {
	
	private String ten;
	private int tuoi;
	private String diaChi;
	private int number;
	private float mark;
	public Student(String ten, int tuoi, String diaChi, String number, float mark) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.number = number;
		this.mark = mark;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		if(tuoi > 0) {
		this.tuoi = tuoi;
		}
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getNumber() {
		return number;
	}
	public void setNum(int number) {
		this.number = number;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		if(mark >= 0) {
			this.mark = mark;
		}
	}
}
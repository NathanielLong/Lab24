package co.grandcircus.Lab24;

public class Products {

	private Integer id;
	private String name;
	private String description;
	private int quantity;
	private double price;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Products( String name, String description, int quantity, double price) {
		
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Products(Integer id, String name, String description, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}

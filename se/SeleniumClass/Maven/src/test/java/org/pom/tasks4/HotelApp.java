package org.pom.tasks4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class HotelApp extends BaseClass {
	
	public HotelApp()   {
		
		PageFactory.initElements(driver, this);
	}	
	
	//Login
	
	@FindBy(id="username")
	private WebElement userid;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	// Search Hotel
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")	
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement NoofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement CheckinDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement Adultsperroom;
	
	@FindBy(id="child_room")
	private WebElement childsperroom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	// Hotel Option Selection
	
	@FindBy(id="radiobutton_0")
	private WebElement Options;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	// ***************Book A Hotel Freeze*************
	
	@FindBy(id="hotel_name_dis")
	private WebElement HotelName;
	
	@FindBy(id="location_dis")
	private WebElement Location2;
	
	@FindBy(id="room_type_dis")
	private WebElement RoomsType;
	
	@FindBy(id="room_num_dis")
	private WebElement TotalRooms;
	
	@FindBy(id="total_days_dis")
	private WebElement TotalDays;
	
	@FindBy(id="price_night_dis")
	private WebElement pricepernight;
	
	@FindBy(id="total_price_dis")
	private WebElement TotalPrice;
	
	@FindBy(id="gst_dis")
	private WebElement GST;
	
	@FindBy(id="final_price_dis")
	private WebElement FinalBill;
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CCno;
	
	@FindBy(id="cc_type")
	private WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryDate;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVV;
	
	@FindBy(id="book_now")
	private WebElement Booknow;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement getorder;

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoofRooms() {
		return NoofRooms;
	}

	public WebElement getCheckinDate() {
		return CheckinDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultsperroom() {
		return Adultsperroom;
	}

	public WebElement getChildsperroom() {
		return childsperroom;
	}
	
	public WebElement getsearch() {
		return search;
	}
	
	

	public WebElement getOptions() {
		return Options;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getHotelName() {
		return HotelName;
	}

	public WebElement getLocation2() {
		return Location2;
	}

	public WebElement getRoomsType() {
		return RoomsType;
	}

	public WebElement getTotalRooms() {
		return TotalRooms;
	}

	public WebElement getTotalDays() {
		return TotalDays;
	}

	public WebElement getPricepernight() {
		return pricepernight;
	}

	public WebElement getTotalPrice() {
		return TotalPrice;
	}

	public WebElement getGST() {
		return GST;
	}

	public WebElement getFinalBill() {
		return FinalBill;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCCno() {
		return CCno;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpiryDate() {
		return ExpiryDate;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBooknow() {
		return Booknow;
	}
	
	public WebElement getorder() {
		return Booknow;
	}
}

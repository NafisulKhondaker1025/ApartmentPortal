package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Hardware.Apartment;
import Hardware.Building;
import People.PotResident;

class ApartmentTest {

	@Test
	final void testApartment() {
		Apartment a = new Apartment();
		assertEquals("NULL", a.getName());
		assertEquals("NULL", a.getAddress());
	}
	
	@Test
	final void testApartmentSetName() {
		Apartment a = new Apartment();
		a.setName("apartment");
		assertEquals("apartment", a.getName());
	}
	
	@Test
	final void testApartmentSetAddress() {
		Apartment a = new Apartment();
		a.setAddress("address");
		assertEquals("address", a.getAddress());
	}
	
	@Test
	final void testApartmentAddBuilding() {
		Apartment a = new Apartment();
		Building b = new Building();
		b.setiD(5);
		a.addBuilding(b);
		assertEquals(5, a.getBuildingList().get(0).getiD());
	}
	
	@Test
	final void testApartmentAddPotResident() {
		Apartment a = new Apartment();
		PotResident r = new PotResident();
		r.setName("Kevin");
		a.addPotResident(r);
		assertEquals("Kevin", a.getPotResidentList().get(0).getName());
	}


}

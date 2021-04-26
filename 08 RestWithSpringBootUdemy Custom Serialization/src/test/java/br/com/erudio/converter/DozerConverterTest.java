package br.com.erudio.converter;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.erudio.converter.mocks.MockPerson;
import br.com.erudio.data.model.Person;
import br.com.erudio.data.vo.v1.PersonVO;

public class DozerConverterTest {
	MockPerson inputObject;
	
	@Before
	public void setup( ) {
		inputObject = new MockPerson();
	}
	
	@Test
	public void parseEntityToVoTest() {
		PersonVO output = DozerConverter.parseObject(
				inputObject.mockEntity(), PersonVO.class);
		assertEquals(Long.valueOf(0L), output.getId());
		assertEquals("First Name Test0", output.getFirstName());
		assertEquals("Last Name Test0", output.getLastName());
		assertEquals("Address Test0", output.getAddress());
		assertEquals("Male", output.getGender());
	}
	
	@Test
	public void parseEntityListToVoListTest() {
		List<PersonVO> outputList = DozerConverter.parseListObjects(
				inputObject.mockEntityList(), PersonVO.class);
		PersonVO outputZero = outputList.get(0);
		
		assertEquals(Long.valueOf(0L), outputZero.getId());
		assertEquals("First Name Test0", outputZero.getFirstName());
		assertEquals("Last Name Test0", outputZero.getLastName());
		assertEquals("Address Test0", outputZero.getAddress());
		assertEquals("Male", outputZero.getGender());
		
		PersonVO outputSeven = outputList.get(7);
		
		assertEquals(Long.valueOf(7L), outputSeven.getId());
		assertEquals("First Name Test7", outputSeven.getFirstName());
		assertEquals("Last Name Test7", outputSeven.getLastName());
		assertEquals("Address Test7", outputSeven.getAddress());
		assertEquals("Female", outputSeven.getGender());
	}
	
	@Test
	public void parseVoToEntityTest() {
		Person output = DozerConverter.parseObject(
				inputObject.mockVO(), Person.class);
		assertEquals(Long.valueOf(0L), output.getId());
		assertEquals("First Name Test0", output.getFirstName());
		assertEquals("Last Name Test0", output.getLastName());
		assertEquals("Address Test0", output.getAddress());
		assertEquals("Male", output.getGender());
	}
	
	@Test
	public void parseVoListToEntityListTest() {
		List<Person> outputList = DozerConverter.parseListObjects(
				inputObject.mockVOList(), Person.class);
		Person outputZero = outputList.get(0);
		
		assertEquals(Long.valueOf(0L), outputZero.getId());
		assertEquals("First Name Test0", outputZero.getFirstName());
		assertEquals("Last Name Test0", outputZero.getLastName());
		assertEquals("Address Test0", outputZero.getAddress());
		assertEquals("Male", outputZero.getGender());
		
		Person outputSeven = outputList.get(7);
		
		assertEquals(Long.valueOf(7L), outputSeven.getId());
		assertEquals("First Name Test7", outputSeven.getFirstName());
		assertEquals("Last Name Test7", outputSeven.getLastName());
		assertEquals("Address Test7", outputSeven.getAddress());
		assertEquals("Female", outputSeven.getGender());
	}
}

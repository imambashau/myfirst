package com.wipro.myfirst;

import com.wipro.myfirst.model.FirstModel;
import com.wipro.myfirst.repository.FirstRepository;
import com.wipro.myfirst.service.FirstService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MyfirstApplicationTests {
	@InjectMocks
	FirstService firstService;
	@Mock
	FirstRepository firstRepository;

	@Test
	void testCreate() {
		FirstModel firstModel=new FirstModel();
		firstModel.setSno(1);
		firstModel.setName("imam");
		firstModel.setAddress("tad");
		firstService.create(firstModel);
		Mockito.verify(firstRepository, Mockito.times(1)).save(firstModel);
	}
@Test
	public void testInvoke(){
		FirstModel firstModel=new FirstModel();
	firstModel.setSno(1);
	firstModel.setName("imam");
	firstModel.setAddress("tad");
	FirstModel firstModel1=new FirstModel();
	firstModel1.setSno(2);
	firstModel1.setName("imam2");
	firstModel1.setAddress("tad2");
	List<FirstModel> data=new ArrayList<>();
	data.add(firstModel);
	data.add(firstModel1);
	Mockito.when(firstRepository.findAll()).thenReturn(data);
	List<FirstModel> all=firstService.invoke();
	Assertions.assertEquals(all.size(),data.size());
}

}

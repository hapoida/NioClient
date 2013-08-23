package com.benepia.client;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-app-context.xml"})
public class TestGuideForTdd {
	
	@Autowired
	private ExampleService service;
	
	@Test
	public void test_플러스목모듈테스트(){
		
		ExampleService mockService = Mockito.mock(ExampleService.class);		
		
		when(mockService.plus(1,1)).thenReturn("1귀요미1");
		when(mockService.plus(2,2)).thenReturn("2귀요미2");
		when(mockService.plus(3,3)).thenReturn("3귀요미3");
		when(mockService.plus(4,4)).thenReturn("4귀요미4");
		when(mockService.plus(5,5)).thenReturn("5귀요미5");
		when(mockService.plus(6,6)).thenReturn("쪽쪽쪽쪽쪽쪽 귀요미");
		
		assertThat(mockService.plus(1,1), is("1귀요미1") );
		assertThat(mockService.plus(2,2), is("2귀요미2") );
		assertThat(mockService.plus(3,3), is("3귀요미3") );
		assertThat(mockService.plus(4,4), is("4귀요미4") );
		assertThat(mockService.plus(5,5), is("5귀요미5") );
		assertThat(mockService.plus(6,6), is("쪽쪽쪽쪽쪽쪽 귀요미") );
	}
	
	@Test
	public void test_플러스_리얼_모듈테스트(){
		
		
		assertThat(service.plus(1,1), is("1귀요미1") );
		assertThat(service.plus(2,2), is("2귀요미2") );
		assertThat(service.plus(3,3), is("3귀요미3") );
		assertThat(service.plus(4,4), is("4귀요미4") );
		assertThat(service.plus(5,5), is("5귀요미5") );
		assertThat(service.plus(6,6), is("쪽쪽쪽쪽쪽쪽 귀요미") );
	}
}

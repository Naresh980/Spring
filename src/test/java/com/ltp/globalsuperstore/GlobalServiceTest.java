package com.ltp.globalsuperstore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GlobalServiceTest {
    @Mock
    private StoreRepository storeRepository;
    @InjectMocks
    private StoreService storeService;

   // @Test
  //  public void getItemsFromRepoTest(){
   //     when(storeRepository.getItems()).thenReturn(Arrays.asList(
    //            new Item("Furniture","Chairs",5000.0,500.0,1),
         //       new Item("Furniture","Sofas",10000.0,100.0,)

   //     ))
  //  }
}

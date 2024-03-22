package org.example;


import org.example.SingleSensorType.*;
import org.junit.Test;
import org.mockito.MockedConstruction;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SensorTypeServiceTest {


    @Test
    public void whenGetListOfSensorType_ShouldReturnCorrectSizeList() throws InstantiationException {

        //Arrange

        SensorType sensorTypeDouble = mock(SensorType.class);
        SensorTypeFactory sensorTypeFactory = mock(SensorTypeFactory.class);
        SensorTypeRepository sensorTypeRepository = mock(SensorTypeRepository.class);
        List<SensorType> sensorTypeListDoubles = new ArrayList<>();

        sensorTypeListDoubles.add(sensorTypeDouble);
        sensorTypeListDoubles.add(sensorTypeDouble);
        Iterable<SensorType> sensorTypeDoublesIterable = sensorTypeListDoubles;
        when(sensorTypeRepository.findAll()).thenReturn(sensorTypeDoublesIterable);


        //Act

        try (MockedConstruction<SensorTypeID> sensorTypeIDMockedConstruction = mockConstruction(SensorTypeID.class, (mock, context) -> {

        }); MockedConstruction<UnitVO> unitVOMockedConstruction = mockConstruction(UnitVO.class, (mock, context) -> {

        })) {

            SensorTypeService sensorTypeService = new SensorTypeService(sensorTypeRepository, sensorTypeFactory);

            SensorTypeID sensorTypeID = sensorTypeIDMockedConstruction.constructed().getLast();
            UnitVO unitVO = unitVOMockedConstruction.constructed().getLast();

//            when(sensorTypeFactory.createSensorType(sensorTypeID, unitVO)).thenReturn(sensorTypeDouble); //Para depois não dar merda no save do repo???
            //sensorTypeListDoubles.add(sensorTypeDouble);

            List<SensorType> listOfSensorTypes = sensorTypeService.getAllSensorTypes();

            //Assert

            assertEquals(listOfSensorTypes.size(),2);

        }



    }
}
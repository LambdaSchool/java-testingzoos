package com.stepasha.zoo.services;

import com.stepasha.zoo.ZooApplication;
import com.stepasha.zoo.models.Zoo;
import com.stepasha.zoo.models.ZooAnimals;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZooApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ZooServiceImplUnitTest {

    @Autowired
    private ZooService zooService;

    @Before
    public void AsetUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    @After
    public void BtearDown() throws Exception {
    }


    @Test
    public void findAllZoos() {
        assertEquals(5, zooService.findAllZoos().size());
    }

    @Test
    public void findZooById() {
        assertEquals("Gladys Porter Zoo", zooService.findZooById(1).getZooname());
    }

    @Test
    public void findZooByName() {
        assertEquals("Gladys Porter Zoo", zooService.findZooByName("Gladys Porter Zoo").getZooname());
    }

    @Test
    public void deleteZoo() {
    }

    @Test
    public void saveZoo() {
    }

    @Test
    public void updateZoo() {
        ArrayList<Zoo> thisZoo = new ArrayList<>();
        ArrayList<ZooAnimals> thisAnimal = new ArrayList<>();
        Zoo zoo1 = new Zoo("Monkey Porter Zoo", thisAnimal);
        zoo1.setZooid(1);

        Zoo updateZoo1 = zooService.updateZoo(zoo1, 1);

        assertEquals("Monkey Porter Zoo", updateZoo1.getZooname());
    }

    @Test
    public void deleteZooAnimal() {
    }

    @Test
    public void addZooAnimal() {
    }
}
package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    Pet pet = new Pet("buck");

    @Test
    public void testConstructor(){
        String expected = "buck";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetName(){
        String expected = "barry";
        pet.setName("barry");
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak(){
        String expected = "some noise";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);

    }

}

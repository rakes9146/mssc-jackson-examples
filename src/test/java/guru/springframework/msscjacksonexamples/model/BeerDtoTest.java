package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper jsonObjectMapper;

    @Test
    public void testSerializeDto() throws JsonProcessingException {

        BeerDto beer = getBeer();
        String jsonBeer = jsonObjectMapper.writeValueAsString(beer);
        System.out.println("Beer Value "+jsonBeer);

    }

    @Test
    public void testDeserializeDto() throws IOException {

        String jsonValue = "{\"beerName\":\"APEC\",\"beerStyle\":\"APC\",\"upc\":343434343434,\"price\":\"32.3299999999999982946974341757595539093017578125\",\"createdDate\":\"2025-02-23T14:35:25+0530\",\"lastUpdatedDate\":\"2025-02-23T14:35:25.8372471+05:30\",\"myDate\":\"20250223\",\"beerId\":\"c47cf2e6-5fe1-40d3-b60b-5ef86a021c03\"}";
        BeerDto beer = jsonObjectMapper.readValue(jsonValue, BeerDto.class);
        System.out.println("Json Beer Value "+beer);


    }


}
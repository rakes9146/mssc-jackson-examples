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

        String jsonValue = "{\"beerId\":\"639c00ff-9993-4ec1-af12-8277c85f93bb\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2019-06-02T16:35:58.321001-04:00\",\"lastUpdatedDate\":\"2019-06-02T16:35:58.321872-04:00\"}";

        BeerDto beer = jsonObjectMapper.readValue(jsonValue, BeerDto.class);
        System.out.println("Json Beer Value "+beer);


    }


}
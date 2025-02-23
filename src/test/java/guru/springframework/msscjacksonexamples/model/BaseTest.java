package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    public BeerDto getBeer(){

      return  BeerDto.builder().beerName("APEC")
                .price(new BigDecimal(32.33))
                .beerStyle("APC")
                .upc(343434343434L)
                .id(UUID.randomUUID())
                .lastUpdatedDate(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .build();

    }

}

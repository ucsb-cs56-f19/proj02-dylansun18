package earthquakes.osm;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Place {
  public String type;
  public long place_id;
  public double lat;
  public double lon;
  public String display_name;
  private static Logger logger = LoggerFactory.getLogger(Place.class);

  public static List<Place> listFromJSON(String json) {
    try {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        List<Place> Places = objectMapper.readValue(json, new TypeReference<List<Place>>(){});
        return Places;
    } catch (JsonProcessingException jpe) {
        logger.error("JsonProcessingException:" + jpe);
        return null;
    } catch (Exception e) {
        logger.error("Exception:" + e);
        return null;
    }
  }
}

package com.poc.suggetion.suggetionprocessing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
  @Autowired
  ObjectMapper objectMapper;

  @GetMapping(value = "/hello")

  public List<Suggestion> suggetionController() throws JsonProcessingException {
    String jsonString = "[{\"text\":\"100 S Doheny Dr, Beverly Hills CA 90211-2510\",\"additional_attributes\":[{\"name\":\"picklist_display\",\"value\":\"100 S Doheny Dr, Beverly Hills CA\"},{\"name\":\"score\",\"value\":\"100\"},{\"name\":\"postcode\",\"value\":\"90211-2510\"},{\"name\":\"full_address\",\"value\":\"true\"}]},{\"text\":\"112 ... 124 S Doheny Dr, Beverly Hills CA 90211-2510\",\"additional_attributes\":[{\"name\":\"picklist_display\",\"value\":\"112 ... 124 S Doheny Dr, Beverly Hills CA   [even]\"},{\"name\":\"score\",\"value\":\"100\"},{\"name\":\"postcode\",\"value\":\"90211-2510\"},{\"name\":\"multiples\",\"value\":\"true\"},{\"name\":\"unresolvable_range\",\"value\":\"true\"}]},{\"text\":\"129 ... 199 S Doheny Dr, Beverly Hills CA 90211-2509\",\"additional_attributes\":[{\"name\":\"picklist_display\",\"value\":\"129 ... 199 S Doheny Dr, Beverly Hills CA   [odd]\"},{\"name\":\"score\",\"value\":\"100\"},{\"name\":\"postcode\",\"value\":\"90211-2509\"},{\"name\":\"multiples\",\"value\":\"true\"},{\"name\":\"unresolvable_range\",\"value\":\"true\"}]},{\"text\":\"140 ... 154 S Doheny Dr, Beverly Hills CA 90211-2510\",\"additional_attributes\":[{\"name\":\"picklist_display\",\"value\":\"140 ... 154 S Doheny Dr, Beverly Hills CA   [even]\"},{\"name\":\"score\",\"value\":\"100\"},{\"name\":\"postcode\",\"value\":\"90211-2510\"},{\"name\":\"multiples\",\"value\":\"true\"},{\"name\":\"unresolvable_range\",\"value\":\"true\"}]},{\"text\":\"161 S Doheny Dr, Beverly Hills CA 90211-2590\",\"additional_attributes\":[{\"name\":\"picklist_display\",\"value\":\"161 S Doheny Dr, Beverly Hills CA\"},{\"name\":\"score\",\"value\":\"100\"},{\"name\":\"postcode\",\"value\":\"90211-2590\"},{\"name\":\"full_address\",\"value\":\"true\"}]},{\"text\":\"Gelfand, 161 S Doheny Dr, Beverly Hills CA 90211-2590\",\"additional_attributes\":[{\"name\":\"picklist_display\",\"value\":\"Gelfand, 161 S Doheny Dr, Beverly Hills CA\"},{\"name\":\"score\",\"value\":\"100\"},{\"name\":\"postcode\",\"value\":\"90211-2590\"},{\"name\":\"full_address\",\"value\":\"true\"}]},{\"text\":\"176 ... 198 S Doheny Dr, Beverly Hills CA 90211-2510\",\"additional_attributes\":[{\"name\":\"picklist_display\",\"value\":\"176 ... 198 S Doheny Dr, Beverly Hills CA   [even]\"},{\"name\":\"score\",\"value\":\"100\"},{\"name\":\"postcode\",\"value\":\"90211-2510\"},{\"name\":\"multiples\",\"value\":\"true\"},{\"name\":\"unresolvable_range\",\"value\":\"true\"}]}]";
    ObjectMapper mapper = new ObjectMapper();


    List<Suggestion> suggetions = mapper.readValue(jsonString.toString(), mapper.getTypeFactory().constructCollectionType(List.class, Suggestion.class));


    return suggetions;
  }
}

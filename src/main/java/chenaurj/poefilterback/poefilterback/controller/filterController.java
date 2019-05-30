package chenaurj.poefilterback.poefilterback.controller;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import chenaurj.poefilterback.poefilterback.model.PoeFilter;
import chenaurj.poefilterback.poefilterback.service.FilterService;

@RestController
public class filterController {

    @Autowired
    private FilterService filterService;

    @RequestMapping(value="/generateFilter", method=RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
    public byte[] generateFilter(@RequestBody PoeFilter filterData) throws IOException {
        return filterService.generateFilter(filterData);
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String test() {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node  = mapper.createObjectNode();
        ((ObjectNode) node).put("test", "success");
        return node.toString();
    }

    
}
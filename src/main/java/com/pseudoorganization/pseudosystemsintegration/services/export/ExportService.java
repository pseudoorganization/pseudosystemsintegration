package com.pseudoorganization.pseudosystemsintegration.services.export;

import com.pseudoorganization.pseudosystemsintegration.models.State;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ExportService {
    private final JsonParser jsonParser;
    private final XmlParser xmlParser;
    private final YamlParser yamlParser;

    @SneakyThrows
    public String exportJSON(final List<State> states) {
        return jsonParser.writeValueAsString(states);
    }

    @SneakyThrows
    public String exportXML(final List<State> states) {
        return xmlParser.writeValueAsString(states);
    }

    @SneakyThrows
    public String exportYAML(final List<State> states) {
        return yamlParser.writeValueAsString(states);
    }
}

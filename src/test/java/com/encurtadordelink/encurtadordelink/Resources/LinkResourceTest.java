package com.encurtadordelink.encurtadordelink.Resources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.encurtadordelink.encurtadordelink.Resource.LinkResource;

@WebMvcTest(LinkResource.class)
class LinkResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveRetornarUrlEncurtadaQuandoUrlValidaForEnviada() throws Exception {
        String urlOriginal = "https://meusite.com/pagina123";

        mockMvc.perform(post("/api/links/encurtar")
                .content(urlOriginal)
                .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string("https://short.ly/abc123"));
    }

    @Test
    void deveRetornarBadRequestQuandoUrlForVazia() throws Exception {
        mockMvc.perform(post("/api/links/encurtar")
                .content("")
                .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isBadRequest())
            .andExpect(content().string("URL inválida"));
    }
}

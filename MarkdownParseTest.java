import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void checkLinks(){
        MarkdownParse markdown = new MarkdownParse();
        // ArrayList<String> linkTest = [https://something.com, some-thing.html];
        List linkList = List.of("https://something.com", "some-thing.html");

        try {
            Path fileName = Path.of("test-file.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = markdown.getLinks(content);
            System.out.println("try");
            assertEquals(linkList, links);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
// import static org.junit.Assert.*;

// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.ArrayList;
// import java.util.List;

// import org.junit.*;
// public class MarkdownParseTest {
//     MarkdownParse markdown = new MarkdownParse();

//     @Test
//     public void addition() {
//         assertEquals(2, 1 + 1);
//     }

//     @Test
//     public void checkTestFile1(){
//         // ArrayList<String> linkTest = [https://something.com, some-thing.html];
//         List linkList = List.of("https://something.com", "some-thing.html");

//         try {
//             Path fileName = Path.of("test-file.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Test
//     public void checkTestFile2(){
//         // ArrayList<String> linkTest = [https://something.com, some-thing.html];
//         List<String> linkList = List.of("https://google.com", "some-thing.html");

//         try {
//             Path fileName = Path.of("test-file2.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Test
//     public void checkTest3(){
//         List<String> linkList = List.of("");

//         try {
//             Path fileName = Path.of("test-file3.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             System.out.println("test: " + links);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Test
//     public void checkTest4(){
//         List<String> linkList = List.of("[]");

//         try {
//             Path fileName = Path.of("test-file4.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Test
//     public void checkTest5(){
//         List<String> linkList = List.of("page.com");

//         try {
//             Path fileName = Path.of("test-file5.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Test
//     public void checkTest6(){
//         List<String> linkList = List.of("page.com");

//         try {
//             Path fileName = Path.of("test-file6.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Test
//     public void checkTest7(){
//         List<String> linkList = List.of("");

//         try {
//             Path fileName = Path.of("test-file7.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Test
//     public void checkTest8(){
//         List<String> linkList = List.of("");

//         try {
//             Path fileName = Path.of("test-file8.md");
//             String content = Files.readString(fileName);
//             ArrayList<String> links = markdown.getLinks(content);
//             System.out.println("8: " + links);
//             assertEquals(linkList, links);
//         } 
//         catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

// }

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {


    @Test
    public void testFile1() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(content));
    }
}
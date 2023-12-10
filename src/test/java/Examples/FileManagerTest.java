package Examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {
    private FileManager fileManager;
    private final String fileName = "testfile.txt";

    @BeforeEach
    public void setUp() throws IOException {
        fileManager = new FileManager(fileName);
        fileManager.createFile();
    }

    @AfterEach
    public void tearDown() throws IOException {
        fileManager.cleanUp();
        fileManager = null;
    }

    @Test
    public void testFileCreation() {
        assertTrue(Files.exists(Path.of(fileName)));
    }

    @Test
    public void testWriteAndReadFile() throws IOException {
        String contentToWrite = "Hello, this is a test content!";
        fileManager.writeFile(contentToWrite);

        String contentRead = fileManager.readFile();
        assertEquals(contentToWrite, contentRead);
    }

    @Test
    public void testFileCleanup() throws IOException {
        assertTrue(Files.exists(Path.of(fileName)));

        fileManager.cleanUp();

        assertTrue(Files.notExists(Path.of(fileName)));
    }
}
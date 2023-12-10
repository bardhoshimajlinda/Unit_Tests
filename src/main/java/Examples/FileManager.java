package Examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileManager {
    private Path filePath;

    public FileManager(String fileName) {
        this.filePath = Path.of(fileName);
    }

    public void createFile() throws IOException {
        Files.createFile(filePath);
    }

    public void writeFile(String content) throws IOException {
        Files.write(filePath, content.getBytes(), StandardOpenOption.WRITE);
    }

    public String readFile() throws IOException {
        return Files.readString(filePath);
    }

    public void cleanUp() throws IOException {
        Files.deleteIfExists(filePath);
    }
}

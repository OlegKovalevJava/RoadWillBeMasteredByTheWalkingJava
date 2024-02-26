package finished.archive.lesson20.task1.service;

import finished.archive.lesson20.task1.model.File;

import java.io.FileNotFoundException;

public class FileService {
    private final File[] files;

    public FileService(File[] files) {
        this.files = files;
    }

    public File findFile(String name) throws FileNotFoundException {
        for (File f : files) {
            if (f.getName().equals(name)) {
                return f;
            }
        }
        throw new FileNotFoundException("File not found");
    }
}
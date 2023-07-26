package finished.lesson20.task1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class File {
    private String name;
    private long size;
    private MediaType mediaType;

    @Override
    public String toString() {
        return """
                name: %s
                size: %d
                mediaType: %s
                """
                .formatted(name, size, mediaType.name());
    }
}
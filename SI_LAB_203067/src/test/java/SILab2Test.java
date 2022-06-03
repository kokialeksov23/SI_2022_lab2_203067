import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> createList(String... strings){
        return new ArrayList<>(Arrays.asList(strings));
    }
    @Test
    void testcases() {
        RuntimeException ex = null;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList("#", "#", "#", "#", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
    }
}
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC17Test {

    @Test
    void letterCombinations() {
        LC17 lc = new LC17();
        lc.letterCombinations("23").stream().forEach(System.out::println);
    }
}
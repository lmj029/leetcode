import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC17 {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();

        Map<String, List<String>> digitalMap = new HashMap<String, List<String>>() {
            {
                put("2", new ArrayList<String>(){{
                    add("a");
                    add("b");
                    add("c");
                }});

                put("3", new ArrayList<String>(){{
                    add("d");
                    add("e");
                    add("f");
                }});

                put("4", new ArrayList<String>(){{
                    add("g");
                    add("h");
                    add("i");
                }});

                put("5", new ArrayList<String>(){{
                    add("j");
                    add("k");
                    add("l");
                }});

                put("6", new ArrayList<String>(){{
                    add("m");
                    add("n");
                    add("o");
                }});

                put("7", new ArrayList<String>(){{
                    add("p");
                    add("q");
                    add("r");
                    add("s");
                }});

                put("8", new ArrayList<String>(){{
                    add("t");
                    add("u");
                    add("v");
                }});

                put("9", new ArrayList<String>(){{
                    add("w");
                    add("x");
                    add("y");
                    add("z");
                }});

            }};

        List<String> answer = new ArrayList<>();

        solver(digits, answer, digitalMap, 0, new StringBuilder());
        return answer;


    }

    public void solver(String digits, List<String> answer, Map<String, List<String>> map, int index, StringBuilder sb) {
        if(index == digits.length()) {
            answer.add(sb.toString());
        } else {
            List<String> currentList =  map.get(String.valueOf(digits.charAt(index)));
            for(int i = 0; i< currentList.size(); i++) {
                sb.append(currentList.get(i));
                solver(digits, answer, map, index+1, sb);
                sb.deleteCharAt(index);
            }
        }
    }
}

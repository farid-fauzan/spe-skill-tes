public class NeedleInTheHaystack {

    public String findNeedle (Object[] haystack, String needle) {


        int position = 0;

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                position = i;
            }
        }

        return "found the needle at position " + position;

    }
}

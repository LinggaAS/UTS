package UTS1;

public class ulangan {
    public static void main(String[] args) {
        String abjad = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
        char nama[] = {'L', 'I', 'N', 'G', 'G', 'A', '-', 'A', 'N', 'D', 'I', 'K', 'A'};

        for (int i = 0; i < nama.length; i++)
        {
            int getIndex = abjad.indexOf(nama[i]);
            System.out.print(abjad.charAt(getIndex));
        }
    }
}

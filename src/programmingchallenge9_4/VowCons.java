package programmingchallenge9_4;

public class VowCons {
    private int v;
    private int c;
    private String s;

    VowCons(String str) {
        v = 0;
        c = 0;
        s = str;
    }
    public int vCount() {
        v = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                switch(s.charAt(i)) {
                    case 'a' :
                    case 'e' :
                    case 'i' :
                    case 'o' :
                    case 'u' :
                        ++v;
                        break;
                }
            }
        }
        return v;
    }
    public int cCount() {
        c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                switch(s.charAt(i)) {
                    case 'a' :
                    case 'e' :
                    case 'i' :
                    case 'o' :
                    case 'u' :
                    case ' ' :
                        break;
                    default :
                        ++c;
                }
            }
        }
        return c;
    }
    public void setStr(String str) {
        s = str;
    }
    
}

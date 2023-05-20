class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int c = 0;

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0;) {
            if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                if (c == 0) {
                    res += "0";
                } else if (c == 1) {
                    res += "1";
                    c = 0;
                }
            } else if (a.charAt(i) == '0' && b.charAt(j) == '1') {
                if (c == 0) {
                    res += "1";
                } else if (c == 1) {
                    res += "0";
                }
            } else if (a.charAt(i) == '1' && b.charAt(j) == '0') {
                if (c == 0) {
                    res += "1";
                } else if (c == 1) {
                    res += "0";
                }
            } else if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (c == 0) {
                    res += "0";
                    c = 1;
                } else if (c == 1) {
                    res += "1";
                }
            }

            if (i == 0 && j != 0) {
                a = "0";
            } else if (i != 0 && j == 0) {
                b = "0";
            }

            if (i == 0 && j == 0) {
                if (c == 1) {
                    res += "1";
                }
                break;
            }

            if (i > 0) {
                i--;
            }
            if (j > 0) {
                j--;
            }
        }

        return (new StringBuilder(res)).reverse().toString();
    }
}

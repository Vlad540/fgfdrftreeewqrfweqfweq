package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: h0e  reason: default package */
public abstract class h0e extends p0e {
    public static Boolean A0(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence B0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean G = iu7.G(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!G) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!G) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean R(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (!(charSequence2 instanceof String)) {
            if (Y(charSequence, charSequence2, 0, charSequence.length(), z, false) < 0) {
                return false;
            }
        } else if (a0(charSequence, (String) charSequence2, 0, z, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean S(CharSequence charSequence, char c) {
        return Z(charSequence, c, 0, false, 2) >= 0;
    }

    public static boolean T(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && iu7.s(charSequence.charAt(V(charSequence)), c, false);
    }

    public static boolean U(String str, CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).endsWith(str);
        }
        return j0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int V(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static Character W(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final int X(int i, CharSequence charSequence, String str, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return Y(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int Y(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        dz6 dz6;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            dz6 = new dz6(i, i2, 1);
        } else {
            int V = V(charSequence);
            if (i > V) {
                i = V;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            dz6 = new dz6(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = dz6.c;
        int i4 = dz6.b;
        int i5 = dz6.a;
        if (!z3 || !(charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    if (!j0(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (true) {
                if (!p0e.N(0, i5, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i5 == i4) {
                        break;
                    }
                    i5 += i3;
                } else {
                    return i5;
                }
            }
        }
        return -1;
    }

    public static int Z(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return b0(charSequence, new char[]{c}, i, z);
    }

    public static /* synthetic */ int a0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return X(i, charSequence, str, z);
    }

    public static final int b0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int V = V(charSequence);
            if (i > V) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                for (char s : cArr) {
                    if (iu7.s(s, charAt, z)) {
                        return i;
                    }
                }
                if (i == V) {
                    return -1;
                }
                i++;
            }
        } else {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            } else if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            } else {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static boolean c0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!iu7.G(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char d0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(V(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int e0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = V(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int V = V(charSequence);
        if (i > V) {
            i = V;
        }
        while (-1 < i) {
            if (iu7.s(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int f0(String str, CharSequence charSequence, int i) {
        int V = (i & 2) != 0 ? V(charSequence) : 0;
        return !(charSequence instanceof String) ? Y(charSequence, str, V, 0, false, true) : ((String) charSequence).lastIndexOf(str, V);
    }

    public static vqe g0(CharSequence charSequence) {
        return r0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 6);
    }

    public static String h0(String str, int i, char c) {
        CharSequence charSequence;
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(c);
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append(str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(rf0.f(i, "Desired length ", " is less than zero."));
    }

    public static ke4 i0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        n0(i);
        return new ke4(charSequence, 0, i, new q0e(Arrays.asList(strArr), z, 1));
    }

    public static final boolean j0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!iu7.s(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String k0(String str, String str2) {
        return t0(str2, str) ? str.substring(str2.length()) : str;
    }

    public static String l0(String str, String str2) {
        return U(str2, str) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static StringBuilder m0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(rf0.g("End index (", i2, ") is less than start index (", i, ")."));
    }

    public static final void n0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(wn6.h(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List o0(int i, CharSequence charSequence, String str, boolean z) {
        n0(i);
        int i2 = 0;
        int X = X(0, charSequence, str, z);
        if (X == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, X).toString());
            i2 = str.length() + X;
            if ((z2 && arrayList.size() == i - 1) || (X = X(i2, charSequence, str, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, X).toString());
            i2 = str.length() + X;
            break;
        } while ((X = X(i2, charSequence, str, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static List p0(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return o0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        n0(0);
        ke4<fz6> ke4 = new ke4(charSequence, 0, 0, new q0e(cArr, false, 0));
        ArrayList arrayList = new ArrayList(q23.H(new ds(3, ke4), 10));
        for (fz6 fz6 : ke4) {
            arrayList.add(charSequence.subSequence(fz6.a, fz6.b + 1).toString());
        }
        return arrayList;
    }

    public static List q0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return o0(0, charSequence, str, z);
            }
        }
        ke4<fz6> i0 = i0(charSequence, strArr, z, 0);
        ArrayList arrayList = new ArrayList(q23.H(new ds(3, i0), 10));
        for (fz6 fz6 : i0) {
            arrayList.add(charSequence.subSequence(fz6.a, fz6.b + 1).toString());
        }
        return arrayList;
    }

    public static vqe r0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return new vqe(i0(charSequence, strArr, z, 0), new c0(9, charSequence));
    }

    public static boolean s0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && iu7.s(charSequence.charAt(0), c, false);
    }

    public static boolean t0(String str, CharSequence charSequence) {
        if ((charSequence instanceof String) && (str instanceof String)) {
            return p0e.Q((String) charSequence, str, false);
        }
        return j0(charSequence, 0, str, 0, str.length(), false);
    }

    public static String u0(String str, String str2) {
        int a0 = a0(str, str2, 0, false, 6);
        return a0 == -1 ? str : str.substring(str2.length() + a0, str.length());
    }

    public static String v0(String str) {
        int e0 = e0(str, '.', 0, 6);
        return e0 == -1 ? str : str.substring(e0 + 1, str.length());
    }

    public static String w0(String str, String str2) {
        int a0 = a0(str, str2, 0, false, 6);
        return a0 == -1 ? str : str.substring(0, a0);
    }

    public static CharSequence x0(int i, CharSequence charSequence) {
        if (i >= 0) {
            int length = charSequence.length();
            if (i > length) {
                i = length;
            }
            return charSequence.subSequence(0, i);
        }
        throw new IllegalArgumentException(rf0.f(i, "Requested character count ", " is less than zero.").toString());
    }

    public static String y0(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        throw new IllegalArgumentException(rf0.f(i, "Requested character count ", " is less than zero.").toString());
    }

    public static String z0(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(length - i);
        }
        throw new IllegalArgumentException(rf0.f(i, "Requested character count ", " is less than zero.").toString());
    }
}

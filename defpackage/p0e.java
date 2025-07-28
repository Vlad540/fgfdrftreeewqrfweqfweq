package defpackage;

import java.util.Locale;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: p0e  reason: default package */
public abstract class p0e extends o0e {
    public static String I(String str) {
        Locale locale = Locale.getDefault();
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            sb.append(str.substring(0, 1).toUpperCase(locale));
        }
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static boolean J(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return hhd.f(charSequence, charSequence2);
        }
        if (charSequence != charSequence2) {
            if (!(charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length())) {
                int length = charSequence.length();
                int i = 0;
                while (i < length) {
                    if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean K(String str, CharSequence charSequence) {
        if ((charSequence instanceof String) && (str instanceof String)) {
            return M((String) charSequence, str, true);
        }
        if (charSequence == str) {
            return true;
        }
        if (!(charSequence == null || str == null || charSequence.length() != str.length())) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                if (iu7.s(charSequence.charAt(i), str.charAt(i), true)) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public static String L(byte[] bArr) {
        return new String(bArr, e22.a);
    }

    public static boolean M(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean N(int i, int i2, int i3, String str, String str2, boolean z) {
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String O(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return BuildConfig.FLAVOR;
        } else {
            int i2 = 1;
            if (i == 1) {
                return str.toString();
            }
            int length = str.length();
            if (length == 0) {
                return BuildConfig.FLAVOR;
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(str.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(str);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                return sb.toString();
            }
            char charAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    public static String P(String str, String str2, String str3) {
        int X = h0e.X(0, str, str2, false);
        if (X < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append(str, i2, X);
                sb.append(str3);
                i2 = X + length;
                if (X >= str.length() || (X = h0e.X(X + i, str, str2, false)) <= 0) {
                    sb.append(str, i2, str.length());
                }
                sb.append(str, i2, X);
                sb.append(str3);
                i2 = X + length;
                break;
            } while ((X = h0e.X(X + i, str, str2, false)) <= 0);
            sb.append(str, i2, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static boolean Q(String str, String str2, boolean z) {
        return !z ? str.startsWith(str2) : N(0, 0, str2.length(), str, str2, z);
    }
}

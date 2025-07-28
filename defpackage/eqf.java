package defpackage;

import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: eqf  reason: default package */
public final class eqf {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final yze a = new yze(3, false);
    public final StringBuilder b = new StringBuilder();

    public static String a(yze yze, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = yze.b;
        int i2 = yze.c;
        while (i < i2 && !z) {
            char c2 = (char) yze.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        yze.I(i - yze.b);
        return sb.toString();
    }

    public static String b(yze yze, StringBuilder sb) {
        c(yze);
        if (yze.c() == 0) {
            return null;
        }
        String a2 = a(yze, sb);
        if (!BuildConfig.FLAVOR.equals(a2)) {
            return a2;
        }
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) yze.v());
        return sb2.toString();
    }

    public static void c(yze yze) {
        while (true) {
            boolean z = true;
            while (yze.c() > 0 && z) {
                int i = yze.b;
                byte[] bArr = yze.a;
                byte b2 = bArr[i];
                char c2 = (char) b2;
                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                    yze.I(1);
                } else {
                    int i2 = yze.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b2 == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                } else if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            yze.I(i2 - yze.b);
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }
}

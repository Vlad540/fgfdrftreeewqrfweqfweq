package defpackage;

import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: fqf  reason: default package */
public final class fqf {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final ija a = new ija();
    public final StringBuilder b = new StringBuilder();

    public static String a(ija ija, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = ija.b;
        int i2 = ija.c;
        while (i < i2 && !z) {
            char c2 = (char) ija.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        ija.H(i - ija.b);
        return sb.toString();
    }

    public static String b(ija ija, StringBuilder sb) {
        c(ija);
        if (ija.a() == 0) {
            return null;
        }
        String a2 = a(ija, sb);
        if (!BuildConfig.FLAVOR.equals(a2)) {
            return a2;
        }
        return BuildConfig.FLAVOR + ((char) ija.u());
    }

    public static void c(ija ija) {
        while (true) {
            boolean z = true;
            while (ija.a() > 0 && z) {
                int i = ija.b;
                byte[] bArr = ija.a;
                byte b2 = bArr[i];
                char c2 = (char) b2;
                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                    ija.H(1);
                } else {
                    int i2 = ija.c;
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
                            ija.H(i2 - ija.b);
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }
}

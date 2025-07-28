package defpackage;

import android.text.Spannable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fhe  reason: default package */
public abstract class fhe {
    public static final Pattern a = Pattern.compile("#(?i)([\\p{L}0-9_]+)");

    public static void a(Spannable spannable, sf7 sf7, boolean z, int i) {
        ph0 ph0 = new ph0(spannable, sf7, i, 13);
        if (sf7 == sf7.o) {
            c(spannable.toString(), b(sf7, z), gla.b, false, ph0);
            return;
        }
        String obj = spannable.toString();
        Pattern b = b(sf7, z);
        Pattern pattern = gla.a;
        c(obj, b, (Pattern) null, false, ph0);
    }

    public static Pattern b(sf7 sf7, boolean z) {
        int ordinal = sf7.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ehe.a : ehe.a : z ? ehe.e : ehe.c : a;
    }

    public static void c(CharSequence charSequence, Pattern pattern, Pattern pattern2, boolean z, of3 of3) {
        Pattern pattern3 = gla.a;
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            Matcher matcher2 = pattern3.matcher(charSequence);
            while (true) {
                if (matcher2.find()) {
                    if ((matcher.start() >= matcher2.start() && matcher.end() <= matcher2.end()) || ((matcher.end() <= matcher2.end() && matcher.end() >= matcher2.start()) || (matcher.start() <= matcher2.end() && matcher.end() >= matcher2.end()))) {
                        break;
                    }
                } else {
                    if (!z && pattern == ehe.a) {
                        Matcher matcher3 = ehe.e.matcher(charSequence);
                        while (true) {
                            if (matcher3.find() && matcher.start() >= matcher3.start() && matcher.end() <= matcher3.end()) {
                                if (matcher3.group().contains(matcher.group())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (pattern2 != null) {
                        Matcher matcher4 = pattern2.matcher(charSequence);
                        while (true) {
                            if (matcher4.find() && matcher.start() >= matcher4.start() && matcher.end() <= matcher4.end()) {
                                if (matcher4.group().contains(matcher.group())) {
                                    break;
                                }
                            }
                        }
                    }
                    try {
                        of3.accept(new bhe(matcher.start(), matcher.end(), matcher.group()));
                        break;
                    } catch (Throwable th) {
                        udd.s("fhe", th.getMessage(), th);
                    }
                }
            }
        }
    }
}

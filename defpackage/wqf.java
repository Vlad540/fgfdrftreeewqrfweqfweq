package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;

/* renamed from: wqf  reason: default package */
public abstract class wqf {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(yze yze) {
        String i = yze.i();
        return i != null && i.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = mze.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void d(yze yze) {
        int i = yze.b;
        if (!a(yze)) {
            yze.H(i);
            String valueOf = String.valueOf(yze.i());
            throw ParserException.a((RuntimeException) null, valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
        }
    }
}

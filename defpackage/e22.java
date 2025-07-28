package defpackage;

import java.nio.charset.Charset;

/* renamed from: e22  reason: default package */
public abstract class e22 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName("UTF-16");
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
    }
}

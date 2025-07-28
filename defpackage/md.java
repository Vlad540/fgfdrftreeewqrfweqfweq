package defpackage;

/* renamed from: md  reason: default package */
public final class md {
    public static final md b = new md();
    public static final int c;
    public static final int d;
    public final mh4 a = new mh4(3);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors + 1;
        d = (availableProcessors * 2) + 1;
    }
}

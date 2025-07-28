package defpackage;

/* renamed from: n7c  reason: default package */
public final class n7c {
    public static String a(v26 v26) {
        String obj = v26.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}

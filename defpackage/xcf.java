package defpackage;

/* renamed from: xcf  reason: default package */
public final class xcf extends kj0 {
    public static final /* synthetic */ int b = 0;
    public final String a;

    public xcf(String str) {
        this.a = str;
    }

    public static String b(String str) {
        String[] split = str.split("/");
        String str2 = split.length == 0 ? "" : split[split.length - 1];
        if (str2.length() <= 0) {
            return null;
        }
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str2.charAt(i))) {
                return null;
            }
        }
        String[] split2 = str.split("/");
        return split2.length == 0 ? "" : split2[split2.length - 1];
    }

    public final dhd a() {
        return new mv9(1, new xle(13, (Object) this));
    }
}

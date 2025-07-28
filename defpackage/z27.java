package defpackage;

/* renamed from: z27  reason: default package */
public abstract class z27 {
    public static final Integer a;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                a = num2;
            }
        } catch (Throwable unused) {
        }
        num = null;
        num2 = num;
        a = num2;
    }
}

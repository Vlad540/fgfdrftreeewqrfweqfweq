package defpackage;

import java.text.SimpleDateFormat;

/* renamed from: v14  reason: default package */
public abstract class v14 {
    public static final boolean a = true;
    public static final ea3 b = new ea3(true);
    public static final /* synthetic */ u14 c = new Object();

    /* JADX WARNING: type inference failed for: r0v4, types: [u14, java.lang.Object] */
    static {
        Object obj;
        ete.b(new Exception(), hwf.class.getSimpleName());
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        new ea3(false);
        Object obj2 = null;
        try {
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance((Object[]) null);
            ete.g(1, newInstance);
            obj = (u16) newInstance;
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        if (!(obj instanceof kcc)) {
            obj2 = obj;
        }
        u16 u16 = (u16) obj2;
    }
}

package defpackage;

/* renamed from: t14  reason: default package */
public enum t14 {
    DISABLED(0),
    FILE_LOGS(2),
    DEV_OPTIONS_MENU(3);
    
    public static final t14[] X = null;
    public final int a;

    static {
        X = values();
    }

    /* access modifiers changed from: public */
    t14(int i) {
        this.a = i;
    }

    public static t14 a(int i) {
        for (t14 t14 : X) {
            if (t14.a == i) {
                return t14;
            }
        }
        return DISABLED;
    }
}

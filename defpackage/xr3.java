package defpackage;

/* renamed from: xr3  reason: default package */
public enum xr3 {
    PUSH_ENTER(true, true),
    PUSH_EXIT(true, false),
    POP_ENTER(false, true),
    POP_EXIT(false, false);
    
    public final boolean a;
    public final boolean b;

    /* access modifiers changed from: public */
    xr3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}

package defpackage;

/* renamed from: g2f  reason: default package */
public final class g2f implements ls9 {
    public ot1 a;
    public boolean b;

    public final void a(Object obj) {
        e07.p("SourceStreamRequirementObserver can be updated from main thread only", gt0.C());
        boolean equals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b != equals) {
            this.b = equals;
            ot1 ot1 = this.a;
            if (ot1 == null) {
                return;
            }
            if (equals) {
                ot1.o();
            } else {
                ot1.a();
            }
        }
    }

    public final void onError(Throwable th) {
    }
}

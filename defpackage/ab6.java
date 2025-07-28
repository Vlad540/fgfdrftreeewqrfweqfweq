package defpackage;

import com.google.android.gms.tasks.Task;

/* renamed from: ab6  reason: default package */
public final /* synthetic */ class ab6 implements hx9, kx9, gx9 {
    public final /* synthetic */ eb6 a;

    public /* synthetic */ ab6(eb6 eb6) {
        this.a = eb6;
    }

    public void d() {
        eb6 eb6 = this.a;
        udd.q(eb6.e, "startRetriever: canceled");
        eb6.h = null;
    }

    public void l(Task task) {
        eb6 eb6 = this.a;
        udd.q(eb6.e, "retriever is complete");
        eb6.h = null;
    }

    public void onFailure(Exception exc) {
        eb6 eb6 = this.a;
        udd.u(eb6.e, new Error("startRetriever: failed", exc), (String) null, new Object[0]);
        eb6.h = null;
    }
}

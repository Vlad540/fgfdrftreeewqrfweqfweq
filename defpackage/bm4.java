package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: bm4  reason: default package */
public final class bm4 extends ol implements tna, qce {
    public final j4a X;
    public final String Y = bm4.class.getName();
    public final long o;

    public bm4(long j, long j2, j4a j4a) {
        super(j);
        this.o = j2;
        this.X = j4a;
    }

    public final void c(lbe lbe) {
        cm4 cm4 = (cm4) lbe;
        String str = this.Y;
        udd.q(str, "onSuccess: " + cm4);
        t52 m = m();
        long j = this.o;
        i22 B = m.B(j);
        if (B == null) {
            udd.q(str, "onSuccess: No chat. return");
            return;
        }
        o62 o62 = B.b;
        j4a j4a = o62.f0;
        long j2 = o62.g0;
        if (j4a == null && j2 > cm4.c) {
            udd.U(str, "onSuccess: draft was discarded");
        } else if (j2 > cm4.c) {
            udd.U(str, "local draft time more than response, ignore!");
        } else {
            j4a j4a2 = this.X;
            if (j4a2 == null) {
                udd.U(str, "could not deserialize draft");
                m().p(j);
                return;
            }
            t52 m2 = m();
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            m2.k(this.o, cm4.c, ((dm4) plVar.R.getValue()).a(j4a2, Long.valueOf(cm4.c)));
        }
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    public final int e() {
        i22 B = m().B(this.o);
        String str = this.Y;
        if (B == null) {
            udd.q(str, "onPreExecute: No chat. remove task");
            return 3;
        }
        j4a j4a = this.X;
        if (j4a == null) {
            udd.q(str, "onPreExecute: could not deserialize draft, remove task");
            return 3;
        } else if (w10.a(j4a.a())) {
            return 1;
        } else {
            udd.q(str, "onPreExecute: Attaches not ready. skip task");
            return 2;
        }
    }

    public final void f() {
        udd.s(this.Y, "onMaxFailCount", (Throwable) null);
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.DraftSave draftSave = new Tasks.DraftSave();
        draftSave.requestId = this.a;
        draftSave.chatId = this.o;
        draftSave.draft = am4.b(this.X);
        return gr8.toByteArray(draftSave);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_DRAFT_SAVE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        long j;
        i22 B = m().B(this.o);
        String str = this.Y;
        if (B == null) {
            udd.q(str, "createRequest: No chat. return null");
            return null;
        }
        j4a j4a = this.X;
        if (j4a == null) {
            udd.U(str, "could not deserialize draft");
            return null;
        }
        if (B.J()) {
            tf3 k = B.k();
            Long valueOf = k != null ? Long.valueOf(k.n()) : null;
            if (valueOf != null) {
                j = valueOf.longValue();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            j = 0;
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        nzc f = ((dm4) plVar.R.getValue()).f(j4a);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = i == 0 ? B.b.a : 0;
        pn2 pn2 = new pn2((dfa) null, 12);
        if (i != 0) {
            pn2.n(j, "userId");
        }
        if (j2 != 0) {
            pn2.n(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        pn2.p("draft", f.a());
        return pn2;
    }
}

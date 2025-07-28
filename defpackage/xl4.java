package defpackage;

import java.io.IOException;
import java.util.Arrays;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: xl4  reason: default package */
public final class xl4 extends ol implements tna, qce {
    public final long X;
    public final String Y = xl4.class.getName();
    public final long o;

    public xl4(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final void c(lbe lbe) {
        String str = this.Y;
        udd.q(str, "onSuccess: " + lbe);
        i22 B = m().B(this.o);
        if (B == null) {
            udd.H(str, "no chat, ignore!", (Throwable) null);
            return;
        }
        o62 o62 = B.b;
        if (o62.f0 != null) {
            long j = o62.g0;
            if (j == 0) {
                udd.H(str, "local draft not yet sync, ignore!", (Throwable) null);
                return;
            }
            long j2 = this.X;
            if (j < j2) {
                m().k(this.o, this.X, (j4a) null);
                udd.R(str, (IOException) null, "chat has server draft older than current DRAFT_DISCARD server time, diff = %d, clear it", Arrays.copyOf(new Object[]{Long.valueOf(j2 - j)}, 1));
                return;
            }
            return;
        }
        udd.H(str, "draft already is null, ignore!", (Throwable) null);
        m().k(this.o, this.X, (j4a) null);
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    public final int e() {
        return 1;
    }

    public final void f() {
        udd.s(this.Y, "onMaxFailCount", (Throwable) null);
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.DraftDiscard draftDiscard = new Tasks.DraftDiscard();
        draftDiscard.requestId = this.a;
        draftDiscard.chatId = this.o;
        draftDiscard.serverTime = this.X;
        return gr8.toByteArray(draftDiscard);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_DRAFT_DISCARD;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        long j;
        i22 B = m().B(this.o);
        if (B == null) {
            udd.q(this.Y, "createRequest: No chat. return null");
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
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = i == 0 ? B.b.a : 0;
        pn2 pn2 = new pn2((dfa) null, 11);
        if (i != 0) {
            pn2.n(j, "userId");
        }
        if (j2 != 0) {
            pn2.n(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        long j3 = this.X;
        if (j3 != 0) {
            pn2.n(j3, "time");
        }
        return pn2;
    }
}

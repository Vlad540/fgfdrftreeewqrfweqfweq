package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: t65  reason: default package */
public final class t65 extends c0d implements tna {
    public static final /* synthetic */ int w0 = 0;
    public final long X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final String o;

    public t65(long j, String str, String str2, long j2, long j3, String str3) {
        this.b = j;
        this.c = str;
        this.o = str2;
        this.X = j2;
        this.Y = j3;
        this.Z = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r0 = defpackage.ls8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r4 = this;
            long r0 = r4.X
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x000a
            return r3
        L_0x000a:
            to8 r4 = r4.n()
            vo8 r4 = r4.q(r0)
            if (r4 == 0) goto L_0x001c
            ls8 r0 = defpackage.ls8.DELETED
            ls8 r4 = r4.z0
            if (r4 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            return r3
        L_0x001c:
            r4 = 3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t65.e():int");
    }

    public final void f() {
        r().d(this.b);
        i22 B = b().B(this.Y);
        long j = this.X;
        if (B != null) {
            d0d d0d = this.a;
            if (d0d == null) {
                d0d = null;
            }
            long j2 = B.b.a;
            ((eha) d0d.p.getValue()).getClass();
            eha.b(j2, j);
        }
        vo8 q = n().q(j);
        if (q == null || q.z0 == ls8.DELETED) {
            udd.q("t65", "onMaxFailCount: Message was deleted");
            return;
        }
        n().x(q, bp8.ERROR);
        t().c(new ove(q.x0, q.b, 0));
        o1d.y(u());
    }

    public final byte[] g() {
        Tasks.ExternalVideoSend externalVideoSend = new Tasks.ExternalVideoSend();
        externalVideoSend.requestId = this.b;
        externalVideoSend.externalUrl = this.c;
        externalVideoSend.attachLocalId = this.o;
        externalVideoSend.messageId = this.X;
        externalVideoSend.chatId = this.Y;
        externalVideoSend.stickerId = this.Z;
        return gr8.toByteArray(externalVideoSend);
    }

    public final long getId() {
        return this.b;
    }

    public final una getType() {
        return una.TYPE_EXTERNAL_GIF_SEND;
    }

    public final int h() {
        return 5;
    }

    public final void x() {
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        uc5 uc5 = (uc5) d0d.b.getValue();
        uc5.getClass();
        int ordinal = ((qc5) xs7.M(bw4.a, new tc5(uc5, this.b, this.c, this.o, this.X, this.Y, this.Z, (Continuation) null))).ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            if (ordinal == 5) {
                f();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}

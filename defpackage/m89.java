package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: m89  reason: default package */
public final class m89 extends ol implements qce, tna {
    public final long X;
    public final long Y;
    public final md4 Z;
    public final long o;
    public long w0;

    public m89(long j, long j2, long j3, long j4, md4 md4) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = md4;
    }

    public final void c(lbe lbe) {
        n89 n89 = (n89) lbe;
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        plVar.d().b(this.o, this.X, this.Y);
        pl plVar3 = this.c;
        if (plVar3 != null) {
            plVar2 = plVar3;
        }
        plVar2.c().c0(Collections.singletonList(n89.c));
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    public final int e() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        i22 B = plVar.c().B(this.o);
        if (B == null) {
            return 3;
        }
        this.w0 = B.b.a;
        return 1;
    }

    public final void f() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
    }

    public final byte[] g() {
        Tasks.MsgDeleteRange msgDeleteRange = new Tasks.MsgDeleteRange();
        msgDeleteRange.requestId = this.a;
        msgDeleteRange.chatId = this.o;
        msgDeleteRange.startTime = this.X;
        msgDeleteRange.endTime = this.Y;
        msgDeleteRange.itemTypeId = this.Z.a;
        return gr8.toByteArray(msgDeleteRange);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_DELETE_RANGE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        long j = this.w0;
        pn2 pn2 = new pn2(dfa.MSG_DELETE_RANGE, 19);
        pn2.n(j, ApiProtocol.PARAM_CHAT_ID);
        pn2.n(this.X, "startTime");
        pn2.n(this.Y, "endTime");
        pn2.s("itemType", this.Z.name());
        return pn2;
    }
}

package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: j99  reason: default package */
public final class j99 extends ol implements qce, tna {
    public final long X;
    public final String o;

    public j99(long j, String str, long j2) {
        super(j);
        this.o = str;
        this.X = j2;
    }

    public final void c(lbe lbe) {
        k99 k99 = (k99) lbe;
        long j = this.X;
        if (j != -1) {
            vo8 q = p().q(j);
            boolean isEmpty = k99.c.isEmpty();
            ls8 ls8 = ls8.ACTIVE;
            pl plVar = null;
            String str = this.o;
            if (isEmpty || q == null) {
                ((hz3) p().a).c.d().m(new eve(j, (jj7) null, 0));
                if (q != null) {
                    String str2 = q.w0;
                    if (!hhd.f(str2, str) && str2 != null && str != null && !h0e.R(str2, str, false)) {
                        p().z(this.X, me4.i(str2, "\n", str), (List) null, m(), ls8);
                    }
                }
            } else {
                zy zyVar = k99.c;
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                p().w(q, fu7.g(zyVar, (zpc) plVar2.E.getValue()));
                if (hhd.f(q.w0, str)) {
                    p().z(this.X, (String) null, (List) null, m(), ls8);
                }
            }
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar = plVar3;
            }
            o1d.y((luf) plVar.g.getValue());
        } else if (!k99.c.isEmpty()) {
            l().c(new nm3(this.a, k99.c));
        }
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
        t().d(this.a);
        ((hz3) p().a).c.d().m(new eve(this.X, (jj7) null, 0));
    }

    public final byte[] g() {
        Tasks.MsgSharePreview msgSharePreview = new Tasks.MsgSharePreview();
        msgSharePreview.requestId = this.a;
        msgSharePreview.text = this.o;
        msgSharePreview.messageId = this.X;
        return gr8.toByteArray(msgSharePreview);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_SHARE_PREVIEW;
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 29);
        pn2.s("text", this.o);
        return pn2;
    }
}

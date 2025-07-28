package defpackage;

import java.util.HashSet;
import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: m92  reason: default package */
public final class m92 extends ol implements qce {
    public final List X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m92(int i, long j, List list) {
        super(j);
        this.o = i;
        this.X = list;
    }

    public final void c(lbe lbe) {
        switch (this.o) {
            case 0:
                n92 n92 = (n92) lbe;
                try {
                    q().m(n92);
                } catch (TamErrorException unused) {
                    String name = m92.class.getName();
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.w0, name, "fail to get missed contacts for CHAT_INFO", (Throwable) null);
                    }
                }
                m().c0(n92.c);
                tt0 l = l();
                long j = this.a;
                List list = this.X;
                kh0 kh0 = new kh0(j);
                new HashSet(list);
                l.c(kh0);
                return;
            default:
                k().h(((q3d) lbe).c, k().e());
                l().c(new kh0(this.a));
                return;
        }
    }

    public final void d(uae uae) {
        switch (this.o) {
            case 0:
                l().c(new jh0(this.a, uae));
                return;
            default:
                l().c(new jh0(this.a, uae));
                return;
        }
    }

    public final ibe i() {
        switch (this.o) {
            case 0:
                dt dtVar = new dt((dfa) null, 21);
                dtVar.h("chatIds", this.X);
                return dtVar;
            default:
                bm9 bm9 = new bm9((dfa) null, 8);
                List list = this.X;
                if (list != null && !list.isEmpty()) {
                    bm9.h("pushTokens", list);
                }
                return bm9;
        }
    }
}

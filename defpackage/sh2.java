package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: sh2  reason: default package */
public final class sh2 extends ol implements qce, tna {
    public final String A0 = sh2.class.getName();
    public long X;
    public final int Y;
    public final List Z;
    public final long o;
    public final ch2 w0;
    public final boolean x0;
    public final int y0;
    public final int z0;

    public sh2(long j, long j2, long j3, int i, List list, ch2 ch2, boolean z, int i2, int i3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = i;
        this.Z = list;
        this.w0 = ch2;
        this.x0 = z;
        this.y0 = i2;
        this.z0 = i3;
    }

    public final void c(lbe lbe) {
        i22 B;
        uh2 uh2 = (uh2) lbe;
        boolean z = !uh2.X.isEmpty();
        long j = this.o;
        if (z) {
            ArrayList k = p().k(j, uh2.X);
            if (!k.isEmpty()) {
                ArrayList arrayList = new ArrayList(q23.H(k, 10));
                Iterator it = k.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((vo8) it.next()).b));
                }
                p().c(j, arrayList);
                l().c(new l89(j, arrayList, (md4) null));
            }
        }
        if (uh2.c != null) {
            m().c0(Collections.singletonList(uh2.c));
        }
        if (this.w0 == ch2.ADMIN && this.Y == 1 && (B = m().B(j)) != null) {
            Iterator it2 = this.Z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!B.b.R.containsKey(Long.valueOf(((Number) it2.next()).longValue()))) {
                    l().c(new jh0(this.a, new uae("friend.blocks.me", "friend.blocks.me", (String) null)));
                    break;
                }
            }
        }
        l().c(new vh2(this.a, this.Z, this.w0, this.o, this.Y));
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
        }
        l().c(new jh0(this.a, uae));
        if (this.w0 == ch2.MEMBER) {
            l().c(new hr3(uae, this.o, this.Z));
        }
    }

    public final int e() {
        o62 o62;
        m62 m62;
        i22 B = m().B(this.o);
        if (B == null || (m62 = o62.c) == m62.Y || m62 == m62.X || m62 == m62.o) {
            return 3;
        }
        if (this.X == 0) {
            long j = (o62 = B.b).a;
            if (j != 0) {
                this.X = j;
            }
        }
        return this.X != 0 ? 1 : 2;
    }

    public final void f() {
        udd.q(this.A0, "onMaxFailCount");
        int ordinal = this.w0.ordinal();
        int i = this.Y;
        List list = this.Z;
        long j = this.o;
        if (ordinal == 0) {
            int t = hr1.t(i);
            if (t == 0) {
                t52 m = m();
                i22 B = m.B(j);
                if (B != null) {
                    m.h(j, false, new d52(1, list));
                    m.m.c(new mw2(Collections.singletonList(Long.valueOf(B.a)), false));
                }
            } else if (t == 1) {
                m().d(j, list);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1) {
            int t2 = hr1.t(i);
            if (t2 == 0) {
                t52 m2 = m();
                i22 B2 = m2.B(j);
                if (B2 != null) {
                    m2.h(j, false, new d52(2, list));
                    m2.m.c(new mw2(Collections.singletonList(Long.valueOf(B2.a)), false));
                }
            } else if (t2 == 1) {
                t52 m3 = m();
                i22 B3 = m3.B(j);
                if (B3 != null) {
                    m3.h(j, false, new ph0((Object) m3, (Object) list, this.z0, 2));
                    m3.m.c(new mw2(Collections.singletonList(Long.valueOf(B3.a)), false));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ((gy9) j()).j(this.X);
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatMembersUpdate chatMembersUpdate = new Tasks.ChatMembersUpdate();
        chatMembersUpdate.requestId = this.a;
        chatMembersUpdate.chatId = this.o;
        chatMembersUpdate.chatServerId = this.X;
        chatMembersUpdate.operation = th2.b(this.Y);
        chatMembersUpdate.userIds = ek8.n(this.Z);
        chatMembersUpdate.chatMemberType = this.w0.a;
        chatMembersUpdate.showHistory = this.x0;
        return gr8.toByteArray(chatMembersUpdate);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_MEMBERS_UPDATE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        return new dt(this.X, this.Y, this.Z, this.w0, this.x0, this.y0, this.z0);
    }
}

package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: mp2  reason: default package */
public final class mp2 extends ol implements qce, tna {
    public final String A0;
    public final d10 B0;
    public final Long C0;
    public final boolean D0;
    public final long E0;
    public final long X;
    public final int Y;
    public final String Z;
    public final long o;
    public final boolean w0;
    public final String x0;
    public final Map y0;
    public final String z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mp2(long j, long j2, long j3, int i, String str, boolean z, String str2, HashMap hashMap, String str3, String str4, d10 d10, Long l, boolean z2, long j4) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = i;
        this.Z = str;
        this.w0 = z;
        this.x0 = str2;
        this.y0 = hashMap;
        this.z0 = str3;
        this.A0 = str4;
        this.B0 = d10;
        this.C0 = l;
        this.D0 = z2;
        this.E0 = j4;
    }

    public final void c(lbe lbe) {
        np2 np2 = (np2) lbe;
        if (np2.c != null) {
            u();
            m().c0(Collections.singletonList(np2.c));
        }
        l().c(new kh0(this.a));
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            u();
            if (!(this.z0 == null && this.A0 == null && this.C0 == null)) {
                f();
            }
            ((gy9) j()).j(this.X);
        }
        l().c(new jh0(this.a, uae));
    }

    public final int e() {
        i22 B = m().B(this.o);
        if (B == null) {
            return 3;
        }
        o62 o62 = B.b;
        if (o62.a == 0) {
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            if (!o62.f(((lqc) ((f03) plVar.e.getValue())).s())) {
                return 2;
            }
        }
        return 1;
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.ChatUpdate chatUpdate = new Tasks.ChatUpdate();
        chatUpdate.requestId = this.a;
        chatUpdate.chatId = this.o;
        chatUpdate.chatServerId = this.X;
        String str = this.z0;
        if (str != null) {
            chatUpdate.theme = str;
        } else {
            chatUpdate.themeIsNull = true;
        }
        String str2 = this.A0;
        if (str2 != null) {
            chatUpdate.photoToken = str2;
        } else {
            chatUpdate.photoTokenIsNull = true;
        }
        d10 d10 = this.B0;
        if (d10 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = d10.b;
            rect.top = d10.c;
            rect.right = d10.d;
            rect.bottom = d10.e;
            chatUpdate.crop = rect;
        }
        Long l = this.C0;
        if (l != null) {
            chatUpdate.pinMessageId = l.longValue();
        } else {
            chatUpdate.pinMessageIdIsNull = true;
        }
        chatUpdate.notifyPin = this.D0;
        String str3 = this.x0;
        if (str3 != null) {
            chatUpdate.description = str3;
        } else {
            chatUpdate.descriptionIsNull = true;
        }
        return gr8.toByteArray(chatUpdate);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CHAT_UPDATE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        Long l = this.C0;
        if (l != null && l.longValue() == -1) {
            l = 0L;
        }
        Long l2 = l;
        int i = this.Y;
        return new pn2(this.X, i != 0 ? hr1.t(i) != 0 ? 3 : 2 : 0, this.Z, this.w0, this.x0, (HashMap) this.y0, this.z0, this.A0, this.B0, l2, this.D0, this.E0);
    }

    public final void u() {
        String str = this.A0;
        long j = this.o;
        if (str != null) {
            m().W(j, z52.b);
        }
        if (this.z0 != null) {
            m().W(j, z52.a);
        }
        if (this.C0 != null) {
            m().W(j, z52.o);
        }
    }
}

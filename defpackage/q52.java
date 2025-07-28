package defpackage;

import org.webrtc.RTCStats;

/* renamed from: q52  reason: default package */
public final /* synthetic */ class q52 implements of3, kh7, n0c, v1b, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ q52() {
        this.a = 5;
        this.b = "payloadType";
    }

    public Object T0(Object obj, k77 k77) {
        RTCStats rTCStats = (RTCStats) obj;
        switch (this.a) {
            case 5:
                Object obj2 = rTCStats.getMembers().get(this.b);
                if (obj2 != null) {
                    return bxb.c(obj2);
                }
                return null;
            default:
                Object obj3 = rTCStats.getMembers().get(this.b);
                if (obj3 != null) {
                    return obj3.toString();
                }
                return null;
        }
    }

    public void accept(Object obj) {
        l00 l00;
        String str = this.b;
        switch (this.a) {
            case 0:
                ((y52) obj).h = str;
                return;
            case 2:
                p10 p10 = (p10) obj;
                for (int i = 0; i < p10.b(); i++) {
                    if (ete.w(str, p10.d(i).q)) {
                        if (i < 0 || i >= p10.b()) {
                            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
                        }
                        p10.a.remove(i);
                    }
                }
                return;
            case 3:
                Throwable th = (Throwable) obj;
                udd.r("to8", "Can't update attach async localId = " + str);
                return;
            default:
                m00 m00 = (m00) obj;
                l00 l002 = m00.e;
                if (l002 == null) {
                    l002 = l00.j;
                }
                if (l002 != null) {
                    k00 a2 = l002.a();
                    a2.b = str;
                    l00 = new l00(a2);
                } else {
                    l00 = null;
                }
                m00.e = l00;
                return;
        }
    }

    public Object apply(Object obj) {
        yxe yxe = (yxe) obj;
        yxe.getClass();
        return new y63(2, new uh(yxe, 27, this.b));
    }

    public void invoke(Object obj) {
        ((n35) obj).getClass();
        udd.q("n35", "videoDebugListener.onVideoDecoderInitialized decoder = " + this.b);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return ((ep0) obj).c.contains(this.b);
            case 8:
                return ((ep0) obj).c.equals(this.b);
            default:
                String str = ((qxe) obj).a;
                return str != null && str.equals(this.b);
        }
    }

    public /* synthetic */ q52(fd fdVar, String str, long j, long j2) {
        this.a = 1;
        this.b = str;
    }

    public /* synthetic */ q52(String str, int i) {
        this.a = i;
        this.b = str;
    }
}

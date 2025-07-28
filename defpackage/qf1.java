package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: qf1  reason: default package */
public final class qf1 extends taf {
    public final grd A0;
    public final t0c B0;
    public final t0c C0;
    public final l05 D0 = new l05(0);
    public final t97 X;
    public final t97 Y;
    public final grd Z;
    public final String b;
    public final boolean c;
    public final List o;
    public final grd w0;
    public final t0c x0;
    public final grd y0;
    public final t0c z0;

    public qf1(String str, boolean z, List list) {
        bh1 bh1 = bh1.a;
        r7e d = bh1.getAccessor().d(w6a.class);
        r7e d2 = bh1.getAccessor().d(iq1.class);
        this.b = str;
        this.c = z;
        this.o = list;
        this.X = d;
        this.Y = d2;
        grd a = hrd.a(new of1((Integer) null, gz6.a, (CharSequence) null));
        this.Z = a;
        grd a2 = hrd.a(new hge(r1a.n0));
        this.w0 = a2;
        this.x0 = new t0c(a2);
        grd a3 = hrd.a(r());
        this.y0 = a3;
        this.z0 = new t0c(a3);
        grd a4 = hrd.a(hw4.a);
        this.A0 = a4;
        this.B0 = new t0c(a4);
        uv uvVar = new uv(a, 21);
        Boolean bool = Boolean.FALSE;
        this.C0 = ez3.d0(uvVar, this.a, ucd.a, bool);
    }

    public static ArrayList q(boolean z) {
        List<uxb> list;
        if (z) {
            uxb.b.getClass();
            list = p23.B(uxb.VIDEO_FREEZES, uxb.VIDEO_QUALITY, uxb.VIDEO_SYNC, uxb.VIDEO_CALL_INTERRUPTION, uxb.USERS_FREEZES, uxb.OTHER);
        } else {
            uxb.b.getClass();
            list = p23.B(uxb.AUDIO_FREEZES, uxb.AUDIO_CALL_INTERRUPTION, uxb.VOICE_COMMUNICATION_PROBLEM, uxb.AUDIO_QUALITY, uxb.AUDIO_ECHO, uxb.OTHER);
        }
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (uxb u : list) {
            arrayList.add(hwf.u(u, false));
        }
        return arrayList;
    }

    public final List r() {
        Integer num = ((of1) this.Z.getValue()).a;
        boolean z = false;
        boolean z2 = num == null;
        oxb oxb = z2 ? oxb.b : oxb.a;
        int i = o1a.y0;
        int i2 = o1a.x0;
        int i3 = o1a.w0;
        t97 t97 = this.X;
        rxb rxb = new rxb(i, oxb, ((w6a) t97.getValue()).j.e("😍"), z2 || (num != null && num.intValue() == i));
        rxb rxb2 = new rxb(i2, oxb, ((w6a) t97.getValue()).j.e("😐"), z2 || (num != null && num.intValue() == i2));
        CharSequence e = ((w6a) t97.getValue()).j.e("😡");
        if (z2 || (num != null && num.intValue() == i3)) {
            z = true;
        }
        return p23.B(rxb, rxb2, new rxb(i3, oxb, e, z));
    }
}

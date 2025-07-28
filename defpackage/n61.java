package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: n61  reason: default package */
public final class n61 extends chd {
    public final mod J0;
    public final t97 K0 = ez3.O(3, new c6(20, this));

    public n61(fh3 fh3, mod mod) {
        super(fh3);
        this.J0 = mod;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [n61, b7c] */
    /* renamed from: F */
    public final void A(eh6 eh6) {
        fh3 fh3 = (fh3) this.a;
        fh3.setId(Long.hashCode(eh6.A0));
        fh3.setTitle(eh6.Y);
        boolean z = eh6.z0 instanceof tg6;
        long j = eh6.b;
        if (z) {
            fh3.F(j, (CharSequence) null, (String) null);
            fh3.setAvatarOverlay((oc0) this.K0.getValue());
        } else {
            fh3.setAvatarOverlay((oc0) null);
            String str = eh6.o;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            fh3.F(j, eh6.c, str);
        }
        fh3.setDescription(eh6.x0);
        fh3.setTime(eh6.Z);
        fh3.C(eh6.w0);
        boolean z2 = true;
        int i = eh6.y0;
        fh3.A(i == 1);
        if (i != 2) {
            z2 = false;
        }
        fh3.B(z2);
        fh3.V0 = eh6.a;
        fh3.T0 = this.J0;
    }
}

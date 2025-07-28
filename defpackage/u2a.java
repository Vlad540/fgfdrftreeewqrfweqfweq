package defpackage;

import com.google.android.material.chip.Chip;

/* renamed from: u2a  reason: default package */
public final /* synthetic */ class u2a implements s16 {
    public final /* synthetic */ x2a a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Chip c;

    public /* synthetic */ u2a(x2a x2a, long j, Chip chip) {
        this.a = x2a;
        this.b = j;
        this.c = chip;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [x2a, android.view.ViewGroup] */
    public final Object invoke() {
        ? r0 = this.a;
        v2a v2a = r0.D0;
        if (v2a != null) {
            v2a.q(this.b);
        }
        r0.removeView(this.c);
        return jue.a;
    }
}

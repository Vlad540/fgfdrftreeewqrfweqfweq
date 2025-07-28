package defpackage;

import android.media.AudioManager;

/* renamed from: fdc  reason: default package */
public final class fdc {
    public final r7e a = new r7e(new k6b(28));
    public final r7e b;
    public edc c;

    public fdc(t97 t97, t97 t972) {
        this.b = new r7e(new k61(t97, this, t972, 8));
    }

    public final cg1 a() {
        return (cg1) this.b.getValue();
    }

    public final void b() {
        this.c = edc.END;
        cg1 a2 = a();
        if (((AudioManager) a2.d.getValue()).getRingerMode() == 2) {
            a2.a(a2.b.a, false);
        }
    }

    public final void c() {
        edc edc = this.c;
        if (edc == edc.END || edc == edc.BUSY) {
            this.c = null;
            return;
        }
        this.c = null;
        a().c();
    }
}

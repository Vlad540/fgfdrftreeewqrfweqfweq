package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: i27  reason: default package */
public final class i27 extends n27 {
    public final i26 Y;
    public final u16 Z;

    public i27(bk bkVar, wwd wwd) {
        super(3, 0);
        this.Y = bkVar;
        this.Z = wwd;
    }

    public final void a(RecyclerView recyclerView, b7c b7c) {
        i27.super.a(recyclerView, b7c);
        if (b7c instanceof tm4) {
            ((dud) ((tm4) b7c)).a.animate().translationZ(0.0f);
            this.Z.invoke(b7c);
        }
    }

    public final boolean i(b7c b7c, b7c b7c2) {
        this.Y.invoke(Integer.valueOf(b7c.g()), Integer.valueOf(b7c2.g()));
        return true;
    }

    public final void j(b7c b7c, int i) {
        if (i != 0 && (b7c instanceof tm4)) {
            ((dud) ((tm4) b7c)).a.animate().translationZ(dh4.c().getDisplayMetrics().density * 20.0f);
        }
    }
}

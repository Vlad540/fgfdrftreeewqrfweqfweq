package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: bje  reason: default package */
public final class bje extends ig7 {
    public bje() {
        super(w04.m);
        A(true);
    }

    public final long k(int i) {
        return (long) ((zie) C(i)).a;
    }

    public final void r(b7c b7c, int i) {
        ((aje) b7c).J0.setText(((zie) C(i)).b);
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        return new aje(LayoutInflater.from(viewGroup.getContext()).inflate(qrb.number_item, viewGroup, false));
    }
}

package defpackage;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: uha  reason: default package */
public final class uha extends j6c {
    public final int a;
    public final float b = 0.5f;
    public final float c = 0.5f;

    public uha(int i) {
        this.a = i;
    }

    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        return new tha(i, this, recyclerView, recyclerView.getContext());
    }
}

package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: d04  reason: default package */
public final class d04 implements syd {
    public final u16 a;
    public yq4 b = yq4.b;

    public d04(b09 b09) {
        this.a = b09;
    }

    public final Object a(int i) {
        if (i < 0) {
            return null;
        }
        return (CharSequence) this.a.invoke(Integer.valueOf(i));
    }

    public final myd b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(new TextView(viewGroup.getContext()));
        return new j04(frameLayout, this.b);
    }

    public final void c(myd myd, int i) {
        ((j04) myd).o.setText((CharSequence) a(i));
    }
}
